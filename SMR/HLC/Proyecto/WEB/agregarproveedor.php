<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
mysql_query("INSERT INTO proveedores (nombre,direcion,telefono) VALUES ('".$_POST['nombreproveedor']."','".$_POST['direccionproveedor']."','".$_POST['telefonoproveedor']."')", $link);
?>
<html>
<head><meta http-equiv="refresh" content="3; url=index.php"></head>
<body bgcolor="lightblue">Listo! Volviendo a la página principal...</body>
</html>
