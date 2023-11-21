<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
</head>
<body>
    <p>
        <?php
            $a = "Hola 9";
            $b = "Hola 10";
            $a1 = substr($a, 0, 5);
            $b1 = substr($b, 0, 5);

            print "<h2>Comparación de los primeros 5 caracteres</h2>";
            if ($a1 === $b1) {
                print "<p>Los primeros 5 caracteres de ambas cadenas son iguales.</p>";
            } elseif ($a1 < $b1) {
                print "<p>Los primeros 5 caracteres de la cadena 1 son menores que los de la cadena 2.</p>";
            } else {
                print "<p>Los primeros 5 caracteres de la cadena 2 son menores que los de la cadena 1.</p>";
            }

            print "<h2>Comparación natural</h2>";
            if (strnatcmp($a, $b) === 0) {
                print "<p>Ambas cadenas son iguales.</p>";
            } elseif (strnatcmp($a, $b) < 0) {
                print "<p>La cadena 1 es menor que la cadena 2.</p>";
            } else {
                print "<p>La cadena 2 es menor que la cadena 1.</p>";
            }
        ?>
    </p>
</body>
</html>