function combinaciones() {
    var div = document.getElementById("combinaciones");
    var parejas = 0;
    var trios = 0;
    var simples = 0;
    var completas = 0;
    var pokers = 0;
    calcularCombinaciones(parejas, trios, simples, completas, pokers);
    div.innerHTML = "<h2>Combinaciones posibles</h2>";
    div.innerHTML += "<ul>";
    div.innerHTML += "<li>Pareja: " + parejas + "</li>"
    div.innerHTML += "<li>Trío: " + trios + "</li>"
    div.innerHTML += "<li>Escalera Simple: " + simples + "</li>"
    div.innerHTML += "<li>Escalera Completa: " + completas + "</li>"
    div.innerHTML += "<li>Poker: " + pokers + "</li>"
    div.innerHTML += "</ul>";
}

function calcularCombinaciones(parejas, trios, simples, completas, pokers) {
    for (let i = 0; i <= 9999; i++) {
        repeticiones(i, parejas, trios, pokers);
        escaleras(i, simples, completas);
    }
}

function repeticiones(n, parejas, trios, pokers) {
    var num = n.toString().padStart(4, '0');
    var repeticiones = 0;
    for (let i = 0; i < num.length; i++) {
        for (let j = i + 1; j < num.length; j++) {
            repeticiones += num.charAt(i) == num.charAt(j) ? 1 : 0;
        }
    }
    switch (repeticiones) {
        case 1:
            parejas++;
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

function escaleras(n, simples, completas) {
    var num = n.toString().padStart(4, '0');
    if (num.charAt(3) == num.charAt(2) + 1 && num.charAt(2) == num.charAt(1) + 1 && num.charAt(1) == num.charAt(0) + 1) {
        completas++;
    } else if ((num.charAt(3) == num.charAt(2) + 1 && num.charAt(2) == num.charAt(1) + 1) || (num.charAt(2) == num.charAt(1) + 1 && num.charAt(1) == num.charAt(0) + 1)) {
        simples++;
    }
}

function jugar() {

}