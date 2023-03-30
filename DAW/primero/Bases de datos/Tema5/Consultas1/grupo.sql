USE Liga;
#1 Nombre de equipos y número de jugadores.
SELECT Equipos.Nombre AS Equipo, COUNT(Jugadores.Nombre) AS Jugadores FROM Equipos, Jugadores WHERE Equipos.Codigo = Jugadores.Cod_equipo GROUP BY Jugadores.Cod_equipo;
#2 Número de jugadores por cada posición.
SELECT Posicion, COUNT(*) AS Jugadores FROM Jugadores GROUP BY Posicion;
#3 Número de goles por jugador.
SELECT Jugadores.Nombre AS Jugador, COUNT(Goles.Cod_jugador) AS Goles FROM Jugadores, Goles WHERE Jugadores.Codigo = Goles.Cod_jugador GROUP BY Goles.Cod_jugador;
#4 Número de jugadores por fecha de antigüedad.
SELECT Fecha, COUNT(*) AS Jugadores FROM Jugadores GROUP BY Fecha;
#5 Nombre y número de jugadores de los equipos que tienen menos de 11 jugadores.
SELECT Equipos.Nombre AS Equipo, COUNT(Jugadores.Nombre) AS Jugadores FROM Equipos, Jugadores WHERE Equipos.Codigo = Jugadores.Cod_equipo GROUP BY Jugadores.Cod_equipo HAVING COUNT(Jugadores.Cod_equipo)<11;
#6 Nombre y número de delanteros de los equipos que tienen más de un delantero.
SELECT Equipos.Nombre AS Equipo, COUNT(Jugadores.Nombre) AS Delanteros FROM Equipos, Jugadores WHERE Equipos.Codigo = Jugadores.Cod_equipo AND Jugadores.Posicion = 'delantero' GROUP BY Jugadores.Cod_equipo HAVING COUNT(Jugadores.Cod_equipo)>1;
#7 Nombre y número de goles de los jugadores que han marcado 2 o más goles.
SELECT Jugadores.Nombre AS Jugador, COUNT(Goles.Cod_jugador) AS Goles FROM Jugadores, Goles WHERE Jugadores.Codigo = Goles.Cod_jugador GROUP BY Goles.Cod_jugador HAVING COUNT(Goles.Cod_jugador)>=2;
#8 Fechas en las que se hayan incorporado más de 3 jugadores (y número de jugadores incorporados en esa fecha)
SELECT Fecha, COUNT(*) AS Jugadores FROM Jugadores GROUP BY Fecha HAVING COUNT(Fecha)>3;
#9 Número de goles por jugador indicando el nombre del equipo.
SELECT Jugadores.Nombre AS Jugador, COUNT(Goles.Cod_jugador) AS Goles, Equipos.Nombre AS Equipo FROM Jugadores, Goles, Equipos WHERE Jugadores.Codigo = Goles.Cod_jugador AND Jugadores.Cod_equipo = Equipos.Codigo GROUP BY Goles.Cod_jugador;