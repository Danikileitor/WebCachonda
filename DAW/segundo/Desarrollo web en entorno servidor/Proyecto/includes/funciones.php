<?php
function cambiarTema()
{
    if ($_COOKIE["tema"] == "light") {
        setcookie("tema", "dark");
        $_COOKIE["tema"] = "dark";
    } else {
        setcookie("tema", "light");
        $_COOKIE["tema"] = "light";
    }
}
if (isset($_POST["cambiarTema"])) {
    cambiarTema();
}

function verGestionar()
{
    echo "<form class='' name='formulario' action='admin.php' method='post' enctype='multipart/form-data'>";
    echo "<h1>Gestión de Videojuegos</h1><table class='table table-primary'><thead><tr><th scope='col'>ID</th><th scope='col'>Nombre</th><th scope='col'>Imagen</th><th scope='col'>Descripcion</th><th scope='col'>Precio</th><th scope='col'>Borrar</th></tr></thead>";
    $connection = new PDO("mysql:host=" . HOST . ";dbname=" . DATABASE, USER, PASSWORD);
    $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    try {
        $sql = "SELECT * FROM productos";
        $resultado = $connection->query($sql);

        while ($juego = $resultado->fetch(PDO::FETCH_OBJ)) {
            echo "<tr><td scope='row'>$juego->id</td><td>$juego->nombre</td><td><img class='img-fluid' alt='$juego->imagen' src='" . $juego->imagen . "'></td><td>$juego->descripcion</td><td>$juego->precio</td><td><input type='checkbox' name='ids[]' value='$juego->id'></td></tr>";
        }
    } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
    }
    echo "</tbody></table><input type='submit' name='eliminar' value='Eliminar juegos marcados'></form>";
}

function verInsertar()
{
    echo "Esto funca";
}
?>