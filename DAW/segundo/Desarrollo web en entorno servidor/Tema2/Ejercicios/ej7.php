<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>
<body>
    <?php
        $cadenaOriginal = "CadenaOriginal";
        $caracteres = str_split($cadenaOriginal);
        $cadenaDuplicada = "";
        foreach ($caracteres as $caracter) {
            $cadenaDuplicada .= $caracter . $caracter;
        }
        print $cadenaDuplicada;
    ?>
</body>
</html>