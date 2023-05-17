CONNECT empresa/empresa;

CREATE TABLE Clientes (
    Dni CHAR(9),
    Nombre VARCHAR2(40),
    Apellidos VARCHAR2(40),
    Direccion VARCHAR2(40),
    Fecha_nac DATE,
    CONSTRAINT pk_clientes PRIMARY KEY (Dni)
);

CREATE TABLE Proveedores (
    Nif CHAR(9),
    Nombre VARCHAR2(40),
    Direccion VARCHAR2(40),
    CONSTRAINT pk_proveedores PRIMARY KEY (Nif)
);

CREATE TABLE Productos (
    Codigo CHAR(5),
    Nombre VARCHAR2(40),
    Precio NUMBER(6,2),
    Nif_proveedor CHAR(9),
    CONSTRAINT pk_productos PRIMARY KEY (Codigo),
    CONSTRAINT fk_productosProveedor FOREIGN KEY (Nif_proveedor)
        REFERENCES Proveedores (Nif)
        ON DELETE CASCADE
);

CREATE TABLE Compras (
    Dni_cliente CHAR(9),
    Codigo_producto CHAR(5),
    CONSTRAINT pk_compras PRIMARY KEY (Dni_cliente, Codigo_producto),
    CONSTRAINT fk_comprasClientes FOREIGN KEY (Dni_cliente)
        REFERENCES Clientes (Dni)
        ON DELETE CASCADE,
    CONSTRAINT fk_comprasProductos FOREIGN KEY (Codigo_producto)
        REFERENCES Productos (Codigo)
        ON DELETE CASCADE
);