package ej21_Daniel;

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

    public boolean equals(Conjunto otroConjunto) {
        return super.equals(otroConjunto);
    }

    public static boolean esNumero(Object ob) {
        return ob instanceof Number;
    }

    public boolean sumar(Object a, Object b) {
        boolean sumable = false;
        if (Conjunto.esNumero(a) && Conjunto.esNumero(b)) {
            sumable = true;
            System.out.println((Double) a + (Double) b);
        } else if (a instanceof String && b instanceof String) {
            sumable = true;
            System.out.println((String) a + (String) b);
        } else {
            System.out.println("No sumables");
        }
        return sumable;
    }
}
