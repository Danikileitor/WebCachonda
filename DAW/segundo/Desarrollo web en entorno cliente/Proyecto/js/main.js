var panel = document.getElementById("login");

var profesor1 = {
    user: "gabriel",
    pass: "1234"
};

function verlogin() {
    panel.style.display = "block";
    //setTimeout(ocultar, 60 * 1000, panel);
}

function ocultar(elemento) {
    elemento.style.display = "none";
}