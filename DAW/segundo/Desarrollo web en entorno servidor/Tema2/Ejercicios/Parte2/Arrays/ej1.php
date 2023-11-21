<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
</head>

<body>
    <?php
    $dias = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];

    print "<h2>Usando bucle for each:</h2><ul>";
    foreach ($dias as $n => $dia) {
        print "<li>$n - $dia</li>";
    }

    print "</ul><h2>Usando bucle for:</h2><ul>";
    for ($i = 0; $i < sizeof($dias); $i++) {
        print "<li>$i - $dias[$i]</li>";
    }
    print "</ul>";
    ?>
</body>

</html>