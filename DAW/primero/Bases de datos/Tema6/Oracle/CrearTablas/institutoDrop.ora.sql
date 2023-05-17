CONNECT instituto/instituto;

ALTER TABLE Alumnos
    DROP CONSTRAINT fk_alumnosGrupos;
DROP TABLE Matriculados;
DROP TABLE Grupos;
DROP TABLE Alumnos;
DROP TABLE Modulos;
DROP TABLE Profesores; 