<?php
include_once('config.php');
session_start();
if (isset($_POST['login'])) {
    $usuario = $_POST['usuario'];
    $password = $_POST['password'];
    $query = $connection->prepare("SELECT * FROM usuarios WHERE usuario=:usuario");
    $query->bindParam("usuario", $usuario, PDO::PARAM_STR);
    $query->execute();
    $result = $query->fetch(PDO::FETCH_ASSOC);
    if (!$result) {
        echo '<p class="error">¡Usuario o contraseña incorrectos!</p>';
    } else {
        if (password_verify($password, $result['contrasena'])) {
            if ($result['perfil'] == 'administrador') {
                $_SESSION['user_id'] = $result['id'] . "admin";
                header("Refresh:3; url=admin.php");
            } else {
                $_SESSION['user_id'] = $result['id'];
                header("Refresh:3; url=index.php");
            }
            echo '<p class="success">¡Inicio de sesión correcto!</p>';
        } else {
            echo '<p class="error">¡Usuario o contraseña incorrectos!</p>';
        }
    }
}
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <h1>Iniciar sesión</h1>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" name="signin-form">
        <div class="form-element">
            <label>Usuario</label>
            <input type="text" name="usuario" pattern="[a-zA-Z0-9]+" required />
        </div>
        <div class="form-element">
            <label>Contraseña</label>
            <input type="password" name="password" required />
        </div>
        <button type="submit" name="login" value="login">Iniciar sesión</button>
        <button onclick="location.href='logout.php'" type="button" name="registrarse" value="registrarse">Registrarse</button>
    </form>
</body>

</html>