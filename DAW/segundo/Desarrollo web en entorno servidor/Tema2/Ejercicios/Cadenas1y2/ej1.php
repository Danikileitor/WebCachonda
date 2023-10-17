<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
</head>
<body>
    <p>
        <?php
            $a = strtolower("casa");
            $b = strtolower("pasa");
            if (substr($a, -3) === substr($b, -3)) {
                print "Las palabras riman.";
            } else if (substr($a, -2) === substr($b, -2)) {
                print "Las palabras riman un poco.";
            } else {
                print "Las palabras no riman.";
            }
        ?>
    </p>
</body>
</html>