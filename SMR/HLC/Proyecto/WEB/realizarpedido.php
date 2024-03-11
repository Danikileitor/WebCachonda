<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
mysql_query("INSERT INTO pedido (precio,fecha,id_cli) VALUES ('".$_POST['preciopedido']."','".$_POST['fechapedido']."','".$_POST['clientepedido']."')", $link);
$buscaridpedido = mysql_query("SELECT max(id_ped) FROM pedido", $link);
$idpedido = mysql_fetch_row($buscaridpedido);
mysql_query("INSERT INTO info_pedido (id_ped,id_prod,cantidad) VALUES ('".$idpedido[0]."','".$_POST['productopedido']."','".$_POST['cantidadpedido']."')", $link);
?>
<html>
<head><meta http-equiv="refresh" content="3; url=index.php"></head>
<body bgcolor="lightblue">Listo! Volviendo a la página principal...</body>
</html>
