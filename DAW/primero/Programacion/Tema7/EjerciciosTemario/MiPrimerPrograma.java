public class MiPrimerPrograma {
    public static void main(String[] args) {
        Persona p;
        p = new Persona();
        p.nombre = "Daniel";
        p.edad = 27;
        p.estatura = 1.80;
        p.dni = "54146993W";
        System.out.println(p.nombre);
        System.out.println(p.edad);
        System.out.println(p.estatura);
        System.out.println(p.dni);
        p.saludar();
        p.cumplirAnos();
        p.crecer(0.5);
    }
}

class Persona {
    String nombre;
    byte edad;
    double estatura;
    String dni;

    void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    void cumplirAnos() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }

    void crecer(double incremento) {
        estatura += incremento;
        System.out.println(nombre + " ahora mide " + estatura + "m.");
    }
}