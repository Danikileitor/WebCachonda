package ej16_Daniel;

import java.util.Arrays;

public class Pila extends Lista {

    public Pila() {
        this.tabla = new Integer[0];
    }

    public void apilar(Integer elemento) {
        this.insertarFinal(elemento);
    }

    public Integer desapilar() {
        return this.eliminar(this.tabla.length - 1);
    }

    @Override
    public String toString() {
        return "Pila: " + Arrays.toString(this.tabla);
    }
}
