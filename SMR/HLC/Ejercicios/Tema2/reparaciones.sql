drop table if exists reparaciones;
drop table if exists trabajadores;
drop table if exists talleres;
drop table if exists provincias;
drop table if exists articulos;
drop table if exists clientes;
-- Tablas
create table provincias(
   id_prov char(3),
   nom_prov varchar(30),
   constraint pk_prov primary key(id_prov)
);
create table talleres(
   id_taller char(3),
   nom_taller varchar(50) not null,
   id_prov char(3),
   constraint pk_talleres primary key(id_taller));
create table trabajadores(
   id_trab char(3),
   nom_trab varchar(40) not null,
   sueldo float,
   id_taller char(3),
   constraint pk_trab primary key(id_trab));
create table clientes(
   id_cli char(3),
   nom_cli varchar(40) not null,
   tlfn_cli char(9),
   constraint pk_cliente primary key(id_cli)
);
create table articulos(
   id_art char(3),
   nom_art varchar (40) not null,
   id_cli char(3),
   constraint pk_art primary key(id_art));
create table reparaciones(
   id_trab char(3),
   id_art char(3),
   fecha date,
   precio_rep float,
   constraint pk_rep primary key(id_trab, id_art, fecha));
-- Datos ------------------------------------------------------------------------------
delete from provincias;
insert into provincias values('P01', 'SEVILLA');
insert into provincias values('P02', 'GRANADA');
insert into provincias values('P03', 'ALMERIA');

-- -----------------------------------------------
delete from talleres;
INSERT INTO talleres values('TA1', 'REPARACIONES S.A.', 'P01');
INSERT INTO talleres values('TA2', 'SERVICIOS', 'P02');
INSERT INTO talleres values('TA3', 'REP S.A.', 'P03');
INSERT INTO talleres values('TA4', 'REPARA TODO', 'P03');
INSERT INTO talleres values('TA5', 'TALLERES UNIDOS', 'P02');
-- ---------------------------------------------------------------------------------------
delete from trabajadores;
INSERT INTO trabajadores values('T01', 'ANA LOPEZ', 1234.5, 'TA1');
INSERT INTO trabajadores values('T02', 'LUCAS ACARAZ', 2345.6 , 'TA1');
INSERT INTO trabajadores values('T03', 'MIGUEL GUZMAN', 87.4 , 'TA2');
INSERT INTO trabajadores values('T04', 'INES FERNANDEZ', 380 , 'TA2');
INSERT INTO trabajadores values('T05', 'JUAN GIL',1000 , 'TA3');
INSERT INTO trabajadores values('T06', 'LUISA PEREZ', 1234.67 , 'TA3');
INSERT INTO trabajadores values('T07', 'MANUEL LOPEZ', 1235.6, 'TA4');
INSERT INTO trabajadores values('T08', 'MANOLI BLANES', 3535.67 , 'TA4');
INSERT INTO trabajadores values('T09', 'MIGURL GARCIA', 1567.8, 'TA5');
INSERT INTO trabajadores values('T10', 'JOSE HILARIO', 4567.4 , 'TA5');

-- --------------------------------------------------------------------------------------
delete from clientes;
INSERT INTO clientes VALUES('C01', 'INES JUAREZ', '123445667');
INSERT INTO clientes VALUES('C02', 'MANOLO SANZ', '123445667');
INSERT INTO clientes VALUES('C03', 'OLVIDO GRACIA', '123445667');
INSERT INTO clientes VALUES('C04', 'VICENTE GIL', '123445667');
INSERT INTO clientes VALUES('C05', 'PEPA FLORES', '123445667');
INSERT INTO clientes VALUES('C06', 'LUISA LILO', '123445667');
INSERT INTO clientes VALUES('C07', 'PACO PEREZ', '123445667');
INSERT INTO clientes VALUES('C08', 'MIGUEL HILARIO', '123445667');
INSERT INTO clientes VALUES('C09', 'KIKO HERNANDEZ', '123445667');
INSERT INTO clientes VALUES('C10', 'ANA LUCAS', '123445667');
INSERT INTO clientes VALUES('C11', 'BOB ESPONJA', '123445667');
INSERT INTO clientes VALUES('C12', 'LUIS ALMODOVAR', '123445667');
-- ---------------------------------------------------------

INSERT INTO articulos values('A01', 'MICROONDAS', 'C01');
INSERT INTO articulos values('A02', 'IMPRESORA', 'C02');
INSERT INTO articulos values('A03', 'PORTATIL', 'C03');
INSERT INTO articulos values('A04', 'TABLET', 'C04');
INSERT INTO articulos values('A05', 'ROUTER', 'C05');
INSERT INTO articulos values('A06', 'PANTALLA', 'C06');
INSERT INTO articulos values('A07', 'TV LG', 'C07');
INSERT INTO articulos values('A08', 'TV SAMSUNG', 'C08');
INSERT INTO articulos values('A09', 'MANDO', 'C09');
INSERT INTO articulos values('A10', 'RADIO', 'C10');
INSERT INTO articulos values('A11', 'LAMPARA', 'C11');
INSERT INTO articulos values('A12', 'REPETIDOR', 'C12');
INSERT INTO articulos values('A13', 'MEMORIA', 'C12');
INSERT INTO articulos values('A14', 'TV PHILPS', 'C01');
INSERT INTO articulos values('A15', 'PC INTEL 7', 'C05');
-- --------------------------------------------------

INSERT INTO reparaciones values('T01','A01','2013/05/06', 345.45);
INSERT INTO reparaciones values('T02','A02','2013/05/06', 45.45);
INSERT INTO reparaciones values('T03','A03','2013/05/06', 145.45);
INSERT INTO reparaciones values('T04','A04','2013/05/06', 35.45);
INSERT INTO reparaciones values('T05','A05','2013/05/06', 45.55);
INSERT INTO reparaciones values('T06','A06','2013/05/06', 645.45);
INSERT INTO reparaciones values('T07','A07','2013/05/06', 3.45);
INSERT INTO reparaciones values('T08','A08','2013/05/06', 34.85);
INSERT INTO reparaciones values('T09','A09','2013/05/06', 745.45);
INSERT INTO reparaciones values('T10','A10','2013/05/06', 945.45);
INSERT INTO reparaciones values('T01','A11','2013/05/06', 375.85);
INSERT INTO reparaciones values('T02','A12','2013/05/06', 45.45);
INSERT INTO reparaciones values('T03','A13','2013/05/06', 35.4);
INSERT INTO reparaciones values('T04','A14','2013/05/06', 45.45);
INSERT INTO reparaciones values('T05','A15','2013/05/06', 345);
INSERT INTO reparaciones values('T06','A01','2013/05/06', 35.4);
INSERT INTO reparaciones values('T07','A03','2013/05/06', 34.45);


