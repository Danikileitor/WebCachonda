//Daniel Marcos Guerra Gómez

const errores = document.getElementById("errores");
const intentos = document.getElementById("intentos");
const inputNombre = document.getElementById("nombre");
const inputApellidos = document.getElementById("apellidos");
const inputEdad = document.getElementById("edad");
const inputNIF = document.getElementById("nif");
const inputEmail = document.getElementById("email");
const inputProvincia = document.getElementById("provincia");
const inputFecha = document.getElementById("fecha");
const inputTelefono = document.getElementById("telefono");
const inputHora = document.getElementById("hora");

inputNombre.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});

inputApellidos.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});

inputEdad.addEventListener('blur', function () {
    if (isNaN(this.value) || this.value < 0 || this.value > 105) {
        errores.innerHTML = "*El campo edad tiene que contener un valor numérico entre 0 y 105";
        this.value = "";
        this.focus();
    }
});

inputNIF.addEventListener('blur', function () {
    const validarNIF = /^\d{8}-[a-zA-Z]$/;
    /*
    La expresión se escrite entre barras /expresión/
    Con los caracteres ^ y $ indicamos inicio y final de la expresión
    La expresión \d{8} valida 8 números
    Se indica un '-' para validar que se ha escrito un guión entre los números y la letra
    Posteriormente se indica la expresión [a-zA-Z] que valida 1 letra ya sea minúscula o mayúscula
    */
    if (validarNIF.test(this.value) === false) {
        errores.innerHTML = "*El NIF introducido no es correcto";
        this.value = "";
        this.focus();
    }
});