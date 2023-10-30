function ej14() {
    var contador = 0;
    var suma = 0;
    do {
        var a = parseFloat(prompt("Introduce un número: (escribe 9999 para finalizar)"));
        if (a == 9999) {
            alert("El total de números introducidos es: " + contador + "\nSu suma total es: " + suma);
        } else {
            if (!isNaN(a)) {
                contador++;
                suma += a;
            }
        }
    } while (a != 9999);
}