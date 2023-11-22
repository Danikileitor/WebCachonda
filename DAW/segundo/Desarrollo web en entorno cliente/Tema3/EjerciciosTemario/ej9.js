var arraygrande = ["28924; Estepona",
    "28001;Madrid",
    "08001;Barcelona",
    "41001;Sevilla",
    "48001;Bilbao",
    "15001;A Coruña",
    "46001;Valencia",
    "29001;Málaga",
    "03001;Alicante",
    "07001;Palma",
    "35001;Las Palmas de Gran Canaria",
    "41071;Dos Hermanas",
    "28006;Alcobendas"];

function buscar() {
    const busqueda = document.getElementById("busqueda").value.toLowerCase();
    const resultado = document.getElementById("resultado");
    resultado.innerHTML = "";
    for (let i = 0; i < arraygrande.length; i++) {
        if (arraygrande[i].toLowerCase().includes(busqueda)) {
            var auxiliar = arraygrande[i].split(';');
            resultado.innerHTML += "CP: " + auxiliar[0] + ", Ciudad: " + auxiliar[1] + "<br>";
        }
    }
}