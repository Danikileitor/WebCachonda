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
    div.innerHTML += "<li>Poker: " + pokers + " (" + pokers / 100 + "%)</li>"
    div.innerHTML += "<li>Escalera Completa: " + completas + " (" + completas / 100 + "%)</li>"
    div.innerHTML += "<li>Trío: " + trios + " (" + trios / 100 + "%)</li>"
    div.innerHTML += "<li>Escalera Simple: " + simples + " (" + simples / 100 + "%)</li>"
    div.innerHTML += "<li>Doble Pareja: " + doblesparejas + " (" + doblesparejas / 100 + "%)</li>"
    div.innerHTML += "</ul>";
}

function calcularCombinaciones() {
    for (let i = 0; i <= 9999; i++) {
        doblesparejas += esDoblePareja(i) ? 1 : 0;
        trios += esTrio(i) ? 1 : 0;
        pokers += esPoker(i) ? 1 : 0;
        simples += esEscaleraSimple(i) ? 1 : 0;
        completas += esEscaleraCompleta(i) ? 1 : 0;
    }
    doblesparejas -= pokers; // Restamos la cantidad de pokers a las dobles parejas porque una doble pareja del mismo número es póker y así evitamos duplicidad
}

function esDoblePareja(n) {
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
    return repeticiones == 2;
}

function esTrio(n) {
    var num = n.toString().padStart(4, '0');
    for (let i = 0; i < num.length - 2; i++) {
        if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
            return true; // Si encuentra un trío dejamos de contar para que no haya duplicados con los pokers
        }
    }
    return false;
}

function esPoker(n) {
    var num = n.toString().padStart(4, '0');
    if (num.charAt(0) == num.charAt(1) && num.charAt(0) == num.charAt(2) && num.charAt(0) == num.charAt(3)) {
        return true;
    } else {
        return false;
    }
}

function esEscaleraSimple(n) {
    var num = n.toString().padStart(4, '0');
    if ((num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1) ||
        (num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == num.charAt(0) + 1) ||
        (num.charAt(3) == parseInt(num.charAt(2)) - 1 && num.charAt(2) == parseInt(num.charAt(1)) - 1) ||
        (num.charAt(2) == parseInt(num.charAt(1)) - 1 && num.charAt(1) == parseInt(num.charAt(0)) - 1)) {
        return true;
    } else {
        return false;
    }
}

function esEscaleraCompleta(n) {
    var num = n.toString().padStart(4, '0');
    if ((num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == parseInt(num.charAt(0)) + 1) ||
        (num.charAt(3) == parseInt(num.charAt(2)) - 1 && num.charAt(2) == parseInt(num.charAt(1)) - 1 && num.charAt(1) == parseInt(num.charAt(0)) - 1)) {
        return true;
    } else {
        return false;
    }
}

function jugar() {
    var matricula = document.getElementById("matricula").value;
    var resultado = comprobarMatricula(matricula);
    document.getElementById("resultado").innerHTML = resultado;
}

function comprobarMatricula(n) {
    if (esEscaleraCompleta(n)) {
        return "Escalera Completa";
    } else if (esEscaleraSimple(n)) {
        return "Escalera Simple";
    } else if (esPoker(n)) {
        return "Póker";
    } else if (esTrio(n)) {
        return "Trío";
    } else if (esDoblePareja(n)) {
        return "Doble Pareja";
    } else {
        return "Nada";
    }
}