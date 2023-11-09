<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
</head>

<body>
    <p>
        <?php
        function calculaCantidad($tiempo, $dinero, $interes) {
            return ($dinero * $interes / 100 * $tiempo) + $dinero;
        }

        $interes = 5;
        echo "<p><b>El interés actual es $interes%.</b></p>";
        echo "<p>Si usted deposita 100 &#x20AC; hoy, sus ahorros crecerán a ";
        echo calculaCantidad(5, 100, $interes);
        echo "&#x20AC; en 5 años.</p>";
        echo "<p>Si usted deposita 1.500&#x20AC; hoy, sus ahorros crecerán a ";
        echo calculaCantidad(20, 1500, $interes);
        echo "&#x20AC; después de 20 años.</p>";
        ?>
    </p>
</body>

</html>