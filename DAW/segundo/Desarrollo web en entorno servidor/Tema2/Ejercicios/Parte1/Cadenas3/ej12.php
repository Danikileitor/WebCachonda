<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 12</title>
</head>
<body>
    <p>
        <?php
            $a = "192.168.1.100";
            $partes = explode('.', $a);
            $valido = true;
            
            if (count($partes) !== 4) {
                $valido = false;
            }

            foreach ($partes as $parte) {
                if (!is_numeric($parte)) {
                    $valido = false;
                }

                if ($parte < 0 || $parte > 255) {
                    $valido = false;
                }
            }

            $valido ? print "La IP $a es válida." : print "La IP $a no es válida.";
        ?>
    </p>
</body>
</html>