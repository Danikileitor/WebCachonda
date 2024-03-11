<?php
include_once('config/config.php');
include_once('includes/funciones.php');
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
        exit;
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
        <div class="container-lg d-flex flex-column min-vh-100">
            <?php include("includes/header.php"); ?>

            <main class="row gy-2 mb-2">
                <?php
                try {
                    $sql = "SELECT nombre, imagen, descripcion, precio FROM productos";
                    $resultado = $connection->query($sql);

                    while ($juego = $resultado->fetch(PDO::FETCH_OBJ)) {?>
                        <div class='col-md-3'>
                        <div class='card h-100'>
                        <img src='<?php echo $juego->imagen; ?>' class='card-img-top' alt='<?php echo $juego->nombre; ?>'>
                        <div class='card-body'>
                        <h5 class='card-title text-center' style='height: 3em'><?php echo $juego->nombre; ?></h5>
                        <p class='card-text overflow-auto' style='height: 10rem'><?php echo $juego->descripcion; ?></p>
                        <div class='d-flex justify-content-around'><a href='#' class='btn btn-primary'>Comprar</a>
                        <span class='btn btn-success pe-none'><?php echo $juego->precio; ?> €</span></div></div></div></div>
                    <?php
                    }
                } catch (PDOException $e) {
                    echo "Error: " . $e->getMessage();
                }
                ?>
            </main>

            <?php include("includes/footer.php"); ?>
        </div>
    </body>

    </html>
<?php
}
?>