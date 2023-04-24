package ej12_Daniel;

public class EcuacionGrado2 {

    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;
    private double discriminante;
    private double resultado1;
    private double resultado2;

    EcuacionGrado2(double A, double B, double C) {
        this.coeficienteA = A;
        this.coeficienteB = B;
        this.coeficienteC = C;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public double getResultado1() {
        return resultado1;
    }

    public double getResultado2() {
        return resultado2;
    }

    private void calcularDiscriminante() {
        this.discriminante = this.coeficienteB * this.coeficienteB - 4 * this.coeficienteA * this.coeficienteC;
    }

    public boolean comprobarDiscriminante() {
        calcularDiscriminante();
        return this.discriminante >= 0;
    }

    public void resolver() {
        if (comprobarDiscriminante()) {
            this.resultado1 = (-this.coeficienteB + Math.sqrt(this.discriminante)) / (2 * coeficienteA);
            this.resultado2 = (-this.coeficienteB - Math.sqrt(this.discriminante)) / (2 * coeficienteA);
        }
    }
}
