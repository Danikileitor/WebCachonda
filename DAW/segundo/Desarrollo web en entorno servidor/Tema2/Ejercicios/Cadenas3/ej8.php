<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 8</title>
</head>
<body>
    <p>
        <?php
            $a = "vamos al o'Brian";
            print addslashes($a);
            print ("\n");//metemos un salto de línea para diferenciar
            print stripcslashes($a);
        ?>
    </p>
</body>
</html>