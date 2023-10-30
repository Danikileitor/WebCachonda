function ej73() {
    var a = parseInt(prompt("Introduce un número entero de 1 o 2 dígitos"));
    if (isNaN(a) || a.toString().length > 2) {
        alert("¡No has introducido un número entero de 1 o 2 dígitos!");
    } else {
        a.toString().length == 1 ? alert("El número tiene 1 dígito") : alert("El número tiene 2 dígitos");
    }
}