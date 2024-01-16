//Daniel Marcos Guerra Gómez

const inputNombre = document.getElementById("nombre");
const inputApellidos = document.getElementById("apellidos");

inputNombre.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});

inputApellidos.addEventListener('blur', function () {
    this.value = this.value.toUpperCase();
});