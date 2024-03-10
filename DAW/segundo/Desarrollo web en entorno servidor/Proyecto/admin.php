<?php
include_once('config.php');
session_start();
if (!isset($_SESSION['user_id'])) {
    header('Location: login.php');
    exit;
} else {
    if (!str_contains($_SESSION['user_id'], "admin")) {
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