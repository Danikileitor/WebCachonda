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
    echo "<form class='' name='formulario' action='admin.php' method='post' enctype='multipart/form-data'><h1>Inserción de Videojuegos</h1><table class='table'><tbody><tr><td scope='row'><label for='nombre' class='form-label'>Nombre:</label></td><td><input type='text' name='nombre' id='nombre' placeholder='Nombre' class='form-control' required></td></tr><tr><td scope='row'><label for='imagen'>Imagen:</label></td><td><input type='file' accept='image/*' name='imagen' id='imagen' class='form-control' required></td></tr><tr><td scope='row'><label for='descripcion' class='form-label'>Descripcion:</label></td><td><textarea name='descripcion' id='descripcion' class='form-control' rows='3' required>Descripción del videojuego.</textarea></td></tr><tr><td scope='row'><label for='precio' class='form-label'>Precio:</label></td><td><input type='number' name='precio' id='precio' min='0' pattern='^\d*(\.\d{0,2})?$' placeholder='0,00' step='0.01' class='form-control' required></td></tr></tbody></table><input type='submit' name='insertar' value='Insertar juego'></form>";
}
?>