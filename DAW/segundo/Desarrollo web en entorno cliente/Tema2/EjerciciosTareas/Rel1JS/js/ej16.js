function ej16() {
    var suma = 0;
    var multiplos = "Múltiplos de 23 inferiores a 1000:\n";
    for (let i = 1; i < 1000; i++) {
        if (i % 23 === 0) {
            multiplos += i + " ";
            suma += i ;
        }
    }
    alert(multiplos + "\nSu suma total es: " + suma);
}