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
        function media()
        {
            $cantidad = func_num_args();
            $suma = 0;
            for ($i = 0; $i < $cantidad; $i++) {
                $suma += func_get_arg($i);
            }
            return $suma / $cantidad;
        }

        printf("La media de los números indicados es: %.2f", media(2, 4, 7, 8, 2, 5, 9));
        ?>
    </p>
</body>

</html>