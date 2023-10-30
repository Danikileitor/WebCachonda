function ej1() {
    var a = prompt("Introduce un número:");
    if (isNaN(a)) {
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        var b = prompt("Introduce otro número:");
        if (isNaN(b)) {
            alert("¡No has introducido un número! Inténtalo de nuevo.");
        } else {
            var c = a-b;
            alert("El resultado es: " + c);
        }
    }
}

function ej1b() {
    var a = prompt("Introduce una frase:");
    var b = prompt("Introduce otra frase:");
    var c = a-b;
    alert("El resultado es:\n" + c);
}