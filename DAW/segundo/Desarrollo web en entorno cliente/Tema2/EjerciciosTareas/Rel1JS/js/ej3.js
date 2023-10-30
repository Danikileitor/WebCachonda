function ej3() {
    var nombre = prompt("Introduzca su nombre:");
    var edad = prompt("Introduce su edad:");
    if (isNaN(edad)) {//se comprueba que edad es un número
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        alert("Su nombre es: " + nombre +"\nHas vivido durante " + edad*365 + " días.");//Se calcula y muestra nombre y edad en días.
    }
}