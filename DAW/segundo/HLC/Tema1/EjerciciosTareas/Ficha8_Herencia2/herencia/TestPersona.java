package herencia;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("12345678Z", 180, 22);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Ingeniero p3 = new Ingeniero("23456789D", 172.2, 23);
        IngenieroInformatico p4 = new IngenieroInformatico("34567890V", 178.7, 35);

        System.out.println(p3.toString());
        System.out.println(p4.toString());
        p3.hablar();
        p4.comer();
        p3.razonar();
        p4.trabajarEnGrupo();
        p4.crearPrograma();
    }
}