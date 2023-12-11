package herencia;

public class IngenieroInformatico extends Ingeniero {
    public IngenieroInformatico(String nif, double altura, int edad) {
        super(nif, altura, edad);
    }

    public IngenieroInformatico() {
        super();
    }

    public void crearPrograma() {
        System.out.println("*Crea un programa*");
    }
}