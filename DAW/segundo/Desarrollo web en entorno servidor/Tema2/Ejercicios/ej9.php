<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 9</title>
</head>
<body>
    <?php
        $a = "Bienvenidos al a aventura de aprender PHP en 30 horas";
        //Divido la frase en 3 partes iguales y muestro la parte central
        $primerTercio = strlen($a)/3;
        $segundoTercio = strlen($a)*2/3;
        $central = substr($a, $primerTercio, $segundoTercio-$primerTercio);
        $posPHP = strpos($a, 'PHP');
        $b = str_replace("aventura", "<b>misión</b>", $a);

        print "<p>La parte central de la frase es: $central</p>";
        print "<p>La posición de PHP es: $posPHP</p>";
        print "<p>La frase modificada es: $b</p>";
    ?>
</body>
</html>