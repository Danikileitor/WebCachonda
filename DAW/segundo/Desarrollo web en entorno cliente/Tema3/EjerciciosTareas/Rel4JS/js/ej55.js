function ej55() {
    //Creamos el vector con 10 valores aleatorios
    var vector = [];
    for (let i = 0; i < 10; i++) {
        vector.push(random(0, 100));
    }

    //Creamos 2 variables con toString y join
    var a = vector.toString();
    var b = vector.join();

    //Mostramos un mensaje si ambas variables tienen el mismo valor
    if (a == b) {
        document.getElementById("55").innerHTML = "Ambas variables tienen el mismo valor";
    }
}