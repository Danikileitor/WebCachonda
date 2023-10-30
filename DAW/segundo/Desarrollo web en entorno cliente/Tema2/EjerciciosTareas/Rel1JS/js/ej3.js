function ej3() {
    var nombre = prompt("Introduzca su nombre:");
    var edad = prompt("Introduce su edad:");
    if (isNaN(edad)) {
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        alert("Su nombre es: " + nombre +"\nHas vivido durante " + edad*365 + " días.");
    }
}