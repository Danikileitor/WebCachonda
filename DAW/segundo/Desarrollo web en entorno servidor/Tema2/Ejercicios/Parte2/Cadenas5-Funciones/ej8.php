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
        function sumatoria($n)
        {
            if ($n == 1) {
                return 1;
            } else {
                return $n + sumatoria($n - 1);
            }
        }

        $n = 7;
        printf("La sumatoria de $n es %d.", sumatoria($n));
        ?>
    </p>
</body>

</html>