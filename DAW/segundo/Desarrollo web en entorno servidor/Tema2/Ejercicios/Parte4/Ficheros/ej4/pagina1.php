<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4 - Sugerencias</title>
    <style>
        * {
            font-family: Arial, sans-serif;
        }

        h1 {
            color: blue;
        }

        td:first-child {
            vertical-align: top;
            max-width: 13rem;
        }

        label {
            font-weight: bold;
        }
    </style>
</head>

<body>
    <h1>Sugerencias para nuestra página web</h1>
    <form name="formulario" action="pagina2.php" method="post">
        <table>
            <tr>
                <td><label for="nombre">Introduzca su nombre:</label></td>
                <td><input type="text" name="nombre" id="nombre"></td>
            </tr>
            <tr>
                <td><label for="comentario">Comentarios sobre esta página web:</label></td>
                <td><textarea name="comentario" id="comentario" cols="50" rows="10"></textarea></td>
            </tr>
            <tr>
                <td><input type="submit" name="enviar" id="enviar" value="Enviar"></td>
            </tr>
        </table>
    </form>
</body>

</html>