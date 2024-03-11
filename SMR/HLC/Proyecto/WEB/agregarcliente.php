<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
mysql_query("INSERT INTO clientes (nombre,apellidos,direccion,telefono) VALUES ('".$_POST['nombrecliente']."','".$_POST['apellidoscliente']."','".$_POST['direccioncliente']."','".$_POST['telefonocliente']."')", $link);
?>
<html>
<head><meta http-equiv="refresh" content="3; url=index.php"></head>
<body bgcolor="lightblue">Listo! Volviendo a la página principal...</body>
</html>
