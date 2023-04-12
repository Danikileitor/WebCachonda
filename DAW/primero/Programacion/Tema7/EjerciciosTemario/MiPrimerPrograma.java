public class MiPrimerPrograma {
    public static void main(String[] args) {
        Persona p;
        p = new Persona();
        p.nombre = "Daniel";
        p.edad = 27;
        p.estatura = 1.80;
        //p.dni = "54146993W"; da error por ser final, no se puede modificar.
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
        //Probamos los constructores:
        Persona p1,p2,p3;
        p1 = new Persona("Salvador");
        p2 = new Persona("Rubén", (byte) 22);
        p3 = new Persona("Fran", (byte) 25, 1.72, "12345678Z");
        p1.saludar();
        p2.saludar();
        p3.saludar();
        System.out.println("Se han creado un total de " + Persona.contador + " personas.");
    }
}

class Persona {
    String nombre;
    byte edad;
    double estatura;
    final String dni;
    static String hoy;
    static int contador;

    Persona(){
        this.dni = null;
        contador++;
    }

    Persona(String nombre){
        this.nombre = nombre;
        this.dni = null;
        contador++;
    }

    Persona(String nombre, byte edad){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = null;
        contador++;
    }

    Persona(String nombre, byte edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = null;
        contador++;
    }

    Persona(String nombre, byte edad, double estatura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
        contador++;
    }

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