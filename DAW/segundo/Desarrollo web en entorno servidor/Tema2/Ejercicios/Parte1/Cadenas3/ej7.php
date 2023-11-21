<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>
<body>
    <p>
        <?php
            $a = "Tremendo texto";
            print str_pad($a, 20, "#", STR_PAD_BOTH);
        ?>
    </p>
</body>
</html>