function ej47() {
    //Creamos un vector con 5 valores aleatorios
    var vector = [];
    for (let i = 0; i < 5; i++) {
        vector.push(random(1, 1000));
    }

    //Extraemos los 2 últimos elementos y los sumamos
    var a = vector.pop();
    var b = vector.pop();
    var suma = a + b;

    //Mostramos la suma y el tamaño final del vector
    document.getElementById("47").innerHTML = "Suma de los 2 últimos valores: " + suma + "<br>Tamaño final del vector: " + vector.length;
}