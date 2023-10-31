function ej233() {
    var fuente = prompt("Introduce una frase o texto");
    var clave = prompt("Introduce la clave a buscar");
    var pos = fuente.search(clave);
    if (pos >= 0) {
        alert("La posición de \"" + clave + "\" es: " + pos);
    } else {
        alert("No se ha encontrado la clave \""+ clave + "\", el texto fuente es:\n" + fuente);
    }
}