function ej12() {
    var a = parseFloat(prompt("Introduce un número positivo menor que 57:"));
    if (isNaN(a) || a>=57 || a<=0) {
        alert("¡No has introducido un número positivo menor que 57! Inténtalo de nuevo.");
    } else {
        var b = parseFloat(prompt("Introduce otro número positivo menor que 57:"));
        if (isNaN(b) || b>=57 || b<=0) {
            alert("¡No has introducido un número positivo menor que 57! Inténtalo de nuevo.");
        } else {
            alert("El producto de ambos números es: " + a*b);
            var c = prompt("Si quieres volver a empezar escribe [otra]", 'otra');
            if (c.toLowerCase() == "otra") {
                ej12();
            }
        }
    }
}