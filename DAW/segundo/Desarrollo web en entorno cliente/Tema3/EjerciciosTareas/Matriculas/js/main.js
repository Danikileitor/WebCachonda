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
    div.innerHTML += "<li>Doble Pareja: " + doblesparejas + "</li>"
    div.innerHTML += "<li>Trío: " + trios + "</li>"
    div.innerHTML += "<li>Escalera Simple: " + simples + "</li>"
    div.innerHTML += "<li>Escalera Completa: " + completas + "</li>"
    div.innerHTML += "<li>Poker: " + pokers + "</li>"
    div.innerHTML += "</ul>";
}

function calcularCombinaciones() {
    for (let i = 0; i <= 9999; i++) {
        repeticiones(i,);
        escaleras(i);
    }
}

function repeticiones(n) {
    var num = n.toString().padStart(4, '0');
    var repeticiones = 0;
    for (let i = 0; i < num.length; i++) {
        for (let j = i + 1; j < num.length + 1; j++) {
            repeticiones += num.charAt(i) == num.charAt(j) ? 1 : 0;
        }
    }
    switch (repeticiones) {
        case 1:
            doblesparejas++;
            break;
        case 2:
            trios++;
            break;
        case 3:
            pokers++;
            break;
        default:
            break;
    };
}

function escaleras(n) {
    var num = n.toString().padStart(4, '0');
    if (num.charAt(3) == num.charAt(2) + 1 && num.charAt(2) == num.charAt(1) + 1 && num.charAt(1) == num.charAt(0) + 1) {
        completas++;
    } else if ((num.charAt(3) == num.charAt(2) + 1 && num.charAt(2) == num.charAt(1) + 1) || (num.charAt(2) == num.charAt(1) + 1 && num.charAt(1) == num.charAt(0) + 1)) {
        simples++;
    }
}

function jugar() {

}