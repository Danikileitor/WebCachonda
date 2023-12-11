package herencia;

public class Persona {
    private String nif;
    private double altura;
    private int edad;

    public Persona(String nif, double altura, int edad) {
        this.nif = nif;
        this.altura = altura;
        this.edad = edad;
    }

    public Persona() {
        this("11111111A", 175, 25);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}