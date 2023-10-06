public class Rectangulo {
    protected double longitud;
    protected double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public Rectangulo() {
        this(1, 1);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (comprobar(longitud)) {
            this.longitud = longitud;
        } else {
            System.out.println("¡Error! La longitud ha de estar entre 0.0 y 20.0");
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (comprobar(anchura)) {
            this.anchura = anchura;
        } else {
            System.out.println("¡Error! La anchura ha de estar entre 0.0 y 20.0");
        }
    }

    @Override
    public String toString() {
        return "Rectángulo [longitud=" + longitud + ", anchura=" + anchura + "]";
    }

    protected boolean comprobar(double dato) {
        return dato > 0 && dato < 20;
    }

    public double perimetro() {
        return 2 * this.getAnchura() + 2 * this.getLongitud();
    }

    public double area() {
        return this.getAnchura() * this.getLongitud();
    }
}