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
        errores.innerHTML = "¡El campo edad tiene que contener un valor numérico entre 0 y 105!";
        this.value = "";
        this.focus();
    }
});