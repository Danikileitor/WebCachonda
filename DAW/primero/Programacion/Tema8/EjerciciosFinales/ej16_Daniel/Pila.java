package ej16_Daniel;

import java.util.Arrays;

public class Pila extends Lista {

    private Lista lista;

    public Pila() {
        this.lista = new Lista();
    }

    public void apilar(Integer elemento) {
        this.lista.insertarFinal(elemento);
    }

    public Integer desapilar() {
        return this.lista.eliminar(this.lista.tabla.length - 1);
    }

    @Override
    public String toString() {
        return "Pila: " + Arrays.toString(this.lista.tabla);
    }
}
