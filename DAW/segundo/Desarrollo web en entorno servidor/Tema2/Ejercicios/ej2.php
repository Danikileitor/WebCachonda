<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <?php
        $a = strtolower("correo@valido.com");
        $correo = explode("@",$a);
        if (strpos($a, "@") == true && strpos($a, ".") == true) {
            print "<p>Correo válido</p>";
            print "<p>Usuario: $correo[0]</p>";
            print "<p>Dominio: $correo[1]</p>";
        } else {
            print "<p>Correo no válido</p>";
        }
    ?>
</body>
</html>