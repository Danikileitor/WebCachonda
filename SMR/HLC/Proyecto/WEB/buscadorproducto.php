<html>
<head>
<title>Buscador Cliente</title>
<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body bgcolor="lightblue">
<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$buscar = $_POST['buscadorproducto'];
$result = mysql_query("SELECT * FROM productos WHERE id_prod LIKE '%".$buscar."%' or nombre LIKE '%".$buscar."%' or coste LIKE '%".$buscar."%' or pvp LIKE '%".$buscar."%' or stock LIKE '%".$buscar."%' or id_prov LIKE '%".$buscar."%'", $link);
$result1 = mysql_query("SELECT * FROM proveedores,productos WHERE proveedores.id_prov=productos.id_prov", $link);
$longitud = mysql_num_rows($result);
echo "<table border=1 id='buscadore' style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del producto: ".mysql_result($result, $i, "id_prod")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Coste: ".mysql_result($result, $i, "coste")."€<br>";
echo "P.V.P.: ".mysql_result($result, $i, "pvp")."€<br>";
echo "Stock: ".mysql_result($result, $i, "stock")."<br>";
echo "Suministrado por: ".mysql_result($result1, $i, "proveedores.nombre")."</td></tr>";
}
echo "</table>";
?>
</body>
</html>
