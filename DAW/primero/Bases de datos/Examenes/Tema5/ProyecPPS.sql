USE ProyecPPS;

#Consulta 1
SELECT DISTINCT Color, Ciudad FROM Piezas;

#Consulta 2 (No hay ningún suministro que la cantidad sea nula)
SELECT * FROM Suministros WHERE Cantidad IS NOT NULL;

