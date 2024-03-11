drop table if exists costalero;
drop table if exists trono;
drop table if exists penitente;
drop table if exists costalero_recomienda_costalero;
drop table if exists costalero_lleva_trono;
-- Tablas
create table costalero(
   id_costalero char(3),
   nombre varchar(20),
   apellidos varchar(20),
   direccion varchar(20),
   f_nac date,
   tfno varchar(9),
   ncc varchar(24),
   altura integer,
   peso float,
   constraint pk_prov primary key(id_costalero)
);
create table trono(
   id_trono char(3),
   alto integer,
   ancho integer,
   largo integer,
   peso integer,
   constraint pk_talleres primary key(id_trono));
create table penitente(
   id_penitente char(3),
   nombre varchar(20),
   apellidos varchar(20),
   direccion varchar(20),
   f_nac date,
   tfno varchar(9),
   n_pie integer,
   id_trono char(3),
   constraint pk_trab primary key(id_penitente));
create table costalero_recomienda_costalero(
   id_costalero_recomendador char(3),
   id_costalero_recomendado char(3),
   constraint pk_cliente primary key(id_costalero_recomendador, id_costalero_recomendado)
);
create table costalero_lleva_trono(
   id_costalero char(3),
   id_trono char(3),
   precio integer,
   constraint pk_art primary key(id_costalero, id_trono));
-- Datos ------------------------------------------------------------------------------
delete from costalero;
insert into costalero values('C01', 'ANA', 'LOPEZ', 'Uno de Mayo, 1', "1989-03-15", '111111111', 'ES4568975321548148965234', 175, 80);
insert into costalero values('C02', 'LUCAS', 'ACARAZ', 'Dos de Mayo, 2', "1947-10-25", '222222222', 'ES4568975321548148965234', 169, 74);
insert into costalero values('C03', 'MIGUEL', 'GUZMAN', 'Tres de Mayo, 3', "1997-08-22", '333333333', 'ES4568975321548148965234', 170, 65);
insert into costalero values('C04', 'INES', 'FERNANDEZ', 'Cuatro de Mayo, 4', "1999-07-01", '444444444', 'ES4568975321548148965234', 166, 71);
insert into costalero values('C05', 'JUAN', 'GIL', 'Cinco de Mayo, 5', "2001-12-23", '555555555', 'ES4568975321548148965234', 155, 69);
insert into costalero values('C06', 'LUISA', 'PEREZ', 'Seis de Mayo, 6', "1979-02-28", '666666666', 'ES4568975321548148965234', 158, 64);
insert into costalero values('C07', 'MANUEL', 'LOPEZ', 'Siete de Mayo, 7', "1988-09-15", '777777777', 'ES4568975321548148965234', 160, 70);
insert into costalero values('C08', 'MANOLI', 'BLANES', 'Ocho de Mayo, 8', "1993-04-27", '888888888', 'ES4568975321548148965234', 190, 95);
insert into costalero values('C09', 'MIGUEL', 'GARCIA', 'Nueve de Mayo, 9', "1995-07-07", '999999999', 'ES4568975321548148965234', 187, 87);
insert into costalero values('C10', 'JOSE', 'HILARIO', 'Diez de Mayo, 10', "1996-09-29", '000000000', 'ES4568975321548148965234', 159, 88);

-- -----------------------------------------------
delete from trono;
INSERT INTO trono values('T01', 170, 250, 358, 500);
INSERT INTO trono values('T02', 180, 300, 410, 600);
INSERT INTO trono values('T03', 210, 290, 398, 550);

-- ---------------------------------------------------------------------------------------
delete from penitente;
insert into penitente values('P01', 'ANA', 'LOPEZ', 'Uno de Mayo, 1', "1989-03-15", '111111111', 35, 'T01');
insert into penitente values('P02', 'LUCAS', 'ACARAZ', 'Dos de Mayo, 2', "1947-10-25", '222222222', 42, 'T02');
insert into penitente values('P03', 'MIGUEL', 'GUZMAN', 'Tres de Mayo, 3', "1997-08-22", '333333333', 38, 'T03');
insert into penitente values('P04', 'INES', 'FERNANDEZ', 'Cuatro de Mayo, 4', "1999-07-01", '444444444', 45, 'T01');
insert into penitente values('P05', 'JUAN', 'GIL', 'Cinco de Mayo, 5', "2001-12-23", '555555555', 42, 'T02');
insert into penitente values('P06', 'LUISA', 'PEREZ', 'Seis de Mayo, 6', "1979-02-28", '666666666', 39, 'T03');
insert into penitente values('P07', 'MANUEL', 'LOPEZ', 'Siete de Mayo, 7', "1988-09-15", '777777777', 46, 'T01');
insert into penitente values('P08', 'MANOLI', 'BLANES', 'Ocho de Mayo, 8', "1993-04-27", '888888888', 41, 'T02');
insert into penitente values('P09', 'MIGUEL', 'GARCIA', 'Nueve de Mayo, 9', "1995-07-07", '999999999', 35, 'T03');
insert into penitente values('P10', 'JOSE', 'HILARIO', 'Diez de Mayo, 10', "1996-09-29", '000000000', 36, 'T03');

-- --------------------------------------------------------------------------------------
delete from costalero_recomienda_costalero;
INSERT INTO costalero_recomienda_costalero VALUES('C09', 'C01');
INSERT INTO costalero_recomienda_costalero VALUES('C01', 'C02');
INSERT INTO costalero_recomienda_costalero VALUES('C04', 'C03');
INSERT INTO costalero_recomienda_costalero VALUES('C08', 'C04');
INSERT INTO costalero_recomienda_costalero VALUES('C01', 'C05');
INSERT INTO costalero_recomienda_costalero VALUES('C07', 'C06');
INSERT INTO costalero_recomienda_costalero VALUES('C08', 'C07');
INSERT INTO costalero_recomienda_costalero VALUES('C09', 'C08');
INSERT INTO costalero_recomienda_costalero VALUES('C01', 'C09');
INSERT INTO costalero_recomienda_costalero VALUES('C01', 'C10');
-- ---------------------------------------------------------

delete from costalero_lleva_trono;
INSERT INTO costalero_lleva_trono values('C01', 'T01', 150);
INSERT INTO costalero_lleva_trono values('C02', 'T02', 200);
INSERT INTO costalero_lleva_trono values('C03', 'T03', 100);
INSERT INTO costalero_lleva_trono values('C04', 'T01', 40);
INSERT INTO costalero_lleva_trono values('C05', 'T02', 95);
INSERT INTO costalero_lleva_trono values('C06', 'T03', 600);
INSERT INTO costalero_lleva_trono values('C07', 'T01', 25);
INSERT INTO costalero_lleva_trono values('C08', 'T02', 180);
INSERT INTO costalero_lleva_trono values('C09', 'T03', 220);
INSERT INTO costalero_lleva_trono values('C10', 'T02', 475);


