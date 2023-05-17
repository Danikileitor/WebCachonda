package animales;

public class Diente {

    private TipoDiente tipo;
    private boolean estado;

    public Diente(TipoDiente tipo) {
        this.tipo = tipo;
        this.estado = true;
    }

    public Diente(TipoDiente tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public boolean estaSano() {
        return this.estado;
    }

    @Override
    public String toString() {
        return "Tipo:" + this.tipo + ", Estado: " + this.estado;
    }
}
