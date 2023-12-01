package ej5;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private static final int PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (plus()) {
            this.salario = salario + PLUS;
        } else {
            this.salario = salario;
        }
    }

    public static int getPlus() {
        return PLUS;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario() + "\n";
    }

    public abstract boolean plus();

}