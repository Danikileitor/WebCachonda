<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 6</title>
</head>

<body>
    <?php
    $paises = array(
        "España" => "Madrid",
        "Italia" => "Roma",
        "Suecia" => "Estocolmo",
        "Austria" => "Viena",
        "Bélgica" => "Bruselas",
        "Francia" => "París",
        "Dinamarca" => "Copenhague",
        "Portugal" => "Lisboa",
        "Alemania" => "Berlín",
        "Finlandia" => "Helsinki",
        "Países Bajos" => "Ámsterdam"
    );

    print "<h2>Lista de países de la Unión Europea y sus capitales:</h2><ul>";
    foreach ($paises as $pais => $capital) {
        print "<li>La capital de $pais es $capital</li>";
    }

    print "</ul><h2>Lista ordenada por el nombre del país:</h2><ul>";
    ksort($paises);
    foreach ($paises as $pais => $capital) {
        print "<li>La capital de $pais es $capital</li>";
    }

    print "</ul><h2>Lista ordenada por el nombre de la capital:</h2><ul>";
    asort($paises);
    foreach ($paises as $pais => $capital) {
        print "<li>La capital de $pais es $capital</li>";
    }
    print "</ul>";
    ?>
</body>

</html>