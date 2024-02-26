var profesor = document.getElementById("profesor");
var panel = document.getElementById("formulariologin");
var user = document.getElementById("usuario");
var pass = document.getElementById("pass");
var errores = document.getElementById("errores");

var admin = {
    user: "admin",
    pass: "1234"
};

function verlogin() {
    panel.style.display = "block";
    setTimeout(ocultar, 60 * 1000, panel);
}

function ocultar(elemento) {
    elemento.style.display = "none";
}

function login() {
    errores.innerHTML = "";
    if (usuario.value == admin.user && pass.value == admin.pass) {
        profesor.disabled = false;
        ocultar(panel);
        ocultar(cargarDatos);
    } else {
        errores.innerHTML = "Credenciales incorrectas";
    }
}