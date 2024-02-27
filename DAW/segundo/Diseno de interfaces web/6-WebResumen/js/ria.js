// Función para validar campos
function validateEmail(email) {
    // Expresión regular para validar el formato de correo electrónico
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}

function validatePass(pass) {
    // Expresión regular para validar que la contraseña tenga 8 caracteres con un mínimo de una minúscula, una mayúscula y un número
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,}$/;
    return regex.test(pass);
}

// Evento de envío del formulario
document.getElementById('formularioRegistro').addEventListener('submit', function (event) {
    // Detenemos el envío del formulario por defecto
    event.preventDefault();

    // Validamos los campos obligatorios
    const usuarioInput = document.getElementById('usuario');
    const usuarioError = document.getElementById('usuarioError');
    const contrasenaInput = document.getElementById('contrasena');
    const contrasenaError = document.getElementById('contrasenaError');
    const nombreInput = document.getElementById('nombre');
    const nombreError = document.getElementById('nombreError');
    const apellidosInput = document.getElementById('apellidos');
    const apellidosError = document.getElementById('apellidosError');
    const emailInput = document.getElementById('email');
    const emailError = document.getElementById('emailError');

    var usuarioOK = false;
    var contrasenaOK = false;
    var nombreOK = false;
    var apellidosOK = false;
    var emailOK = false;

    if (usuarioInput.value == "") {
        usuarioError.style.display = "block";
        usuarioOK = false;
    } else {
        usuarioError.style.display = "none";
        usuarioOK = true;
    }

    if (!validatePass(contrasenaInput.value)) {
        contrasenaError.style.display = 'block';
        contrasenaOK = false;
    } else {
        contrasenaError.style.display = 'none';
        contrasenaOK = true;
    }

    if (nombreInput.value == "") {
        nombreError.style.display = "block";
        nombreOK = false;
    } else {
        nombreError.style.display = "none";
        nombreOK = true;
    }

    if (apellidosInput.value == "") {
        apellidosError.style.display = "block";
        apellidosOK = false;
    } else {
        apellidosError.style.display = "none";
        apellidosOK = true;
    }

    if (!validateEmail(emailInput.value)) {
        emailError.style.display = 'block';
        emailOK = false;
    } else {
        emailError.style.display = 'none';
        emailOK = true;
    }
    this.submit();
});