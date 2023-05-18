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