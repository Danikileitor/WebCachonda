//Autor: Daniel Marcos Guerra Gómez

//Definimos estas variables globlaes para poder usarlas en todas las funciones:
var equilatero = 0;
var isosceles = 0;
var escaleno = 0;

//Función principal a la que llama el botón desde la web:
function clasificar() {
    //Ponemos las cantidades a 0:
    equilatero = 0;
    isosceles = 0;
    escaleno = 0;

    //Primer triángulo:
    var t1l1 = document.getElementById("uno1").value;//Recogemos los datos de los lados
    var t1l2 = document.getElementById("uno2").value;
    var t1l3 = document.getElementById("uno3").value;
    var t1lados = clasificarLados(t1l1, t1l2, t1l3);//Obtenemos su clasificación según sus lados

    //Segundo triángulo:
    var t2l1 = document.getElementById("dos1").value;//Recogemos los datos de los lados
    var t2l2 = document.getElementById("dos2").value;
    var t2l3 = document.getElementById("dos3").value;
    var t2lados = clasificarLados(t2l1, t2l2, t2l3);//Obtenemos su clasificación según sus lados

    //Tercer triángulo:
    var t3l1 = document.getElementById("tres1").value;//Recogemos los datos de los lados
    var t3l2 = document.getElementById("tres2").value;
    var t3l3 = document.getElementById("tres3").value;
    var t3lados = clasificarLados(t3l1, t3l2, t3l3);//Obtenemos su clasificación según sus lados

    //Cuarto triángulo:
    var t4l1 = document.getElementById("cuatro1").value;//Recogemos los datos de los lados
    var t4l2 = document.getElementById("cuatro2").value;
    var t4l3 = document.getElementById("cuatro3").value;
    var t4lados = clasificarLados(t4l1, t4l2, t4l3);//Obtenemos su clasificación según sus lados

    //Imprimimos resultados:
    document.getElementById("primero").innerHTML = "El primer triángulo es: " + t1lados;
    document.getElementById("segundo").innerHTML = "El segundo triángulo es: " + t2lados;
    document.getElementById("tercero").innerHTML = "El tercer triángulo es: " + t3lados;
    document.getElementById("cuarto").innerHTML = "El cuarto triángulo es: " + t4lados;
    document.getElementById("tipos").innerHTML = "Cantidad de tríangulos equiláteros: " + equilatero;
    document.getElementById("tipos").innerHTML += "<br>Cantidad de tríangulos isósceles: " + isosceles;
    document.getElementById("tipos").innerHTML += "<br>Cantidad de tríangulos escalenos: " + escaleno;

    //Calculamos e imprimimos el tipo de triángulo de menor cantidad:
    if (equilatero < isosceles && equilatero < escaleno) {
        document.getElementById("menor").innerHTML = "El tipo triángulo de menor cantidad es: Equilátero";
    } else if (isosceles < escaleno) {
        document.getElementById("menor").innerHTML = "El tipo triángulo de menor cantidad es: Isósceles";
    } else if (escaleno < isosceles) {
        document.getElementById("menor").innerHTML = "El tipo triángulo de menor cantidad es: Escaleno";
    } else {
        document.getElementById("menor").innerHTML = "¡Ningún tipo de triángulo es menor que los demás!";
    }
}

//Función para clasificar al triángulo según sus lados:
function clasificarLados(lado1, lado2, lado3) {
    if (lado1 === lado2 && lado1 === lado3) {//si los 3 lados son iguales será equilátero
        equilatero++;//sumamos la cuenta para el apartado 3
        return "Equilátero";
    } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {//si 2 lados son iguales será isósceles
        isosceles++;//sumamos la cuenta para el apartado 3
        return "Isósceles";
    } else {//caso contrario (ninguno de los lados es igual a otro) será escaleno
        escaleno++;//sumamos la cuenta para el apartado 3
        return "Escaleno";
    }
}