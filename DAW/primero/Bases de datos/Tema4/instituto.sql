CREATE DATABASE Instituto;
USE Instituto;
CREATE TABLE Profesores(
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(40),
    Direccion VARCHAR(40),
    Tfno CHAR(9)
);
CREATE TABLE Modulos(
    Codigo CHAR(4) PRIMARY KEY,
    Nombre VARCHAR(40),
    DNI_profesor CHAR(9),
    FOREIGN KEY (DNI_profesor) REFERENCES Profesores(Dni) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Grupos(
    Curso CHAR(1),
    Letra CHAR(1),
    Aula VARCHAR(2),
    Delegado CHAR(5),
    PRIMARY KEY (Curso, Letra)
);
CREATE TABLE Alumnos(
    N_expdte CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Apellidos VARCHAR(40),
    Fecha_nac DATE,
    Curso CHAR(1),
    Letra CHAR(1),
    FOREIGN KEY (Curso, Letra) REFERENCES Grupos(Curso, Letra) ON UPDATE CASCADE ON DELETE RESTRICT
);
ALTER TABLE Grupos ADD FOREIGN KEY (Delegado) REFERENCES Alumnos(N_expdte) ON UPDATE CASCADE ON DELETE RESTRICT;
CREATE TABLE Matriculas(
    Modulo CHAR(4),
    Alumno CHAR(5),
    PRIMARY KEY (Modulo, Alumno),
    FOREIGN KEY (Modulo) REFERENCES Modulos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Alumno) REFERENCES Alumnos(N_expdte) ON UPDATE CASCADE ON DELETE CASCADE
);