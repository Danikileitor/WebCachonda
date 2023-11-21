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
            $b = substr_replace($a, 'o', -1);
            print $b;
        ?>
    </p>
</body>
</html>