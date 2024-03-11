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
        <?php
        if (isset($_POST["comprar"])) {
            $compra = (object) [
                'id' => $_POST['comprar_id'],
                'nombre' => $_POST['comprar_nombre'],
                'precio' => $_POST['comprar_precio']
            ];
            $_SESSION['carro'][] = $compra;
            //Me lo robaron^
        }
        ?>
        <div class="container-lg d-flex flex-column min-vh-100">
            <?php include("includes/header.php"); ?>

            <?php
            if (isset($_SESSION['carro'])) { ?>
                <div class="row gy-2 mb-2">
                    <div class="col">
                        <nav class="navbar navbar-expand">
                            <ul class="nav navbar-nav">
                                <li class="nav-item bg-success rounded w-25">
                                    <span class="nav-link"><img class="img-fluid" alt="carrito" src="assets/cesta.png"></span>
                                </li>
                                <li class="nav-item">
                                    <span class="nav-link">
                                        <h5>Productos:</h5>
                                    </span>
                                </li>
                                <?php foreach ($_SESSION['carro'] as $producto) { ?>
                                    <li class="nav-item">
                                        <span class="nav-link"><?php echo $producto->nombre; ?></span>
                                    </li>
                                <?php } ?>
                            </ul>
                        </nav>
                    </div>
                </div>
            <?php } ?>

            <main class="row gy-2 mb-2">
                <?php
                try {
                    $sql = "SELECT * FROM productos";
                    $resultado = $connection->query($sql);

                    while ($juego = $resultado->fetch(PDO::FETCH_OBJ)) { ?>
                        <form class='col-md-3' method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" name="palcarro">
                            <div class='card h-100'>
                                <img src='<?php echo $juego->imagen; ?>' class='card-img-top' alt='<?php echo $juego->nombre; ?>'>
                                <div class='card-body'>
                                    <h5 class='card-title text-center' style='height: 2.5em'><?php echo $juego->nombre; ?></h5>
                                    <p class='card-text overflow-auto' style='height: 10rem'><?php echo $juego->descripcion; ?></p>
                                    <div class='d-flex justify-content-around'>
                                        <input type="hidden" name="comprar_id" value="<?php echo $juego->id; ?>">
                                        <input type="hidden" name="comprar_nombre" value="<?php echo $juego->nombre; ?>">
                                        <input type="hidden" name="comprar_precio" value="<?php echo $juego->precio; ?>">
                                        <input type="submit" name="comprar" value="Comprar" class='btn btn-primary'>
                                        <span class='btn btn-success pe-none'><?php echo $juego->precio; ?> €</span>
                                    </div>
                                </div>
                            </div>
                        </form>
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