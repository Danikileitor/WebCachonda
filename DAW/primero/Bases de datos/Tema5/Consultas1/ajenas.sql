USE Liga;
#1 Nombre de todos los equipos con sus presidentes.
SELECT Equipos.Nombre AS Equipo, Presidentes.Nombre AS Presidente FROM Equipos, Presidentes WHERE Equipos.Presidente = Presidentes.Dni;
#2 Nombre de todos los jugadores y equipos a los que pertenecen.
SELECT Jugadores.Nombre AS Jugador, Equipos.Nombre AS Equipo FROM Jugadores, Equipos WHERE Jugadores.Cod_equipo = Equipos.Codigo;
#3 Nombres de los equipos local y visitante de todos los partidos de la primera jornada.
SELECT EL.Nombre AS Local, EV.Nombre AS Visitante FROM Equipos AS EL, Equipos AS EV, Partidos WHERE Partidos.Codigo LIKE 'J1%' AND EL.Codigo = Partidos.Equipo_local AND EV.Codigo = Partidos.Equipo_visitante;
#4 Nombre y posición de todos los jugadores que han marcado algún gol.
SELECT DISTINCT Jugadores.Nombre AS Jugador, Jugadores.Posicion FROM Jugadores, Goles WHERE Goles.Cod_jugador = Jugadores.Codigo;
USE Instituto;
#5 Nombre de todos los módulos y nombre de los profesores que lo imparten.
SELECT Modulos.Nombre AS Modulo, Profesores.Nombre AS Profesor FROM Modulos, Profesores WHERE Modulos.Dni_profesor = Profesores.Dni;
#6 Nombre de todos los alumnos y nombre de su delegado.
SELECT AL.Nombre AS Alumno, DE.Nombre AS Delegado FROM Alumnos AS AL, Alumnos AS DE, Grupos WHERE DE.N_expdte = Grupos.Delegado AND (AL.Curso = Grupos.Curso AND AL.Letra = Grupos.Letra);
#7 Nombre de todos los alumnos matriculados en Bases de Datos.
SELECT Alumnos.Nombre AS Alumno FROM Alumnos, Matriculas, Modulos WHERE Matriculas.Alumno = Alumnos.N_expdte AND Matriculas.Modulo = Modulos.Codigo AND Modulos.Nombre = 'Bases de Datos';
#8 Nombre de los alumnos de Fernando nacidos antes de 1999.
SELECT Alumnos.Nombre AS Alumno FROM Alumnos, Matriculas, Modulos, Profesores WHERE Matriculas.Alumno = Alumnos.N_expdte AND Matriculas.Modulo = Modulos.Codigo AND Modulos.Dni_profesor = Profesores.Dni AND Profesores.Nombre = 'Fernando' AND Alumnos.Fecha_nac < '1999-01-01';
#9 Listado de todos los grupos con su delegado.
SELECT DISTINCT CONCAT(Grupos.Curso, 'º', Grupos.Letra) AS Grupo, Alumnos.Nombre AS Delegado FROM Grupos, Alumnos, Matriculas, Modulos WHERE Alumnos.N_expdte = Matriculas.Alumno AND Matriculas.Modulo = Modulos.Codigo AND Alumnos.N_expdte = Grupos.Delegado;
#10 Listado de los módulos en los que hay delegados matriculados.
SELECT DISTINCT Modulos.Nombre AS Modulo FROM Modulos, Alumnos, Grupos, Matriculas WHERE Matriculas.Alumno = Alumnos.N_expdte AND Alumnos.N_expdte = Grupos.Delegado AND Matriculas.Modulo = Modulos.Codigo;
#11 Listado de grupos en los que imparte clase Macarena.
SELECT CONCAT(Alumnos.Curso, 'º', Alumnos.Letra) AS Grupo FROM Alumnos, Matriculas, Modulos, Profesores WHERE Alumnos.N_expdte = Matriculas.Alumno AND Matriculas.Modulo = Modulos.Codigo AND Modulos.Dni_profesor = Profesores.Dni AND Profesores.Nombre = 'Macarena';