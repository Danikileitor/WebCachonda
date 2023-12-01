<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
    <style>
        * {
            font-family: Arial, sans-serif;
        }

        h1 {
            color: blue;
            font-style: italic;
        }

        table {
            border: 1px dotted blue;
            padding: 5px;
        }
    </style>
</head>

<body>
    <h1>Formulario simple</h1>
    <h2>Búsqueda de canciones</h2>
    <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
        <table>

        </table>
    </form>
</body>

</html>