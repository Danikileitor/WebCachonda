<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>

<body>
    <?php
    function semisuma($a, $b)
    {
        return ($a + $b) / 2;
    }

    $a = 2;
    $b = 3;
    printf("<p>La semisuma de $a y $b es %.2f</p>", semisuma($a, $b));
    ?>
</body>

</html>