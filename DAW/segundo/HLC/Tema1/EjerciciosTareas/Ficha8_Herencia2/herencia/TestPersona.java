package herencia;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("12345678Z", 180, 22);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}