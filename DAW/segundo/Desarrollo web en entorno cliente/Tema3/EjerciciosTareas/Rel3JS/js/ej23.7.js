function ej237() {
    var texto = prompt("Introduce una frase o texto").trim();
    var palabras = texto.split(" ");
    var resultado = "";
    palabras.forEach(palabra => {
        resultado += palabra + "\n";
    });
    alert(resultado);
}