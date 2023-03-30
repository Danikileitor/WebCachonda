CREATE DATABASE Liga;
USE Liga;
CREATE TABLE Presidentes(
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(40),
    Apellidos VARCHAR(40),
    Fecha_nac DATE NULL,
    Anno CHAR(4)
);
CREATE TABLE Equipos(
    Codigo CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Estadio VARCHAR(40),
    Aforo INTEGER NULL,
    Fundacion DATE NULL,
    Ciudad VARCHAR(40),
    Presidente CHAR(9),
    FOREIGN KEY (Presidente) REFERENCES Presidentes(Dni) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Partidos(
    Codigo CHAR(5) PRIMARY KEY,
    Fecha DATE,
    Equipo_local CHAR(5),
    Equipo_visitante CHAR(5),
    FOREIGN KEY (Equipo_local) REFERENCES Equipos(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (Equipo_visitante) REFERENCES Equipos(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Jugadores(
    Codigo CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Fecha DATE,
    Posicion ENUM('portero','defensa','centrocampista','delantero'),
    Cod_equipo CHAR(5),
    FOREIGN KEY (Cod_equipo) REFERENCES Equipos(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Goles(
    Cod_partido CHAR(5),
    Minuto SMALLINT,
    Descripcion TEXT NULL,
    Cod_jugador CHAR(5),
    PropiaPuerta BOOLEAN,
    PRIMARY KEY (Cod_partido, Minuto),
    FOREIGN KEY (Cod_partido) REFERENCES Partidos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Cod_jugador) REFERENCES Jugadores(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT
);