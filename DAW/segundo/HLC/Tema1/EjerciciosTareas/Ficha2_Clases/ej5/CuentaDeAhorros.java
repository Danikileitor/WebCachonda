package ej5;

public class CuentaDeAhorros {
    static double tasaInteresAnual;
    private double saldoAhorros;
    
    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public CuentaDeAhorros() {
        this(0);
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double calcularInteresMensual() {
        return this.getSaldoAhorros()*tasaInteresAnual/12;
    }
}