<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2 - Resultados</title>
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
        echo "<li>Sexo: ".$_REQUEST["sexo"]."</li>";
        echo "<li>Extras:<ul>";
        $extras = $_REQUEST["extras"];
        foreach ($extras as $extra) {
            echo "<li>".$extra."</li>";
        }
        echo "</ul></li>";
        echo "<li>Fichero: <i>Lo veremos en el ejercicio 4</i></li>";
        echo "<li>Oculto: ".$_REQUEST["oculto"]."</li>";
        echo "<li>Contraseña: ".$_REQUEST["pass"]."</li>";
        echo "<li>Color: ".$_REQUEST["color"]."</li>";
        echo "<li>Idiomas:<ul>";
        $idiomas = $_REQUEST["idiomas"];
        foreach ($idiomas as $idioma) {
            echo "<li>".$idioma."</li>";
        }
        echo "</ul></li>";
        echo "<li>Comentario: ".$_REQUEST["comentario"]."</li>";
        ?>
    </ul>
    <p>[ <a href="./ejercicio2.php">Nueva búsqueda</a> ]</p>
</body>

</html>