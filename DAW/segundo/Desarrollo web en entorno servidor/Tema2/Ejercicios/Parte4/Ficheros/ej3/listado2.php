<?php
function listado($ruta)
{
    if ($directorio = opendir($ruta)) {
        while (false !== ($fichero = readdir($directorio))) {
            $rutaCompleta = "$ruta/$fichero";
            if (is_file($rutaCompleta))
            echo "<p>Fichero: [$fichero] - " . date("F d Y H:i:s", filemtime($rutaCompleta)) . " - " . filesize($rutaCompleta) . ' bytes.</p>';
        }
        closedir($directorio);
    } else {
        echo "<font color='red'>¡El directorio indicado no existe!</font>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3 - Listado</title>
</head>

<body>
    <?php
    $ruta = "../../../Parte3/Formularios";
    listado($ruta);
    ?>
</body>

</html>