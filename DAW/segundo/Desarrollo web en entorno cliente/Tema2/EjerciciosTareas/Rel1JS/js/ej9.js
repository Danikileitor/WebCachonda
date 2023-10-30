function ej9() {
    var a = parseInt(prompt("Introduce un número en base ocho:"));
    if (isNaN(a)) {//se comprueba que se ha introducido un número
        alert("¡No has introducido un número entero! Inténtalo de nuevo.");
    } else {
        alert("Base decimal: " + parseInt(a, 8) + "\nBase 2: " + parseInt(a, 8).toString(2));//Primero indicamos que el número introducido se encuentra en base 8 y la mostramos en base 2.
    }
}