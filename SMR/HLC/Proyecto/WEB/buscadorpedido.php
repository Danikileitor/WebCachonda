<html>
<head>
<title>Buscador Cliente</title>
<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body bgcolor="lightblue">
<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$buscar = $_POST['buscadorpedido'];
$result = mysql_query("SELECT * FROM pedido WHERE id_ped LIKE '%".$buscar."%' or precio LIKE '%".$buscar."%' or fecha LIKE '%".$buscar."%'", $link);
$result1 = mysql_query("SELECT * FROM clientes,pedido WHERE clientes.id_cli=pedido.id_cli", $link);
$longitud = mysql_num_rows($result);
echo "<table border=1 id='buscadore' style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del pedido: ".mysql_result($result, $i, "id_ped")."<br>";
echo "Precio: ".mysql_result($result, $i, "precio")."<br>";
echo "Fecha: ".mysql_result($result, $i, "fecha")."<br>";
echo "Realizado por: ".mysql_result($result1, $i, "clientes.nombre")."</td></tr>";
}
echo "</table>";
?>
</body>
</html>
