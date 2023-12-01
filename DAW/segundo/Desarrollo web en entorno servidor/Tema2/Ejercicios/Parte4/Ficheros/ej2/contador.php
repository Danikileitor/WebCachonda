<?php
function contadorVisitas($fichero = "visitas.txt", $bytes = 8)
{
    $fvisitas = @fopen($fichero, 'r+');
    $contador = fgets($fvisitas, $bytes);

    echo "<p>Esta es la visita número: $contador</p>";
    $contador++;
    rewind($fvisitas);
    fwrite($fvisitas, $contador);

    fclose($fvisitas);
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2 - Contador de visitas</title>
</head>

<body>
    <?php
    contadorVisitas();
    ?>
</body>

</html>