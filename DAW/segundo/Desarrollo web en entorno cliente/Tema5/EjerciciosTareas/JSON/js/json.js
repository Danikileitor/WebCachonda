//Adaptación cross-browser
var xmlhttp;
if (window.XMLHttpRequest) {
    xmlhttp = new XMLHttpRequest();
} else {
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}
var url = "http://192.168.106.128:3005/Lenguaje_de_Marcas";
var listado1 = document.getElementById("losRA");
var listado2 = document.getElementById("losCriterios");
var resultado = document.getElementById("resultado");

function listadoRA() {
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var listaRA = JSON.parse(this.responseText);
            var i = 0;
            listaRA.forEach(function (ra) {
                var option = document.createElement("option");
                option.id = ra.id;
                option.value = i;
                option.textContent = ra.id + ": " + ra.textoRA;
                listado1.appendChild(option);
                i++;
            });
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
listadoRA();

function actualizarRA() {
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var listaRA = JSON.parse(this.responseText);
            getRA(listaRA);
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

function getRA(arr) {
    var RA = arr[listado1.value];
    var criterios = RA.criterios;
    //Primero limpiamos el listado
    while (listado2.lastChild.id !== 'Cvacio') {
        listado2.removeChild(listado2.lastChild);
    }
    //Ahora rellenamos el listado con los criterios
    for (var key in criterios) {
        if (criterios.hasOwnProperty(key)) {
            var option = document.createElement("option");
            option.id = RA.id + key;
            option.value = RA.id + key;
            option.textContent = key + ") " + criterios[key];
            listado2.appendChild(option);
        }
    }
}