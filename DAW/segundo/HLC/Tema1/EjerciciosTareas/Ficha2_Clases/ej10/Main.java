package ej10;

public class Main {
    public static void main(String[] args) {
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();

        conjunto1.insertarElemento(5);
        conjunto1.insertarElemento(10);
        conjunto1.insertarElemento(20);

        conjunto2.insertarElemento(10);
        conjunto2.insertarElemento(30);

        System.out.println("Conjunto 1: " + conjunto1.aStringConjunto());
        System.out.println("Conjunto 2: " + conjunto2.aStringConjunto());

        ConjuntoEnteros union = ConjuntoEnteros.union(conjunto1, conjunto2);
        ConjuntoEnteros interseccion = ConjuntoEnteros.interseccion(conjunto1, conjunto2);

        System.out.println("Unión: " + union.aStringConjunto());
        System.out.println("Intersección: " + interseccion.aStringConjunto());

        System.out.println("¿Conjunto 1 igual a Conjunto 2? " + conjunto1.esIgualA(conjunto2));
    }
}
