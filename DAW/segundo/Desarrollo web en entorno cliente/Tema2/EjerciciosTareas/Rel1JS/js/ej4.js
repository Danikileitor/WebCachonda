function ej4() {
    var a = prompt("Introduce un número:");
    if (isNaN(a)) {
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        alert("Doble: " + a*2 + "\nTriple: " + a*3 + "\nCuádruple: " + a*4);
    }
}