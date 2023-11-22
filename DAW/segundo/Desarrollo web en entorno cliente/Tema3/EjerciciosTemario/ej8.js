var perrillos = ["Rocket", "Flash", "Bella", "Slugger"];
console.log(perrillos.toString());//Ambos Console.log() estaban mal, tienen que estar en mínusculas
var ciudades = 'Manchester,London,Liverpool,Birmingham,Leeds,Carlisle';
perrillos = ciudades.split(',');
for (let i = perrillos.length - 1; i >= 0; i--) {//eliminamos los elementos que contengan C o c:
    if (perrillos[i].toLocaleLowerCase().includes('c')) {
        perrillos.splice(i, 1);
    }
}
console.log(perrillos.toString());