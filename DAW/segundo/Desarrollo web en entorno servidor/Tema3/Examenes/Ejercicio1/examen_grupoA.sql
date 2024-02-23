DROP DATABASE IF EXISTS Instituto;
CREATE DATABASE Instituto;
USE Instituto;

CREATE TABLE Profesores (
	Dni char(9),
	Nombre varchar(40) NOT NULL,
	Direccion varchar(50) NOT NULL,
	Tfno char(9) NOT NULL,
	CONSTRAINT pf_Profesores PRIMARY KEY (Dni)
);

CREATE TABLE Modulos (
	Codigo char(5),
	Nombre varchar(40) NOT NULL,
	Dni_profesor char(9) NOT NULL,
	CONSTRAINT pk_modulos PRIMARY KEY (Codigo),
	CONSTRAINT fk_modulosProfesores FOREIGN KEY (Dni_profesor)
		REFERENCES Profesores(Dni)
		ON UPDATE CASCADE
		ON DELETE RESTRICT
);

#Creamos la tabla Alumnos sin declarar la clave ajena a Grupos
#porque aún no se ha creado esa tabla.
#Añadimos la clave ajena al final con ALTER TABLE
CREATE TABLE Alumnos (
	N_expdte char(5),
	Nombre varchar(40) NOT NULL,
	Apellidos varchar(40) NOT NULL,
	Fecha_nac date NOT NULL,
	Curso TINYINT UNSIGNED NOT NULL,
	Letra char(1) NOT NULL,
	CONSTRAINT pk_alumnos PRIMARY KEY (N_expdte)
);

CREATE TABLE Grupos (
	Curso TINYINT UNSIGNED,
	Letra char(1),
	Aula char(3) NOT NULL,
	Delegado char(5),
	CONSTRAINT pk_grupos PRIMARY KEY (Curso,Letra),
	CONSTRAINT fk_gruposAlumnos FOREIGN KEY (Delegado)
		REFERENCES Alumnos(N_expdte)
		ON UPDATE CASCADE
		ON DELETE RESTRICT
);

CREATE TABLE Matriculas (
	Alumno char(5),
	Modulo char(5),
	CONSTRAINT pk_matriculas PRIMARY KEY (Alumno,Modulo),
	CONSTRAINT fk_matriculasAlumnos FOREIGN KEY (Alumno)
		REFERENCES Alumnos(N_expdte)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
	CONSTRAINT fk_matriculasModulos FOREIGN KEY (Modulo)
		REFERENCES Modulos(Codigo)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

ALTER TABLE Alumnos
	ADD CONSTRAINT fk_alumnosGrupos FOREIGN KEY (Curso,Letra)
			REFERENCES Grupos(Curso,Letra)
			ON UPDATE CASCADE
			ON DELETE RESTRICT;

DROP USER IF EXISTS 'instituto';
CREATE USER 'instituto' IDENTIFIED BY 'instituto';

GRANT ALL ON Instituto.* to 'instituto';




#Fichero instiDatos.sql
USE Instituto;

DELETE from Matriculas;
DELETE from Modulos;
DELETE from Profesores;
UPDATE Grupos SET delegado=NULL;
DELETE from Alumnos;
DELETE from Grupos;

INSERT INTO Profesores VALUES 
	('11111111A','Andrés','Cervantes, 4','611111111'),
	('22222222B','Macarena','República, 127, 2ºA','622222222'),
	('33333333C','Isabel','Plaza de la Rosa, 1','633333333'),
	('44444444D','Fernando','Lucifer, 666','644444444');

INSERT INTO Modulos VALUES
	('BBDD1','Bases de datos','11111111A'),
	('PROG1','Programación','44444444D'),
	('SSOO1','Sistemas operativos','22222222B'),
	('RRLL1','Redes locales','11111111A'),
	('DEC01','Desarrollo en entorno cliente','33333333C'),
	('DES01','Desarrollo en entorno servidor','33333333C');

#Introducimos los grupos sin valor para el delegado
#porque al ser una clave ajena no podrá tomar valores
#que aún no existen en la tabla Alumnos.
INSERT INTO Grupos VALUES
	(1,'A','S21',NULL),
	(1,'B','S22',NULL),
	(2,'A','T13',NULL),
	(2,'B','T14',NULL);

INSERT INTO Alumnos VALUES
	('E1001','Maruja','Andrade','1999-03-16',2,'A'),
	('E1002','Inés','Bonilla','1999-05-20',2,'B'),
	('E1003','Alfonso','Cortés','1999-07-05',2,'A'),
	('E1004','Miguel','Dávila','1999-09-27',1,'B'),
	('E1005','Francisco','Estévez','1999-11-12',1,'A'),
	('E1006','Cristina','Fernández','1999-08-21',2,'B'),
	('E1007','José','González','1998-06-30',1,'A'),
	('E1008','Raúl','Hervás','1999-01-02',2,'B'),
	('E1009','Luisa','Iniesta','1998-11-18',1,'A'),
	('E1010','Ángel','Jiménez','1998-09-09',1,'B'),
	('E1011','Miguel','López','1998-07-21',1,'A'),
	('E1012','Esteban','Moreno','1998-05-02',1,'B'),
	('E1013','Matilde','Núñez','1998-03-12',1,'A'),
	('E1014','Ángel','Ortega','1998-01-23',1,'B');
	
UPDATE Grupos SET delegado='E1005' WHERE Curso=1 AND Letra='A';
UPDATE Grupos SET delegado='E1004' WHERE Curso=1 AND Letra='B';
UPDATE Grupos SET delegado='E1003' WHERE Curso=2 AND Letra='A';
UPDATE Grupos SET delegado='E1002' WHERE Curso=2 AND Letra='B';

INSERT INTO Matriculas VALUES
	('E1004','BBDD1'),
	('E1005','BBDD1'),
	('E1007','BBDD1'),
	('E1009','BBDD1'),
	('E1009','SSOO1'),
	('E1010','SSOO1'),
	('E1009','PROG1'),
	('E1013','PROG1'),
	('E1001','DEC01'),
	('E1002','DEC01'),
	('E1003','DEC01'),
	('E1006','DEC01'),
	('E1006','DES01'),
	('E1008','DES01'),
	('E1001','DES01'),
	('E1002','DES01'),
	('E1002','RRLL1'),
	('E1003','RRLL1'),
	('E1006','RRLL1'),
	('E1008','RRLL1');
