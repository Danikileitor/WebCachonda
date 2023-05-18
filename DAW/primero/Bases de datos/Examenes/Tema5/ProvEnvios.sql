USE ProvEnvios;
#Consulta 1
SELECT CodArt, Ciudad FROM Articulos WHERE Ciudad LIKE '%d' OR Ciudad LIKE '%e%';