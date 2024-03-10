<?php
include_once('config.php');
session_start();
if (isset($_POST['register'])) {
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
        $query = $connection->prepare("INSERT INTO usuarios(nombre,usuario,contrasena,email,direccion,perfil) VALUES (:nombre,:usuario,:password_hash,:email,:direccion,:normal)");
        $query->bindParam("nombre", $nombre, PDO::PARAM_STR);
        $query->bindParam("usuario", $username, PDO::PARAM_STR);
        $query->bindParam("password_hash", $password_hash, PDO::PARAM_STR);
        $query->bindParam("email", $email, PDO::PARAM_STR);
        $query->bindParam("direccion", $direccion, PDO::PARAM_STR);
        $query->bindParam("perfil", "normal", PDO::PARAM_STR);
        $result = $query->execute();
        if ($result) {
            echo '<p class="success">¡Usuario registrado correctamente!</p>';
        } else {
            echo '<p class="error">¡Algo ha ido mal!</p>';
        }
    }
}
?>