package ej18_Daniel;

public class Cola extends Lista {

    public Cola() {
        this.tabla = new Integer[0];
    }

    public Integer getEntero(int n) {
        return this.tabla[n];
    }

    protected Integer[] prepararAux() {
        Integer[] aux = new Integer[this.tabla.length + 1];
        for (int i = 0; i < this.tabla.length; i++) {
            aux[i] = this.tabla[i];
        }
        return aux;
    }

    public void encolar(Integer entero) {
        Integer[] aux = prepararAux();
        aux[aux.length - 1] = entero;
        this.tabla = aux;
    }
}
