CONNECT liga/liga;

CREATE TABLE Presidentes (
    Dni CHAR(9),
    Nombre VARCHAR2(40) NOT NULL,
    Apellidos VARCHAR2(40) NOT NULL,
    Fecha_nac DATE,
    Anno NUMBER(4) NOT NULL,
    CONSTRAINT pk_presidentes PRIMARY KEY (Dni)
);

CREATE TABLE Equipos (
    Codigo CHAR(5),
    Nombre VARCHAR2(40) NOT NULL,
    Estadio VARCHAR2(40) NOT NULL,
    Aforo NUMBER,
    Fundacion DATE,
    Ciudad VARCHAR2(20) NOT NULL,
    Presidente CHAR(9) NOT NULL,
    CONSTRAINT pk_equipos PRIMARY KEY (Codigo),
    CONSTRAINT fk_equiposPresidentes FOREIGN KEY (Presidente)
        REFERENCES Presidentes (Dni)
);

CREATE TABLE Partidos (
    Codigo CHAR(4),
    Fecha DATE NOT NULL,
    Equipo_local CHAR(5) NOT NULL,
    Equipo_visitante CHAR(5) NOT NULL,
    CONSTRAINT pk_partidos PRIMARY KEY (Codigo),
    CONSTRAINT fk_partidosEquipos1 FOREIGN KEY (Equipo_local)
        REFERENCES Equipos(Codigo),
    CONSTRAINT fk_partidosEquipos2 FOREIGN KEY (Equipo_visitante)
        REFERENCES Equipos(Codigo)
);
    
CREATE TABLE Jugadores (
    Codigo CHAR(5),
    Nombre VARCHAR2(40) NOT NULL,
    Fecha DATE NOT NULL,
    Posicion VARCHAR2(15) NOT NULL,
    Cod_equipo CHAR(5) NOT NULL,
    CONSTRAINT ch_posicion CHECK (Posicion IN ('portero', 'defensa', 'centrocampista', 'delantero')),
    CONSTRAINT pk_jugadores PRIMARY KEY (Codigo),
    CONSTRAINT fk_jugadoresEquipos FOREIGN KEY (Cod_equipo)
        REFERENCES Equipos(Codigo)
);

CREATE TABLE Goles (
    Cod_partido CHAR(4),
    Minuto NUMBER,
    Descripcion CLOB,
    Cod_jugador CHAR(5) NOT NULL,
    PropiaPuerta NUMBER(1) NOT NULL,
    CONSTRAINT pk_goles PRIMARY KEY (Cod_partido, Minuto),
    CONSTRAINT fk_golesPartidos FOREIGN KEY (Cod_partido)
        REFERENCES Partidos(Codigo)
            ON DELETE CASCADE,
    CONSTRAINT fk_golesJugadores FOREIGN KEY (Cod_jugador)
        REFERENCES Jugadores(Codigo)
);
