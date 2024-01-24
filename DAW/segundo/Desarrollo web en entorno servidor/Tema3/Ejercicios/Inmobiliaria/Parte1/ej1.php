<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inmobiliaria - Consulta</title>
    <link rel="stylesheet" href="css/estilo.css">
</head>

<body>
    <h1>Consulta de noticias</h1>
    <table>
        <tr>
            <th>Título</th>
            <th>Texto</th>
            <th>Categoría</th>
            <th>Fecha</th>
            <th>Imagen</th>
        </tr>
        <?php
        @$dwes = new mysqli('localhost', 'dwes', 'abc123.', 'inmobiliaria');
        $error = $dwes->connect_errno;
        if ($error == null) {
            $resultado = $dwes->query('SELECT titulo, texto, categoria, fecha, imagen FROM noticias ORDER BY fecha DESC');
            $noticia = $resultado->fetch_object();
            while ($noticia != null) {
                print "<tr><td>$noticia->titulo</td><td>$noticia->texto</td><td>$noticia->categoria</td><td>$noticia->fecha</td><td>$noticia->imagen</td></tr>";
                $noticia = $resultado->fetch_object();
            }
            $dwes->close();
        }
        ?>
    </table>
</body>

</html>