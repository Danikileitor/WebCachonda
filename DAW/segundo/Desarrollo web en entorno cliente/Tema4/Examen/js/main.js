// Punteros
const labelNombre = document.getElementById("labelNombre");
const nombre = document.getElementById("nombre");
const labelApellidos = document.getElementById("labelApellidos");
const apellidos = document.getElementById("apellidos");
const labelCodigo = document.getElementById("labelCodigo");
const codigo = document.getElementById("codigo");
const labelUsuario = document.getElementById("labelUsuario");
const usuario = document.getElementById("usuario");
const labelClave = document.getElementById("labelClave");
const clave = document.getElementById("clave");
const error1 = document.getElementById("error1");
const error2 = document.getElementById("error2");
const enviar1 = document.getElementById("enviar1");
const enviar2 = document.getElementById("enviar2");
const panel = document.getElementById("panel");
const cambiar = document.getElementById("cambiar");
const salir = document.getElementById("salir");

// Validar formulario 1
nombre.addEventListener('blur', function () {
    const validarNombre = /^[a-zA-Z ]+$/;//Esta expresión verifica que solamente se han escrito letras y espacios para el nombre

    if (validarNombre.test(this.value) === false) {
        error1.innerHTML = "*El nombre introducido no es válido";
        this.focus();
    } else {
        error1.innerHTML = "";
    }
});

apellidos.addEventListener('blur', function () {
    const validarApellidos = /^[a-zA-Z ]+$/;//Misma expresión utilizada anteriormente

    if (validarApellidos.test(this.value) === false) {
        error1.innerHTML = "*Los apellidos introducidos no son válidos";
        this.focus();
    } else {
        error1.innerHTML = "";
    }
});

codigo.addEventListener('blur', function () {
    const validarCodigo = /^[0-9]{4}[A-Z]$/;//Esta expresión valida que se hayan escrito 4 números seguidos de una mayúscula, ejemplo: 1234A

    if (validarCodigo.test(this.value) === false) {
        error1.innerHTML = "*El código introducido no es válido, ha de contener 4 números y 1 letra mayúscula";
        this.focus();
    } else {
        error1.innerHTML = "";
    }
});

// Validar formulario 2
enviar2.addEventListener('click', function () {
    var validarClave = codigo.value;
    validarClave = validarClave.replace(/[A-Z]/, "");//Con esto buscamos la letra del código y la eliminamos, guardando solo los números.

    if (usuario.value == "Admin" && clave.value == validarClave) {
        error2.innerHTML = "Usuario y clave correctas";
        panel.style.display = "block";// En caso de que el usuario y clave sean correctos mostrará un mensaje y se visualizará el panel para cambiar de idioma y salir durante 10 segundos
        setTimeout(() => {
            panel.style.display = "none";
        }, 10000);
    } else {
        error2.innerHTML = "Inténtelo de nuevo";
    }
});

// Eventos del panel de cambiar idioma y salir
cambiar.addEventListener('click', function () {
    if (this.innerHTML == "Cambiar a Inglés") {
        labelNombre.innerHTML = "Name:";
        labelApellidos.innerHTML = "Last Name:";
        labelCodigo.innerHTML = "Verification Code:";
        labelUsuario.innerHTML = "Administator:"
        labelClave.innerHTML = "Password:";
        this.innerHTML = "Switch to Spanish";
    } else {
        labelNombre.innerHTML = "Nombre:";
        labelApellidos.innerHTML = "Apellidos:";
        labelCodigo.innerHTML = "Código de verificación:";
        labelUsuario.innerHTML = "Usuario Administrador:"
        labelClave.innerHTML = "Clave de acceso:";
        this.innerHTML = "Cambiar a Inglés";
    }
});

salir.addEventListener('click', function () {
    panel.style.display = "none";
});