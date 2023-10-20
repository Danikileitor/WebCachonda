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
            $Nom = "Daniel Marcos";
            $Apell1 = "Guerra";
            $Apell2 = "Gómez";
            $edad = 28;

            print "<p>Me llamo $Nom $Apell1 $Apell2 y tengo $edad años</p>";
            print "<p>Me llamo " . $Nom . " " . $Apell1 . " " . $Apell2 . " y tengo " . $edad . " años</p>";
            print "<p>Me llamo $Nom\n$Apell1\n$Apell2\ny tengo $edad años</p>";
            print "<p>Me llamo $Nom\n$Apell1\n$Apell2\ny tengo $edad años</p>";
        ?>
    </p>
</body>
</html>