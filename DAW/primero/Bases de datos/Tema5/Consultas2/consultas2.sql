USE Jardineria;
#1 Obtener el nombre del cliente con mayor límite de crédito.
SELECT NombreCliente AS Nombre FROM Clientes WHERE LimiteCredito = (SELECT MAX(LimiteCredito) FROM Clientes);
#2 Obtener el nombre, apellido1 y puesto de los empleados que no representen a ningún cliente.
SELECT Nombre, Apellido1, Puesto FROM Empleados WHERE NOT EXISTS (SELECT CodigoEmpleadoRepVentas FROM Clientes WHERE Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado);
#3 Obtener el nombre del producto más caro.
SELECT Nombre FROM Productos WHERE PrecioVenta = (SELECT MAX(PrecioVenta) FROM Productos);
#4 Obtener el nombre del producto del que más unidades se hayan vendido en un mismo pedido.
SELECT Nombre FROM Productos WHERE CodigoProducto = (SELECT CodigoProducto FROM Detallepedidos WHERE Cantidad = (SELECT MAX(Cantidad) FROM Detallepedidos));
#5 Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
SELECT * FROM Clientes WHERE LimiteCredito > ALL (SELECT sum(Cantidad) FROM Pagos WHERE Pagos.CodigoCliente = Clientes.CodigoCliente);
#6 Sacar el producto que más unidades tiene en stock y el que menos unidades tiene en stock.
SELECT * FROM Productos WHERE CantidadEnStock = (SELECT MAX(CantidadEnStock) FROM productos) OR CantidadEnStock = (SELECT MIN(CantidadEnStock) FROM productos);
#7 Sacar la media de unidades en stock de los productos agrupados por gama.
SELECT Gama, AVG(CantidadEnStock) AS 'Media de stock' FROM Productos GROUP BY Gama;
#8 Sacar los clientes que residan en ciudades donde no hay oficinas ordenado por la ciudad donde residen.
SELECT * FROM Clientes WHERE NOT EXISTS (SELECT Ciudad FROM Oficinas WHERE Clientes.Ciudad = Oficinas.Ciudad);
#9 Sacar un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT NombreCliente AS Cliente, concat(Nombre, ' ', Apellido1) AS Representante FROM Clientes JOIN Empleados WHERE Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado;
#10 Mostrar el nombre de los clientes que no hayan realizado pagos junto con el nombre de su representante de ventas.
SELECT NombreCliente AS Cliente, concat(Nombre, ' ', Apellido1) AS Representante FROM Clientes JOIN Empleados WHERE Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado AND NOT EXISTS (SELECT * FROM Pagos WHERE Pagos.CodigoCliente = Clientes.CodigoCliente);
#11 Listar las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA).
SELECT Nombre, COUNT(Cantidad) AS 'Unidades vendidas', SUM(Cantidad*PrecioUnidad) AS 'Total facturado', SUM(Cantidad*PrecioUnidad*1.21) AS 'Total facturado con impuestos' FROM Productos NATURAL JOIN Detallepedidos GROUP BY Nombre HAVING SUM(Cantidad*PrecioUnidad) > 3000.00;
#12 Listar la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT CodigoOficina, CONCAT(LineaDireccion1, ' ', LineaDireccion2, ', ', CodigoPostal, ', ', Ciudad, ', ', Pais) AS Direccion FROM Oficinas WHERE CodigoOficina IN (SELECT CodigoOficina FROM Empleados WHERE EXISTS (SELECT CodigoEmpleadoRepVentas FROM Clientes WHERE Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado AND Clientes.Ciudad = 'Fuenlabrada'));
#13 Sacar el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT Clientes.NombreCliente AS 'Cliente', Empleados.Nombre AS 'Representante', Oficinas.Ciudad FROM Clientes JOIN Empleados ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina;
#14 Sacar la misma información que en la pregunta anterior pero sólo con los clientes que no hayan hecho pagos.
SELECT Clientes.NombreCliente AS 'Cliente', Empleados.Nombre AS 'Representante', Oficinas.Ciudad FROM Clientes JOIN Empleados ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina WHERE NOT EXISTS (SELECT * FROM Pagos WHERE Pagos.CodigoCliente = Clientes.CodigoCliente);
#15 Obtener un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT Empleado.Nombre AS Empleado, Jefe.Nombre AS Jefe FROM Empleados AS Empleado LEFT JOIN Empleados AS Jefe ON Empleado.CodigoJefe = Jefe.CodigoEmpleado;
#16 Obtener el nombre de los clientes a los que no se les ha entregado a tiempo un pedido (FechaEntrega>FechaEsperada).
SELECT NombreCliente FROM Clientes NATURAL JOIN Pedidos WHERE FechaEntrega > FechaEsperada GROUP BY CodigoCliente;
#17 Sacar el cliente que hizo el pedido de mayor cuantía.
SELECT NombreCliente, SUM(Cantidad) AS CantidadTotal FROM Clientes NATURAL JOIN Pedidos NATURAL JOIN Detallepedidos GROUP BY CodigoPedido ORDER BY CantidadTotal DESC LIMIT 1;
#18 Sacar el importe medio de los pedidos.
SELECT AVG(PrecioTotal) AS 'Importe medio de los pedidos' FROM (SELECT SUM(Cantidad*PrecioUnidad) AS PrecioTotal FROM Detallepedidos GROUP BY CodigoPedido) AS PT;
#19 Sacar un listado de clientes indicando el nombre del cliente y cuántos pedidos ha realizado.
SELECT NombreCliente, COUNT(CodigoPedido) AS Pedidos FROM Clientes NATURAL JOIN Pedidos GROUP BY CodigoCliente;
#20 Sacar un listado con los nombres de los clientes y el total pagado por cada uno de ellos.
SELECT NombreCliente, SUM(Cantidad) AS 'Total pagado' FROM Clientes NATURAL JOIN Pagos GROUP BY CodigoCliente;
#21 Sacar el nombre de los clientes que hayan hecho pedidos en 2008.
SELECT NombreCliente FROM Clientes NATURAL JOIN Pedidos WHERE FechaPedido BETWEEN '2008-01-01' AND '2008-12-31' GROUP BY CodigoCliente;
#22 Listar el nombre del cliente y el nombre y apellido de sus representantes de aquellos que no hayan realizado pagos.
SELECT Clientes.NombreCliente AS 'Cliente', CONCAT(Empleados.Nombre, ' ', Empleados.Apellido1) AS 'Representante' FROM Clientes JOIN Empleados ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado WHERE NOT EXISTS (SELECT * FROM Pagos WHERE Pagos.CodigoCliente = Clientes.CodigoCliente);
#23 Sacar un listado de clientes donde aparezca el nombre de su comercial y la ciudad donde está su oficina. (Es la misma consulta que la 13)
SELECT Clientes.NombreCliente AS 'Cliente', Empleados.Nombre AS 'Representante', Oficinas.Ciudad FROM Clientes JOIN Empleados ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina;
#24 Sacar el nombre, apellidos, oficina y cargo de aquellos que no sean representantes de ventas.
SELECT Empleados.Nombre, Empleados.Apellido1, Empleados.Apellido2, Empleados.Puesto, Empleados.CodigoOficina FROM Empleados WHERE Empleados.CodigoEmpleado NOT IN (SELECT Clientes.CodigoEmpleadoRepVentas FROM Clientes);
#25 Sacar cuantos empleados tiene cada oficina, mostrando el nombre de la ciudad donde está la oficina.
SELECT Oficinas.CodigoOficina, Oficinas.Ciudad, COUNT(*) AS 'Empleados' FROM Oficinas NATURAL JOIN Empleados GROUP BY Oficinas.CodigoOficina;
#26 Sacar los clientes que residan en la misma ciudad donde hay una oficina, indicando dónde está la oficina.
SELECT Clientes.NombreCliente, concat(Oficinas.LineaDireccion1, ' ', Oficinas.LineaDireccion2) AS 'Dirección', Oficinas.Ciudad FROM Oficinas JOIN Clientes ON Clientes.Ciudad = Oficinas.Ciudad;
#27 Sacar el número de clientes que tiene asignado cada representante de ventas.
SELECT Empleados.Nombre, Empleados.Apellido1, COUNT(*) AS 'Clientes' FROM Empleados JOIN Clientes ON Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado GROUP BY Clientes.CodigoEmpleadoRepVentas;
#28 Sacar cuál fue el cliente que hizo el pago con mayor cuantía y el que hizo el pago con menor cuantía.
SELECT Clientes.NombreCliente, Detallepedidos.Cantidad FROM Clientes JOIN Pedidos ON Clientes.CodigoCliente = Pedidos.CodigoCliente JOIN Detallepedidos ON Detallepedidos.CodigoPedido = Pedidos.CodigoPedido GROUP BY Clientes.CodigoCliente HAVING MAX(Detallepedidos.Cantidad);
#29 Sacar un listado con el precio total de cada pedido.
SELECT
#30 Sacar los clientes que hayan hecho pedidos en el 2008 por una cuantía superior a 2000 euros.
SELECT
#31 Sacar cuantos pedidos tiene cada cliente en cada estado.
SELECT
#32 Sacar los clientes que han pedido más de 200 unidades de cualquier producto.
SELECT