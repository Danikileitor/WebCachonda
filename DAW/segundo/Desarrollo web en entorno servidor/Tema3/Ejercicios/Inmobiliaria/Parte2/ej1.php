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
        $dwes = new PDO('mysql:host=localhost;dbname=inmobiliaria', 'dwes', 'abc123.');
        $dwes->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        try {
            $sql = "SELECT titulo, texto, categoria, fecha, imagen FROM noticias ORDER BY fecha DESC";
            $resultado = $dwes->query($sql);

            while ($noticia = $resultado->fetch(PDO::FETCH_OBJ)) {
                echo "<tr><td>$noticia->titulo</td><td>$noticia->texto</td><td>$noticia->categoria</td><td>$noticia->fecha</td><td>$noticia->imagen</td></tr>";
            }

            $dwes = null; // Cerramos la conexión
        } catch (PDOException $e) {
            echo "Error: " . $e->getMessage();
        }
        ?>
    </table>
</body>

</html>