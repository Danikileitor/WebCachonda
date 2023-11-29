var parte1 = [
    "Queridos compañeros ",
    "Por otra parte,y dados los condicionamientos actuales ",
    "Asimismo, ",
    "Sin embargo no hemos de olvidar que ",
    "De igual manera, ",
    "La práctica de la vida cotidiana prueba que, ",
    "No es indispensable argumentar el peso y la significación de estos problemas ya que, ",
    "Las experiencias ricas y diversas muestran que, ",
    "El afán de organización, pero sobre todo ",
    "Los superiores principios ideológicos, condicionan que ",
    "Incluso, bien pudiéramos atrevernos a sugerir que ",
    "Es obvio señalar que, ",
    "Pero pecaríamos de insinceros si soslayásemos que, ",
    "Y además, quedaríamos inmersos en la más abyecta de las estulticias si no fueramos consacientes de que, ",
    "Por último, y como definitivo elemento esclarecedor, cabe añadir que,"
];

var parte2 = [
    "la realización de las premisas del programa ",
    "la complejidad de los estudios de los dirigentes ",
    "el aumento constante, en cantidad y en extensión, de nuestra actividad ",
    "la estructura actual de la organización ",
    "el nuevo modelo de actividad de la organización, ",
    "el desarrollo continuo de distintas formas de actividad ",
    "nuestra actividad de información y propaganda ",
    "el reforzamiento y desarrollo de las estructuras ",
    "la consulta con los numerosos militantes ",
    "el inicio de la acción general de formación de las actitudes ",
    "un relanzamiento específico de todos los sectores implicados ",
    "la superación de experiencias periclitadas ",
    "una aplicación indiscriminada de los factores confluyentes ",
    "la condición sine qua non rectora del proceso ",
    "el proceso consensuado de unas y otras aplicaciones concurrentes "
];

var parte3 = [
    "nos obliga a un exhaustivo análisis ",
    "cumple un rol escencial en la formación ",
    "exige la precisión y la determinación ",
    "ayuda a la preparación y a la realización ",
    "garantiza la participación de un grupo importante en la formación ",
    "cumple deberes importantes en la determinación ",
    "facilita la creación ",
    "obstaculiza la apreciación de la importancia ",
    "ofrece un ensayo interesante de verificación ",
    "implica el proceso de reestructuración y modernización ",
    "habrá de significar un auténtico y eficaz punto de partida ",
    "permite en todo caso explicitar las razones fundamentales ",
    "asegura, en todo caso, un proceso muy sensible de inversión ",
    "radica en una elaboración cuidadosa y sistemática de las estrategias adecuadas ",
    "deriva de una indirecta incidencia superadora "
];

var parte4 = [
    "de las condiciones financieras y administrativas existentes.",
    "de las directivas de desarrollo para el futuro.",
    "del sistema de participación general.",
    "de las actitudes de los miembros hacia sus deberes ineludibles.",
    "de las nuevas proposiciones.",
    "de las direcciones educativas en el sentido del progreso.",
    "del sistema de formación de cuadros que corresponda a las necesidades.",
    "de las condiciones de las actividades apropiadas.",
    "del modelo de desarrollo.",
    "de las formas de acción.",
    "de las básicas premisas adoptadas.",
    "de toda una casuística de amplio espectro.",
    "de los elementos generadores.",
    "para configurar una interface amigable y coadyuvante a la reingeniería del sistema.",
    "de toda una serie de criterios ideológicamente sistematizados en un frente común de actuación regeneradora."
];

//Esta función devuelve un número entero entre 2 números incluidos.
function random(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

//Contador de frases generadas, aumentará cada vez que generamos una frase aleatoria.
var contador = obtenerValorCookie("Frases generadas");
contador = contador == null ? 0 : contador;// Si es la primera vez que visitamos la página y no existe la cookie, el valor por defecto será 0

//Con esta función obtendremos el valor actual del contador de frases generadas
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

//Esta función actualiza la cookie con el contador de frases generadas
function cookieFrasesGeneradas() {
    var fecha = new Date();
    fecha.setTime(fecha.getTime() + (7 * 24 * 60 * 60 * 1000));//fecha para que expire en una semana
    var expira = "expires=" + fecha.toUTCString();
    document.cookie = "Frases generadas=" + contador + ";" + expira + ";path=/";//Actualizamos la cookie
}

function escribirFrase() {
    //Comprobamos si quedan frases por escribir, si no quedan se mostrará un error
    if (parte1.length > 0) {
        var uno = random(0, parte1.length - 1);
        var dos = random(0, parte2.length - 1);
        var tres = random(0, parte3.length - 1);
        var cuatro = random(0, parte4.length - 1);
        var frase = "<p>" + parte1[uno] + parte2[dos] + parte3[tres] + parte4[cuatro] + "</p>";
        document.getElementById("discurso").innerHTML += frase;
        //Si no ha marcado el check de repetir, eliminamos las entradas de los arrays
        if (!document.getElementById("repetir").checked) {
            parte1.splice(uno, 1);
            parte2.splice(dos, 1);
            parte3.splice(tres, 1);
            parte4.splice(cuatro, 1);
        }
        //Actualizamos el contador de frases generadas y su cookie asociada
        contador++;
        cookieFrasesGeneradas();
    } else {
        alert("¡No quedan frases por escribir!");
    }
}