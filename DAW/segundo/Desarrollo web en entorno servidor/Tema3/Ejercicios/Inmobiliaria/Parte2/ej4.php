<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inmobiliaria - Filtrar</title>
    <link rel="stylesheet" href="css/estilo.css">
</head>

<body>
    <h1>Consulta de noticias</h1>
    <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
        <p>Mostrar noticias de la categoría: <select name="filtro">
                <option selected value="todas">Todas</option>
                <option value="promociones">Promociones</option>
                <option value="ofertas">Ofertas</option>
                <option value="costas">Costas</option>
            </select> <input type="submit" name="actualizar" value="Actualizar"></p>
    </form>
    <br>
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
            if (isset($_POST["filtro"]) && $_POST["filtro"] !== "todas") {
                $filtro = $_POST["filtro"];
                $sql = "SELECT titulo, texto, categoria, fecha, imagen FROM noticias WHERE categoria = ? ORDER BY fecha DESC";
                $resultado = $dwes->prepare($sql);
                $resultado->execute([$filtro]);
            } else {
                $sql = "SELECT titulo, texto, categoria, fecha, imagen FROM noticias ORDER BY fecha DESC";
                $resultado = $dwes->query($sql);
            }

            while ($noticia = $resultado->fetch(PDO::FETCH_OBJ)) {
                echo "<tr><td>$noticia->titulo</td><td>$noticia->texto</td><td>$noticia->categoria</td><td>$noticia->fecha</td><td>$noticia->imagen</td></tr>";
            }
        } catch (PDOException $e) {
            echo "Error: " . $e->getMessage();
        }
        ?>
    </table>
</body>

</html>