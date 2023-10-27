<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <p>
        <?php
            $a = "Esto es una cadena";
            $b = " un poco más larga.";
            $c = $a . $b;
            print $c . "<br>";
            print "La posición de la primera [c] es: " . strpos($c, 'c') . "<br>";
            print "La posición de la última [c] es: " . strrpos($c, 'c') . "<br>";
            print "La posición de la palabra [poco] es: " . strpos($c, "poco") . "<br>";
        ?>
    </p>
</body>
</html>