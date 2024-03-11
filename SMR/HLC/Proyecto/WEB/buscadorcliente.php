<html>
<head>
<title>Buscador Cliente</title>
<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body bgcolor="lightblue">
<?php
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$buscar = $_POST['buscadorcliente'];
$result = mysql_query("SELECT * FROM clientes WHERE id_cli LIKE '%".$buscar."%' or nombre LIKE '%".$buscar."%' or apellidos LIKE '%".$buscar."%' or direccion LIKE '%".$buscar."%' or telefono LIKE '%".$buscar."%'", $link);
$longitud = mysql_num_rows($result);
echo "<table id='buscadore' border=1 style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del cliente: ".mysql_result($result, $i, "id_cli")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Apellidos: ".mysql_result($result, $i, "apellidos")."<br>";
echo "Dirección: ".mysql_result($result, $i, "direccion")."<br>";
echo "Teléfono: ".mysql_result($result, $i, "telefono")."</td></tr>";
}
echo "</table>";
?>
</body>
</html>
