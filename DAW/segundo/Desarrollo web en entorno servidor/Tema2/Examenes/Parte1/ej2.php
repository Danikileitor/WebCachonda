<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <p>
        <?php
            $numero = 12;
            $formato = 5;

            switch ($formato) {
                case 1:
                    printf("El valor pasado es %d en decimal", $numero);
                    break;

                case 2: 
                    printf("El valor pasado es %x en hexadecimal", $numero);
                    break;

                case 3: 
                    printf("El valor pasado es %X en Hexadecimal", $numero);
                    break;

                case 4:
                    printf("El valor pasado es %o en octal", $numero);
                    break;

                case 5:
                    printf("El valor pasado es %e en notación exponencial", $numero);
                    break;

                case 6:
                    printf("El valor pasado es %b en binario", $numero);
                    break;
                
                default:
                    printf("Formato incorrecto!!!");
                    break;
            }
        ?>
    </p>
</body>
</html>