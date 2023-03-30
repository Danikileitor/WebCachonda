CREATE DATABASE Empresa;
USE Empresa;
CREATE TABLE Clientes(
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(20),
    Apellidos VARCHAR(20),
    Direccion VARCHAR(20),
    Fecha_nac DATE
);
CREATE TABLE Proveedores(
    Nif CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(20),
    Direccion VARCHAR(20)
);
CREATE TABLE Productos(
    Codigo VARCHAR(20) PRIMARY KEY,
    Nombre VARCHAR(20),
    Precio DOUBLE,
    Nif_proveedor CHAR(9),
    FOREIGN KEY (Nif_proveedor) REFERENCES Proveedores(Nif) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Compras(
    Dni_cliente CHAR(9),
    Cod_producto VARCHAR(20),
    PRIMARY KEY (Dni_cliente, Cod_producto),
    FOREIGN KEY (Dni_cliente) REFERENCES Clientes(Dni) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Cod_producto) REFERENCES Productos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);