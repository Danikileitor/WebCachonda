CREATE DATABASE Startrek;
USE Startrek;
CREATE TABLE Personajes(
    Nombre VARCHAR(40) PRIMARY KEY,
    Grado ENUM('capitán','teniente','almirante')
);
CREATE TABLE Humanos(
    Personaje VARCHAR(40) PRIMARY KEY,
    Fecha_nac DATE,
    Ciudad VARCHAR(40),
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Vulcanos(
    Personaje VARCHAR(40) PRIMARY KEY,
    Fecha_grad DATE,
    Mentor VARCHAR(40),
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Klingons(
    Personaje VARCHAR(40) PRIMARY KEY,
    Fecha_combate DATE,
    Planeta VARCHAR(40),
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Depende(
    Mando VARCHAR(40),
    Subordinado VARCHAR(40),
    PRIMARY KEY (Mando, Subordinado),
    FOREIGN KEY (Mando) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Subordinado) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Actores(
    Codigo CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Nacionalidad VARCHAR(40),
    Fecha_nac DATE,
    Personaje VARCHAR(40),
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Peliculas(
    Titulo VARCHAR(40) PRIMARY KEY,
    Director VARCHAR(40),
    Anno CHAR(4),
    Fecha_nac DATE,
    Protagonista VARCHAR(40),
    FOREIGN KEY (Protagonista) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Aparece(
    Pelicula VARCHAR(40),
    Personaje VARCHAR(40),
    PRIMARY KEY (Pelicula, Personaje),
    FOREIGN KEY (Pelicula) REFERENCES Peliculas(Titulo) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
#Para cada pareja (título, protagonista) en la tabla Peliculas tiene que existir la misma pareja (película, personaje) en la tabla Aparece.
CREATE TABLE Capitulos(
    Temporada TINYINT UNSIGNED,
    Orden SMALLINT UNSIGNED,
    Titulo VARCHAR(40),
    Fecha DATE,
    PRIMARY KEY (Temporada, Orden)
);
CREATE TABLE Participa(
    Personaje VARCHAR(40),
    Cap_temp TINYINT UNSIGNED,
    Cap_orden SMALLINT UNSIGNED,
    PRIMARY KEY (Personaje, Cap_temp, Cap_orden),
    FOREIGN KEY (Personaje) REFERENCES Personajes(Nombre) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Cap_temp, Cap_orden) REFERENCES Capitulos(Temporada, Orden) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Planetas(
    Codigo CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Galaxia VARCHAR(40),
    Problema TEXT
);
CREATE TABLE Naves(
    Codigo CHAR(5) PRIMARY KEY,
    N_tripulantes SMALLINT UNSIGNED
);
CREATE TABLE Lanzaderas(
    Cod_nave CHAR(5),
    Numero SMALLINT UNSIGNED,
    Capacidad SMALLINT UNSIGNED,
    PRIMARY KEY (Cod_nave, Numero),
    FOREIGN KEY (Cod_nave) REFERENCES Naves(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Visitas(
    Codigo CHAR(5) PRIMARY KEY,
    Cap_temp TINYINT UNSIGNED,
    Cap_orden SMALLINT UNSIGNED,
    Cod_planeta CHAR(5),
    Cod_nave CHAR(5),
    FOREIGN KEY (Cap_temp, Cap_orden) REFERENCES Capitulos(Temporada, Orden) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Cod_planeta) REFERENCES Planetas(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (Cod_nave) REFERENCES Naves(Codigo) ON UPDATE CASCADE ON DELETE RESTRICT
);