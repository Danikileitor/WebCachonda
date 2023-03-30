DROP TABLE IF EXISTS Provincia;
CREATE TABLE Provincia (
    Id CHAR(3) PRIMARY KEY,
    Nombre VARCHAR(40)
);
DROP TABLE IF EXISTS Pais;
CREATE TABLE Pais (
    Id CHAR(4) PRIMARY KEY,
    Nombre VARCHAR(40),
    Abreviatura VARCHAR(3)
);
DROP TABLE IF EXISTS Estadio;
CREATE TABLE Estadio (
    Id CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Capacidad INT UNSIGNED,
    Direccion VARCHAR(40),
    CP CHAR(5),
    Provincia CHAR(3),
    Telefono CHAR(9),
    Inauguracion DATE,
    Propietario VARCHAR(40),
    Dimensiones VARCHAR(40),
    Otras_Instalaciones TEXT NULL,
    Localidad VARCHAR(40),
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Equipo;
CREATE TABLE Equipo (
    Id CHAR(6) PRIMARY KEY,
    Nombre VARCHAR(40),
    Nombre_oficial VARCHAR(40),
    Direccion VARCHAR(40),
    CP CHAR(5),
    Provincia CHAR(3),
    Pais CHAR(4),
    Direccion_Internet TEXT NULL,
    Email VARCHAR(40) NULL,
    Telefono CHAR(9),
    Fecha_de_fundacion DATE,
    Historia TEXT,
    Himno TEXT NULL,
    Estadio CHAR(5),
    Localidad VARCHAR(40),
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Estadio) REFERENCES Estadio(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Penas;
CREATE TABLE Penas (
    Id_Equipo CHAR(6),
    Nombre VARCHAR(40),
    PRIMARY KEY (Id_Equipo, Nombre),
    Foreign Key (Id_Equipo) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE CASCADE
);
DROP TABLE IF EXISTS Situacion_de_nacionalidad;
CREATE TABLE Situacion_de_nacionalidad (
    Id CHAR(1) PRIMARY KEY,
    Situacion ENUM('opcion', 'residencia', 'carta de naturaleza', 'posesión de estado')
);
DROP TABLE IF EXISTS Representante;
CREATE TABLE Representante (
    Id CHAR(6) PRIMARY KEY,
    Nombre VARCHAR(40)
);
DROP TABLE IF EXISTS Jugador;
CREATE TABLE Jugador (
    Id CHAR(8) PRIMARY KEY,
    Nombre_Futbolistico VARCHAR(40),
    Nombre VARCHAR(40),
    Apellidos VARCHAR(40),
    Fecha_de_nacimiento DATE,
    Lugar_de_nacimiento VARCHAR(40),
    Provincia CHAR(3),
    Pais CHAR(4),
    Pie ENUM('Derecho', 'Izquierdo'),
    Situacion CHAR(1),
    Altura DOUBLE,
    Peso DOUBLE,
    Cantera CHAR(6),
    Internacional BOOLEAN,
    Representante CHAR(6),
    Pais_Nacionalidad VARCHAR(40),
    Retirado BOOLEAN,
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Situacion) REFERENCES Situacion_de_nacionalidad(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Cantera) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Representante) REFERENCES Representante(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Demarcacion;
CREATE TABLE Demarcacion (
    Jugador CHAR(8),
    Demarcacion ENUM('Portero', 'Defensa', 'Centrocampista', 'Delantero'),
    PRIMARY KEY (Jugador, Demarcacion),
    Foreign Key (Jugador) REFERENCES Jugador(Id) ON UPDATE CASCADE ON DELETE CASCADE
);