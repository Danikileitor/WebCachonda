<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inmobiliaria - Inserción - Resultado</title>
    <link rel="stylesheet" href="css/estilo.css">
</head>

<body>
    <h1>Resultado de la inserción</h1>
    <p>Estos son los datos introducidos:</p>
    <ul>
        <?php
        if (is_uploaded_file($_FILES['imagen']['tmp_name'])) {
            $tipo_imagen = exif_imagetype($_FILES['imagen']['tmp_name']);
            if ($tipo_imagen !== false && ($tipo_imagen == IMAGETYPE_JPEG || $tipo_imagen == IMAGETYPE_PNG)) {
                $directorio = "img/";
                $nombre = $_FILES['imagen']['name'];
                if (is_dir($directorio)) {
                    $idUnico = time();
                    $nombreFichero = $idUnico . "-" . $nombre;
                    $nombreCompleto = $directorio . $nombreFichero;
                    move_uploaded_file($_FILES['imagen']['tmp_name'], $nombreCompleto);
                    echo "<li>Título: " . $_POST["titulo"] . "</li>";
                    echo "<li>Texto: " . $_POST["texto"] . "</li>";
                    echo "<li>Categoría: " . $_POST["categoria"] . "</li>";
                    echo "<li>Imagen:<br><img src='" . $nombreCompleto . "'></li>";
                } else {
                    echo "<li>Directorio no válido</li>";
                }
            } else {
                echo "<li>No se ha subido una imagen JPG o PNG</li>";
            }
        } else {
            echo "<li>Imagen: ¡No se ha podido subir el fichero!</li>";
        }
        ?>
    </ul>
    <p>[ <a href="./ejercicio2.php">Nueva búsqueda</a> ]</p>
</body>

</html>