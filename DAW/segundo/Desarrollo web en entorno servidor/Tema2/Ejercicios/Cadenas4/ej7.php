<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>
<body>
    <ol type="a">
        <?php
            $cadena = "Bienvenido a nestro cine. Ha efectuado usted la decisión correcta.";
            $a = substr($cadena, 26);
            $b = ucfirst(substr($cadena, 39));
            $c = substr($cadena, 26, 5);
            $d = substr_replace(substr($cadena, 26, 36), "q", 2, 0);
            $e = ucfirst(substr($cadena, 21, 10));
            $f = ucfirst(substr($cadena, 21, 41));
            print "<li>" . $a . "</li>";
            print "<li>" . $b . "</li>";
            print "<li>" . $c . "</li>";
            print "<li>" . $d . "</li>";
            print "<li>" . $e . "</li>";
            print "<li>" . $f;
        ?>
    </ol>
</body>
</html>