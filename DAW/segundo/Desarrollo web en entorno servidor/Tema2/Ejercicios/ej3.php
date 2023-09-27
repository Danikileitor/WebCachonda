<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>
<body>
    <?php
        $a = strtolower("correo@valido.com");
        $correo = explode("@",$a);
        if (strpos($a, "@") == true && strpos($a, ".") == true) {
            if (strlen($correo[0] < 3) && strlen($correo[0] > 20)) {
                print "<p>El usuario ha de tener entre 3 y 20 caracteres.</p>";
            } else if (strlen($correo[0]) != strspn($correo[0], "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_")) {
                print "<p>Solo se admiten letras y los cararcteres _ y -</p>";
            }
            print "<p>Correo válido</p>";
            print "<p>Usuario: $correo[0]</p>";
            print "<p>Dominio: $correo[1]</p>";
        } else {
            print "<p>Correo no válido</p>";
        }
    ?>
</body>
</html>