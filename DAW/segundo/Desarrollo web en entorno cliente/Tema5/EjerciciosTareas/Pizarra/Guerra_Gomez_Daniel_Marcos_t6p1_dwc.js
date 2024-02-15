document.addEventListener("DOMContentLoaded", function () {
    // Variables para el estado del pincel y el color seleccionado
    var pincelActivo = false;
    var colorSeleccionado = "";

    // Obtener la paleta de colores y las celdas del tablero
    var paleta = document.getElementById("paleta");
    var celdas = document.querySelectorAll("#zonadibujo td");

    // Manejar clic en la paleta de colores
    paleta.addEventListener("click", function (event) {
        var target = event.target;
        if (target.tagName === "TD") {
            // Cambiar el color seleccionado y activar/desactivar el pincel
            colorSeleccionado = target.className;
            pincelActivo = !pincelActivo;
            updatePincelMensaje();
        }
    });

    // Manejar clic en las celdas del tablero
    celdas.forEach(function (celda) {
        celda.addEventListener("click", function () {
            if (pincelActivo) {
                // Cambiar el color de la celda al color seleccionado
                celda.className = colorSeleccionado;
            }
        });
        celda.addEventListener("mouseover", function (event) {
            if (pincelActivo && event.buttons === 1) {
                // Cambiar el color de la celda al color seleccionado al mantener presionado el botón del ratón
                celda.className = colorSeleccionado;
            }
        });
    });

    // Función para actualizar el mensaje del pincel
    function updatePincelMensaje() {
        var pincelMensaje = document.getElementById("pincel");
        pincelMensaje.textContent = pincelActivo ? "PINCEL ACTIVADO" : "PINCEL DESACTIVADO";
    }
});