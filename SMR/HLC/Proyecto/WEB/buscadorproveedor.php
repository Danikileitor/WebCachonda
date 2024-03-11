<html>
<head>
<title>Buscador Cliente</title>
<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body bgcolor="lightblue">
<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$buscar = $_POST['buscadorproveedor'];
$result = mysql_query("SELECT * FROM proveedores WHERE id_prov LIKE '%".$buscar."%' or nombre LIKE '%".$buscar."%' or direccion LIKE '%".$buscar."%' or telefono LIKE '%".$buscar."%'", $link);
$longitud = mysql_num_rows($result);
echo "<table border=1 id='buscadore' style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del proveedor: ".mysql_result($result, $i, "id_prov")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Dirección: ".mysql_result($result, $i, "direccion")."<br>";
echo "Teléfono: ".mysql_result($result, $i, "telefono")."</td></tr>";
}
echo "</table>";
?>
</body>
</html>
