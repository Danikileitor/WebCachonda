<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 6</title>
</head>
<body>
    <p>
        <?php
            $a = " ... Hola a todos ... ";

            print "<h2>1º Anteriores al texto</h2>";
            print ltrim($a, " .");

            print "<h2>2º Posteriores al texto</h2>";
            print rtrim($a, " .");

            print "<h2>3º Anteriores y posteriores</h2>";
            print trim($a, " .");
        ?>
    </p>
</body>
</html>