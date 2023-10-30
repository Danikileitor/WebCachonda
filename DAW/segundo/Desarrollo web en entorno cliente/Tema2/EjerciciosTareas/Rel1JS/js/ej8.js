function ej8() {
    var a = parseInt(prompt("Introduce un número entero:"));
    if (isNaN(a)) {
        alert("¡No has introducido un número entero! Inténtalo de nuevo.");
    } else {
        alert("Base 16: " + a.toString(16) + "\nBase 5: " + a.toString(5));
    }
}