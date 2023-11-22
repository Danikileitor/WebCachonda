<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1 - Resultados</title>
    <style>
        * {
            font-family: Arial, sans-serif;
        }

        h1 {
            color: blue;
        }
    </style>
</head>

<body>
    <h1>Formulario simple. Resultados del formulario</h1>
    <p>Estos son los datos introducidos:</p>
    <ul>
        <?php
        echo "<li>Texto de búsqueda: ".$_REQUEST["busqueda"]."</li>";
        echo "<li>Buscar en: ".$_REQUEST["buscaren"]."</li>";
        echo "<li>Género: ".$_REQUEST["genero"]."</li>";
        ?>
    </ul>
    <p>[ <a href="./ejercicio1.php">Nueva búsqueda</a> ]</p>
</body>

</html>