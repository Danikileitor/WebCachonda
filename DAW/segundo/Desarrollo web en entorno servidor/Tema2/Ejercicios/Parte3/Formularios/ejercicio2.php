<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
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
    <h1>Elementos de entrada</h1>
    <h2>Elementos tipo INPUT</h2>
    <form name="formulario" action="./ejercicio2-resultados.php" method="post" enctype="multipart/form-data">
        <h3>TEXT</h3>
        <span>Introduzca la cadena a buscar: </span><input type="text" name="busqueda" value="valor por defecto">
        <hr>
        <h3>RADIO</h3>
        <span>Sexo: </span><input type="radio" name="sexo" value="mujer" id="mujer" checked><label for="mujer">Mujer</label> <input type="radio" name="sexo" value="hombre" id="hombre"><label for="hombre">Hombre</label>
        <hr>
        <h3>CHECKBOX</h3>
        <span>Extras: </span><input type="checkbox" name="extras[]" value="garaje" id="garaje" checked><label for="garaje">Garaje</label> <input type="checkbox" name="extras[]" value="piscina" id="piscina"><label for="piscina">Piscina</label> <input type="checkbox" name="extras[]" value="jardin" id="jardin"><label for="jardin">Jardín</label>
        <hr>
        <h3>FILE</h3>
        <span>Fichero: </span><input type="file" name="fichero">
        <hr>
        <h3>HIDDEN</h3>
        <input type="hidden" name="oculto" value="virus">
        <hr>
        <h3>PASSWORD</h3>
        <span>Contraseña: </span><input type="password" name="pass">
        <hr>
        <h2>Elemento SELECT</h2>
        <h3>SELECT SIMPLE</h3>
        <span>Color: </span><select name="color">
            <option value="rojo" selected>Rojo</option>
            <option value="azul">Azul</option>
            <option value="amarillo">Amarillo</option>
            <option value="verde">Verde</option>
        </select>
        <hr>
        <h3>SELECT MÚLTIPLE</h3>
        <span>Idiomas: </span><select name="idiomas[]" multiple size="3">
            <option value="ingles" selected>Inglés</option>
            <option value="frances">Francés</option>
            <option value="aleman">Alemán</option>
        </select>
        <hr>
        <h2>Elemento TEXTAREA</h2>
        <span>Comentario: </span><textarea name="comentario" cols="50" rows="4">Este libro me parece ...</textarea>
    </form>
</body>

</html>