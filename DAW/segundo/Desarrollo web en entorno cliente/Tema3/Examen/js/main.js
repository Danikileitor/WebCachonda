//Daniel Marcos Guerra Gómez
var ventana1, ventana2, ventana3, ventana4;//Variables de las 4 ventanas
var lista, valores;//Variables para los arrays

//Aquí tenemos las funciones para abrir las 4 ventanas, cada una con una posición y color diferentes
function abrirVentana1() {
    var parametros = "width=300, height=300, left=0, top=0 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana1 = window.open("ventanas/ventana1.html", "ventana1", parametros);
    ventana1.onload = () => {
        ventana1.document.body.style.backgroundColor = "lightgreen";
    }
}

function abrirVentana2() {
    var parametros = "width=300, height=300, left=1920, top=0 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana2 = window.open("ventanas/ventana2.html", "ventana2", parametros);
    ventana2.onload = () => {
        ventana2.document.body.style.backgroundColor = "lightblue";
        mostrarLista();
    }
}

function abrirVentana3() {
    var parametros = "width=300, height=300, left=1920, top=1080 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana3 = window.open("ventanas/ventana3.html", "ventana3", parametros);
    ventana3.onload = () => {
        ventana3.document.body.style.backgroundColor = "pink";
        mostrarImpares();
    }
}

function abrirVentana4() {
    var parametros = "width=300, height=300, left=0, top=1080 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana4 = window.open("ventanas/ventana4.html", "ventana4", parametros);
    ventana4.onload = () => {
        ventana4.document.body.style.backgroundColor = "orange";
    }
}

//Función para generar un número aleatorio que usaremos más adelante
function generarNumeroAleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function mostrarLista() {
    longitudLista = document.getElementById("lista").value;
    cantidadValores = document.getElementById("valores").value;
    ventana2.document.getElementById("lista").innerHTML = "Lista de valores: ";
    ventana2.document.getElementById("valores").innerHTML = "Valores aleatorios: ";

    lista = [];//array para la lista de números
    for (let i = 1; i <= longitudLista; i++) {//bucle desde 1 hasta el valor indicado
        lista.push(i);//vamos añadiendo al array el número que toca
    }

    //Mostramos los valores de la lista generada
    for (let i = 0; i < lista.length; i++) {
        ventana2.document.getElementById("lista").innerHTML += "[" + lista[i] + "] ";
    }

    valores = [];//array con los valores obtenidos aleatoriamente
    for (let i = 0; i < cantidadValores; i++) {
        var aleatorio = generarNumeroAleatorio(0, lista.length);
        valores.push(lista.splice(aleatorio, 1));//sacamos los elementos de la lista aleatoriamente para que no se repitan
    }

    //Mostramos los valores aleatorios
    for (let i = 0; i < valores.length; i++) {
        ventana2.document.getElementById("valores").innerHTML += "[" + valores[i] + "] ";
    }
}

function mostrarImpares() {
    ventana3.document.getElementById("impares").innerHTML = "Valores impares: "
    //Ordenamos y recorremos el array de los valores y los mostramos
    //valores.short();
    for (let i = 0; i < valores.length; i++) {
        if (valores[i] % 2 !== 0) {
            ventana3.document.getElementById("impares").innerHTML += "[" + valores[i] + "] ";
        }
    }
}

function mostrarContra() {
    ventana4.document.getElementById("contra").innerHTML = "Contraseña vigente: "
    ventana4.document.getElementById("fecha").innerHTML = "Fecha y hora de la última modificación: "
}