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
        if (!isset($_SESSION['carro'])) {
            header('Location: index.php');
            exit;
        }
        if (isset($_POST["finalizarcompra"])) {
            header("Refresh:0; url=index.php");
            echo "<script>alert('Compra realizada con éxito. ¡Gracias por su compra!')</script>";
            unset($_SESSION['carro']);
            exit;
        }
        ?>
        <div class="container-lg d-flex flex-column min-vh-100">
            <?php include("includes/header.php"); ?>

            <main class="row gy-2 mt-1 mb-2 pb-2">
                <div class="col table-responsive">
                    <form class='' name='formulario' action="<?php echo $_SERVER['PHP_SELF']; ?>" method='post' enctype='multipart/form-data'>
                        <h1>Confirmar compra</h1>
                        <table class='table table-primary'>
                            <thead>
                                <tr>
                                    <th scope='col'>Nombre</th>
                                    <th scope='col'>Precio</th>
                                </tr>
                            </thead>
                            <tbody>
                                <?php $total = 0;
                                foreach ($_SESSION['carro'] as $producto) {
                                    $total += $producto->precio; ?>
                                    <tr>
                                        <td scope='row'><?php echo $producto->nombre; ?></td>
                                        <td><?php echo $producto->precio ?> €</td>
                                    </tr>
                                <?php } ?>
                                <tr>
                                    <th scope='row'>Total de productos: <?php echo count($_SESSION['carro']) ?></th>
                                    <th>Precio total: <?php echo $total ?> €</th>
                                </tr>
                            </tbody>
                        </table>
                        <input type='submit' name='finalizarcompra' value='Comprar' class="btn btn-success">
                    </form>
                </div>
            </main>

            <?php include("includes/footer.php"); ?>
        </div>
    </body>

    </html>
<?php
}
?>