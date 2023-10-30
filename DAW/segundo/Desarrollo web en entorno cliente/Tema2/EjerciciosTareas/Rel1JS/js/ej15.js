function ej15() {
    var contador = 0;
    var suma = 0;
    var producto = 1;
    do {
        var a = parseFloat(prompt("Introduce un número: (escribe 9999 para finalizar)"));
        if (a == 9999) {
            alert("El total de números introducidos es: " + contador + "\nSu suma total es: " + suma + "\nSu producto total es: " + producto);
        } else {
            if (!isNaN(a)) {
                contador++;
                suma += a;
                producto *= a;
            }
        }
    } while (a != 9999);
}