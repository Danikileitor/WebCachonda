<?php
include_once('includes/funciones.php');
include_once('config/config.php');
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
        ?>
        <div class="container-lg d-flex flex-column min-vh-100">
            <?php include("includes/header.php"); ?>
            <main class="row gy-2 mb-2">
                <div class="col-12">
                    <nav class="navbar navbar-expand">
                        <div class="nav navbar-nav">
                            <button type="button" class="nav-item btn btn-primary" href="#">Gestionar</button>
                            <button type="button" class="nav-item btn btn-primary ms-2" href="#">Añadir</button>
                        </div>
                    </nav>
                </div>
                <div class="col table-responsive">
                    <form class="" name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
                        <h1>Gestión de Videojuegos</h1>
                        <table class="table table-primary">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Imagen</th>
                                    <th scope="col">Descripcion</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Borrar</th>
                                </tr>
                            </thead>
                            <tbody>
                                <?php
                                try {
                                    $sql = "SELECT * FROM productos";
                                    $resultado = $connection->query($sql);

                                    while ($juego = $resultado->fetch(PDO::FETCH_OBJ)) {
                                        echo "<tr><td scope='row'>$juego->id</td><td>$juego->nombre</td><td><img class='img-fluid' alt='$juego->imagen' src='" . $juego->imagen . "'></td><td>$juego->descripcion</td><td>$juego->precio</td><td><input type='checkbox' name='ids[]' value='$juego->id'></td></tr>";
                                    }
                                } catch (PDOException $e) {
                                    echo "Error: " . $e->getMessage();
                                }
                                ?>
                            </tbody>
                        </table>
                        <input type="submit" name="eliminar" value="Eliminar juegos marcados">
                    </form>
                </div>
            </main>
            <?php include("includes/footer.php"); ?>
        </div>
    </body>

    </html>
<?php
}
?>