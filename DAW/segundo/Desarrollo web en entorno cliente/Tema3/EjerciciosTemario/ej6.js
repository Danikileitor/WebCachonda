var list = document.querySelector('ul');
list.innerHTML = '';
var equipos = ['MAN675847583748sjt567654;Manchester United',
    'RMD576746573 fhdg4737dh4;Real Madrid',
    'LIV5hg65hd737456236dch46dg4;Liverpool FC',
    'SEV4f65hf75f736463;Sevilla FC',
    'BAR5767ghtyfyr4536dh45dg45dg3;Barcelona FC'];

for (var i = 0; i < equipos.length; i++) {
    var input = equipos[i];
    //escribe el código que haga que funcione aquí debajo
    //localizamos donde empieza el nombre (después de ;)
    var posicion = input.indexOf(';') + 1;
    //recortamos el equipo para que solo quede el nombre real del equipo:
    input = input.substring(posicion);
    var result = input;
    var listItem = document.createElement('li');
    listItem.textContent = result;
    list.appendChild(listItem);
}