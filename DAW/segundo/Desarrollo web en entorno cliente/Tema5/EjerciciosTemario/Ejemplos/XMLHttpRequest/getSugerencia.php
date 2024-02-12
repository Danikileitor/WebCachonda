<?php

if (isset($_SERVER['HTTP_ORIGIN'])) {
    header("Access-Control-Allow-Origin: {$_SERVER['HTTP_ORIGIN']}");
    header('Access-Control-Allow-Credentials: true');
    header('Access-Control-Max-Age: 86400');
}

if ($_SERVER['REQUEST_METHOD'] == 'OPTIONS') {

    if (isset($_SERVER['HTTP_ACCESS_CONTROL_REQUEST_METHOD']))
        header("Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS");

    if (isset($_SERVER['HTTP_ACCESS_CONTROL_REQUEST_HEADERS']))
        header("Access-Control-Allow-Headers: {$_SERVER['HTTP_ACCESS_CONTROL_REQUEST_HEADERS']}");
}




//Array de nombres de ciudades
$arr[] = "Casares";
$arr[] = "El Ejido";
$arr[] = "Dalias";
$arr[] = "Las Norias";
$arr[] = "Celin";
$arr[] = "Ujijar";
$arr[] = "Berja";
$arr[] = "Alcaudique";
$arr[] = "Balerma";
$arr[] = "Roquetas";
$arr[] = "Aguadulce";
$arr[] = "Santa Maria del Aguila";
$arr[] = "Balanegra";
$arr[] = "Adra";

//primero recogemos el parametro de la url
$param = $_REQUEST["param"];

$sugerencia  = "";

//Mira si coincide el parámetro con alguna de las ciudades
if ($param !== "") {
    //convierte el parametro recibido a minuscula
    $param = strtolower($param);

    //determinamos la longitud del parametro recibido
    $len = strlen($param);


    //comparamos sii el texto recibido coincide con el comienzo de alguana
    // ciudad registrada en nuestro array
    foreach ($arr as $nombre) {
        if (stristr($param, substr($nombre, 0, $len))) {
            if ($sugerencia === "") {
                // primerasugerencia
                $sugerencia = $nombre;
            } else {
                // segundas y siguientes sugerencias
                $sugerencia .= ", $nombre";
            }
        }
    }
}
// en caso de no encontrar ninguna sugerencia, se le hace saber
// al usuario. En caso contrario devuelve las sugerencias encontradas
echo $sugerencia === "" ? "ninguna sugerencia" : $sugerencia;
