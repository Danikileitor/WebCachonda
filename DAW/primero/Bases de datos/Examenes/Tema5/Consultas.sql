#Primera parte
USE ProvEnvios;

#Consulta 1
SELECT CodArt, Ciudad FROM Articulos WHERE Ciudad LIKE '%d' OR Ciudad LIKE '%e%';

#Consulta 2
SELECT Cnombre FROM Componentes WHERE Peso BETWEEN 15 AND 18;

#Consulta 3 (Supongo que se pide media de las cantidades)
SELECT AVG(Cantidad) AS 'Cantidad media de envíos de los artículos procedentes de Cáceres' FROM Envios NATURAL JOIN Articulos WHERE Ciudad = 'Cáceres';

#Consulta 4
SELECT DISTINCT Componentes.Cnombre FROM Componentes, Envios, Proveedores WHERE Envios.CodComp = Componentes.CodComp AND Proveedores.CodProv = Envios.CodProv AND Proveedores.Pnombre = 'Juan';

#Consulta 5
SELECT DISTINCT Proveedores.Ciudad FROM Proveedores, Envios, Componentes, Articulos WHERE Proveedores.CodProv = Envios.CodProv AND Envios.CodComp = Componentes.CodComp AND Envios.CodArt = Articulos.CodArt AND Componentes.Ciudad = 'Sevilla' AND Articulos.Ciudad = Proveedores.Ciudad;

#Segunda parte
USE ProyecPPS;

#Consulta 6
SELECT DISTINCT Color, Ciudad FROM Piezas;

#Consulta 7 (No hay ningún suministro que la cantidad sea nula)
SELECT * FROM Suministros WHERE Cantidad IS NOT NULL;

#Consulta 8
SELECT DISTINCT Proveedores.CodProv, Piezas.CodPieza, Proyectos.CodProy FROM proveedores, Piezas, Proyectos WHERE Proveedores.Ciudad != Piezas.Ciudad AND Proveedores.Ciudad != Proyectos.Ciudad AND Piezas.Ciudad != Proyectos.Ciudad;

#Consulta 9
SELECT DISTINCT Proveedores.Ciudad AS ProvCiudad, Proyectos.Ciudad AS ProyCiudad FROM Proveedores, Proyectos, Suministros, Piezas WHERE Suministros.CodProv = Proveedores.CodProv AND Suministros.CodPieza = Piezas.CodPieza AND Suministros.CodProy = Proyectos.CodProy;

#Consulta 10
SELECT DISTINCT Piezas.CodPieza FROM Piezas, Proyectos, Suministros WHERE Suministros.CodPieza = Piezas.CodPieza AND Suministros.CodProy = Proyectos.CodProy AND Proyectos.Ciudad = 'Londres';