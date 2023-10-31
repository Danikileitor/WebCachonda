function ej231() {
    var nombres = [];
    var nombre = "";
    do {
        nombre = prompt("Introduce un nombre (Escribe Fin para finalizar)", "Fin");
        if (nombre != "Fin") {
            nombres.push(nombre);
        }
    } while (nombre != "Fin");
    alert("La cantidad de nombres ingresados ha sido: " + nombres.length);
}