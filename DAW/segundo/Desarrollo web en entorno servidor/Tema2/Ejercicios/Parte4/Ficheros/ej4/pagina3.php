<?php
function mostrarDatos()
{
    if ($fichero = @fopen("datos.txt", "r")) {
        $contenido = file("datos.txt");

        echo "<pre>";
        foreach ($contenido as $linea) {
            echo "$linea";
        }
        echo "</pre>";

        fclose($fichero);
    } else {
        echo "<p>No se pudo acceder al fichero 'datos.txt'</p>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4 - Sugerencias</title>
</head>

<body>
    <?php mostrarDatos(); ?>
</body>

</html>