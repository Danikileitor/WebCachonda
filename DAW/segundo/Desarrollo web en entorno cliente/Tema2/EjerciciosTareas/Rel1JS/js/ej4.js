function ej4() {
    var a = prompt("Introduce un número:");
    if (isNaN(a)) {//se comprueba que edad es un número
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        alert("Doble: " + a*2 + "\nTriple: " + a*3 + "\nCuádruple: " + a*4);//Se calcula y muestra el doble, triple y cuádruple del número introducido.
    }
}