package ej5;

public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
        setSalario(salario);
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Zona: " + zona + "\n";
    }

    @Override
    public boolean plus() {
        return getEdad() < 25 && getZona() == "zona 3";
    }

}