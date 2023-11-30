var doblesparejas, trios, simples, completas, pokers, ventana;

var contador = obtenerValorCookie("Jugadas");
contador = contador == null ? 0 : contador;// Si es la primera vez que visitamos la página y no existe la cookie, el valor por defecto será 0

function mostrarContador() {
    document.getElementById("contador").innerHTML = contador;// Actualizamos el contador en la web
}

//Con esta función obtendremos el valor actual del contador de veces que se ha jugado
function obtenerValorCookie(nombre) {
    const nombreCookie = nombre + "=";
    const cookies = document.cookie.split(';');

    for (let i = 0; i < cookies.length; i++) {
        let cookie = cookies[i].trim();
        if (cookie.indexOf(nombreCookie) === 0) {
            return cookie.substring(nombreCookie.length, cookie.length);
        }
    }

    return null;
}

//Esta función actualiza la cookie con el contador de veces que se ha jugado
function cookieVecesJugado(n = contador) {//Si no se pasa parámetro se utilizará el valor del contador, si se pasa por ejemplo un 0 se cambiará su valor
    contador = n;//En caso de pasar un parámetro actualizamos el contador
    var fecha = new Date();
    fecha.setTime(fecha.getTime() + (7 * 24 * 60 * 60 * 1000));//Fecha para que expire en una semana
    var expira = "expires=" + fecha.toUTCString();
    document.cookie = "Jugadas=" + contador + ";" + expira + ";path=/";//Actualizamos la cookie
    mostrarContador();
}

function combinaciones() {
    doblesparejas = 0;  // La matrícula tiene 2 pares de números iguales. Ej: 1122 4545 6886
    trios = 0;          // La matrícula tiene 3 números iguales. Ej: 0666 7377
    simples = 0;        // La matrícula tiene una escalera de 3 elementos consecutivos de forma ascendente o descendente. Ej: 0129 6321 4856
    completas = 0;      // La matrícula tiene una escalera de 4 elementos consecutivos de forma ascendente o descendente. Ej: 6789 7654 7698
    pokers = 0;         // La matrícula tiene los 4 números iguales. Ej: 8888
    var parametros = "width=400, height=220, left=200, top=150, resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
    ventana = window.open("combinaciones.html", "ventana", parametros);
    ventana.onload = function () {//Nos aseguramos de que la ventana está cargada para poder escribir en ella los resultados de las combinaciones
        var div = ventana.document.getElementById("combinaciones");
        calcularCombinaciones();
        div.innerHTML += "<ul>";
        div.innerHTML += "<li>Póker: " + pokers + " (" + pokers / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Completa: " + completas + " (" + completas / 100 + "%)</li>"
        div.innerHTML += "<li>Doble Pareja: " + doblesparejas + " (" + doblesparejas / 100 + "%)</li>"
        div.innerHTML += "<li>Trío: " + trios + " (" + trios / 100 + "%)</li>"
        div.innerHTML += "<li>Escalera Simple: " + simples + " (" + simples / 100 + "%)</li>"
        div.innerHTML += "</ul>";
    }
    setTimeout("ventana.close()", 10000);//Cerramos la ventana pasados 10 segundos
}

//En esta función comprobamos una matrícula concreta y devolvemos de qué tipo es, es necesario hacerlo en el orden correcto
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

function calcularCombinaciones() {
    //Contamos todas las combinaciones posibles desde el 0000 hasta el 9999 y comprobamos individualmente cada una
    for (let i = 0; i <= 9999; i++) {
        switch (comprobarMatricula(i)) {
            case "Escalera Completa":
                completas++;
                break;
            case "Escalera Simple":
                simples++;
                break;
            case "Póker":
                pokers++;
                break;
            case "Trío":
                trios++;
                break;
            case "Doble Pareja":
                doblesparejas++;
                break;
        }
    }
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
    /* Es necesario no tener en cuenta los números repetidos porque entonces la matrícula 2123 no contaría como escalera simple ya que sería 1223 y devolvería false,
    por lo que el ejemplo es erróneo, hay más de 600 combinaciones de escaleras simples, el resto son correctas. */
    var numeroSinRepetidos = "";
    for (let i = 0; i < num.length; i++) {
        if (numeroSinRepetidos.indexOf(num.charAt(i)) == -1) {
            numeroSinRepetidos += num.charAt(i);
        }
    }
    return (numeroSinRepetidos.charAt(2) == parseInt(numeroSinRepetidos.charAt(1)) + 1 && numeroSinRepetidos.charAt(1) == parseInt(numeroSinRepetidos.charAt(0)) + 1);
    //Comparamos si hay una escalera de 3 dígitos consecutiva ascendente o descendente
}

function esEscaleraCompleta(n) {
    var num = n.toString().padStart(4, '0').split('').sort().join("");
    return (num.charAt(3) == parseInt(num.charAt(2)) + 1 && num.charAt(2) == parseInt(num.charAt(1)) + 1 && num.charAt(1) == parseInt(num.charAt(0)) + 1);
    //Comparamos si hay una escalera de 4 dígitos consecutiva ascendente o descendente
}

function jugar() {
    var matricula = document.getElementById("matricula").value;
    if (matricula.length == 4 && matricula >= 0 && matricula <= 9999) {
        document.getElementById("resultado").innerHTML = "La matrícula " + matricula.toString().padStart(4, '0') + " es: " + comprobarMatricula(matricula);
        contador++;
        cookieVecesJugado();
        //Llamamos a la función para comprobar la matrícula introducida por el usuario y actualizamos la cookie del contador de veces que se ha jugado
    } else {
        alert("La matrícula introducida no es correcta, introduce un número de 4 dígitos entre 0000 y 9999");
        //En caso de introducir una matrícula incorrecta saltará un mensaje de error
    }
}