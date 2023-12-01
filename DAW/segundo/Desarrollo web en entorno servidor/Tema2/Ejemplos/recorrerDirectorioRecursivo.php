<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Prueba de directorios</title>
</head>

<body>
    VAMOS A RECORRER EL DIRECTORIO ACTUAL<BR><br>
    <?php

    function recorre($directorio, $nivel = 0)
    {
        chdir($directorio);
        $dir = opendir("."); //abre el directorio actual
        while (false !== ($fichero = readdir($dir))) {
            for ($i = 0; $i < $nivel; $i++)
                echo "----";
            if (is_dir($fichero)) {
                echo "Entrando en Directorio: $fichero<br>";
                if (strpos($fichero, ".") === false) {
                    recorre($directorio . "/" . $fichero, $nivel + 1);
                    chdir($directorio);
                }
            } else
                echo "$fichero: " . filesize($fichero) . 'bytes <br>';
        }
        closedir($dir);
    }

    //No funciona con rutas relativas
    recorre("/home/daniel");
    ?>
</body>

</html>