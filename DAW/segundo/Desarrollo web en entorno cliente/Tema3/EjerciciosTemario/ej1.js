var fecha = new Date();
var hora = fecha.getHours();
var n = Math.random();
if (n < 0.5) {
    document.getElementById("saludo").innerHTML = "<a href='http://myfpschool.com/'>Myfpschool</a>";
} else {
    if (hora < 15) {
        document.getElementById("saludo").innerHTML = "Buenos días";
    } else {
        document.getElementById("saludo").innerHTML = "Buenas tardes";
    }
}