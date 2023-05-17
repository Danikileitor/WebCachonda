connect automoviles/automoviles;

CREATE TABLE Clientes (
	Cod_cliente integer AUTO_INCREMENT,
	Nif char(9),
	Nombre varchar(40),
	Direccion varchar(40),
	Ciudad varchar(20),
	Tfno char(9),
	CONSTRAINT pk_clientes PRIMARY KEY (Cod_cliente)
);

CREATE TABLE Vehiculos (
	Matricula char(8),
	Marca varchar(15),
	Modelo varchar(15),
	Color varchar(10),
	Precio float,
	CONSTRAINT pk_vehiculos PRIMARY KEY (Matricula)
);

CREATE TABLE Revisiones (
	Cod_revision char(5),
	Filtro boolean,
	Aceite boolean,
	Frenos boolean,
	Otros text,
	Matricula char(8),
	CONSTRAINT pk_Revisiones PRIMARY KEY (Cod_revision),
	CONSTRAINT fk_RevisionesVehiculos FOREIGN KEY (Matricula)
		REFERENCES Vehiculos(Matricula)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE Compras (
	Matricula char(8),
	Cod_comprador integer,
	CONSTRAINT pk_compras PRIMARY KEY (Matricula, Cod_comprador),
	CONSTRAINT fk_comprasVehiculos FOREIGN KEY (Matricula)
		REFERENCES Vehiculos(Matricula)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
	CONSTRAINT fk_comprasClientes FOREIGN KEY (Cod_comprador)
		REFERENCES Clientes (Cod_cliente)
		ON UPDATE CASCADE
		ON DELETE RESTRICT
);