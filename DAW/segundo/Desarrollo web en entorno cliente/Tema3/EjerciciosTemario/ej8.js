var perrillos = ["Rocket", "Flash", "Bella", "Slugger"];
console.log(perrillos.toString());//Ambos Console.log() estaban mal, tienen que estar en mínusculas
var ciudades = 'Manchester,London,Liverpool,Birmingham,Leeds,Carlisle';
perrillos = perrillos.concat(ciudades.split(','));//Unimos los nombres de los perrillos y las ciudades
for (let i = perrillos.length - 1; i >= 0; i--) {//Eliminamos los elementos que contengan C o c:
    if (perrillos[i].toLowerCase().includes('c')) {
        perrillos.splice(i, 1);
    }
}
perrillos.unshift('Estepona');//Añadimos al principio el nombre 'Estepona'
console.log(perrillos.toString());