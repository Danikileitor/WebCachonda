package ejerciciopersona;

public class Persona {
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