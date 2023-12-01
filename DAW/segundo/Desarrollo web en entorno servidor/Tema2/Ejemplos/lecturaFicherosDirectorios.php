<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Prueba de lectura de ficheros</title>
</head>

<body>
    <?php
    // Leer fichero usando fgets

    /*	$id = @fopen("arrays.php", "r");
	if (!$id)	// Error al abrir
		die("No se ha podido abrir el fichero");

	while(!feof($id)) {
		$linea = fgets($id);
		echo htmlentities($linea) . "<br>";
	}

	fclose($id);

	// Leer fichero usando file
	$array = @file("arrays.php");

	if ($array) 
		foreach ($array as $pos => $linea) {
			echo "$pos  ==> " . htmlentities($linea) . "<br>";
		}
	else
		die("No se ha podido abrir el fichero");*/

    // Lectura del directorio actual

    rename("ficheros.php", "ficheros1.php");

    // abrimos el directorio
    $dir = opendir(".");

    while (false !== ($fichero = readdir($dir))) {
        // Mientras lea ficheros en el directorio
        if (is_dir($fichero))
            echo "Directorio: $fichero<br>";
        else
            echo "$fichero: " . filesize($fichero) . " bytes - Fecha: " . date("d-m-y", filemtime($fichero)) . " - " . mime_content_type($fichero) . "<br>";
    }

    // Cerramos el directorio
    closedir($dir);
    ?>
</body>

</html>