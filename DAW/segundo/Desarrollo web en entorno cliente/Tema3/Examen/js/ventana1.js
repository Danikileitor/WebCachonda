//Daniel Marcos Guerra Gómez
//Creamos el objeto usuario con los atributos y funciones indicados en el examen
var fecha = new Date();
const usuario = {
    nombre: "alumno",
    contra: "bueno",
    login: function login() {//Con esta función obtenemos los valores de los campos y los comparamos con los valores de este objeto
        var nombre = document.getElementById("usuario").value;
        var contra = document.getElementById("contra1").value;
        if (this.nombre === nombre && this.contra === contra) {
            alert("Datos correctos, ¿Deseas cambiar la contraseña?");
        } else {
            alert("Datos incorrectos, ¿Quieres intentarlo de nuevo?");
        }
    },
    cambiarContra: function cambiarContra() {//Con esta función obtenemos los valores de los campos y los comparamos con los valores de este objeto, si coinciden se cambia la contraseña
        var nombre = document.getElementById("usuario").value;
        var contra = document.getElementById("contra1").value;
        var contra2 = document.getElementById("contra2").value;
        if (this.nombre === nombre && this.contra === contra) {
            if (contra2 === "") {//Comprobamos que el campo está vacío para mostrar un error
                alert("Introduce una nueva contraseña");
            } else {
                this.contra = contra2;
                alert("Contraseña modificada");
            }
        } else {
            alert("Datos incorrectos, ¿Quieres intentarlo de nuevo?");
        }
    }
}