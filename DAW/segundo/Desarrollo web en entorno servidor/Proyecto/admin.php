<?php
include_once('config/config.php');
include_once('includes/funciones.php');
session_start();
if (!isset($_SESSION['usuario'])) {
    header('Location: login.php');
    exit;
} else {
    if ($_SESSION['perfil'] != 'administrador') {
        header('Location: index.php');
        exit;
    }
?>
    <!DOCTYPE html>
    <html lang="es" data-bs-theme="<?php echo $_COOKIE["tema"]; ?>">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tienda de Videojuegos - Panel de administrador</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous" />
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <?php
        // Eliminar videojuegos
        if (isset($_POST["eliminar"])) {
            if (isset($_POST["ids"])) {
                $ids = $_POST["ids"];
                foreach ($ids as $id) {
                    $eliminar = $connection->prepare('DELETE FROM productos WHERE id=:id');
                    $eliminar->bindParam("id", $id);
                    $eliminar->execute();
                }
                echo "Se han eliminado los videojuegos: ";
                foreach ($ids as $id) {
                    echo "$id ";
                }
                echo "correctamente.";
            }
        }
        // Insertar videojuego
        if (isset($_POST["insertar"])) {
            if (is_uploaded_file($_FILES['imagen']['tmp_name'])) {
                $ruta = "img/";
                $temporal = $_FILES['imagen']['tmp_name'];
                $nombre = $_FILES['imagen']['name'];
                $nombre = time() . substr($nombre, 0, strpos($nombre, ".")) . ".jpg";
                $rutaCompleta = $ruta . $nombre;
                //Gracias al módulo php-imagick podemos redimensionar la imagen y convertirla a jpg!
                $imagen = new Imagick();
                $imagen->setFormat('jpg');
                $imagen->readImage($temporal);
                $imagen->setImageCompressionQuality(80);
                $imagen->scaleImage(512, 512);
                $imagen->writeImage($rutaCompleta);
                $imagen->destroy();

                $sql = "INSERT INTO productos (nombre, imagen, descripcion, precio) VALUES (?, ?, ?, ?)";
                $insertar = $connection->prepare($sql);
                $insertar->execute([$_POST["nombre"], $rutaCompleta, $_POST["descripcion"], $_POST["precio"]]);
            }
        }
        ?>
        <div class="container-lg d-flex flex-column min-vh-100">
            <?php include("includes/header.php"); ?>
            <main class="row gy-2 mb-2">
                <div class="col-12">
                    <nav class="navbar navbar-expand">
                        <div class="nav navbar-nav">
                            <button type="button" id="btnGestionar" class="nav-item btn btn-primary">Gestionar</button>
                            <button type="button" id="btnInsertar" class="nav-item btn btn-primary ms-2">Añadir</button>
                        </div>
                    </nav>
                </div>
                <div id="contenido" class="col table-responsive">
                    <form class="" name="formulario" action="admin.php" method="post" enctype="multipart/form-data">
                        <h1>Inserción de Videojuegos</h1>
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td scope="row"><label for="nombre" class="form-label">Nombre:</label></td>
                                    <td><input type="text" name="nombre" id="nombre" class="form-control" placeholder="Nombre" class="form-control" required></td>
                                </tr>
                                <tr>
                                    <td scope="row"><label for="imagen">Imagen:</label></td>
                                    <td><input type="file" accept="image/*" name="imagen" id="imagen" required></td>
                                </tr>
                                <tr>
                                    <td scope="row"><label for="descripcion" class="form-label">Descripcion:</label></td>
                                    <td><textarea name="descripcion" id="descripcion" class="form-control" rows="3" required>Descripción del videojuego.</textarea></td>
                                </tr>
                                <tr>
                                    <td scope="row"><label for="precio" class="form-label">Precio:</label></td>
                                    <td><input type="number" name="precio" id="precio" class="form-control" min="0" pattern="^\d*(\.\d{0,2})?$" placeholder="0,00" step="0.01" class="form-control" required></td>
                                </tr>
                            </tbody>
                        </table>
                        <input type="submit" name="insertar" value="Insertar juego">
                    </form>
                </div>
            </main>
            <?php include("includes/footer.php"); ?>
        </div>
        <script type="text/javascript">
            const panel = document.getElementById("contenido");
            const btnGestionar = document.getElementById("btnGestionar");
            const btnInsertar = document.getElementById("btnInsertar");

            function mostrarGestionar() {
                panel.innerHTML = "<?php verGestionar(); ?>";
            }

            function mostrarInsertar() {
                panel.innerHTML = "<?php verInsertar(); ?>";
            }

            btnGestionar.addEventListener("click", mostrarGestionar);
            btnInsertar.addEventListener("click", mostrarInsertar);
        </script>
    </body>

    </html>
<?php
}
?>