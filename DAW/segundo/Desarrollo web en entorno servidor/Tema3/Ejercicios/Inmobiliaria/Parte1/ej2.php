<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inmobiliaria - Inserción</title>
    <link rel="stylesheet" href="css/estilo.css">
</head>

<body>
    <h1>Inserción de nueva noticia</h1>
    <form name="formulario" action="./ej2-resultado.php" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <th>Título: *</th>
                <td><input type="text" name="titulo" required></td>
            </tr>
            <tr>
                <th>Texto: *</th>
                <td><textarea name="texto" required></textarea></td>
            </tr>
            <tr>
                <th>Categoría:</th>
                <td><select name="categoria">
                        <option value="promociones" selected>promociones</option>
                        <option value="costas">costas</option>
                        <option value="ofertas">ofertas</option>
                    </select></td>
            </tr>
            <tr>
                <th>Imagen:</th>
                <td><input type="file" accept="image/*" name="imagen"></td>
            </tr>
            <tr>
                <td><input type="submit" name="insertar" value="Insertar noticia"></td>
            </tr>
        </table>
    </form>
</body>

</html>