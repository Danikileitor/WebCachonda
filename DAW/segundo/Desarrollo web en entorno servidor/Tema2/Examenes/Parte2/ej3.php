<?php
//Abajo en el body se encuentra la llamada de la función
function eliminaPalabra($c, $n)
{
    $a = explode(" ", $c);
    if ($n >= 1 && $n <= count($a)) {
        array_splice($a, $n - 1, 1);
        return implode(" ", $a);
    } else {
        return "La posición a eliminar no existe";
    }
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
    <style>
        body,
        div {
            background-color: whitesmoke;
            margin: 20px auto;
            width: fit-content;
        }
    </style>
</head>

<body>
    <h1>Cortar un elemento de una cadena</h1>
    <div>
        <?php
        echo eliminaPalabra("Hola amigo, que tal", 3);// <-- Aquí está la llamada de la función
        ?>
    </div>
</body>

</html>