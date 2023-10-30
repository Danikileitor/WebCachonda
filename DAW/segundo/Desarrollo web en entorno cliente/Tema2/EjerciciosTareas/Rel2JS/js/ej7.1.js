function ej71() {
    var a = parseFloat(prompt("Introduce el primer número"));
    var b = parseFloat(prompt("Introduce el segundo número"));
    if (a > b) {
        alert("Su suma es: " + (a+b) + "\nSu diferencia es: " + (a-b));
    } else {
        alert("Su producto es: " + a*b + "\nSu división es: " + a/b);
    }
}