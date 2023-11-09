<?php
function crearPagina($titulo)
{
    print '<!DOCTYPE html><html lang="es">';
    print '<head> <meta charset="UTF-8"> <meta name="viewport" content="width=device-width, initial-scale=1.0">';
    print "<title>$titulo</title></head>";
    print "<body><h1>$titulo</h1></body></html>";
}

crearPagina("Ejercicio 4");
?>