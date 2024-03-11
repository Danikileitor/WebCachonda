<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
mysql_query("INSERT INTO productos (nombre,coste,pvp,stock,id_prov) VALUES ('".$_POST['nombreproducto']."','".$_POST['costeproducto']."','".$_POST['pvpproducto']."','".$_POST['stockproducto']."','".$_POST['idproveedorproducto']."')", $link);
?>
<html>
<head><meta http-equiv="refresh" content="3; url=index.php"></head>
<body bgcolor="lightblue">Listo! Volviendo a la página principal...</body>
</html>
