<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>
<body>
    <p>
        <?php
            $correo = "daniel@gmail.com";
            $partes = explode("@", $correo);
            
            print "Correo: $correo <br>";
            print "Usuario: $partes[0] <br>";
            print "Dominio: $partes[1] <br>";
        ?>
    </p>
</body>
</html>