<?php
function copiarFichero($fichero)
{
    $fsalida = @fopen("fich_salida.txt", 'w');
    $contenido = file($fichero);

    foreach ($contenido as $linea) {
        fwrite($fsalida, $linea . "\n");
    }

    fclose($fsalida);
    echo "<p>Se ha generado el fichero: 'fich_salida.txt' con " . filesize("fich_salida.txt") . " bytes.</p>";
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1 - Lectura</title>
</head>

<body>
    <?php
    $origen = "../../../Parte1/Cadenas3/ej1.php";
    copiarFichero($origen);
    ?>
</body>

</html>