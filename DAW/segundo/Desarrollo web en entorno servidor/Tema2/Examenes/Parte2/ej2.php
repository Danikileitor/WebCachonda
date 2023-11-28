<?php
//Array de ejemplo usado en la llamada de la función:
$colores = ["Rojo", "Verde", "Azul", "Violeta", "Amarillo", "Rosa", "Gris", "Negro", "Marrón", "Blanco"];
//Abajo en el body se encuentra la llamada de la función
function ordenar($a, $n = 1)
{
    switch ($n) {
        case '1':
            asort($a);
            break;
        case 2:
            arsort($a);
            break;
        case 3:
            ksort($a);
            break;
        case 4:
            krsort($a);
            break;
        default:
            return "parámetro incorrecto";
    }
    return $a;
}

function imprimirArray($a)
{
    if (is_array($a)) {
        foreach ($a as $key => $value) {
            echo "$key => $value<br>";
        }
    } else {
        echo $a;
    }
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
    <style>
        body, div {
            background-color: whitesmoke;
            margin: 20px auto;
            width: fit-content;
        }
    </style>
</head>

<body>
    <h1>Ordenar Arrays</h1>
    <div>
    <?php
    imprimirArray(ordenar($colores, 1));// <-- Aquí está la llamada de la función
    ?>
    </div>
</body>

</html>