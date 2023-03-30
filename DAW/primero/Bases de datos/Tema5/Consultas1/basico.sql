USE Liga;
#1 Mostrar todos los datos de los Presidentes.
SELECT * FROM Presidentes;
#2 Mostrar todos los datos de los Partidos.
SELECT * FROM Partidos;
#3 Mostrar el Nombre y Cod_equipo de todos los Jugadores.
SELECT Jugadores.Nombre, Jugadores.Cod_equipo FROM Jugadores;
#4 Mostrar el Estadio y Aforo de todos los Equipos.
SELECT Equipos.Estadio, Equipos.Aforo FROM Equipos;
#5 Mostrar el campo Posicion de todos los Jugadores.
SELECT Jugadores.Posicion FROM Jugadores;
#6 Mostrar el campo Posicion de todos los Jugadores, sin repeticiones.
SELECT DISTINCT Jugadores.Posicion FROM Jugadores;
#7 Mostrar los Jugadores del Equipo 4.
SELECT * FROM Jugadores WHERE Jugadores.Cod_equipo = 'EQ004';
#8 Mostrar la Posicion de los Jugadores del Equipo 3 sin repeticiones.
SELECT DISTINCT Jugadores.Posicion FROM Jugadores WHERE Jugadores.Cod_equipo = 'EQ003';
#9 Mostrar descripción de gol y código del jugador que lo marca, para todos los goles que se producen en la primera parte (hasta el minuto 45 inclusive).
SELECT Goles.Descripcion, Goles.Cod_jugador FROM Goles WHERE Goles.`Minuto` <= 45;
#10 Mostrar los presidentes que han accedido al cargo después de 2006.
SELECT * FROM Presidentes WHERE Presidentes.Anno > 2006;
#11 Mostrar los goles que se han marcado entre el minuto 30 y 60 inclusive.
SELECT * FROM Goles WHERE Goles.Minuto >= 30 AND Goles.Minuto <= 60;
#12 Mostrar los Equipos de ciudades acabadas en ‘s’.
SELECT * FROM Equipos WHERE Equipos.Ciudad LIKE '%s';
#13 Mostrar el Nombre de los Jugadores que sean del equipo 3 y delanteros.
SELECT Jugadores.Nombre FROM Jugadores WHERE Jugadores.Cod_equipo = 'EQ003' AND Jugadores.Posicion = 'delantero';
#14 Mostrar el Nombre de los Jugadores que sean del equipo 3 y los jugadores que sean delanteros.
SELECT Jugadores.Nombre FROM Jugadores WHERE Jugadores.Cod_equipo = 'EQ003' OR Jugadores.Posicion = 'delantero';
#15 Mostrar los goles que se han producido de penalti. Fíjate que la descripción de los penaltis no siempre se ha escrito igual. Usa el operador LIKE para conseguirlo.
SELECT * FROM Goles WHERE Goles.Descripcion LIKE '%penalti%';
#16 Muestra el nombre de los Jugadores que tengan una ‘i’ en su Nombre.
SELECT Jugadores.Nombre FROM Jugadores WHERE Jugadores.Nombre LIKE '%i%';