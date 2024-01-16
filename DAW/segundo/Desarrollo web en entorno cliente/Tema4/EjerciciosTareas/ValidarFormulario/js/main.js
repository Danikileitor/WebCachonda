//Daniel Marcos Guerra Gómez

const inputNombre = document.getElementById("nombre");
const inputApellidos = document.getElementById("apellidos");
const inputEdad = document.getElementById("edad");

inputNombre.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});

inputApellidos.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});

inputEdad.addEventListener('blur', function () {
    if (isNaN(this.value) || this.value < 0 || this.value > 105) {
        alert("¡El campo edad tiene que contener un valor numérico entre 0 y 105!");
        this.value = "";
        this.focus();
    }
});