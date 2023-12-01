<?php
if (isset($_REQUEST['enviar'])) {
    if ($fichero = @fopen("viajes.txt", "a")) {
        $linea = $_REQUEST['nombre'] . ":" . $_REQUEST['destino'] . ":" . $_REQUEST['duracion'] . ":" . $_REQUEST['salida'];
        fwrite($fichero, "$linea\n");
        fclose($fichero);
    }
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5 - Travelmas</title>
    <style>
        * {
            font-family: Arial, sans-serif;
        }

        body {
            margin: 0 auto;
            width: fit-content;
        }

        h1 {
            color: blue;
            font-style: italic;
        }

        table {
            border: 2px solid black;
            border-collapse: collapse;
            margin: 0 auto;
        }

        table+form {
            margin-top: 20px;
        }

        td,
        th {
            border: 1px solid lightgray;
            padding: 5px;
        }

        td {
            background-color: lightyellow;
        }

        th {
            background-color: magenta;
        }
    </style>
</head>

<body>
    <h1>Agencia de viajes travelmas</h1>
    <?php
    if (filesize("viajes.txt") > 0) {
        if ($fichero = @fopen("viajes.txt", "r")) {
            $contenido = file("viajes.txt");

            echo "<table>";
            echo "<tr>";
            echo "<th>nombre</th>";
            echo "<th>destino</th>";
            echo "<th>duración</th>";
            echo "<th>salida</th>";
            echo "</tr>";

            foreach ($contenido as $linea) {
                echo "<tr>";
                $celdas = explode(":", $linea);
                foreach ($celdas as $celda) {
                    echo "<td>$celda</td>";
                }
                echo "</td>";
            }

            echo "</table>";
            fclose($fichero);
        }
    }
    ?>
    <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
        <table>
            <tr>
                <td><label for="nombre">Introduzca el nombre del circuito</label></td>
                <td><input type="text" name="nombre" id="nombre" required></td>
            </tr>
            <tr>
                <td><label for="destino">Introduzca el destino</label></td>
                <td><input type="text" name="destino" id="destino" required></td>
            </tr>
            <tr>
                <td><label for="duracion">Introduzca la duración</label></td>
                <td><input type="text" name="duracion" id="duracion" required></td>
            </tr>
            <tr>
                <td><label for="salida">Introduzca los días de salida</label></td>
                <td><input type="text" name="salida" id="salida" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="enviar" value="Enviar"></td>
            </tr>
        </table>
    </form>
</body>

</html>