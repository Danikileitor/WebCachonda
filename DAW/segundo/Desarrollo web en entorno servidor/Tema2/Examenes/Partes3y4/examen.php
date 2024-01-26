<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Examen de Formularios y Ficheros</title>
</head>

<body style="margin: 0 auto; width: fit-content;">
    <h1>Examen de Formularios y Ficheros</h1>
    <?php
    $visitas = "visitas.txt";
    if (isset($_POST['enviar'])) {
        if (file_exists($visitas)) {
            $num_visitas = file_get_contents($visitas);
            echo "Visitas: " . $num_visitas;
        }
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            echo "<h2>Datos del formulario</h2>";
            if (empty($_POST['nombre']) || empty($_POST['apellidos']) || empty($_POST['dni']) || $_FILES['carnet']['size'] == 0) {
                echo "<p>Han habido campos sin rellenar:</p><ul>";
                if (empty($_POST['nombre'])) {
                    echo "<li>Falta rellenar el nombre</li>";
                }
                if (empty($_POST['apellidos'])) {
                    echo "<li>Falta rellenar los apellidos</li>";
                }
                if (empty($_POST['dni'])) {
                    echo "<li>Falta rellenar el DNI</li>";
                }
                if ($_FILES['carnet']['size'] == 0) {
                    echo "<li>Falta adjuntar foto carnet</li>";
                }
                echo "<hr>";
            } else {
                if (is_uploaded_file($_FILES['carnet']['tmp_name'])) {
                    $tipo_imagen = exif_imagetype($_FILES['carnet']['tmp_name']);
                    if ($tipo_imagen !== false && ($tipo_imagen == IMAGETYPE_JPEG || $tipo_imagen == IMAGETYPE_PNG)) {
                        $directorio = "img/";
                        $nombre = $_FILES['carnet']['name'];
                        if (is_dir($directorio)) {
                            $idUnico = time();
                            $nombreFichero = $idUnico . "-" . $nombre;
                            $nombreCompleto = $directorio . $nombreFichero;
                            move_uploaded_file($_FILES['carnet']['tmp_name'], $nombreCompleto);
                            echo "<li>Nombre: " . $_POST["nombre"] . "</li>";
                            echo "<li>Apellidos: " . $_POST["apellidos"] . "</li>";
                            echo "<li>DNI: " . $_POST["dni"] . "</li>";
                            if (isset($_POST['meritos'])) {
                                echo "<li>Méritos:<ul>";
                                $meritos = $_POST["meritos"];
                                foreach ($meritos as $merito) {
                                    echo "<li>" . $merito . "</li>";
                                }
                                echo "</ul></li>";
                            }
                            echo "<li>País de residencia: " . $_POST["pais"] . "</li>";
                            echo "<li>Comentario: " . $_POST["comentario"] . "</li>";
                            echo "<li>Foto carnet:<br><img src='" . $nombreCompleto . "'></li>";
                        } else {
                            echo "<li>Directorio no válido</li>";
                        }
                    } else {
                        echo "<li>No se ha subido una imagen JPG o PNG</li>";
                    }
                } else {
                    echo "<li>Imagen: ¡No se ha podido subir el fichero!</li>";
                }
            }
        }
    } else {
        if (file_exists($visitas)) {
            $num_visitas = file_get_contents($visitas);
            $num_visitas++;
        } else {
            $num_visitas = 1;
        }
        file_put_contents($visitas, $num_visitas);
        echo "Visitas: " . $num_visitas;
    }
    ?>
    <form name="formulario" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">
        <table style="border: 1px solid black; padding: 10px;">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td>Apellidos:</td>
                <td><input type="text" name="apellidos"></td>
            </tr>
            <tr>
                <td>DNI:</td>
                <td><input type="text" name="dni"></td>
            </tr>
            <tr>
                <td>Sexo:</td>
                <td><input type="radio" name="sexo" id="hombre" value="Hombre" checked><label for="hombre">Hombre</label></td>
                <td><input type="radio" name="sexo" id="mujer" value="Mujer"><label for="mujer">Mujer</label></td>
            </tr>
            <tr>
                <td>Méritos:</td>
                <td><input type="checkbox" name="meritos[]" id="carnetB" value="Carnet de conducir B"><label for="carnetB">Carnet de conducir B</label></td>
                <td><input type="checkbox" name="meritos[]" id="pensionista" value="Pensionista"><label for="pensionista">Pensionista</label></td>
                <td><input type="checkbox" name="meritos[]" id="experiencia" value="20 años (o más) de experiencia"><label for="experiencia">20 años (o más) de experiencia</label></td>
                <td><input type="checkbox" name="meritos[]" id="discapacidad" value="Discapacidad superior al 33%"><label for="discapacidad">Discapacidad superior al 33%</label></td>
            </tr>
            <tr>
                <td>País de residencia:</td>
                <td><select name="pais">
                        <option id="spain" value="España" selected>España</option>
                        <option id="portugal" value="Portugal">Portugal</option>
                        <option id="france" value="Francia">Francia</option>
                    </select></td>
            </tr>
            <tr>
                <td>Comentario:</td>
                <td><textarea name="comentario"></textarea></td>
            </tr>
            <tr>
                <td>Foto carnet</td>
                <td><input type="file" accept="image/*" name="carnet"></td>
            </tr>
        </table>
        <br>
        <input type="submit" name="enviar" value="Enviar">
    </form>
</body>

</html>