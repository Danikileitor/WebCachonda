<?php
function guardareinformar()
{
    $nombre = $_REQUEST["nombre"];
    $comentario = $_REQUEST["comentario"];
    if ($fichero = @fopen("datos.txt", "a")) {
        fwrite($fichero, "--------------------------------------------------------\n");
        fwrite($fichero, "$nombre\n");
        fwrite($fichero, "$comentario\n");
        fclose($fichero);
        echo "<pre>Los datos se guardaron correctamente:\n";
        echo "--------------------------------------------------------\n";
        echo "$nombre\n";
        echo "$comentario\n";
        echo "--------------------------------------------------------</pre>";
        echo "<p><a href='pagina3.php'>ver fichero</a></p>";
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
    <?php guardareinformar(); ?>
</body>

</html>