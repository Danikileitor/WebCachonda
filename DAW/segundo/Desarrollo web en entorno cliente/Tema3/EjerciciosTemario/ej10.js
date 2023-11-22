var fecha = new Date();
fecha.setTime(fecha.getTime() + (7 * 24 * 60 * 60 * 1000));//fecha para que expire en una semana
var expira = "expires=" + fecha.toUTCString();
document.cookie = "Cookie1=Contenido de la primera cookie;" + expira + ";path=/";//cookie 1
document.cookie = "Cookie2=Esta cookie también tiene contenido;" + expira + ";path=/";//cookie 2