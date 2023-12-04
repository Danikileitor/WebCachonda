function ej52() {
    //Creamos el vector con 10 valores aleatorios
    var vector = [];
    for (let i = 0; i < 10; i++) {
        vector.push(random(0, 1000));
    }

    //Mostramos el vector original para luego poder compararlo
    alert(vector.toString());

    //Obtenemos el valor más pequeño y su posición
    var menor = Math.min(...vector);
    var posMenor = vector.indexOf(menor);

    //Generamos un array a partir de la posición del menor valor
    var vector2 = vector.slice(posMenor);

    //Mostramos el nuevo vector
    alert(vector2.toString());
}