function ej6() {
    var radio = prompt("Introduce el radio:");
    if (isNaN(radio)) {//se comprueba que radio es un número
        alert("¡No has introducido un número! Inténtalo de nuevo.");
    } else {
        alert("Longitud de la circunferencia: " + 2*Math.PI*radio + "\nÁrea del círculo: " + Math.PI*radio*radio);//Utilizando Math.PI podemos llamar al número PI para realizar las operaciones
    }
}