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
    }
}

class Persona {
    String nombre;
    byte edad;
    double estatura;
    String dni;
}