package ej13_Daniel;

public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad){
        super(ancho, alto, fondo, Unidad.cm);
    }

    @Override
    public double getVolumen() {
        return ancho*alto*fondo*0.8;
    }

    public double getSuperficie() {
        return 2*fondo*ancho+2*fondo*alto+2*alto*ancho;
    }
}
