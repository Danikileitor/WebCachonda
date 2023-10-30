function ej9() {
    var a = parseInt(prompt("Introduce un número en base ocho:"));
    if (isNaN(a)) {
        alert("¡No has introducido un número entero! Inténtalo de nuevo.");
    } else {
        alert("Base decimal: " + parseInt(a, 8) + "\nBase 2: " + parseInt(a, 8).toString(2));
    }
}