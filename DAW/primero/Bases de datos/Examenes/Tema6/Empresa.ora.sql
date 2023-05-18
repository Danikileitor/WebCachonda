--Preparamos y creamos el usuario examen
alter session set "_ORACLE_SCRIPT"=true;
CREATE USER examen IDENTIFIED BY examen;
GRANT ALL PRIVILEGES TO examen;
CONNECT examen/examen;

--Limpiamos la base de datos para pruebas
DROP TABLE Empleaado;
DROP TABLE Sede;

--Ejercicio 1
CREATE TABLE Sede(
    Cod_sede CHAR(5) PRIMARY KEY,
    Nombre VARCHAR2(20) NOT NULL,
    Ciudad VARCHAR2(20) NOT NULL
);

CREATE TABLE Empleaado(
    cod_emp CHAR(5) PRIMARY KEY,
    Nombre VARCHAR2(20) NOT NULL,
    Apellidos VARCHAR2(20) NOT NULL,
    encargado CHAR(5) NOT NULL,
    Sede_trabajo CHAR(5) NOT NULL,
    sueldo NUMBER(4) NOT NULL,
    CONSTRAINT fk_encargado FOREIGN KEY (encargado) REFERENCES Empleaado(cod_emp),
    CONSTRAINT fk_sede_trabajo FOREIGN KEY (Sede_trabajo) REFERENCES Sede(Cod_sede),
    CONSTRAINT ch_sueldo CHECK (sueldo BETWEEN 1200 AND 3000)
);

--Ejercicio 2 (Mejor primero metemos las sedes por lo que sea)
INSERT INTO Sede VALUES('S1', 'Leon', 'Madrid');
INSERT INTO Sede VALUES('S2', 'Tigre', 'Barcelona');
INSERT INTO Sede VALUES('S3', 'Pantera', 'Bilbao');
INSERT INTO Sede VALUES('S4', 'Jaguar', 'Sevilla');
INSERT INTO Sede VALUES('S5', 'Puma', 'Valencia');

--Ya podía alguno ser encargado de sí mismo... Pongo primero el empleado C3 encargado de sí mismo y al final lo corrigo.
INSERT INTO Empleaado VALUES('C3', 'Mateo', 'Berrizo', 'C3', 'S2', 1900);
INSERT INTO Empleaado VALUES('C1', 'Pedro', 'Toribio', 'C3', 'S1', 1600);
INSERT INTO Empleaado VALUES('C4', 'Jesús', 'Cea', 'C3', 'S3', 1600);
INSERT INTO Empleaado VALUES('C5', 'Lucas', 'Dones', 'C3', 'S4', 1500);
INSERT INTO Empleaado VALUES('C6', 'Manuel', 'Espinosa', 'C3', 'S5', 2000);
INSERT INTO Empleaado VALUES('C2', 'Juan', 'Ares', 'C4', 'S1', 1900);
UPDATE Empleaado SET encargado='C2' WHERE cod_emp='C3';

--Ejercicio 3
UPDATE Empleaado SET sueldo = sueldo + 50;
SELECT Empleaado.Nombre Nombre_Empleado, Encargado.Nombre Nombre_Encargado FROM Empleaado, (SELECT Nombre, cod_emp FROM Empleaado) Encargado WHERE Empleaado.encargado = Encargado.cod_emp;