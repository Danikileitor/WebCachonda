<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 9</title>
</head>
<body>
    <p>
        <?php
            $a = "El caballo blanco de Santiago es gris";
            print "<p>" . addcslashes($a, "e,i,o,u") . "</p>";
            print "<p>" . stripcslashes($a) . "</p>";
        ?>
    </p>
</body>
</html>