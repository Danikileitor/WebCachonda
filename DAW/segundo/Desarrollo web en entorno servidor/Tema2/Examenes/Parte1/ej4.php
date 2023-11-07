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
            $cad = "Hola que tal";
            $n = 2;
            $palabras = explode(" ", $cad);

            print $palabras[$n-1];
        ?>
    </p>
</body>
</html>