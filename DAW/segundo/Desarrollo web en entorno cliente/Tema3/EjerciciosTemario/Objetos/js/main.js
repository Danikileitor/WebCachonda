class UsuarioPro {
    constructor(nombre, nombre_usuario, contraseña) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    login(nombre_usuario, contraseña) {
        if (this.nombre_usuario === nombre_usuario && this.contraseña === contraseña) {
            console.log("Sesión iniciada con éxito.");
        } else {
            console.log("Credenciales incorrectas.");
        }
    }
}

const usuariopro = new UsuarioPro("Daniel", "Dani", "lamisma");
usuariopro.login("Dani", "lamisma");

const usuario = {
    nombre: "Daniel",
    nombre_usuario: "Dani",
    contraseña: "lamisma",
    login: function login(nombre_usuario, contraseña) {
        if (this.nombre_usuario === nombre_usuario && this.contraseña === contraseña) {
            console.log("Sesión iniciada con éxito.");
        } else {
            console.log("Credenciales incorrectas.");
        }
    }
}

usuario.login("Dani", "lamisma");

function fibonacci(n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n - 2) + fibonacci(n - 1);
}

console.log(fibonacci(8));