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
            $cad1 = "Hola9";
            $cad2 = "Hola10";
            $resultado;
            $modo = 4;
            $ncaracteres = 4;

            switch ($modo) {
                case 1:
                    $resultado = strcmp($cad1, $cad2);
                    break;

                case 2: 
                    $resultado = strcasecmp($cad1, $cad2);
                    break;

                case 3: 
                    $resultado = strnatcmp($cad1, $cad2);
                    break;

                case 4:
                    $resultado = strncmp($cad1, $cad2, $ncaracteres);
                    break;
            }

            if ($resultado < 0) {
                print "$cad1 es menor que $cad2";
            } else if ($resultado > 0) {
                print "$cad1 es mayor que $cad2";
            } else {
                print "$cad1 es igual que $cad2";
            }
            
        ?>
    </p>
</body>
</html>