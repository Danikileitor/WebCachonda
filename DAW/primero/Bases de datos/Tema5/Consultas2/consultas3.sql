USE Nba;
#1 Equipos que comiencen por H y terminen en S.
SELECT * FROM Equipos WHERE Nombre LIKE 'H%S';
#2 Equipos que hay en la conferencia oeste ('west').
SELECT * FROM Equipos WHERE Conferencia = 'west';
#3 Jugadores de Arizona que pesen más de 100 kilos y midan más de 1.82m (6 pies).
SELECT * FROM Jugadores WHERE Procedencia = 'Arizona' AND Peso > 100 AND Altura > '6-0';
#4 Jugadores cuya tercera letra de su nombre sea la v.
SELECT * FROM Jugadores WHERE Nombre LIKE '__v%';
#5 Número de jugadores argentinos de la NBA.
SELECT COUNT(*) AS 'Jugadores Argentinos' FROM Jugadores WHERE Procedencia = 'Argentina';
#6 Máxima media de puntos de 'Lebron James' en su carrera.
SELECT MAX(Puntos_por_partido) AS 'Máxima media de puntos de Lebron James' FROM Estadisticas WHERE Jugador = (SELECT Codigo FROM Jugadores WHERE Nombre = 'Lebron James');
#7 Número de jugadores de España y Francia en la NBA.
SELECT Procedencia, COUNT(*) AS Jugadores FROM Jugadores WHERE Procedencia IN ('Spain', 'France') GROUP BY Procedencia;
#8 Número de pívots 'C' que tiene cada equipo.
SELECT Nombre_equipo, COUNT(*) AS Jugadores FROM Jugadores WHERE Posicion = 'C' GROUP BY Nombre_equipo;
#9 ¿Cuánto mide el pívot más alto de la NBA?
SELECT MAX(Altura) AS 'Altura del pívot más alto' FROM Jugadores WHERE Posicion = 'C';
#10 ¿Cuánto pesa (en libras y kilos) el pívot más alto de la NBA?
SELECT Peso AS 'Peso en Libras', ROUND(Peso/2.205,2) AS 'Peso en Kilos' FROM Jugadores WHERE Altura = (SELECT MAX(Altura) FROM Jugadores WHERE Posicion = 'C') AND Posicion = 'C';
#11 Número de jugadores que empiezan por Y.
SELECT COUNT(*) AS 'Jugadores que empiezan por Y' FROM Jugadores WHERE Nombre LIKE 'Y%';
#12 Peso medio en kilos y en libras de los jugadores de los 'Raptors'.
SELECT ROUND(AVG(Peso),2) AS 'Peso medio en Libras', ROUND(AVG(Peso/2.205),2) AS 'Peso medio en Kilos' FROM Jugadores WHERE Nombre_equipo = 'Raptors';
#13 Mostrar un listado de jugadores con el formato Nombre(Equipo) en una columna.
SELECT CONCAT(Nombre, ' (', Nombre_equipo, ')') AS Jugador FROM Jugadores;
#14 Puntuación más baja de un partido de la NBA.
SELECT MIN(Puntos_local + Puntos_visitante) AS 'Puntuación más baja' FROM Partidos;
#15 Primeros 10 jugadores por orden alfabético.
SELECT Nombre FROM Jugadores ORDER BY Nombre ASC LIMIT 10;
#16 Número de equipos que tiene cada conferencia.
SELECT Conferencia, COUNT(*) AS Equipos FROM Equipos GROUP BY Conferencia;
#17 Nombre de las divisiones de la conferencia Este.
SELECT DISTINCT Division FROM Equipos WHERE Conferencia = 'East';
#18 Sacar cuántas letras tiene el nombre de cada jugador de los 'grizzlies' (función LENGTH).
SELECT Nombre, LENGTH(Nombre) AS 'Cantidad de letras' FROM Jugadores WHERE Nombre_equipo = 'Grizzlies';
#19 Sacar un listado con el número de partidos ganados por los equipos de la NBA.
SELECT Equipos.Nombre, SUM(CASE WHEN Partidos.Equipo_local = Equipos.Nombre AND Partidos.Puntos_local > Partidos.Puntos_visitante THEN 1 WHEN Partidos.Equipo_visitante = Equipos.Nombre AND Partidos.Puntos_visitante > Partidos.Puntos_local THEN 1 ELSE 0 END) AS Partidos_ganados FROM Equipos LEFT JOIN Partidos ON Equipos.Nombre = Partidos.Equipo_local OR Equipos.Nombre = Partidos.Equipo_visitante GROUP BY Equipos.Nombre ORDER BY Partidos_ganados DESC;
#20 Sacar la media de partidos ganados por los equipos del oeste.
SELECT AVG(PG) AS 'Media de partidos ganados' FROM (SELECT SUM(Puntos_local > Puntos_visitante) AS PG FROM Partidos WHERE Equipo_local IN (SELECT Nombre FROM Equipos WHERE Conferencia = 'West') AND Equipo_visitante IN (SELECT Nombre FROM Equipos WHERE Conferencia = 'West') GROUP BY Equipo_local) AS partidos_ganados;
#21 Equipo y ciudad de los jugadores españoles de la NBA.
SELECT Equipos.Nombre AS Equipo, Equipos.Ciudad AS Ciudad, Jugadores.Nombre AS Jugador FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre WHERE Jugadores.Procedencia = 'Spain';
#22 Puntos por partido de 'Pau Gasol' en toda su carrera.
SELECT Temporada, Puntos_por_partido FROM Estadisticas JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo WHERE Nombre = 'Pau Gasol';
#23 Puntos por partido de los jugadores de los 'cavaliers'.
SELECT Estadisticas.Temporada, Jugadores.Nombre, Estadisticas.Puntos_por_partido FROM Jugadores JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre WHERE Equipos.Nombre = 'Cavaliers' ORDER BY Estadisticas.Temporada;
#24 Número de jugadores que tiene cada equipo de la conferencia oeste ('west').
SELECT Nombre_equipo, COUNT(*) AS Jugadores FROM Jugadores WHERE Nombre_equipo IN (SELECT Nombre FROM Equipos WHERE Conferencia = 'west') GROUP BY Nombre_equipo;
#25 Asistencias por partido de 'José Calderón' en la temporada '07/08'.
SELECT Asistencias_por_partido FROM Estadisticas JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo WHERE Jugadores.Nombre = 'José Calderón' AND Estadisticas.Temporada = '07/08';
#26 Puntos por partido de 'LeBron James' en las temporadas del '03/04' al '05/06'.
SELECT Temporada, Puntos_por_partido FROM Estadisticas INNER JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo WHERE Jugadores.Nombre = 'LeBron James' AND Temporada BETWEEN '03/04' AND '05/06';
#27 Número de jugadores que tiene cada equipo en la conferencia este ('east').
SELECT Nombre_equipo, COUNT(*) AS Jugadores FROM Jugadores INNER JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre WHERE Equipos.Conferencia = 'east' GROUP BY Nombre_equipo;
#28 Tapones por partido de los jugadores de los ' Trail Blazers'.
SELECT Estadisticas.Temporada, Jugadores.Nombre, Estadisticas.Tapones_por_partido FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador WHERE Equipos.Nombre = 'Trail Blazers' ORDER BY Estadisticas.Temporada;
#29 Media de rebotes de los jugadores de la conferencia este ('east').
SELECT Jugadores.Nombre AS Jugador, AVG(Estadisticas.Rebotes_por_partido) AS Media_Rebotes FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador WHERE Equipos.Conferencia = 'east' GROUP BY Jugadores.Nombre;
#30 Rebotes por partido de los jugadores de los equipos de Los Angeles.
SELECT Jugadores.Nombre AS Jugador, AVG(Estadisticas.Rebotes_por_partido) AS Media_Rebotes FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador WHERE Equipos.Ciudad = 'Los Angeles' GROUP BY Jugadores.Nombre;
#31 Número de jugadores que tiene cada equipo en la división NorthWest.
SELECT Equipos.Nombre AS Equipo, COUNT(Jugadores.Codigo) AS Num_Jugadores FROM Equipos JOIN Jugadores ON Equipos.Nombre = Jugadores.Nombre_equipo WHERE Equipos.Division = 'NorthWest' GROUP BY Equipos.Nombre;
#32 Jugadores que no metieron ningún punto en alguna temporada.
SELECT Jugadores.Nombre FROM Jugadores LEFT JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador WHERE Estadisticas.Puntos_por_partido = 0;
#33 Número total de jugadores de cada división.
SELECT Equipos.Division, COUNT(DISTINCT Jugadores.Codigo) AS Num_Jugadores FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre GROUP BY Equipos.Division;
#34 Temporada con más puntos por partido de 'Kobe Bryant'.
SELECT Temporada, MAX(Puntos_por_partido) as 'Puntos por partido' FROM Estadisticas JOIN Jugadores ON Estadisticas.Jugador = Jugadores.Codigo WHERE Jugadores.Nombre = 'Kobe Bryant' GROUP BY Temporada;
#35 Número de bases 'G' que tiene cada equipo de la conferencia este 'East'.
SELECT Equipos.Nombre AS Equipo, COUNT(*) AS Bases FROM Jugadores JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre WHERE Equipos.Conferencia = 'East' AND Jugadores.Posicion = 'G' GROUP BY Equipos.Nombre;
#36 Máximo reboteador de los 'Suns'.
SELECT Jugadores.Nombre, MAX(Estadisticas.Rebotes_por_partido) AS Rebotes_por_partido FROM Jugadores JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador JOIN Equipos ON Jugadores.Nombre_equipo = Equipos.Nombre WHERE Equipos.Nombre = 'Suns' GROUP BY Jugadores.Nombre ORDER BY Rebotes_por_partido DESC LIMIT 1;
#37 Máximo anotador de toda la base de datos en una temporada.
SELECT Jugadores.Nombre AS Jugador, Estadisticas.Temporada, Estadisticas.Puntos_por_partido FROM Jugadores JOIN Estadisticas ON Jugadores.Codigo = Estadisticas.Jugador ORDER BY Estadisticas.Puntos_por_partido DESC LIMIT 1;
#38 ¿Cuantas letras tiene el equipo con nombre más largo de la NBA (Ciudad y Nombre)?
SELECT Nombre, Ciudad, LENGTH(CONCAT(Nombre,Ciudad)) AS 'Cantidad de letras' FROM Equipos WHERE LENGTH(CONCAT(Nombre,Ciudad)) = (SELECT MAX(LENGTH(CONCAT(Nombre,Ciudad))) FROM Equipos);