var doblesparejas, trios, simples, completas, pokers, ventana;

function combinaciones() {
    doblesparejas = 0;  // La matrícula tiene 2 pares de números iguales. Ej: 1122 4545 6886
    trios = 0;          // La matrícula tiene 3 números iguales. Ej: 0666 7377
    simples = 0;        // La matrícula tiene una escalera de 3 elementos consecutivos de forma ascendente o descendente. Ej: 0129 6321 4856
    completas = 0;      // La matrícula tiene una escalera de 4 elementos consecutivos de forma ascendente o descendente. Ej: 6789 7654 7698
    pokers = 0;         // La matrícula tiene los 4 números iguales. Ej: 8888
    var parametros = "width=400, height=300, left=200, top=150 resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana = window.open("combinaciones.html", "ventana", parametros);
    ventana.onload = function () {//Nos aseguramos de que la ventana está cargada para poder escribir en ella los resultados de las combinaciones
        var div = ventana.document.getElementById("combinaciones");
        calcularCombinaciones();
        div.innerHTML += "<ul>";
        div.innerHTML += "<li>Poker: " + pokers + " (" + pokers / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Completa: " + completas + " (" + completas / 100 + "%)</li>"
        div.innerHTML += "<li>Doble Pareja: " + doblesparejas + " (" + doblesparejas / 100 + "%)</li>"
        div.innerHTML += "<li>Trío: " + trios + " (" + trios / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Simple: " + simples + " (" + simples / 100 + "%)</li>"
        div.innerHTML += "</ul>";
    }
    setTimeout("ventana.close()", 10000);//Cerramos la ventana pasados 10 segundos
}

function calcularCombinaciones() {
    //Contamos todas las combinaciones posibles desde el 0000 hasta el 9999 y comprobamos individualmente cada una
    for (let i = 0; i <= 9999; i++) {
        doblesparejas += esDoblePareja(i) ? 1 : 0;
        trios += esTrio(i) ? 1 : 0;
        pokers += esPoker(i) ? 1 : 0;
        simples += esEscaleraSimple(i) ? 1 : 0;
        completas += esEscaleraCompleta(i) ? 1 : 0;
    }
    doblesparejas -= pokers; // Restamos la cantidad de pokers a las dobles parejas porque una doble pareja del mismo número es póker y así evitamos duplicidad
    trios -= pokers; // Restamos la cantidad de pokers a los tríos porque si sale póker tambíen cuenta como trío y así evitamos duplicidad
    simples -= completas;// Restamos la cantidad de escaleras completas a las simples porque si sale escalera completa tambíen cuenta como simple y así evitamos duplicidad
}

function esDoblePareja(n) {
    var num = n.toString().padStart(4, '0').split('').sort().join("");/* De esta forma rellenamos con ceros a la izquierda por si el usuario no escribe una matrícula completa
    además convertimos el número en un array para poder ordenarlo y volvemos a convertirlo a cadena, este truco lo usaremos bastante */
    return num.charAt(0) == num.charAt(1) && num.charAt(2) == num.charAt(3);
    //Se compara si hay 2 parejas de dígitos
}

function esTrio(n) {
    var num = n.toString().padStart(4, '0').split('').sort().join("");
    return (num.charAt(0) == num.charAt(1) && num.charAt(1) == num.charAt(2)) || (num.charAt(1) == num.charAt(2) && num.charAt(2) == num.charAt(3));
    //Se compara si hay al menos 3 dígitos iguales
}

function esPoker(n) {
    var num = n.toString().padStart(4, '0');
    return (num.charAt(0) == num.charAt(1) && num.charAt(0) == num.charAt(2) && num.charAt(0) == num.charAt(3));
    //Se compara si los 4 dígitos son iguales
}

function esEscaleraSimple(n) {
    var num = n.toString().padStart(4, '0').split('').sort().join("");
    return (num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == parseInt(num.charAt(0)) + 1);
    //Comparamos si hay una escalera de 3 dígitos consecutiva ascendente o descendente
}

function esEscaleraCompleta(n) {
    var num = n.toString().padStart(4, '0').split('').sort().join("");
    return (num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == parseInt(num.charAt(0)) + 1);
    //Comparamos si hay una escalera de 4 dígitos consecutiva ascendente o descendente
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