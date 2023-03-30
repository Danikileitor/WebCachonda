INSERT INTO profesores VALUES('11111111A','Andrés','Cervantes, 4','611111111'),
('22222222B','Macarena','República, 127, 2ºA','622222222'),
('33333333C','Isabel','Plaza de la Rosa, 1','633333333'),
('44444444D','Fernando','Lucifer, 666','644444444');
INSERT INTO modulos VALUES('BBDD1','Bases de datos','11111111A'),
('PROG1','Programación','44444444D'),
('SSOO1','Sistemas operativos','22222222B'),
('RRLL1','Redes locales','11111111A'),
('DEC01','Desarrollo en entorno cliente','33333333C'),
('DES01','Desarrollo en entorno servidor','33333333C');
INSERT INTO grupos(Curso, Letra, Aula) VALUES(1,'A','S21'),
(1,'B','S22'),
(2,'A','T13'),
(2,'B','T14');
INSERT INTO alumnos VALUES('E1001','Maruja','Andrade','1999-03-16',2,'A'),
('E1002','Inés','Bonilla','1999-05-20',2,'B'),
('E1003','Alfonso','Cortés','1999-07-05',2,'A'),
('E1004','Miguel','Dávila','1999-09-27',1,'B'),
('E1005','Francisco','Estévez','1999-11-12',1,'A'),
('E1006','Cristina','Fernández','1999-08-21',2,'B'),
('E1007','José','González','1998-06-30',1,'A'),
('E1008','Raúl','Hervás','1999-01-02',2,'B'),
('E1009','Luisa','Iniesta','1998-11-18',1,'A'),
('E1010','Ángel','Jiménez','1998-09-09',1,'B'),
('E1011','Miguel','López','1998-07-21',1,'A'),
('E1012','Esteban','Moreno','1998-05-02',1,'B'),
('E1013','Matilde','Núñez','1998-03-12',1,'A'),
('E1014','Ángel','Ortega','1998-01-23',1,'B');
UPDATE grupos SET Delegado='E1005' WHERE Curso=1 AND Letra='A';
UPDATE grupos SET Delegado='E1004' WHERE Curso=1 AND Letra='B';
UPDATE grupos SET Delegado='E1003' WHERE Curso=2 AND Letra='A';
UPDATE grupos SET Delegado='E1002' WHERE Curso=2 AND Letra='B';
INSERT INTO matriculas VALUES('E1004','BBDD1'), ('E1005','BBDD1'), ('E1007','BBDD1'), ('E1009','BBDD1'), ('E1009','SSOO1'), ('E1010','SSOO1'),
('E1009','PROG1'), ('E1013','PROG1'), ('E1001','DEC01'), ('E1002','DEC01'),
('E1003','DEC01'), ('E1006','DEC01'), ('E1006','DES01'), ('E1008','DES01'),
('E1001','DES01'), ('E1002','DES01'), ('E1002','RRLL1'), ('E1003','RRLL1'),
('E1006','RRLL1'), ('E1008','RRLL1');