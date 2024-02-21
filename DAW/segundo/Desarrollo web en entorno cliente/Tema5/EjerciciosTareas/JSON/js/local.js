//Adaptación cross-browser
var xmlhttp;
if (window.XMLHttpRequest) {
    xmlhttp = new XMLHttpRequest();
} else {
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}

var url = "db.json";
var listado1 = document.getElementById("losRA");
var listado2 = document.getElementById("losCriterios");
var resultado = document.getElementById("resultado");

function listadoRA() {
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var listaRA = JSON.parse(this.responseText);
            var i = 0;
            listaRA.Lenguaje_de_Marcas.forEach(function (ra) {
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
    var modulo = arr.Lenguaje_de_Marcas
    var RA = modulo[listado1.value];
    var criterios = RA.criterios;
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