function ej50() {
    //Pedimos los sueldos hasta que se introduzca 0
    var sueldos = [];
    do {
        sueldos.push(prompt("Introduce un sueldo"));
    } while (!sueldos.includes("0"));

    //Ordenamos el array, eliminamos el 0 y mostramos los sueldos
    sueldos.sort((a,b)=>a-b);//ordenamos numéricamente
    sueldos.shift();//eliminamos el primer elemento (el 0)
    alert("Los sueldos introducidos son: " + sueldos.toString());
}