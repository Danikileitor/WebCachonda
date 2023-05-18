CONNECT super/super;

CREATE TABLE Categorias (
    Nombre VARCHAR2(20),
    Observaciones CLOB,
    Condiciones VARCHAR2(20),
    CONSTRAINT pk_categorias PRIMARY KEY (Nombre)
);

CREATE TABLE Productos (
    Nombre VARCHAR2(20),
    Marca VARCHAR2(20),
    Origen VARCHAR2(20),
    Volumen NUMBER(3,2),
    Peso NUMBER(3,2),
    Foto VARCHAR2(60),
    Caracteristicas CLOB,
    Stock NUMBER(6),
    Cod_categoria VARCHAR2(20),
    CONSTRAINT pk_productos PRIMARY KEY (Nombre, Marca),
    CONSTRAINT fk_productosCategorias FOREIGN KEY (Cod_categoria)
        REFERENCES Categorias (Nombre)
);

CREATE TABLE Zonas (
    Codigo_postal CHAR(5),
    CONSTRAINT pk_zonas PRIMARY KEY (Codigo_postal)
);

CREATE TABLE Repartidores (
    Codigo CHAR(5),
    Nombre VARCHAR2(40),
    Matricula CHAR(9),
    Zona CHAR(5),
    CONSTRAINT pk_repartidores PRIMARY KEY (Codigo),
    CONSTRAINT fk_repartidoresZonas FOREIGN KEY (Zona)
        REFERENCES Zonas (Codigo_postal)
);

CREATE TABLE Clientes (
    Dni CHAR(9),
    Nombre VARCHAR2(40),
    Direccion VARCHAR2(60),
    Tfno CHAR(9),
    Mail VARCHAR2(30),
    Password VARCHAR2(15),
    Zona CHAR(5),
    CONSTRAINT pk_clientes PRIMARY KEY (Dni),
    CONSTRAINT fk_clientesZonas FOREIGN KEY (Zona)
        REFERENCES Zonas (Codigo_postal)
);

CREATE TABLE Pedidos (
    Codigo CHAR(10),
    Fecha DATE,
    Direccion VARCHAR2(60),
    Importe NUMBER(6,2),
    Tarjeta CHAR(20),
    Fecha_cad_tjta DATE,
    Dni_cliente CHAR(9),
    CONSTRAINT pk_pedidos PRIMARY KEY (Codigo),
    CONSTRAINT fk_pedidosClientes FOREIGN KEY (Dni_cliente)
        REFERENCES Clientes (Dni)
);

CREATE TABLE Incluye (
    Cod_pedido CHAR(10),
    Prod_nombre VARCHAR2(20),
    Prod_marca VARCHAR2(20),
    Cantidad NUMBER(6),
    CONSTRAINT pk_incluye PRIMARY KEY (Cod_pedido, Prod_nombre, Prod_marca),
    CONSTRAINT fk_incluyePedidos FOREIGN KEY (Cod_pedido)
        REFERENCES Pedidos (Codigo),
    CONSTRAINT fk_incluyeProductos FOREIGN KEY (Prod_nombre, Prod_marca)
        REFERENCES Productos (Nombre, Marca)
        ON DELETE CASCADE
);