function ej10() {
    var a = parseInt(prompt("Introduce un número entero:"));
    var b = parseInt(prompt("Introduce la base:"));
    if (isNaN(a)) {
        alert("¡No has introducido un número entero! Inténtalo de nuevo.");
    } else {
        if (isNaN(b)) {
            alert("¡No has introducido un número entero! Inténtalo de nuevo.");
        } else {
            alert("El número en la base indicada es: " + a.toString(b));
        }
    }
}