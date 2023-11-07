<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>
<body>
    <p>
        <?php
            $a = "Observa a cada una";
            $b = substr($a, 0, strlen($a)-1) . 'o';
            print $b;
        ?>
    </p>
</body>
</html>