function ej20() {
    var fecha = new Date();
    var mes = fecha.getMonth();
    var resultado = "Cuatrimestre actual: ";
    if (mes < 4) {
        resultado += "Primero";
    } else if (mes < 8) {
        resultado += "Segundo";
    } else {
        resultado += "Tercero";
    }
    alert(resultado);
}