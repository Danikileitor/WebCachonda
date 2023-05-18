CREATE TABLE Personajes (
	Nombre varchar(40),
	Grado enum ('capitán', 'teniente', 'almirante'),
	CONSTRAINT pk_personajes PRIMARY KEY (Nombre)
);

CREATE TABLE Humanos (
	Cod_personaje varchar(40),
	Fecha_nac date,
	Ciudad varchar(2),
	CONSTRAINT pk_humanos PRIMARY KEY (Cod_personaje),
	CONSTRAINT fk_humanosPersonajes FOREIGN KEY (Cod_personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Vulcanos (
	Cod_personaje varchar(40),
	Fecha_grad date,
	Mentor varchar(40),
	CONSTRAINT pk_vulcanos PRIMARY KEY (Cod_personaje),
	CONSTRAINT fk_vulcanosPersonajes FOREIGN KEY (Cod_personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Klingons (
	Cod_personaje varchar(40),
	Fecha_combate date,
	Planeta varchar(30),
	CONSTRAINT pk_klingons PRIMARY KEY (Cod_personaje),
	CONSTRAINT fk_klingonsPersonajes FOREIGN KEY (Cod_personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Depende (
	Mando varchar(40),
	Subordinado varchar(40),
	CONSTRAINT pk_depende PRIMARY KEY (Mando, Subordinado),
	CONSTRAINT fk_dependePersonajes1 FOREIGN KEY (Mando)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_dependePersonajes2 FOREIGN KEY (Subordinado)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Actores (
	Codigo char(7),
	Nombre varchar(40),
	Nacionalidad varchar(20),
	Fecha_nac date,
	Cod_personaje varchar(40),
	CONSTRAINT pk_actores PRIMARY KEY (Codigo),
	CONSTRAINT fk_actoresPersonajes FOREIGN KEY (Cod_personaje)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Peliculas (
	Titulo varchar(50),
	Director varchar(40),
	Anno year,
	Protagonista varchar(40),
	CONSTRAINT pk_peliculas PRIMARY KEY (Titulo),
	CONSTRAINT fk_peliculasPersonajes FOREIGN KEY (Protagonista)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Aparece (
	Pelicula varchar(50),
	Personaje varchar(40),
	CONSTRAINT pk_aparece PRIMARY KEY (Pelicula, Personaje),
	CONSTRAINT fk_aparecePeliculas FOREIGN KEY (Pelicula)
		REFERENCES Peliculas (Titulo)
		ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_aparecePersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Capitulos (
	Temporada TINYINT,
	Orden TINYINT,
	Titulo varchar(50),
	Fecha date,
	CONSTRAINT pk_capitulos PRIMARY KEY (Temporada, Orden)
);

CREATE TABLE Participa (
	Personaje varchar(40),
	Cap_temp TINYINT,
	Cap_orden TINYINT,
	CONSTRAINT pk_participa PRIMARY KEY (Personaje, Cap_temp, Cap_orden),
	CONSTRAINT fk_participaPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_participaCapitulos FOREIGN KEY (Cap_temp, Cap_orden)
		REFERENCES Capitulos (Temporada, Orden)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Naves (
	Codigo char(3),
	N_tripulantes integer,
	CONSTRAINT pk_naves PRIMARY KEY (Codigo)
);

CREATE TABLE Lanzaderas (
	Cod_nave char(3),
	Numero TINYINT,
	Capacidad integer,
	CONSTRAINT pk_lanzaderas PRIMARY KEY (Cod_nave, Numero),
	CONSTRAINT fk_lanzaderasNaves FOREIGN KEY (Cod_nave)
		REFERENCES Naves (Codigo)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Planetas (
	Codigo char(5),
	Nombre varchar(20),
	Galaxia varchar(20),
	Problema text,
	CONSTRAINT pk_planetas PRIMARY KEY (Codigo)
);

CREATE TABLE Visitas (
	Codigo char(5),
	Cod_temp TINYINT,
	Cod_orden TINYINT,
	Cod_planeta char(5),
	Cod_nave char (3),
	CONSTRAINT pk_visitas PRIMARY KEY (Codigo),
	CONSTRAINT fk_visitasCapitulos FOREIGN KEY(Cod_temp, Cod_orden)
		REFERENCES Capitulos(Temporada, Orden)
		ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_visitasPlanetas FOREIGN KEY(Cod_planeta)
		REFERENCES Planetas (Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT,
	CONSTRAINT fk_visitasNaves FOREIGN KEY(Cod_nave)
		REFERENCES Naves(Codigo)
		ON UPDATE CASCADE ON DELETE RESTRICT
);