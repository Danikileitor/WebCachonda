var panel = document.getElementById("login");

function verlogin() {
    panel.style.display = "block";
    setTimeout(ocultar, 60 * 1000, panel);
}

function ocultar(elemento) {
    elemento.style.display = "none";
}