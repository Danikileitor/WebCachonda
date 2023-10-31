function ej234() {
    var texto = prompt("Introduce una palabra o texto").trim().toLowerCase();
    var palindromo = true;
    for (let i = 0; i < texto.length; i++) {
        if (texto[i] !== texto[texto.length - 1 - i]) {
            palindromo = false;
        }
    }
    palindromo ? alert("El texto introducido es palíndromo.") : alert("El texto introducido no es palíndromo.");
}