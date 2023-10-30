function ej13() {
    var contador = 0;
    do {
        var a = parseFloat(prompt("Introduce un número: (escribe 9999 para finalizar)"));
        if (a == 9999) {
            alert("El total de números introducidos es: " + contador);
        } else {
            if (!isNaN(a)) {
                contador++;
            }
        }
    } while (a != 9999);
}