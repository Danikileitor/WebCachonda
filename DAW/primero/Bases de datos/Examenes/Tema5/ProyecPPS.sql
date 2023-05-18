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