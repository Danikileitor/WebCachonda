CONNECT startrek/startrek;

CREATE TABLE Personajes (
    Nombre VARCHAR2(40),
    Grado VARCHAR2(10),
    CONSTRAINT pk_personajes PRIMARY KEY (Nombre)
);

CREATE TABLE Humanos (
    Cod_personaje VARCHAR2(40),
    Fecha_nac DATE,
    Ciudad VARCHAR2(2),
    CONSTRAINT pk_humanos PRIMARY KEY (Cod_personaje),
    CONSTRAINT fk_humanosPersonajes FOREIGN KEY (Cod_personaje)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE
);

CREATE TABLE Vulcanos (
    Cod_personaje VARCHAR2(40),
    Fecha_grad DATE,
    Mentor VARCHAR2(40),
    CONSTRAINT pk_vulcanos PRIMARY KEY (Cod_personaje),
    CONSTRAINT fk_vulcanosPersonajes FOREIGN KEY (Cod_personaje)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE
);

CREATE TABLE Klingons (
    Cod_personaje VARCHAR2(40),
    Fecha_combate DATE,
    Planeta VARCHAR2(30),
    CONSTRAINT pk_klingons PRIMARY KEY (Cod_personaje),
    CONSTRAINT fk_klingonsPersonajes FOREIGN KEY (Cod_personaje)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE
);

CREATE TABLE Depende (
    Mando VARCHAR2(40),
    Subordinado VARCHAR2(40),
    CONSTRAINT pk_depende PRIMARY KEY (Mando, Subordinado),
    CONSTRAINT fk_dependePersonajes1 FOREIGN KEY (Mando)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE,
    CONSTRAINT fk_dependePersonajes2 FOREIGN KEY (Subordinado)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE
);

CREATE TABLE Actores (
    Codigo CHAR(7),
    Nombre VARCHAR2(40),
    Nacionalidad VARCHAR2(20),
    Fecha_nac DATE,
    Cod_personaje VARCHAR2(40),
    CONSTRAINT pk_actores PRIMARY KEY (Codigo),
    CONSTRAINT fk_actoresPersonajes FOREIGN KEY (Cod_personaje)
        REFERENCES Personajes (Nombre)
);

CREATE TABLE Peliculas (
    Titulo VARCHAR2(50),
    Director VARCHAR2(40),
    Anno NUMBER(4),
    Protagonista VARCHAR2(40),
    CONSTRAINT pk_peliculas PRIMARY KEY (Titulo),
    CONSTRAINT fk_peliculasPersonajes FOREIGN KEY (Protagonista)
        REFERENCES Personajes (Nombre)
);

CREATE TABLE Aparece (
    Pelicula VARCHAR2(50),
    Personaje VARCHAR2(40),
    CONSTRAINT pk_aparece PRIMARY KEY (Pelicula, Personaje),
    CONSTRAINT fk_aparecePeliculas FOREIGN KEY (Pelicula)
        REFERENCES Peliculas (Titulo)
        ON DELETE CASCADE,
    CONSTRAINT fk_aparecePersonajes FOREIGN KEY (Personaje)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE
);

CREATE TABLE Capitulos (
    Temporada NUMBER(3),
    Orden NUMBER(3),
    Titulo VARCHAR2(50),
    Fecha DATE,
    CONSTRAINT pk_capitulos PRIMARY KEY (Temporada, Orden)
);

CREATE TABLE Participa (
    Personaje VARCHAR2(40),
    Cap_temp NUMBER(3),
    Cap_orden NUMBER(3),
    CONSTRAINT pk_participa PRIMARY KEY (Personaje, Cap_temp, Cap_orden),
    CONSTRAINT fk_participaPersonajes FOREIGN KEY (Personaje)
        REFERENCES Personajes (Nombre)
        ON DELETE CASCADE,
    CONSTRAINT fk_participaCapitulos FOREIGN KEY (Cap_temp, Cap_orden)
        REFERENCES Capitulos (Temporada, Orden)
        ON DELETE CASCADE
);

CREATE TABLE Naves (
    Codigo CHAR(3),
    N_tripulantes NUMBER(6),
    CONSTRAINT pk_naves PRIMARY KEY (Codigo)
);

CREATE TABLE Lanzaderas (
    Cod_nave CHAR(3),
    Numero NUMBER(3),
    Capacidad NUMBER(3),
    CONSTRAINT pk_lanzaderas PRIMARY KEY (Cod_nave, Numero),
    CONSTRAINT fk_lanzaderasNaves FOREIGN KEY (Cod_nave)
        REFERENCES Naves (Codigo)
        ON DELETE CASCADE
);

CREATE TABLE Planetas (
    Codigo CHAR(5),
    Nombre VARCHAR2(20),
    Galaxia VARCHAR2(20),
    Problema CLOB,
    CONSTRAINT pk_planetas PRIMARY KEY (Codigo)
);

CREATE TABLE Visitas (
    Codigo CHAR(5),
    Cod_temp NUMBER(3),
    Cod_orden NUMBER(3),
    Cod_planeta CHAR(5),
    Cod_nave CHAR(3),
    CONSTRAINT pk_visitas PRIMARY KEY (Codigo),
    CONSTRAINT fk_visitasCapitulos FOREIGN KEY (Cod_temp, Cod_orden)
        REFERENCES Capitulos (Temporada, Orden)
        ON DELETE CASCADE,
    CONSTRAINT fk_visitasPlanetas FOREIGN KEY (Cod_planeta)
        REFERENCES Planetas (Codigo),
    CONSTRAINT fk_visitasNaves FOREIGN KEY (Cod_nave)
        REFERENCES Naves (Codigo)
);

