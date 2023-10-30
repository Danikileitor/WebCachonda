function ej72() {
    var a = parseFloat(prompt("Introduce la primera nota"));
    var b = parseFloat(prompt("Introduce la segunda nota"));
    var c = parseFloat(prompt("Introduce la tercera nota"));
    var promedio = (a+b+c)/3;
    if (promedio >= 4) {
        alert("Su promedio es de: " + promedio + "\nRegular");
    } else {
        alert("Su promedio es de: " + promedio + "\nReprobado");
    }
}