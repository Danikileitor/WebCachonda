package ej5;

public class Comercial extends Empleado {

    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
        setSalario(salario);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + "Comision: " + getComision() + "\n";
    }

    @Override
    public boolean plus() {
        return getEdad() > 30 && getComision() > 200;
    }

}