function previous() {
    let pokemonId = document.pokemonKeySend.pokemonId.value
    pokemonId = (Number(pokemonId) == 1) ? 905 : Number(pokemonId)-1; //cuando actualizen la api el límite será de 1010
    getPokemon(pokemonId)
}

function next() {
    let pokemonId = document.pokemonKeySend.pokemonId.value
    pokemonId = (Number(pokemonId) == 905) ? 1 : Number(pokemonId)+1;
    getPokemon(pokemonId)
}

function pokemonKeyId() {
    let pokemonId = document.pokemonKeySend.pokemonId.value
    pokemonId = (pokemonId <= 1) ? 1 : pokemonId;
    pokemonId = (pokemonId >= 905) ? 1 : pokemonId;
    getPokemon(pokemonId)
}

function marcar(idElemento) {
    document.getElementById(idElemento).checked = !document.getElementById(idElemento).checked;
    if(document.getElementById(idElemento).checked){document.getElementById("bshiny").className += " shiny";}
    else{document.getElementById("bshiny").className = "button";}
}

function getPokemon(id) {
    typesJson = '{'+
    '"bug": "img/tipos/bicho.png",'+
    '"dark": "img/tipos/siniestro.png",'+
    '"dragon": "img/tipos/dragon.png",'+
    '"electric": "img/tipos/electrico.png",'+
    '"fairy": "img/tipos/hada.png",'+
    '"fighting": "img/tipos/lucha.png",'+
    '"fire": "img/tipos/fuego.png",'+
    '"flying": "img/tipos/volador.png",'+
    '"ghost": "img/tipos/fantasma.png",'+
    '"grass": "img/tipos/planta.png",'+
    '"ground": "img/tipos/tierra.png",'+
    '"ice": "img/tipos/hielo.png",'+
    '"normal": "img/tipos/normal.png",'+
    '"poison": "img/tipos/veneno.png",'+
    '"psychic": "img/tipos/psiquico.png",'+
    '"rock": "img/tipos/roca.png",'+
    '"steel": "img/tipos/acero.png",'+
    '"water": "img/tipos/agua.png"'+
'}'

    let pokemonApi = "https://pokeapi.co/api/v2/pokemon/"+id
    // let XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;
    let pokemonreq = new XMLHttpRequest();
    // let typesreq = new XMLHttpRequest();
    pokemonreq.open("GET", pokemonApi, false);
    pokemonreq.send();
    let pokemonData = JSON.parse(pokemonreq.responseText);
    document.getElementById("pokemonId").value = pokemonData.id;
    document.getElementById("name-display").innerHTML = pokemonData.name;
    // document.getElementById("imgPokemon").src = pokemonData.sprites.front_default;
    if(document.getElementById("shiny").checked){document.getElementById("imgPokemon").src = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+pokemonData.id+".png";}
    else{document.getElementById("imgPokemon").src = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+pokemonData.id+".png";}
    document.getElementById("pokemonType").innerHTML = "";
    pokemonTypes = JSON.parse(typesJson);
    pokemonData.types.map(item => document.getElementById("pokemonType").innerHTML += "<img src="+pokemonTypes[item.type.name]+" height=50>");
}