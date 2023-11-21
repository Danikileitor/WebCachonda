<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>

<body>
    <?php
    //Imprimimos el array para verificar el resultado:
    print "<p>Números generados: ";
    $aleatorios;
    for ($i = 0; $i < 10; $i++) {
        $aleatorios[$i] = rand(1, 10);
        print $aleatorios[$i] . " ";
    }
    print "</p>";

    $veces2 = 0;
    foreach ($aleatorios as $n) {
        $veces2 += $n === 2 ? 1 : 0;
    }

    print "<p>Cantidad de veces que ha salido el número 2: $veces2</p>";
    ?>
</body>

</html>