var parametros = "width=400, height=300, left=200, top=150 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
var ventana;

function abrirVentana() {
    ventana = window.open("texto_de_secundaria_2.htm", "ventana", parametros);
}

function moverVentana() {
    var x = document.getElementById("x").value;
    var y = document.getElementById("y").value;
    ventana.moveTo(x, y);
}