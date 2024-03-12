-- Active: 1698050079167@@127.0.0.1@3306@dwes
CREATE DATABASE tienda_videojuegos;

USE tienda_videojuegos;

CREATE TABLE `usuarios` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(255) NOT NULL,
  `usuario` VARCHAR(50) NOT NULL,
  `contrasena` CHAR(60) NOT NULL,
  `email` VARCHAR(320) NOT NULL,
  `direccion` MEDIUMTEXT NOT NULL,
  `perfil` ENUM('normal','administrador') NULL DEFAULT 'normal'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `productos` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(255) NOT NULL,
  `imagen` VARCHAR(255) NOT NULL,
  `descripcion` TEXT NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuarios` (`id`, `nombre`, `usuario`, `contrasena`, `email`, `direccion`, `perfil`) VALUES
(1, 'Usuario', 'usuario', '$2a$12$78aEJHTD0qaH6MvfsKCGkev2MLMhR8eCCo0ccUb7acvDcyXNIGxgK', 'usuario@usuario.com', 'Debajo de un puente', 'normal'),
(2, 'Administrador', 'admin', '$2a$12$tjWR7yqs388DwkHg0jmp3./TIU7tKN/.3I76zNWtOevlldWNs3wR.', 'admin@admin.com', 'En el ático', 'administrador'),
(3, 'Prueba', 'prueba', '$2y$10$2EZ4m083BH7HYWQVSCx2qOn7eT0eswn21GYDKRuxpqhpyCmt72/sC', 'prueba@prueba.com', 'Calle de la prueba 420, 69', 'normal');

INSERT INTO `productos` (`id`, `nombre`, `imagen`, `descripcion`, `precio`) VALUES
(1, 'Crash Bandicoot', 'img/cb1.jpg', 'Crash Bandicoot es un videojuego de plataformas desarrollado por Naughty Dog y publicado por Sony Computer Entertainment para PlayStation en 1996. El jugador controla a Crash, un bandicut mejorado genéticamente creado por el científico loco Doctor Neo Cortex. La trama sigue al bandicut Crash en su intento por rescatar a su novia Tawna, y frustrar los planes del científico Neo Cortex para dominar el mundo. Si bien el título cuenta principalmente con un sistema de perspectiva en tercera persona, algunos de sus niveles muestran una vista tanto lateral como frontal.', '39.99'),
(2, 'Crash Bandicoot 2: Cortex Strikes Back', 'img/cb2.jpg', 'Crash Bandicoot 2: Cortex Strikes Back es un videojuego de plataformas desarrollado por Naughty Dog y publicado por Sony Computer Entertainment para PlayStation en 1997. Es la secuela de Crash Bandicoot (1996) y forma parte de la serie del mismo nombre. Se relanzó para las líneas Greatest Hits y Best for Family de Sony en 1998, para Platinum Range en 1999 y para la línea PSone Books en 2001. Se lanzó más tarde para PlayStation Network, pero se retiró como medida de precaución cuando los juegos MediEvil y Spyro 2: Ripto\'s Rage! no funcionaba correctamente. Se volvió a lanzar en el servicio en Norteamérica el 10 de enero de 2008 y en europea el 2 de febrero de 2011.', '39.99'),
(3, 'Crash Bandicoot 3: Warped', 'img/cb3.jpg', 'Crash Bandicoot: Warped, conocido en Europa como Crash Bandicoot 3: Warped,1​2​ es un videojuego de plataformas desarrollado por Naughty Dog y publicado por Sony Computer Entertainment para PlayStation en 1998. Es la tercera entrega de la serie de videojuegos Crash Bandicoot después de Crash Bandicoot 2: Cortex Strikes Back. Fue relanzado para la línea Sony Greatest Hits el 23 de agosto de 1999 y para Platinum Range en el año 2000. Estuvo disponible para PlayStation Store en Norteamérica el 7 de febrero de 2008 y en Europa el 23 de octubre de 2008.', '39.99'),
(4, 'Crash Team Racing', 'img/ctr.jpg', 'Crash Team Racing (estilizado como CTR: Crash Team Racing, y en su versión japonesa conocido como: クラッシュ バンディクー レーシング, Crash Bandicoot Racing) es un videojuego de carreras y de Karts desarrollado por Naughty Dog, siendo el último videojuego de Crash Bandicoot hecho por esta desarrolladora, y distribuido por únicamente Sony Computer Entertainment (a diferencia de los anteriores juegos que se distribuyeron con Universal Interactive Studios, por lo cual, este es el primer videojuego que Naughty Dog hace para Sony Computer Entertainment, y el primer, y último Crash que Naughty Dog hace para Sony) para la consola PlayStation.', '39.99'),
(5, 'Crash Bash', 'img/cb.jpg', 'Crash Bash es un videojuego de PlayStation desarrollado por Eurocom que salió a la venta el 6 de noviembre de 2000. Fue distribuido por Sony Computer Entertainment y pertenece al género de los llamados minijuegos (como los de la saga Mario Party). El juego es la quinta entrega de la saga Crash Bandicoot, aunque no tiene relación directa con los sucesos de Crash. Además de ser el segundo videojuego de Crash en no ser desarrollado por Naughty Dog el otro es Crash Bandicoot 99x.', '39.99'),
(6, 'Tombi!', 'img/1710172742tombi.jpg', 'Tomba! (Tombi! en la región PAL y オレっ！トンバ (Ore! Tomba) en Japón) es un videojuego de plataformas, acción y aventura creado por Whoopee Camp Co. Ltd. y publicado por Sony Computer Entertainment para la consola de videojuego PlayStation. Fue lanzado en 1997 para Japón y en 1998 para Norteamérica y la región PAL. Tombi! también contó con una secuela titulada Tombi! 2: The Evil Swine Return en 1999. También ha sido lanzado en PlayStation Network por MonkeyPaw Games. La saga es fue idea del creador de juegosTokuro Fujiwara, quien creó los videojuegos Ghosts\'n Goblins y Mega Man.', '39.99'),
(7, 'Tombi! 2: Contra los cerdiablos', 'img/1710231065tombi2.jpg', 'Tombi! 2: Contra los cerdiablos, también conocido en inglés como Tomba! 2: The Evil Swine Return en région NTSC, simplemente Tombi! 2 en la región PAL (europea) o トンバ! ザ・ワイルドアドベンチャー (Tomba: The Wild Adventures) en Japón), es un videojuego de acción y aventuras de plataformas, desarrollado por Whoopee Camp y publicado por Sony Computer Entertainment para la videoconsola PlayStation. Salió a la venta en el año 1999 para Japón y Norteamérica, y en el año 2000 para la región PAL. El juego es una secuela de Tombi! y está ambientado en un continente diferente, donde Tombi busca a su novia secuestrada mientras completa eventos y captura a un nuevo grupo de Cerdiablos junto a su nuevo compañero, Zippo.', '39.99'),
(8, 'Tekken 3', 'img/1710231685tekken3.jpg', 'Tekken 3 (鉄拳3) es la tercera entrega de Tekken, la popular serie de juegos de lucha. Fue el primer juego lanzado en el hardware del System 12 de Namco en 1997 (una mejora a los dos juegos originales de Tekken, que utilizaron el System 11), aparte de ser la última entrega de Tekken para PlayStation. Fue lanzado para PlayStation en 1998 y en 2005 para PlayStation 2 como parte del Modo Historia del Arcade de Tekken 5.', '59.99'),
(9, 'Spyro the Dragon', 'img/1710241821spyro.jpg', 'Spyro the Dragon es un videojuego de plataformas desarrollado por Insomniac Games y publicado por Sony Computer Entertainment para PlayStation el 10 de septiembre de 1998. El primer juego de la serie Spyro, está protagonizado por el personaje principal, un joven dragón púrpura llamado Spyro y su amigo libélula, Sparx, quien debe viajar a través del Reino del Dragón para derrotar a Gnasty Gnorc, quien ha superado a los 5 Mundos del dragón atrapando a los otros dragones en cristal y convirtiendo su tesoro de gemas en un ejército de secuaces para su orden. Spyro the Dragon es un videojuego de plataformas en 3D de mundo abierto, que presenta niveles grandes y extensos en los que el jugador debe encontrar elementos coleccionables, entre los que se encuentran piedras preciosas, dragones cristalizados y huevos de dragón robados. Las habilidades de Spyro como dragón incluyen aliento de fuego, un ataque de carga frontal y un planeo en el aire que puede usar para viajar a grandes distancias, todo lo cual debe usarse estratégicamente para encontrar objetos y derrotar enemigos.', '39.99');

ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

ALTER TABLE `productos`
  MODIFY `id` INT NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

ALTER TABLE `usuarios`
  MODIFY `id` INT NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

COMMIT;