package ejerciciopersona;

public class Principal {
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
