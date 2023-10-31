function ej232() {
    var nombres = [];
    var nombre = "";
    do {
        nombre = prompt("Introduce un nombre (Escribe Fin para finalizar)", "Fin");
        if (nombre.toLowerCase() != "fin") {
            nombres.push(nombre);
        }
    } while (nombre.toLowerCase() != "fin");
    alert("La cantidad de nombres ingresados ha sido: " + nombres.length);
}