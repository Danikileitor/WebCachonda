//Adaptación cross-browser
var xmlhttp;
if (window.XMLHttpRequest) {
    xmlhttp = new XMLHttpRequest();
} else {
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}
var url = "http://10.147.20.155:3005/db";
var listado0 = document.getElementById("losModulos");
var listado1 = document.getElementById("losRA");
var listado2 = document.getElementById("losCriterios");

function listadoModulos() {
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var modulos = JSON.parse(this.responseText);
            var i = 0;
            modulos.forEach(function (modulo) {
                var option = document.createElement("option");
                option.id = modulo.id;
                option.value = i;
                option.textContent = modulo.id + ": " + modulo.textoRA;
                listado0.appendChild(option);
                i++;
            });
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
listadoModulos();

function listadoRA() {
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var modulos = JSON.parse(this.responseText);
            var modulo = Object.keys(modulos)[0];//Obtenemos el módulo
            document.getElementById("modulo").innerHTML = modulo.replaceAll("_", " ");
            var i = 0;
            modulos[modulo].forEach(function (ra) {
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
            var modulos = JSON.parse(this.responseText);
            var modulo = Object.keys(modulos)[0];
            getRA(modulos[modulo]);
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