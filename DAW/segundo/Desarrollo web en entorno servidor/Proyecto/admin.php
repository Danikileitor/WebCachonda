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
                @$dwes = new mysqli('localhost', 'dwes', 'abc123.', 'inmobiliaria');
                $error = $dwes->connect_errno;
                if ($error == null) {
                    foreach ($ids as $id) {
                        $eliminar = $dwes->stmt_init();
                        $eliminar->prepare('DELETE FROM noticias WHERE id=?');
                        $eliminar->bind_param('s', $id);
                        $eliminar->execute();
                        $eliminar->close();
                    }
                    $dwes->close();
                    echo "Se han eliminado las noticias: ";
                    foreach ($ids as $id) {
                        echo "$id ";
                    }
                    echo "correctamente.";
                }
            }
        }
        ?>
        <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
            <h1>Eliminación de noticias</h1>
            <table>
                <tr>
                    <th>Título</th>
                    <th>Texto</th>
                    <th>Categoría</th>
                    <th>Fecha</th>
                    <th>Imagen</th>
                    <th>Borrar</th>
                </tr>
                <?php
                $dwes = new PDO('mysql:host=localhost;dbname=inmobiliaria', 'dwes', 'abc123.');
                $dwes->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                try {
                    $sql = "SELECT titulo, texto, categoria, fecha, imagen, id FROM noticias ORDER BY fecha DESC";
                    $resultado = $dwes->query($sql);

                    while ($noticia = $resultado->fetch(PDO::FETCH_OBJ)) {
                        echo "<tr><td>$noticia->titulo</td><td>$noticia->texto</td><td>$noticia->categoria</td><td>$noticia->fecha</td><td>$noticia->imagen</td><td><input type='checkbox' name='ids[]' value='$noticia->id'></td></tr>";
                    }
                } catch (PDOException $e) {
                    echo "Error: " . $e->getMessage();
                }
                ?>
            </table><br>
            <input type="submit" name="eliminar" value="Eliminar noticias marcadas">
        </form>
    </body>

    </html>
<?php
}
?>