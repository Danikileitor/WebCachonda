<?php
include_once('includes/funciones.php');
include_once('config/config.php');
session_start();
if (!isset($_COOKIE["tema"])) {
    setcookie("tema", "light");
}
if (!isset($_SESSION['usuario'])) {
    header('Location: login.php');
    exit;
} else {
    if ($_SESSION['perfil'] == 'administrador') {
        header('Location: admin.php');
    }
?>
    <!DOCTYPE html>
    <html lang="es" data-bs-theme="<?php echo $_COOKIE["tema"]; ?>">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tienda de Videojuegos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous" />
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div class="container-lg">
            <?php include("includes/header.php"); ?>

            <main class="row justify-content-center align-items-center g-2">
                <div class="col">Column</div>
                <div class="col">Column</div>
                <div class="col">Column</div>
            </main>

            <?php include("includes/footer.php"); ?>
        </div>
    </body>

    </html>
<?php
}
?>