<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
    <style>
        * {
            font-family: Arial, sans-serif;
        }

        h1 {
            color: blue;
        }

        h2 {
            font-style: italic;
        }

        table {
            border: 1px dotted blue;
            padding: 5px;
        }

        td:first-child {
            font-weight: bold;
        }
    </style>
</head>

<body>
    <h1>Subida de ficheros</h1>
    <?php
    if (isset($_REQUEST['insertar'])) {
        echo "<h2>Resultado de la inserción de nueva noticia</h2>";
        if (empty($_REQUEST['titulo']) || empty($_REQUEST['texto'])) {
            echo "<p>No se ha podido realizar la inserción debido a los siguientes errores:</p><ul>";
            if (empty($_REQUEST['titulo'])) {
                echo "<li>Se requiere el título de la noticia</li>";
            }
            if (empty($_REQUEST['texto'])) {
                echo "<li>Se requiere el texto de la noticia</li>";
            }
            echo "</ul><p>[ <a href='./ejercicio4.php'>Volver</a> ]</p>";
        } else {
            echo "<p>La noticia ha sido recibida correctamente:</p><ul>";
            echo "<li>Título: " . $_REQUEST["titulo"] . "</li>";
            echo "<li>Texto: " . $_REQUEST["texto"] . "</li>";
            echo "<li>Categoría: " . $_REQUEST["categoria"] . "</li>";
            echo "<li>Imagen: " . $_REQUEST['imagen']['name'] . "</li>";
            echo "</ul><p>[ <a href='./ejercicio4.php'>Insertar otra noticia</a> ]</p>";
        }
    } else {
    ?>
        <h2>Insertar nueva noticia</h2>
        <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Título: *</td>
                    <td><input type="text" name="titulo"></td>
                </tr>
                <tr>
                    <td>Texto: *</td>
                    <td><textarea name="texto" cols="50" rows="4"></textarea></td>
                </tr>
                <tr>
                    <td>Categoría:</td>
                    <td>
                        <select name="categoria">
                            <option value="promociones" selected>Promociones</option>
                            <option value="salseo">Salseo</option>
                            <option value="otros">Otros</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Imagen: </td>
                    <td><input type="file" accept="image/*" name="imagen"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="insertar" value="Insertar noticia"></td>
                </tr>
            </table>
        </form>
        <p>NOTA: los datos marcados con (*) deben ser rellenados obligatoriamente</p>
    <?php
    }
    ?>
</body>

</html>