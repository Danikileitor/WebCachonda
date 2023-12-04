function ej46() {
    //Creamos el vector rifa con 1000 elementos aleatorios
    var rifa = [];
    for (let i = 0; i < 1000; i++) {
        rifa.push(random(1000, 10000));
    }

    //Determinamos 10 números premiados aleatoriamente
    var premiados = [];
    for (let i = 0; i < 10; i++) {
        premiados.push(rifa[random(0, rifa.length)]);
    }

    //Mostramos los números premiados y sus premios (el primero será 1000, el segundo 2000, etc)
    alert("Los 10 números premiados y sus premios son:\n" +
        premiados[0] + " tiene de premio: 1000\n" +
        premiados[1] + " tiene de premio: 2000\n" +
        premiados[2] + " tiene de premio: 3000\n" +
        premiados[3] + " tiene de premio: 4000\n" +
        premiados[4] + " tiene de premio: 5000\n" +
        premiados[5] + " tiene de premio: 6000\n" +
        premiados[6] + " tiene de premio: 7000\n" +
        premiados[7] + " tiene de premio: 8000\n" +
        premiados[8] + " tiene de premio: 9000\n" +
        premiados[9] + " tiene de premio: 10000");
}