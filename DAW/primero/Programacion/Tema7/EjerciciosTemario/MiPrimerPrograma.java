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
        Persona.hoy = "miércoles";
        System.out.println(Persona.hoy);
        Persona.hoyEs(4);
    }
}

class Persona {
    String nombre;
    byte edad;
    double estatura;
    String dni;
    static String hoy;

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

    static void hoyEs (int dia) {
        switch (dia) {
            case 1: hoy = "lunes"; break;
            case 2: hoy = "martes"; break;
            case 3: hoy = "miércoles"; break;
            case 4: hoy = "jueves"; break;
            case 5: hoy = "viernes"; break;
            case 6: hoy = "sábado"; break;
            case 7: hoy = "domingo"; break;
        }
        System.out.println("Hoy es " + Persona.hoy + ".");
    }
}