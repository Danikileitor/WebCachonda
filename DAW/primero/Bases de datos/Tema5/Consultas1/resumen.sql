USE Liga;
#1 Número de equipos de la liga.
SELECT COUNT(*) AS 'Número de equipos' FROM Equipos;
#2 Fecha de nacimiento del presidente mas joven.
SELECT MAX(Fecha_nac) AS 'Fecha de nacimiento' FROM Presidentes;
#3 Fecha del primer partido de la liga que se jugó.
SELECT MIN(Fecha) AS 'Fecha del partido' FROM Partidos;
#4 Número de goles marcados de penalti. (Recuerda que no siempre se escribe igual)
SELECT COUNT(*) AS 'Número de goles marcados de penalti' FROM Goles WHERE Goles.Descripcion LIKE '%penalti%';
#5 Número de porteros de la liga.
SELECT COUNT(*) AS 'Número de porteros' FROM Jugadores WHERE Jugadores.Posicion = 'portero';
#6 Número de delanteros del ‘Atlético Zamora’.
SELECT COUNT(*) AS 'Número de delanteros del Atlético Zamora' FROM Jugadores, Equipos WHERE Jugadores.Posicion = 'delantero' AND Jugadores.Cod_equipo = Equipos.Codigo AND Equipos.Nombre = 'Atlético Zamora';
#7 Número de defensas del ‘Atlético Zamora’.
SELECT COUNT(*) AS 'Número de defensas del Atlético Zamora' FROM Jugadores, Equipos WHERE Jugadores.Posicion = 'defensa' AND Jugadores.Cod_equipo = Equipos.Codigo AND Equipos.Nombre = 'Atlético Zamora';
#8 Nombre y fecha de llegada de los tres jugadores más antiguos de la liga.
SELECT Nombre, Fecha FROM Jugadores ORDER BY Fecha LIMIT 3;
#9 Nombre y fecha de llegada de los cuatro siguientes en antigüedad.
SELECT Nombre, Fecha FROM Jugadores ORDER BY Fecha LIMIT 3,4;
#10 Número de goles marcados en la segunda parte de los partidos.
SELECT COUNT(*) AS 'Goles marcados en la segunda parte' FROM Goles WHERE Minuto > 45;
#11 Número de jugadores cuyo nombre empieza por ‘P’.
SELECT COUNT(*) AS 'Jugadores cuyo nombre empieza por "P"' FROM Jugadores WHERE Nombre LIKE 'P%';