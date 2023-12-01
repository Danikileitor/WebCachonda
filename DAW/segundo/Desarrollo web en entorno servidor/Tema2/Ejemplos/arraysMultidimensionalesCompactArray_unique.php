<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Prueba de Arrays</title>
</head>

<body>

</body>
<?php
$datos = array(
    "Pepe" => array("Jose", "Garcia", 33, array("Primaria", "Secundaria", "Bachiller"), "C/ Sin nombre, 7", "666666666"),
    "Manuel" => "Manolo Fernandez",
    "Maria" => array("Maria Jose", "Perez", 21, "C/ Con nombre, 3", "950950950"),
    "Josefa" => "Josefa Martinez"
);

/* Volcamos datos */
/*foreach ($datos as $pos => $valor) {
	echo "<br>Los datos de $pos son: ";
	if (is_array($valor)) 
		foreach ($valor as $valor_interno) {
			echo "<pre>     $valor_interno</pre>";
		}
	else
		echo $valor;
}*/

recorreArray($datos);

function recorreArray($datos)
{
    // Recorremos el array mostrando su contenido y si hay subarrays también se recorren

    foreach ($datos as $pos => $valor) {
        echo "<pre>Los datos de $pos son: </pre> ";
        if (is_array($valor))
            recorreArray($valor);
        else {
            echo "<pre> $valor </pre>";
        }
    }
}

/*function recorreArray ($datos, $nivel=0) {
	// Recorremos el array mostrando su contenido y si hay subarrays también se recorren
	$relleno="";
	for ($i=0;$i<$nivel; $i++)
		$relleno .= "   ";
	
	foreach ($datos as $pos => $valor) {
		echo "<pre> $relleno Los datos de $pos son: </pre> ";
		if (is_array($valor)) 
			recorreArray($valor, $nivel+1);
		else {
			echo "<pre>" . $relleno;
			echo $valor . "</pre>";
		}
	}
}*/

/**** EJEMPLO DE COMPACT *****/

echo "<br><br> ***************** EJEMPLO DE COMPACT *********************<BR><BR>";

$nombre = "Eugenio";
$apellidos = "Lopez Martin";
$edad = 89;

$datos = compact("nombre", "apellidos", "edad");

recorreArray($datos);

/**** EJEMPLO DE ARRAY_UNIQUE *****/

echo "<br><br> ***************** EJEMPLO DE ARRAY_UNIQUE *********************<BR><BR>";

$array = array(4, "4", 5, 4, 3, 2, 1, 2);
$arrayUnico = array_unique($array);

recorreArray($arrayUnico);
?>

</html>