<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>

<body>
    <?php
    $alumnos = ['Víctor', 'Jairo', 'Alberto', 'Pedro', 'Daniel'];
    $primeros = array_slice($alumnos, 0, 3);
    $ultimos = array_splice($alumnos, -2);

    print "<h2>Los 3 primeros:</h2><ul>";
    foreach ($primeros as $n => $alumno) {
        print "<li>$alumno</li>";
    }

    print "</ul><h2>Los 2 últimos:</h2><ul>";
    for ($i = 0; $i < sizeof($ultimos); $i++) {
        print "<li>$ultimos[$i]</li>";
    }
    print "</ul>";
    ?>
</body>

</html>