<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Examen Instituto</title>
    <link rel="stylesheet" href="dwes.css">
</head>

<body>
    <h1>Listado de alumnos</h1>
    <table>
        <tr>
            <th>Nº Expediente</th>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>Fecha de nacimiento</th>
            <th>Curso</th>
            <th>Letra</th>
        </tr>
        <?php
        include_once 'fecha.php';
        $instituto = new PDO('mysql:host=localhost;dbname=Instituto', 'instituto', 'instituto');
        $instituto->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        try {
            $sql = "SELECT * FROM Alumnos ORDER BY Apellidos DESC";
            $resultado = $instituto->query($sql);

            while ($alumno = $resultado->fetch(PDO::FETCH_OBJ)) {
                $fecha = date2string($alumno->Fecha_nac);
                echo "<tr><td>$alumno->N_expdte</td><td>$alumno->Nombre</td><td>$alumno->Apellidos</td><td>$fecha</td><td>$alumno->Curso</td><td>$alumno->Letra</td></tr>";
            }
        } catch (PDOException $e) {
            echo "Error: " . $e->getMessage();
        }
        ?>
    </table>
</body>

</html>