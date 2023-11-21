<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
</head>

<body>
    <?php
    $colores = [
        'Colores fuertes' => ['Rojo' => 'FF0000', 'Verde' => '00FF00', 'Azul' => '0000FF'],
        'Colores suaves' => ['Rosa' => 'FE9ABC', 'Amarillo' => 'FDF189', 'Malva' => 'BC8F8F']
    ];

    print "<p>¿Se encuentra el color 'FF88CC' en el array? ";
    if (in_array("FF88CC", $colores["Colores fuertes"]) || in_array("FF88CC", $colores["Colores suaves"])) {
        print "Sí.</p>";
    } else {
        print "No.</p>";
    }

    print "<p>¿Se encuentra el color 'FF0000' en el array? ";
    if (in_array("FF0000", $colores["Colores fuertes"]) || in_array("FF0000", $colores["Colores suaves"])) {
        print "Sí.</p>";
    } else {
        print "No.</p>";
    }
    ?>
</body>

</html>