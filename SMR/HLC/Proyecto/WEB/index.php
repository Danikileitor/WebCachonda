<html>
<head>
<meta http-equiv="Content-Language" content="es">
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Tienda</title>
<link rel="stylesheet" type="text/css" href="css.css">
<?php //Creo las funciones para los diferentes comandos:
function verclientes(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$result = mysql_query("SELECT * FROM clientes", $link);
$longitud1 = mysql_query("SELECT count(id_cli) FROM clientes", $link);
$longitud = mysql_result($longitud1, 0);
echo "<table border=1 style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del cliente: ".mysql_result($result, $i, "id_cli")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Apellidos: ".mysql_result($result, $i, "apellidos")."<br>";
echo "Dirección: ".mysql_result($result, $i, "direccion")."<br>";
echo "Teléfono: ".mysql_result($result, $i, "telefono")."</td></tr>";
}
echo "</table>";
}
function verproductos(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$result = mysql_query("SELECT * FROM productos", $link);
$result1 = mysql_query("SELECT * FROM proveedores,productos WHERE proveedores.id_prov=productos.id_prov", $link);
$longitud1 = mysql_query("SELECT count(id_prod) FROM productos", $link);
$longitud = mysql_result($longitud1, 0);
echo "<table border=1 style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del producto: ".mysql_result($result, $i, "id_prod")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Coste: ".mysql_result($result, $i, "coste")."€<br>";
echo "P.V.P.: ".mysql_result($result, $i, "pvp")."€<br>";
echo "Stock: ".mysql_result($result, $i, "stock")."<br>";
echo "Suministrado por: ".mysql_result($result1, $i, "proveedores.nombre")."</td></tr>";
}
echo "</table>";
}
function verproveedores(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$result = mysql_query("SELECT * FROM proveedores", $link);
$longitud1 = mysql_query("SELECT count(id_prov) FROM proveedores", $link);
$longitud = mysql_result($longitud1, 0);
echo "<table border=1 style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del proveedor: ".mysql_result($result, $i, "id_prov")."<br>";
echo "Nombre: ".mysql_result($result, $i, "nombre")."<br>";
echo "Dirección: ".mysql_result($result, $i, "direccion")."<br>";
echo "Teléfono: ".mysql_result($result, $i, "telefono")."</td></tr>";
}
echo "</table>";
}
function verpedidos(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$result = mysql_query("SELECT * FROM pedido", $link);
$result1 = mysql_query("SELECT * FROM clientes,pedido WHERE clientes.id_cli=pedido.id_cli", $link);
$longitud1 = mysql_query("SELECT count(id_ped) FROM pedido", $link);
$longitud = mysql_result($longitud1, 0);
echo "<table border=1 style='margin:auto;'>";
for($i=0; $i<$longitud; $i++){
echo "<tr><td align='center'>ID del pedido: ".mysql_result($result, $i, "id_ped")."<br>";
echo "Precio: ".mysql_result($result, $i, "precio")."<br>";
echo "Fecha: ".mysql_result($result, $i, "fecha")."<br>";
echo "Realizado por: ".mysql_result($result1, $i, "clientes.nombre")."</td></tr>";
}
echo "</table>";
}
function verinfo_pedido(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
$result = mysql_query("SELECT * FROM info_pedido", $link);
$longitud1 = mysql_query("SELECT max(id_ped) FROM info_pedido", $link);
$longitud = mysql_result($longitud1, 0);
$longitud2a = mysql_query("SELECT count(id_prod) FROM info_pedido GROUP BY id_ped", $link);
echo "<table border=1 style='margin:auto;'>";
for($i=1; $i<$longitud+1; $i++){
$result = mysql_query("SELECT * from info_pedido WHERE id_ped LIKE '$i'", $link);
$result1 = mysql_query("SELECT * FROM productos,info_pedido WHERE productos.id_prod=info_pedido.id_prod and info_pedido.id_ped LIKE '$i'", $link);
echo "<tr><td align='center'>ID del pedido: ".mysql_result($result, 0, "id_ped")."<br>";
$longitud2 = mysql_result($longitud2a, $i-1);
for($j=0; $j<$longitud2; $j++){
echo "Producto: ".mysql_result($result1, $j, "productos.nombre")."<br>";
echo "Cantidad: ".mysql_result($result1, $j, "cantidad")."<br>";
}
echo "</td></tr>";
}
echo "</table>";
}
function insertarcliente(){
$link = mysql_connect("localhost", "hlc", "nose");
mysql_select_db("proyecto", $link);
}
?>
<script type="text/javascript"> //Creo las funciones para los botones:
function verclientes(){
if(document.getElementById("mclientes").innerHTML === ''){
document.getElementById("mclientes").innerHTML = "<?php verclientes(); ?>";
}else{document.getElementById("mclientes").innerHTML = "";
}}
function verproductos(){
if(document.getElementById("mproductos").innerHTML === ''){
document.getElementById("mproductos").innerHTML = "<?php verproductos(); ?>";
}else{document.getElementById("mproductos").innerHTML = "";
}}
function verproveedores(){
if(document.getElementById("mproveedores").innerHTML === ''){
document.getElementById("mproveedores").innerHTML = "<?php verproveedores(); ?>";
}else{document.getElementById("mproveedores").innerHTML = "";
}}
function verpedidos(){
if(document.getElementById("mpedido").innerHTML === ''){
document.getElementById("mpedido").innerHTML = "<?php verpedidos(); ?>";
}else{document.getElementById("mpedido").innerHTML = "";
}}
function verinfo_pedido(){
if(document.getElementById("minfo_pedido").innerHTML === ''){
document.getElementById("minfo_pedido").innerHTML = "<?php verinfo_pedido(); ?>";
}else{document.getElementById("minfo_pedido").innerHTML = "";
}}
function consultas(){
if(document.getElementById("tablaconsultas").style.display == "none"){
document.getElementById("tablaconsultas").style.display = "";
}else{document.getElementById("tablaconsultas").style.display = "none";
}}
function editar(){
if(document.getElementById("tablaeditar").style.display == "none"){
document.getElementById("tablaeditar").style.display = "";
}else{document.getElementById("tablaeditar").style.display = "none";
document.getElementById("agregarcliente").style.display = "none"
document.getElementById("agregarproducto").style.display = "none"
document.getElementById("agregarproveedor").style.display = "none"
document.getElementById("realizarpedido").style.display = "none"
}}
function agregarcliente(){
if(document.getElementById("agregarcliente").style.display == "none"){
document.getElementById("agregarcliente").style.display = "";
}else{document.getElementById("agregarcliente").style.display = "none";
}}
function agregarproducto(){
if(document.getElementById("agregarproducto").style.display == "none"){
document.getElementById("agregarproducto").style.display = "";
}else{document.getElementById("agregarproducto").style.display = "none";
}}
function agregarproveedor(){
if(document.getElementById("agregarproveedor").style.display == "none"){
document.getElementById("agregarproveedor").style.display = "";
}else{document.getElementById("agregarproveedor").style.display = "none";
}}
function realizarpedido(){
if(document.getElementById("realizarpedido").style.display == "none"){
document.getElementById("realizarpedido").style.display = "";
}else{document.getElementById("realizarpedido").style.display = "none";
}}
function insertarcliente(){
document.getElementById("orden").innerHTML = "<?php insertarcliente(); ?>";
}
function buscador(){
if(document.getElementById("tablabuscador").style.display == "none"){
document.getElementById("tablabuscador").style.display = "";
}else{document.getElementById("tablabuscador").style.display = "none";
}}
</script>
</head>
<body>
<div id="orden"></div>
<center>
<header>
<h1 contentEditable="true">Tienda</h1>
</header>
<nav>
<table id="menu" border=1 width="100%">
<tr>
<td width="33%"><button onclick="consultas()">Consultas</button></td>
<td width="33%"><button onclick="editar()">Editar datos</button></td>
<td width="33%"><button onclick="buscador()">Buscador</button></td>
</tr>
</table>
</nav>
<br><br>
<table id="tablabuscador" border=1 style="display:none;margin-top:10px;">
<tr>
<form action="buscadorcliente.php" method="POST" target="popup" onsubmit="popup=window.open('','popup', 'width=300 height=200, status=no scrollbars=no, location=no, manu=no');">
<td width='90%'><input id="buscadorcliente" name="buscadorcliente" type="text" style="width:100%"></td>
<td><input type="submit" value="Buscar Cliente" style="width:100%"></td>
</form>
</tr>
<tr>
<form action="buscadorproducto.php" method="POST" target="popup" onsubmit="popup=window.open('','popup', 'width=300 height=200, status=no scrollbars=no, location=no, manu=no');">
<td width='90%'><input id="buscadorproducto" name="buscadorproducto" type="text" style="width:100%"></td>
<td><input type="submit" value="Buscar Producto" style="width:100%"></td>
</form>
</tr>
<tr>
<form action="buscadorproveedor.php" method="POST" target="popup" onsubmit="popup=window.open('','popup', 'width=300 height=200, status=no scrollbars=no, location=no, manu=no');">
<td width='90%'><input id="buscadorproveedor" name="buscadorproveedor" type="text" style="width:100%"></td>
<td><input type="submit" value="Buscar Proveedor" style="width:100%"></td>
</form>
</tr>
<tr>
<form action="buscadorpedido.php" method="POST" target="popup" onsubmit="popup=window.open('','popup', 'width=300 height=200, status=no scrollbars=no, location=no, manu=no');">
<td width='90%'><input id="buscadorpedido" name="buscadorpedido" type="text" style="width:100%"></td>
<td><input type="submit" value="Buscar Pedido" style="width:100%"></td>
</form>
</tr>
</table>
<table id="tablaconsultas" border=1 style="display:none;margin-top:10px;">
<tr align='center' style="border:0;border-color:transparent;">
<td><button style="width:100%;" onclick="verclientes()">Clientes</button></td><td><button style="width:100%;" onclick="verproductos()">Productos</button></td><td><button style="width:100%;" onclick="verproveedores()">Proveedores</button></td>
</tr>
<tr><td id="mclientes"></td><td id="mproductos"></td><td id="mproveedores"></td></tr>
<tr colspan=3 align='center' style="border:0;border-color:transparent;">
<td><button style="width:100%;" onclick="verpedidos()">Pedidos</button></td><td colspan=2><button style="width:100%;" onclick="verinfo_pedido()">Información de los pedidos</button></td>
</tr>
<tr><td id="mpedido"></td><td colspan=2 id="minfo_pedido"></td></tr>
</table>
<table id="tablaeditar" border=1 style="display:none;margin-top:10px;">
<tr>
<td><button style="width:100%;" onclick="agregarcliente()">Agregar cliente</td>
<td><button style="width:100%;" onclick="agregarproducto()">Agregar producto</td>
<td><button style="width:100%;" onclick="agregarproveedor()">Agregar proveedor</td>
<td><button style="width:100%;" onclick="realizarpedido()">Realizar pedido</td>
</tr>
</table>
<form action="agregarcliente.php" method="post">
<table id="agregarcliente" border=1 style="display:none;margin-top:10px;">
<tr>
<th colspan=2>DATOS DEL CLIENTE</th>
</tr>
<tr>
<td>Nombre</td><td><input type="text" name="nombrecliente" rows=1 required></td>
</tr>
<tr>
<td>Apellidos</td><td><input type="text" name="apellidoscliente" rows=1></td>
</tr>
<tr>
<td>Dirección</td><td><input type="text" name="direccioncliente" rows=1></td>
</tr>
<tr>
<td>Teléfono</td><td><input type="number" min=0 name="telefonocliente" rows=1></td>
</tr>
<tr>
<td colspan=2><input style="width:100%;" type="submit" value="Agregar Cliente"></td>
</tr>
</table>
</form>
<form action="agregarproducto.php" method="post">
<table id="agregarproducto" border=1 style="display:none;margin-top:10px;">
<tr>
<th colspan=2>DATOS DEL PRODUCTO</th>
</tr>
<tr>
<td>Nombre</td><td><input type="text" name="nombreproducto" rows=1 required></td>
</tr>
<tr>
<td>Coste</td><td><input type="number" min=0 name="costeproducto" rows=1 required></td>
</tr>
<tr>
<td>P.V.P.</td><td><input type="number" min=0 name="pvpproducto" rows=1 required></td>
</tr>
<tr>
<td>Stock</td><td><input type="number" min=0 name="stockproducto" rows=1 required></td>
</tr>
<tr>
<td>ID del Proveedor</td><td><input type="number" min=0 name="idproveedorproducto" rows=1 required></td>
</tr>
<tr>
<td colspan=2><input style="width:100%;" type="submit" value="Agregar Producto"></td>
</tr>
</table>
</form>
<form action="agregarproveedor.php" method="post">
<table id="agregarproveedor" border=1 style="display:none;margin-top:10px;">
<tr>
<th colspan=2>DATOS DEL PROVEEDOR</th>
</tr>
<tr>
<td>Nombre</td><td><input type="text" name="nombreproveedor" rows=1 required></td>
</tr>
<tr>
<td>Dirección</td><td><input type="text" name="direccionproveedor" rows=1></td>
</tr>
<tr>
<td>Teléfono</td><td><input type="number" min=0 name="telefonoproveedor" rows=1></td>
</tr>
<tr>
<td colspan=2><input style="width:100%;" type="submit" value="Agregar Proveedor"></td>
</tr>
</table>
</form>
<form action="realizarpedido.php" method="post">
<table id="realizarpedido" border=1 style="display:none;margin-top:10px;">
<tr>
<th colspan=2>DATOS DEL PEDIDO</th>
</tr>
<tr>
<td>ID del Cliente</td><td><input type="number" min=0 name="clientepedido" rows=1 required></td>
</tr>
<tr>
<td>ID del Producto</td><td><input type="number" min=0 name="productopedido" rows=1 required></td>
</tr>
<tr>
<td>Cantidad</td><td><input type="number" min=0 name="cantidadpedido" rows=1 required></td>
</tr>
<tr>
<td>Precio</td><td><input type="number" min=0 name="preciopedido" rows=1 required></td>
</tr>
<tr>
<td>Fecha</td><td><input type="date" name="fechapedido" rows=1 required></td>
</tr>
<tr>
<td colspan=2><input style="width:100%;" type="submit" value="Realizar Pedido"></td>
</tr>
</table>
</form>
<br>
<footer>
&copy; Copyright 2016 Daniel Marcos Guerra Gómez. Todos los derechos reservados.
</footer>
</center>
</body>
</html>
