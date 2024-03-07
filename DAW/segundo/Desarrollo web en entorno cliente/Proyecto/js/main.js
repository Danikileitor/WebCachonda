var profesor = document.getElementById("profesor");
var panel = document.getElementById("formulariologin");
var user = document.getElementById("usuario");
var pass = document.getElementById("pass");
var errores = document.getElementById("errores");
var logeo = document.getElementById("login");

var admin = {
    user: "admin",
    pass: "1234"
};

function submitForm(event) {
    event.preventDefault();
    login();
}

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

logeo.addEventListener('submit', submitForm);

// Código para añadir RA y Criterios

// Encuentra el botón "Añadir RA" por su ID
var btnAddRA = document.getElementById("addRA");

btnAddRA.addEventListener('click', function () {
    // Encuentra la fila que contiene el botón "Añadir RA"
    var rowAddRA = btnAddRA.parentNode.parentNode;

    // Clona la fila de RA y la fila de criterio
    var clonedRowRA = rowAddRA.cloneNode(true);
    var clonedRowCriterio = rowAddRA.nextElementSibling.cloneNode(true);

    // Inserta las filas clonadas
    rowAddRA.parentNode.insertBefore(clonedRowCriterio, rowAddRA.nextElementSibling.nextElementSibling);
    rowAddRA.parentNode.insertBefore(clonedRowRA, rowAddRA.nextElementSibling.nextElementSibling);
});

// Vamos a impelemntar el botón "Quitar RA"
var btnRemoveRA = document.getElementById("quitarRA");

btnRemoveRA.addEventListener('click', function () {
    // Encuentra la fila que contiene el botón "Quitar RA"
    var rowRemoveRA = btnRemoveRA.parentNode.parentNode;

    // Elimina la fila de RA y la siguiente fila, que es la de criterio
    rowRemoveRA.nextElementSibling.parentNode.removeChild(rowRemoveRA.nextElementSibling);
    rowRemoveRA.parentNode.removeChild(rowRemoveRA);
});

// Botones para los criterios

var btnAddCriterio = document.getElementById("addCriterio");

btnAddCriterio.addEventListener('click', function () {
    // Encuentra la fila que contiene el botón "Añadir Cr."
    var rowAddCriterio = btnAddCriterio.parentNode.parentNode;

    // Clona la fila de criterio
    var clonedRowCriterio = rowAddCriterio.cloneNode(true);

    // Inserta la fila clonada de criterio justo debajo de la fila de criterio original
    rowAddCriterio.parentNode.insertBefore(clonedRowCriterio, rowAddCriterio.nextElementSibling);
});

var btnRemoveCriterio = document.getElementById("quitarCriterio");

btnRemoveCriterio.addEventListener('click', function () {
    // Encuentra la fila que contiene el botón "Quitar Cr."
    var rowRemoveCriterio = btnRemoveCriterio.parentNode.parentNode;

    // Elimina la fila de criterio y la siguiente fila, que es la de tipo tarea
    rowRemoveCriterio.nextElementSibling.parentNode.removeChild(rowRemoveCriterio.nextElementSibling);
});