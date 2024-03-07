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

// Código para los botones de añadir y quitar

// Encuentra el botón "Añadir RA" por su ID
function addRA(element) {
    var rowAddRA = element.parentNode.parentNode;

    // Clona la fila de RA y la fila de criterio
    var clonedRowRA = rowAddRA.cloneNode(true);
    var clonedRowCriterio = rowAddRA.nextElementSibling.cloneNode(true);

    // Inserta las filas clonadas
    rowAddRA.parentNode.insertBefore(clonedRowCriterio, rowAddRA.nextElementSibling.nextElementSibling);
    rowAddRA.parentNode.insertBefore(clonedRowRA, rowAddRA.nextElementSibling.nextElementSibling);
}

// Vamos a impelemntar el botón "Quitar RA"
function quitarRA(element) {
    // Encuentra la fila que contiene el botón "Quitar RA"
    var rowRemoveRA = element.parentNode.parentNode;

    // Elimina la fila de RA y la siguiente fila, que es la de criterio
    rowRemoveRA.nextElementSibling.parentNode.removeChild(rowRemoveRA.nextElementSibling);
    rowRemoveRA.parentNode.removeChild(rowRemoveRA);
}

// Botones para los criterios
function addCriterio(element) {
    // Encuentra la fila que contiene el botón "Añadir Cr."
    var rowAddCriterio = element.parentNode.parentNode;

    // Clona la fila de criterio
    var clonedRowCriterio = rowAddCriterio.cloneNode(true);

    // Inserta la fila clonada de criterio justo debajo de la fila de criterio original
    rowAddCriterio.parentNode.insertBefore(clonedRowCriterio, rowAddCriterio.nextElementSibling);
}

function quitarCriterio(element) {
    // Encuentra la fila que contiene el botón "Quitar Cr."
    var rowRemoveCriterio = element.parentNode.parentNode;

    // Elimina la fila de criterio y la siguiente fila, que es la de tipo tarea
    rowRemoveCriterio.nextElementSibling.parentNode.removeChild(rowRemoveCriterio.nextElementSibling);
}

// Botones para los objetivos
function addObjetivo(element) {
    // Encuentra la fila que contiene el botón "Añadir Objetivo"
    var rowAddObjetivo = element.parentNode.parentNode;

    // Clona la fila de Objetivo
    var clonedRowObjetivo = rowAddObjetivo.cloneNode(true);

    // Inserta la fila clonada de Objetivo justo debajo de la fila de Objetivo original
    rowAddObjetivo.parentNode.insertBefore(clonedRowObjetivo, rowAddObjetivo.nextElementSibling);
}

function quitarObjetivo(element) {
    // Encuentra la fila que contiene el botón "Quitar Objetivo"
    var rowRemoveObjetivo = element.parentNode.parentNode;

    // Elimina la fila de Objetivo y la siguiente fila, que es la de tipo tarea
    rowRemoveObjetivo.nextElementSibling.parentNode.removeChild(rowRemoveObjetivo.nextElementSibling);
}