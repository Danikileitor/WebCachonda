package ej19_Daniel;

public class Conjunto extends Lista {

    public Conjunto() {
        super();
    }

    private boolean comprobarRepetido(Integer nuevo) {
        boolean repetido = false;
        for (int i = 0; i < tabla.length; i++) {
            repetido = tabla[i] == nuevo;
        }
        return repetido;
    }

    @Override
    public void insertarPrincipio(Integer nuevo) {
        if (!comprobarRepetido(nuevo)) {
            super.insertarPrincipio(nuevo);
        }
    }

    @Override
    public void insertarFinal(Integer nuevo) {
        if (!comprobarRepetido(nuevo)) {
            super.insertarFinal(nuevo);
        }
    }

    @Override
    public void insertarFinal(Lista otraLista) {
        boolean repetido = false;
        for (int i = 0; i < otraLista.tabla.length; i++) {
            comprobarRepetido(otraLista.tabla[i]);
        }
        if (!repetido) {
            super.insertarFinal(otraLista);
        }
    }

    @Override
    public void insertar(int posicion, Integer nuevo) {
        if (!comprobarRepetido(nuevo)) {
            super.insertar(posicion, nuevo);
        }
    }
}
