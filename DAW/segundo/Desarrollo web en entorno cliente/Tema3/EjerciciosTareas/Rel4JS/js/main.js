function mostrar(id) {
    document.getElementById(id).style.display == "" || document.getElementById(id).style.display == "none" ? document.getElementById(id).style.display = "flex" : document.getElementById(id).style.display = "none";
}

//Esta función devuelve un número entero entre 2 números incluidos.
function random(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}