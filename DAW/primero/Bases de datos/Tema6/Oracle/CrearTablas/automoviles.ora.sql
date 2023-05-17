connect automoviles/automoviles;

CREATE TABLE Clientes (
	Cod_cliente NUMBER(5) PRIMARY KEY,
	Nif CHAR(9),
	Nombre VARCHAR2(40),
	Direccion VARCHAR2(40),
	Ciudad VARCHAR2(20),
	Tfno CHAR(9)
);

CREATE TABLE Vehiculos (
	Matricula CHAR(8) PRIMARY KEY,
	Marca VARCHAR2(15),
	Modelo VARCHAR2(15),
	Color VARCHAR2(10),
	Precio NUMBER(6,2)
);

CREATE TABLE Revisiones (
	Cod_revision CHAR(5),
	Filtro NUMBER(1),
	Aceite NUMBER(1),
	Frenos NUMBER(1),
	Otros CLOB,
	Matricula CHAR(8),
	CONSTRAINT pk_Revisiones PRIMARY KEY (Cod_revision),
	CONSTRAINT fk_RevisionesVehiculos FOREIGN KEY (Matricula)
		REFERENCES Vehiculos(Matricula)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE Compras (
	Matricula CHAR(8),
	Cod_comprador NUMBER(5),
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