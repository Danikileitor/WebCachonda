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
    <form name="formulario" action="./ej2-resultado.php" method="post" enctype="multipart/form-data" class="borde">
        <p><label>Título: *</label>
            <input type="text" name="titulo" required>
        </p>

        <p><label>Texto: *</label>
            <textarea name="texto" required></textarea>
        </p>

        <p><label>Categoría:</label>
            <select name="categoria">
                <option value="promociones" selected>promociones</option>
                <option value="costas">costas</option>
                <option value="ofertas">ofertas</option>
            </select>
        </p>

        <p><label>Imagen:</label>
            <input type="file" accept="image/*" name="imagen">
        </p>

        <p><input type="submit" name="insertar" value="Insertar noticia"></p>
    </form>
    <p>NOTA: los datos marcados con (*) deben ser rellenados obligatoriamente</p>
</body>

</html>