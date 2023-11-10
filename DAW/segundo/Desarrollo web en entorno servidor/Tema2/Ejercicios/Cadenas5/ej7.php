<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>

<body>
    <?php
    function cuadrado($n)
    {
        return $n * $n;
    }

    function cubo($n)
    {
        return cuadrado($n) * $n;
    }

    $n1 = 3;
    $n2 = 4;
    printf("<p>El cuadrado de $n1 es %d.</p>", cuadrado($n1));
    printf("<p>El cubo de $n2 es %d.</p>", cubo($n2));
    ?>
</body>

</html>