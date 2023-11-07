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
            $cadena = "Bienvenido a nestro cine. Ha efectuado usted la decisión correcta.";
            $nombrecliente = ", Pablo González. ";
            $c = substr_replace($cadena, $nombrecliente, 24, 2);
            print $c;
        ?>
    </p>
</body>
</html>