<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Examen Instituto</title>
    <link rel="stylesheet" href="dwes.css">
    <?php
    include_once 'fecha.php';
    $instituto = new PDO('mysql:host=localhost;dbname=Instituto', 'instituto', 'instituto');
    $instituto->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    ?>
</head>

<body>
    <h1>Listado de alumnos</h1>
    <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
        <p>Filtrar por curso y letra:
            <select name="filtroCurso">
                <option value="todos" selected>Todos</option>
                <?php
                try {
                    $sql = "SELECT DISTINCT Curso FROM Alumnos";
                    $resultadoFiltroCurso = $instituto->query($sql);

                    while ($cursos = $resultadoFiltroCurso->fetch(PDO::FETCH_OBJ)) {
                        echo "<option value='$cursos->Curso'>$cursos->Curso</option>";
                    }
                } catch (PDOException $e) {
                    echo "Error: " . $e->getMessage();
                }
                ?>
            </select>
            <select name="filtroLetra">
                <option value="cualquiera" selected>Cualquiera</option>
                <?php
                try {
                    $sql = "SELECT DISTINCT Letra FROM Alumnos";
                    $resultadoFiltroLetra = $instituto->query($sql);

                    while ($letras = $resultadoFiltroLetra->fetch(PDO::FETCH_OBJ)) {
                        echo "<option value='$letras->Letra'>$letras->Letra</option>";
                    }
                } catch (PDOException $e) {
                    echo "Error: " . $e->getMessage();
                }
                ?>
            </select>
            <input type="submit" name="actualizar" value="Actualizar">
        </p>
    </form>
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
        try {
            if (isset($_POST["filtroCurso"]) && $_POST["filtroCurso"] !== "todos") {
                $filtroCurso = $_POST["filtroCurso"];
                if (isset($_POST["filtroLetra"]) && $_POST["filtroLetra"] !== "cualquiera") {
                    $filtroLetra = $_POST["filtroLetra"];
                    $sql = "SELECT * FROM Alumnos WHERE Curso = ? AND Letra = ? ORDER BY Apellidos";
                    $resultado = $instituto->prepare($sql);
                    $resultado->execute([$filtroCurso, $filtroLetra]);
                } else {
                    $sql = "SELECT * FROM Alumnos WHERE Curso = ? ORDER BY Apellidos";
                    $resultado = $instituto->prepare($sql);
                    $resultado->execute([$filtroCurso]);
                }
            } else {
                if (isset($_POST["filtroLetra"]) && $_POST["filtroLetra"] !== "cualquiera") {
                    $filtroLetra = $_POST["filtroLetra"];
                    $sql = "SELECT * FROM Alumnos WHERE Letra = ? ORDER BY Apellidos";
                    $resultado = $instituto->prepare($sql);
                    $resultado->execute([$filtroLetra]);
                } else {
                    $sql = "SELECT * FROM Alumnos ORDER BY Apellidos";
                    $resultado = $instituto->query($sql);
                }
            }

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