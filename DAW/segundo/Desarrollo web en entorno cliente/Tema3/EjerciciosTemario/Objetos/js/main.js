class Usuario {
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

function fibonacci(n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n - 2) + fibonacci(n - 1);
}

const usuario = new Usuario("Daniel", "Dani", "lamisma");
usuario.login("Dani", "lamisma");