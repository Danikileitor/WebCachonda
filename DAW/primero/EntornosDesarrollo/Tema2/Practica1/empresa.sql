SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Compra;
DROP TABLE IF EXISTS Cliente;
DROP TABLE IF EXISTS Producto;
DROP TABLE IF EXISTS Proveedor;




/* Create Tables */

CREATE TABLE Cliente
(
	DNI varchar(9) NOT NULL,
	Nombre varchar(20),
	Apellidos varchar(20),
	Direccion varchar(20),
	Fecha_nac date,
	PRIMARY KEY (DNI)
);


CREATE TABLE Compra
(
	DNI varchar(9),
	Codigo int,
	Fecha date
);


CREATE TABLE Producto
(
	Codigo int NOT NULL,
	Nombre varchar(20),
	Precio float,
	NIF varchar(9) NOT NULL,
	PRIMARY KEY (Codigo)
);


CREATE TABLE Proveedor
(
	NIF varchar(9) NOT NULL,
	Nombre varchar(20),
	Direccion varchar(20),
	PRIMARY KEY (NIF)
);



/* Create Foreign Keys */

ALTER TABLE Compra
	ADD FOREIGN KEY (DNI)
	REFERENCES Cliente (DNI)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Compra
	ADD FOREIGN KEY (Codigo)
	REFERENCES Producto (Codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producto
	ADD CONSTRAINT Suministra FOREIGN KEY (NIF)
	REFERENCES Proveedor (NIF)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



