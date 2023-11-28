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

function colorVentana() {
    ventana.document.body.style.backgroundColor = document.getElementById("color").value;
}

function cerrarVentana() {
    var tiempo = document.getElementById("tiempo").value;
    setTimeout("ventana.close()", tiempo * 1000);
}

function escribirVentana() {
    ventana.document.getElementById("texto").innerHTML = document.getElementById("texto").value;
}

function estiloVentana() {
    ventana.document.getElementById("texto").style.fontSize = document.getElementById("size").value + "px";
    ventana.document.getElementById("texto").style.color = document.getElementById("textcolor").value;
}