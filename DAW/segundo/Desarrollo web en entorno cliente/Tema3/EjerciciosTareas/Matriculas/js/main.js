var doblesparejas, trios, simples, completas, pokers, ventana;

function combinaciones() {  // Es posible que las combinaciones que el profesor tenga en mente no sean equivalentes a las que yo he pensado, las describo:
    doblesparejas = 0;  // La matrícula tiene 2 pares de números iguales (no tienen que ser consecutivos). Ej: 1122 4545 6886
    trios = 0;          // La matrícula tiene 3 números iguales consecutivos. Ej: 0666 7773
    simples = 0;        // La matrícula tiene una escalera de 3 elementos consecutivos de forma ascendente o descendente. Ej: 0129 6321
    completas = 0;      // La matrícula tiene una escalera de 4 elementos consecutivos de forma ascendente o descendente. Ej: 6789 7654
    pokers = 0;         // La matrícula tiene los 4 números iguales. Ej: 8888
    var parametros = "width=400, height=300, left=200, top=150 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana = window.open("combinaciones.html", "ventana", parametros);
    ventana.onload = function () {
        var div = ventana.document.getElementById("combinaciones");
        calcularCombinaciones();
        div.innerHTML += "<ul>";
        div.innerHTML += "<li>Poker: " + pokers + " (" + pokers / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Completa: " + completas + " (" + completas / 100 + "%)</li>"
        div.innerHTML += "<li>Trío: " + trios + " (" + trios / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Simple: " + simples + " (" + simples / 100 + "%)</li>"
        div.innerHTML += "<li>Doble Pareja: " + doblesparejas + " (" + doblesparejas / 100 + "%)</li>"
        div.innerHTML += "</ul>";
    }
    setTimeout("ventana.close()", 10000);
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
    document.getElementById("resultado").innerHTML = "La matrícula " + matricula.toString().padStart(4, '0') + " es: " + comprobarMatricula(matricula);
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