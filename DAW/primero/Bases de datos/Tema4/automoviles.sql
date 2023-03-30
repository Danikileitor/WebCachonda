CREATE DATABASE Automoviles;
USE Automoviles;
CREATE TABLE Vehiculos(
    Matricula CHAR(7) PRIMARY KEY,
    Marca VARCHAR(20),
    Modelo VARCHAR(20),
    Color VARCHAR(20),
    Precio DOUBLE
);
CREATE TABLE Revisiones(
    Cod_revision VARCHAR(20) PRIMARY KEY,
    Filtro BOOLEAN,
    Aceite BOOLEAN,
	Frenos BOOLEAN,
    Otros TEXT NULL,
    Matricula CHAR(7),
    FOREIGN KEY (Matricula) REFERENCES Vehiculos(Matricula) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Clientes(
    Cod_cliente INTEGER AUTO_INCREMENT PRIMARY KEY,
    Nif CHAR(9) UNIQUE,
    Nombre VARCHAR(20),
    Direccion VARCHAR(20),
    Ciudad VARCHAR(20),
    Telefono CHAR(9)
);
CREATE TABLE Compras(
    Matricula CHAR(7),
    Cod_comprador INTEGER,
    PRIMARY KEY (Matricula, Cod_comprador),
    FOREIGN KEY (Matricula) REFERENCES Vehiculos(Matricula) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Cod_comprador) REFERENCES Clientes(Cod_cliente) ON UPDATE CASCADE ON DELETE CASCADE
);