package ej13_Daniel;

public class Caja {

    protected final int ancho, alto, fondo;
    protected final Unidad unidad;
    protected String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public enum Unidad {cm, m};

    public double getVolumen() {
        double resultado = ancho*alto*fondo;
        if (this.unidad == Unidad.cm) {
            resultado /= 1000000;
        }
        return resultado;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Etiqueta: " + this.etiqueta + ", unidad: " + this.unidad + ", ancho: " + this.ancho + ", alto: " + this.alto + ", fondo: " + this.fondo;
    }
}
