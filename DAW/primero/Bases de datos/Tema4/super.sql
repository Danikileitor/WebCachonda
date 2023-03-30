CREATE DATABASE Super;
USE Super;
CREATE TABLE Zonas(  
    Codigo_postal CHAR(5) PRIMARY KEY
);
CREATE TABLE Repartidores(  
    Codigo CHAR(5) PRIMARY KEY,
    Nombre VARCHAR(40),
    Matricula CHAR(7),
    Zona CHAR(5),
    FOREIGN KEY (Zona) REFERENCES Zonas(Codigo_postal) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Clientes(  
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(40),
    Direccion VARCHAR(40),
    Tfno CHAR(9),
    Mail VARCHAR(40),
    Password VARCHAR(40),
    Zona CHAR(5),
    FOREIGN KEY (Zona) REFERENCES Zonas(Codigo_postal) ON UPDATE CASCADE ON DELETE RESTRICT
);
#Para todo registro de Clientes con un valor de zona, tiene que existir un registro en Repartidores con el mismo valor de zona.
CREATE TABLE Pedidos(  
    Codigo CHAR(5) PRIMARY KEY,
    Fecha DATE,
    Direccion VARCHAR(40),
    Importe SMALLINT UNSIGNED,
    Tarjeta CHAR(16),
    Fecha_cad_tjta VARCHAR(5),
    Dni_cliente CHAR(9),
    FOREIGN KEY (Dni_cliente) REFERENCES Clientes(Dni) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Categorias(  
    Nombre VARCHAR(40) PRIMARY KEY,
    Observaciones TEXT NULL,
    Condiciones ENUM('frío', 'congelado', 'seco')
);
CREATE TABLE Productos(  
    Nombre VARCHAR(40),
    Marca VARCHAR(40),
    Origen VARCHAR(40),
    Volumen SMALLINT UNSIGNED,
    Peso SMALLINT UNSIGNED,
    Foto TEXT,
    Caracteristicas TEXT,
    Stock SMALLINT UNSIGNED,
    Cod_categoria VARCHAR(40),
    PRIMARY KEY (Nombre, Marca),
    FOREIGN KEY (Cod_categoria) REFERENCES Categorias(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Incluye(  
    Cod_pedido CHAR(5),
    Prod_nombre VARCHAR(40),
    Prod_marca VARCHAR(40),
    Cantidad SMALLINT UNSIGNED,
    PRIMARY KEY (Cod_pedido, Prod_nombre, Prod_marca),
    FOREIGN KEY (Cod_pedido) REFERENCES Pedidos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Prod_nombre, Prod_marca) REFERENCES Productos(Nombre, Marca) ON UPDATE CASCADE ON DELETE CASCADE
);