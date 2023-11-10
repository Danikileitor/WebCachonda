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
        function media(...$numeros)
        {
            $cantidad = 0;
            $suma = 0;
            foreach ($numeros as $n) {
                $cantidad++;
                $suma += $n;
            }
            return $suma / $cantidad;
        }

        printf("La media de los números indicados es: %.2f", media(2, 4, 7, 8, 2, 5, 9));
        ?>
    </p>
</body>

</html>