<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>

<body>
    <?php
    $colores = [
        'Colores fuertes' => ['Rojo:FF0000', 'Verde:00FF00', 'Azul:0000FF'],
        'Colores suaves' => ['Rosa:FE9ABC', 'Amarillo:FDF189', 'Malva:BC8F8F']
    ];

    print "<h2>Tabla de colores</h2><table border='1'>";
    foreach ($colores as $tipo => $listaColores) {
        print "<tr><th>$tipo</th>";

        foreach ($listaColores as $color) {
            $fondo = explode(':', $color);
            print "<td bgcolor='$fondo[1]'>$color</td>";
        }

        print "</tr>";
    }
    print "</table>";
    ?>
</body>

</html>