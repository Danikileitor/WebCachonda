package ejerciciopersona;

public class Empleado extends Persona {

    double salario;

    Empleado(String nombre, byte edad, double estatura, String dni, double salario) {
        super(nombre, edad, estatura, dni);
        this.salario = salario;
    }
}
