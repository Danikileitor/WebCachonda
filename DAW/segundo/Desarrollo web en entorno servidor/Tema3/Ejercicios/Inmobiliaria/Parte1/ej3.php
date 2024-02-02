<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inmobiliaria - Eliminar</title>
    <link rel="stylesheet" href="css/estilo.css">
</head>

<body>
    <form name="formulario" action="./ej3-resultado.php" method="post" enctype="multipart/form-data">
    <h1>Eliminación de noticias</h1>
    <table>
        <tr>
            <th>Título</th>
            <th>Texto</th>
            <th>Categoría</th>
            <th>Fecha</th>
            <th>Imagen</th>
            <th>Borrar</th>
        </tr>
        <?php
        @$dwes = new mysqli('localhost', 'dwes', 'abc123.', 'inmobiliaria');
        $error = $dwes->connect_errno;
        if ($error == null) {
            $resultado = $dwes->query('SELECT titulo, texto, categoria, fecha, imagen FROM noticias ORDER BY fecha DESC');
            $noticia = $resultado->fetch_object();
            $n = 1;
            while ($noticia != null) {
                print "<tr><td>$noticia->titulo</td><td>$noticia->texto</td><td>$noticia->categoria</td><td>$noticia->fecha</td><td>$noticia->imagen</td><td><input type='checkbox' id='$n'></td></tr>";
                $noticia = $resultado->fetch_object();
                $n++;
            }
            $dwes->close();
        }
        ?>
    </table><br>
    <input type="submit" name="eliminar" value="Eliminar noticias marcadas">
    </form>
</body>

</html>