function ej51() {
    //Creamos el vector con 10 valores aleatorios
    var vector = [];
    for (let i = 0; i < 10; i++) {
        vector.push(random(2, 5));//Pongo este rango para que salga más fácilmente el 2 y se note el cambio por 1
    }

    //Mostramos el vector original para luego poder compararlo
    alert(vector.toString());

    //Recorremos el array y por cada elemento con valor 2 lo sustituimos por dos elementos con valor 1
    //Lo rerorremos desde el final hacia el principio
    for (let i = vector.length - 1; i >= 0; i--) {
        if (vector[i] == 2) {
            vector.splice(i, 1, 1, 1);//primer argumento: posición, segundo argumento: cantidad a remplazar (solo 1), los siguientes argumentos son los valores que se van a insertar (en este caso dos valores 1)
        }
    }

    //Mostramos el vector final
    alert(vector.toString());
}