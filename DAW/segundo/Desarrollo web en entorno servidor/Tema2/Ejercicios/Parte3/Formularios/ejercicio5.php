<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
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

        .error {
            font-weight: normal;
            color: red;
        }
    </style>
</head>

<body>
    <h1>Formulario simple</h1>
    <?php
    if (isset($_REQUEST['buscar']) && !empty($_REQUEST["busqueda"])) {
        echo "<h2>Resultado de la búsqueda de canciones</h2>";
        echo "<ul><li>Texto de búsqueda: " . $_REQUEST["busqueda"] . "</li>";
        echo "<li>Buscar en: " . $_REQUEST["buscaren"] . "</li>";
        echo "<li>Género: " . $_REQUEST["genero"] . "</li></ul>";
        echo "<p>[ <a href='./ejercicio3.php'>Nueva búsqueda</a> ]</p>";
    } else {
    ?>
        <h2>Búsqueda de canciones</h2>
        <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
            <table>
                <tr>
                    <td>Texto a buscar: *</td>
                    <td><input type="text" name="busqueda"></td>
                </tr>
                <?php
                if (isset($_REQUEST['buscar']) && empty($_REQUEST["busqueda"])) {
                    echo "<tr><td colspan='2'><span class='error'>¡Debe introducir el texto de búsqueda!</span></td></tr>";
                }
                ?>
                <tr>
                    <td>Buscar en:</td>
                    <td>
                        <input type="radio" name="buscaren" value="titulos" id="titulos"><label for="titulos">Títulos de canción</label>
                        <input type="radio" name="buscaren" value="album" id="album"><label for="album">Nombres de álbum</label>
                        <input type="radio" name="buscaren" value="ambos" id="ambos" checked><label for="ambos">Ambos campos</label>
                    </td>
                </tr>
                <tr>
                    <td>Género musical:</td>
                    <td>
                        <select name="genero">
                            <option value="todos" selected>Todos</option>
                            <option value="acustica">Acústica</option>
                            <option value="banda">Banda Sonora</option>
                            <option value="acustica">Blues</option>
                            <option value="electronica">Electrónica</option>
                            <option value="folk">Folk</option>
                            <option value="jazz">Jazz</option>
                            <option value="newage">New Age</option>
                            <option value="pop">Pop</option>
                            <option value="rock">Rock</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" name="buscar" value="Buscar"></td>
                </tr>
            </table>
        </form>
    <?php
    }
    ?>
</body>

</html>