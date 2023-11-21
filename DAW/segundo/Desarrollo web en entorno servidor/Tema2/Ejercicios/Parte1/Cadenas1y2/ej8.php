<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 8</title>
</head>
<body>
    <?php
        $a = "Esta cadena tiene muchas letras";
        $a1 = strpos($a, 'a');
        $a2 = strpos($a, 'm');
        $a3 = strpos($a, 'tiene');
        $a4 = strrpos($a, 'a');
        $a5 = substr($a, strpos($a, 'cadena'));
        $a6 = substr($a, 12);
        $a7 = substr($a, 18, 6);
        $a8 = substr($a, -6);
        $a9 = substr($a, -26, 6);
        $a10 = substr($a, 4, -7);
        print "<p>La primera ocurrencia de ‘a’ es $a1</p>";
        print "<p>La primera ocurrencia de ‘m’ es $a2</p>";
        print "<p>La primera ocurrencia de ‘tiene’ es $a3</p>";
        print "<p>La primera ocurrencia desde el final de ‘a’ es $a4</p>";
        print "<p>La frase desde la aparición de la palabra ‘cadena’ hasta el final es: $a5</p><br>";
        print "<p>Partes de la cadena</p><br>";
        print "<p>$a6</p>";
        print "<p>$a7</p>";
        print "<p>$a8</p>";
        print "<p>$a9</p>";
        print "<p>$a10</p>";
    ?>
</body>
</html>