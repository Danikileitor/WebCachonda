DROP TABLE IF EXISTS Pais;
CREATE TABLE Pais(
    Numero CHAR(4) PRIMARY KEY, #Se calcula según el orden alfabético del país
    Nombre VARCHAR(40),
    N_clubes INT UNSIGNED,
    Pais_representador CHAR(4),
    Foreign Key (Pais_representador) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Persona;
CREATE TABLE Persona(
    N_asociado CHAR(4) PRIMARY KEY,
    Nombre VARCHAR(40),
    Direccion VARCHAR(40),
    Telefono CHAR(9),
    Pais CHAR(4),
    Foreign Key (Pais) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Campeonatos_Persona;
CREATE TABLE Campeonatos_Persona(
    N_asociado CHAR(4),
    Campeonato VARCHAR(40),
    PRIMARY KEY (N_asociado, Campeonato),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS Jugador;
CREATE TABLE Jugador(
    N_asociado CHAR(4) PRIMARY KEY,
    Nivel ENUM('1', '2', '3', '4', '5', '6', '7', '8', '9', '10'),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);
DROP TABLE IF EXISTS Arbitro;
CREATE TABLE Arbitro(
    N_asociado CHAR(4) PRIMARY KEY,
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
); #No puede existir un Jugador y un Arbitro con el mismo N_asociado
DROP TABLE IF EXISTS Hotel;
CREATE TABLE Hotel(
    Nombre VARCHAR(40) PRIMARY KEY,
    Direccion VARCHAR(40),
    Telefono CHAR(9)
);
DROP TABLE IF EXISTS Aloja;
CREATE TABLE Aloja(
    N_asociado CHAR(4),
    Nombre_hotel VARCHAR(40),
    fecha DATE,
    PRIMARY KEY (N_asociado, Nombre_hotel),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);
DROP TABLE IF EXISTS Sala;
CREATE TABLE Sala(
    Id_sala CHAR(5) PRIMARY KEY,
    Nombre_hotel VARCHAR(40),
    Capacidad INT UNSIGNED,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
DROP TABLE IF EXISTS Medios_Sala;
CREATE TABLE Medios_Sala(
    id_sala CHAR(5),
    Medio VARCHAR(40),
    PRIMARY KEY (id_sala, Medio),
    Foreign Key (id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE CASCADE
);
DROP TABLE IF EXISTS Partida;
CREATE TABLE Partida(
    Cod_partida INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    dia_jornada VARCHAR(2),
    mes_jornada VARCHAR(2),
    ano_jornada VARCHAR(4),
    Jugador1 CHAR(4),
    color_jugador1 ENUM('Blancas', 'Negras'),
    Jugador2 CHAR(4),
    Color_jugador2 ENUM('Blancas', 'Negras'),
    Arbitro CHAR(4),
    Id_sala CHAR(5),
    Entradas_vendidas INT UNSIGNED,
    Foreign Key (Jugador1) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Jugador2) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Arbitro) REFERENCES Arbitro(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE SET NULL
); #No puede existir una partida en la que Arbitro sea del mismo país que Jugador1 o Jugador2
DROP TABLE IF EXISTS Movimiento;
CREATE TABLE Movimiento(
    Codigo CHAR(8) PRIMARY KEY,
    Comentario TEXT,
    Jugada VARCHAR(40),
    cod_partida INT UNSIGNED,
    Foreign Key (cod_partida) REFERENCES Partida(Cod_partida) ON UPDATE CASCADE ON DELETE CASCADE
);