<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>
<body>
    <?php
        $a = "La bala mata la vaca";
        $contador = substr_count($a, "a");
        print "<p>La frase [$a] contiene $contador [a]</p>";

        // Eliminamos los espacios y convertimos la cadena a minúsculas para evitar diferencias de mayúsculas y minúsculas
        $a = strtolower(str_replace(' ', '', $a));

        for ($i = 0; $i < strlen($a); $i++) {
            $letra = $a[$i];
            
            // Verificamos si la letra ya existe en el array de ocurrencias
            if (isset($ocurrencias[$letra])) {
                $ocurrencias[$letra]++;
            } else {
                $ocurrencias[$letra] = 1;
            }
        }

        ksort($ocurrencias);
        foreach ($ocurrencias as $ocurrencia => $cantidad) {
            print "<p>[$ocurrencia]: $cantidad</p>";
        }
    ?>
</body>
</html>