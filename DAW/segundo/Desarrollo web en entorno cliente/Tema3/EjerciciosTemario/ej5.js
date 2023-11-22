var list = document.querySelector('ul');
list.innerHTML = '';
var saludos = ["¡Feliz cumpleaños!", "Feliz navidades a todos", "Te deseo una feliz navidad", "En Navidades nos vamos de fiesta", "Pasa un buen fin de semana"];
for (var i = 0; i < saludos.length; i++) {
    var input = saludos[i];
    //En este if, añadimos la condición para que no aparezcan saludos con la palabra "fiesta":
    if (saludos[i].toLowerCase().indexOf("navidad") !== -1 && saludos[i].toLowerCase().indexOf("fiesta") == -1) {
        var result = input;
        var listItem = document.createElement('li');
        listItem.textContent = result;
        list.appendChild(listItem);
    }
}