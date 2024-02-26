var panel = document.getElementById("formulariologin");

var admin = {
    user: "admin",
    pass: "1234"
};

function verlogin() {
    panel.style.display = "block";
    //setTimeout(ocultar, 60 * 1000, panel);
}

function ocultar(elemento) {
    elemento.style.display = "none";
}