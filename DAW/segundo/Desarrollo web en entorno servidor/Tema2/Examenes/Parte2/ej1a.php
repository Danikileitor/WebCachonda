<?php
//Abajo en el body se encuentra la llamada de la función
function plantarArbol($altura)
{
    echo "<table>";
    for ($i = $altura; $i > 0; $i--) {
        echo "<tr>";
        //Parte izquierda de la nieve
        for ($j = 1; $j < $i; $j++) {
            echo "<td class='nieve'>*</td>";
        }
        //Parte izquierda y central del árbol
        for ($j = $altura - $i; $j >= 0; $j--) {
            echo "<td class='arbol'>\</td>";
        }
        //Parte derecha del árbol
        for ($j = $altura - $i; $j > 0; $j--) {
            echo "<td class='arbol'>\</td>";
        }
        //Parte derecha de la nieve
        for ($j = 1; $j < $i; $j++) {
            echo "<td class='nieve'>*</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1 A</title>
    <style>
        body {
            background-color: whitesmoke;
            margin: 20px auto;
            width: fit-content;
        }

        table {
            margin: 0 auto;
        }

        td {
            width: 10px;
            text-align: center;
        }

        .nieve {
            background-color: #00FFFF;
            color: white;
        }

        .arbol {
            background-color: #00FFFF;
            color: green;
        }
    </style>
</head>

<body>
    <h1>Tremendo árbol navideño</h1>
    <?php
    plantarArbol(13);// <-- Aquí está la llamada de la función
    ?>
</body>

</html>