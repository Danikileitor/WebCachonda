package ej16_Daniel;

public class Punto {

    private double x, y;
    
    Punto() {
        this.x = 0;
        this.y = 0;
    }

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanciaEuclidea(Punto otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
    }

    public String muestra() {
        return "X: " + this.x + " | Y: " + this.y;
    }

}
