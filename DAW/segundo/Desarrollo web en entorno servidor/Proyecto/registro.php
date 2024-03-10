<?php
include_once('includes/funciones.php');
include_once('config/config.php');
session_start();
if (isset($_POST['registro'])) {
    $nombre = $_POST['nombre'];
    $usuario = $_POST['usuario'];
    $password = $_POST['password'];
    $password_hash = password_hash($password, PASSWORD_BCRYPT);
    $email = $_POST['email'];
    $direccion = $_POST['direccion'];
    $query = $connection->prepare("SELECT * FROM usuarios WHERE usuario=:usuario");
    $query->bindParam("usuario", $usuario, PDO::PARAM_STR);
    $query->execute();
    if ($query->rowCount() > 0) {
        echo '<p class="error">¡El usuario [' . $usuario . '] ya se encuentra registrado!</p>';
    }
    if ($query->rowCount() == 0) {
        $query = $connection->prepare("INSERT INTO usuarios(nombre,usuario,contrasena,email,direccion) VALUES (:nombre,:usuario,:password_hash,:email,:direccion)");
        $query->bindParam("nombre", $nombre, PDO::PARAM_STR);
        $query->bindParam("usuario", $usuario, PDO::PARAM_STR);
        $query->bindParam("password_hash", $password_hash, PDO::PARAM_STR);
        $query->bindParam("email", $email, PDO::PARAM_STR);
        $query->bindParam("direccion", $direccion, PDO::PARAM_STR);
        $result = $query->execute();
        if ($result) {
            header("Refresh:3; url=login.php");
            echo '<p class="success">¡Usuario registrado correctamente!</p>';
        } else {
            echo '<p class="error">¡Algo ha ido mal!</p>';
        }
    }
}
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <h1>Registrar usuario</h1>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" name="signin-form">
        <div class="form-element">
            <label>Nombre</label>
            <input type="text" name="nombre" pattern="[a-zA-Z ]+" required />
        </div>
        <div class="form-element">
            <label>Usuario</label>
            <input type="text" name="usuario" pattern="[a-zA-Z0-9]+" required />
        </div>
        <div class="form-element">
            <label>Contraseña</label>
            <input type="password" name="password" required />
        </div>
        <div class="form-element">
            <label>Email</label>
            <input type="email" name="email" required />
        </div>
        <div class="form-element">
            <label>Dirección</label>
            <input type="text" name="direccion" required />
        </div>
        <button type="submit" name="registro" value="registro">Registrarse</button>
    </form>
</body>

</html>