<?php
function informar()
{
    $nombre = $_REQUEST["nombre"];
    $comentario = $_REQUEST["comentario"];
    echo "<pre>Los datos se guardaron correctamente:\n";
    echo "--------------------------------------------------------\n";
    echo "$nombre\n";
    echo "$comentario\n";
    echo "--------------------------------------------------------</pre>";
    echo "<p><a href='#'></a></p>";
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
    <?php informar(); ?>
</body>

</html>