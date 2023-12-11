package herencia;

public class Ingeniero extends Persona {
    public Ingeniero(String nif, double altura, int edad) {
        super(nif, altura, edad);
    }

    public Ingeniero() {
        super();
    }

    public void razonar() {
        System.out.println("*Razona su argumento*");
    }

    public void trabajarEnGrupo() {
        System.out.println("*Se dispone a trabajar en grupo*");
    }
}