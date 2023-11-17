<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>

<body>
    <?php
    $pila = array("cinco" => 5, "uno" => 1, "cuatro" => 4, "dos" => 2, "tres" => 3);

    print "<h2>Usando asort:</h2><ul>";
    asort($pila);
    foreach ($pila as $numero => $n) {
        print "<li>$numero - $n</li>";
    }

    print "</ul><h2>Usando arsort:</h2><ul>";
    arsort($pila);
    foreach ($pila as $numero => $n) {
        print "<li>$numero - $n</li>";
    }

    print "</ul><h2>Usando ksort:</h2><ul>";
    ksort($pila);
    foreach ($pila as $numero => $n) {
        print "<li>$numero - $n</li>";
    }

    print "</ul><h2>Usando sort:</h2><ul>";
    sort($pila);
    foreach ($pila as $numero => $n) {
        print "<li>$numero - $n</li>";
    }

    print "</ul><h2>Usando rsort:</h2><ul>";
    rsort($pila);
    foreach ($pila as $numero => $n) {
        print "<li>$numero - $n</li>";
    }
    print "</ul>";
    ?>
</body>

</html>