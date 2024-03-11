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
(6, 'Tombi!', 'img/1710172742tombi.jpg', 'Tomba! (Tombi! en la región PAL y オレっ！トンバ (Ore! Tomba) en Japón) es un videojuego de plataformas, acción y aventura creado por Whoopee Camp Co. Ltd. y publicado por Sony Computer Entertainment para la consola de videojuego PlayStation. Fue lanzado en 1997 para Japón y en 1998 para Norteamérica y la región PAL. Tombi! también contó con una secuela titulada Tombi! 2: The Evil Swine Return en 1999. También ha sido lanzado en PlayStation Network por MonkeyPaw Games. La saga es fue idea del creador de juegosTokuro Fujiwara, quien creó los videojuegos Ghosts\'n Goblins y Mega Man.', '39.99');

ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

ALTER TABLE `productos`
  MODIFY `id` INT NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

ALTER TABLE `usuarios`
  MODIFY `id` INT NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

COMMIT;