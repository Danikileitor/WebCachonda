function ej1() {
    var a = prompt("Introduce un número:");
    if (isNaN(a)) {//se comprueba si se ha introducido un número por teclado
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        var b = prompt("Introduce otro número:");
        if (isNaN(b)) {//se comprueba si se ha introducido un número por teclado
            alert("¡No has introducido un número! Inténtalo de nuevo.");
        } else {
            var c = a-b;
            alert("El resultado es: " + c);//en caso de que ambos datos introducidos sean números, se muestra su resta
        }
    }
}

function ej1b() {
    var a = prompt("Introduce una frase:");
    var b = prompt("Introduce otra frase:");//Se piden 2 frases
    var c = a-b;
    alert("El resultado es:\n" + c);//Se "restan" ambas frases y se mostrará NaN porque no se pueden restar frases.
}