function ej45() {
    //Creamos y rellenamos el vector1 con 10 números aleatorios
    var vector1 = [];
    for (let i = 0; i < 10; i++) {
        vector1.push(random(1, 500));//La función random() se encuentra en main.js dado que se va a utilizar en varios ejercicios
    }

    //Creamos los vectores 1 y 3, recorremos vector1 y dependiendo de su valor lo añadimos al vector 2 o 3.
    var vector2 = [], vector3 = [];
    for (let i = 0; i < vector1.length; i++) {
        if (vector1[i] < 250) {
            vector2.push(vector1[i]);
        } else {
            vector3.push(vector1[i]);
        }
    }

    //Mostramos los tamaños de los vectores 2 y 3
    alert("Tamaño del vector2: [" + vector2.length + "]\nTamaño del vector3: [" + vector3.length + "]");
    //Mostramos los valores de los 3 vectores
    alert("vector1: [" + vector1.toString() + "]\nvector2: [" + vector2.toString() + "]\nvector3: [" + vector3.toString() + "]");
}