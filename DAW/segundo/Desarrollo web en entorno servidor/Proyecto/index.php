<?php
include_once('config.php');
session_start();
if (!isset($_SESSION['usuario'])) {
    header('Location: login.php');
    exit;
} else {
    if ($_SESSION['perfil'] == 'administrador') {
        header('Location: admin.php');
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

        <button onclick="location.href='logout.php'" type="button">Cerrar sesión</button>
    </body>

    </html>
<?php
}
?>