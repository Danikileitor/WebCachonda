<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 6</title>
</head>

<body>
    <p>
        <?php
        function negrita($texto)
        {
            return "<span style='font-weight: bold'>$texto</span>";
        }

        printf("La película más taquillera de la historia es %s.", negrita("Avatar de James Cameron"));
        ?>
    </p>
</body>

</html>