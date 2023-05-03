package ej12_Daniel;

public class Caja {

    private final int ancho, alto, fondo;
    private final Unidad unidad;
    private String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public enum Unidad {cm, m};

    public double getVolumen() {
        return ancho*alto*fondo;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Etiqueta: " + this.etiqueta + ", unidad: " + this.unidad + ", ancho: " + this.ancho + ", alto: " + this.alto + ", fondo: " + this.fondo;
    }
}
