function buscar() {
    var frase = document.getElementById("texto").value;
    var palabra = document.getElementById("buscar").value;
    var busqueda = frase.lastIndexOf(palabra);
    document.getElementById("pos").innerHTML = "Última posición: " + busqueda;
}