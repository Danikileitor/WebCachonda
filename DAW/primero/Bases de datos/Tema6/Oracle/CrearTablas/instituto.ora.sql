CONNECT instituto/instituto;

CREATE TABLE Profesores (
    Dni CHAR(9),
    Nombre VARCHAR2(40),
    Direccion VARCHAR2(50),
    Tfno CHAR(9),
    CONSTRAINT pk_profesores PRIMARY KEY (Dni)
);

CREATE TABLE Modulos (
    Codigo CHAR(5),
    Nombre VARCHAR2(40),
    Profesor CHAR(9),
    CONSTRAINT pk_modulos PRIMARY KEY (Codigo),
    CONSTRAINT fk_modulosProfesores FOREIGN KEY (Profesor)
        REFERENCES Profesores(Dni)
);

CREATE TABLE Alumnos (
    N_expdte CHAR(5),
    Nombre VARCHAR2(40),
    Apellidos VARCHAR2(40),
    Fecha_nac DATE,
    Curso NUMBER(3),
    Letra CHAR(1),
    CONSTRAINT pk_alumnos PRIMARY KEY (N_expdte)
);

CREATE TABLE Grupos (
    Curso NUMBER(3),
    Letra CHAR(1),
    Aula CHAR(3),
    Delegado CHAR(5),
    CONSTRAINT pk_grupos PRIMARY KEY (Curso, Letra),
    CONSTRAINT fk_gruposAlumnos FOREIGN KEY (Delegado)
        REFERENCES Alumnos(N_expdte)
);

CREATE TABLE Matriculados (
    Alumno CHAR(5),
    Modulo CHAR(5),
    CONSTRAINT pk_matriculados PRIMARY KEY (Alumno, Modulo),
    CONSTRAINT fk_matriculadosAlumnos FOREIGN KEY (Alumno)
        REFERENCES Alumnos(N_expdte)
        ON DELETE CASCADE,
    CONSTRAINT fk_matriculadosModulos FOREIGN KEY (Modulo)
        REFERENCES Modulos(Codigo)
        ON DELETE CASCADE
);

ALTER TABLE Alumnos
    ADD CONSTRAINT fk_alumnosGrupos FOREIGN KEY (Curso, Letra)
        REFERENCES Grupos(Curso, Letra);
