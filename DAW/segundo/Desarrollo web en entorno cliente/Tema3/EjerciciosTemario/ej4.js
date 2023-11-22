var list = document.querySelector('ul');
list.innerHTML = '';
var saludos = ["¡Feliz cumpleaños!", "Feliz navidades a todos", "Te deseo una feliz navidad", "En Navidades nos vamos de fiesta", "Pasa un buen fin de semana"];
for (var i = 0; i < saludos.length; i++) {
    var input = saludos[i];
    //En este if, pasamos los saludos a minúsculas y cambiamos la búsqueda por "navidad" en minúsculas:
    if (saludos[i].toLowerCase().indexOf("navidad") !== -1) {
        var result = input;
        var listItem = document.createElement('li');
        listItem.textContent = result;
        list.appendChild(listItem);
    }
}