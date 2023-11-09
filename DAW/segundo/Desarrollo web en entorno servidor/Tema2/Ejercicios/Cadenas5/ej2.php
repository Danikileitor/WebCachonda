<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>

<body>
    <?php
    function infoPais($pais, $capital = "Madrid", $habitantes = "muchos")
    {
        return "La capital de $pais es $capital y tiene $habitantes habitantes.";
    }

    printf("<p>%s</p>", infoPais("España"));
    printf("<p>%s</p>", infoPais("Portugal", "Lisboa"));
    printf("<p>%s</p>", infoPais("Francia", "París", 6000000));
    ?>
</body>

</html>