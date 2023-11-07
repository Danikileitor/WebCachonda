<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
</head>
<body>
    <p>
        <?php
            $a = "Esto es una cadena";
            $b = " un poco más larga";
            $c = $a . $b;
            print $c . "<br>";
            print "El primer carácter es: " . substr($c, 0, 1) . "<br>";
            print "El tercer carácter es: " . substr($c, 2, 1) . "<br>";
            print "El último carácter es: " . substr($c, -1, 1) . "<br>";
        ?>
    </p>
</body>
</html>