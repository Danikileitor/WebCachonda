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
            $a = "El caballo blanco de Santiago es gris";
            $b = explode(" ",$a);
            print end($b);
        ?>
    </p>
</body>
</html>