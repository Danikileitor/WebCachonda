<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>

<body>
    <?php
    function diasSegundos($dias)
    {
        return $dias * 86400;
    }

    $dias = 3;
    printf("En $dias días hay %d segundos.", diasSegundos($dias));
    ?>
</body>

</html>