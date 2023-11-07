<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>
<body>
    <p>
        <?php
            $telefono = "654 65 65 65";

            if (preg_match("/^[6789]\d\d\s\d\d\s\d\d\s\d\d$/", $telefono)) {
                if (preg_match("/^[67]/", $telefono)) {
                    print "$telefono es un teléfono móvil válido.";
                } else {
                    print "$telefono es un teléfono fijo válido.";
                }
            } else {
                print "Error, no se ha introducido un número de teléfono en el formato correcto!!!";
            }
        ?>
    </p>
</body>
</html>