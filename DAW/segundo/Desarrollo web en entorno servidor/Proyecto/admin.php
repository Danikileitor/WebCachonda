<?php
include_once('config/config.php');
session_start();
if (!isset($_SESSION['usuario'])) {
    header('Location: login.php');
    exit;
} else {
    if ($_SESSION['perfil'] != 'administrador') {
        header('Location: index.php');
    }
?>
    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tienda de Videojuegos</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <h1>Tienda de videojuegos</h1>
        <h2>Panel de administrador</h2>

        <button onclick="location.href='logout.php'" type="button">Cerrar sesión</button>
    </body>

    </html>
<?php
}
?>