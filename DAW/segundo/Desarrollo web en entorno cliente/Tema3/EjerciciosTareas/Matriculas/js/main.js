var doblesparejas, trios, simples, completas, pokers;

function combinaciones() {
    var div = document.getElementById("combinaciones");
    doblesparejas = 0;
    trios = 0;
    simples = 0;
    completas = 0;
    pokers = 0;
    calcularCombinaciones();
    div.innerHTML = "<h2>Combinaciones posibles</h2>";
    div.innerHTML += "<ul>";
    div.innerHTML += "<li>Doble Pareja: " + doblesparejas + " (" + doblesparejas / 100 + "%)</li>"
    div.innerHTML += "<li>Escalera Simple: " + simples + " (" + simples / 100 + "%)</li>"
    div.innerHTML += "<li>Trío: " + trios + " (" + trios / 100 + "%)</li>"
    div.innerHTML += "<li>Escalera Completa: " + completas + " (" + completas / 100 + "%)</li>"
    div.innerHTML += "<li>Poker: " + pokers + " (" + pokers / 100 + "%)</li>"
    div.innerHTML += "</ul>";
}

function calcularCombinaciones() {
    for (let i = 0; i <= 9999; i++) {
        contarDoblesParejas(i);
        contarTrios(i);
        contarPokers(i);
        contarEscaleras(i);
    }
}

function contarDoblesParejas(n) {
    var num = n.toString().padStart(4, '0');
    var repeticiones = 0;
    for (let i = 0; i < num.length - 1; i++) {
        for (let j = i + 1; j < num.length; j++) {
            if (num.charAt(i) == num.charAt(j)) {
                repeticiones++;
                break; // Rompemos el bucle si ya encontramos una pareja
            }
        }
    }
    doblesparejas += repeticiones == 2 ? 1 : 0;
}

function contarTrios(n) {
    var num = n.toString().padStart(4, '0');
    for (let i = 0; i < num.length - 2; i++) {
        if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
            trios++;
            break;// Si encuentra un trío dejamos de contar para que no haya duplicados con los pokers
        }
    }
}

function contarPokers(n) {
    var num = n.toString().padStart(4, '0');
    if (num.charAt(0) == num.charAt(1) && num.charAt(0) == num.charAt(2) && num.charAt(0) == num.charAt(3)) {
        pokers++;
    }
}

function contarEscaleras(n) {
    var num = n.toString().padStart(4, '0');
    if ((num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == parseInt(num.charAt(0)) + 1) ||
        (num.charAt(3) == parseInt(num.charAt(2)) - 1 && num.charAt(2) == parseInt(num.charAt(1)) - 1 && num.charAt(1) == parseInt(num.charAt(0)) - 1)) {
        completas++;
    } else if ((num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1) ||
        (num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == num.charAt(0) + 1) ||
        (num.charAt(3) == parseInt(num.charAt(2)) - 1 && num.charAt(2) == parseInt(num.charAt(1)) - 1) ||
        (num.charAt(2) == parseInt(num.charAt(1)) - 1 && num.charAt(1) == parseInt(num.charAt(0)) - 1)) {
        simples++;
    }
}

function jugar() {
    var resultado = "test";
    document.getElementById("resultado").innerHTML = resultado;
}