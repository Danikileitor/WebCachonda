package ej18_Daniel;

public class ColaDoble extends Cola {
    
    public ColaDoble() {
        super();
    }

    public void encolarPrincipio(Integer elemento) {
        super.insertarPrincipio(elemento);
    }

    public Integer desencolarFinal() {
        return super.eliminar(this.tabla.length-1);
    }
}
