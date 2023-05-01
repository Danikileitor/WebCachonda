package ej18_Daniel;

public class Cola {

    private Integer[] enteros;

    public Cola() {
        this.enteros = new Integer[0];
    }

    public Integer getEntero(int n) {
        return this.enteros[n];
    }

    private Integer[] prepararAux() {
        Integer[] aux = new Integer[this.enteros.length+1];
        for (int i = 0; i < this.enteros.length; i++) {
            aux[i] = this.enteros[i];
        }
        return aux;
    }

    public void encolar(Integer entero) {
        Integer[] aux = prepararAux();
        aux[aux.length-1] = entero;
        this.enteros = aux;
    }
}
