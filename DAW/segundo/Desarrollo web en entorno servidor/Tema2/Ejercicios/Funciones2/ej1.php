<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
</head>

<body>
    <?php
    function intercambio(&$a, &$b)
    {
        $c = $a;
        $a = $b;
        $b = $c;
    }

    $a = 3;
    $b = 7;
    printf('<p>La variable $a vale %d y la variable $b vale %d.</p>', $a, $b);
    intercambio($a, $b);
    printf('<p>Ahora la variable $a vale %d y la variable $b vale %d.</p>', $a, $b);
    ?>
</body>

</html>