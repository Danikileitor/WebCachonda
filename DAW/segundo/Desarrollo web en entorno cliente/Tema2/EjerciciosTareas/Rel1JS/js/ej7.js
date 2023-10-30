function ej7() {
    var a = parseFloat(prompt("Introduce un número:"));
    if (isNaN(a)) {
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        var b = a+5;
        var c = b+21;
        var d = c-4;
        alert("Número introducido:\u00A0" + a + "\nContadores:\u00A0" + b + "\u00A0" + c + "\u00A0" + d);
    }
}