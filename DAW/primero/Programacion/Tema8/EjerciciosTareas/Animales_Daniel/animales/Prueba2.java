package animales;

import java.util.ArrayList;
import java.util.Iterator;

public class Prueba2 {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paco");                //Añadir al final
        nombres.add(0, "Fito");             //Añadir eligiendo posición
        System.out.println(nombres.size()); //Devolver el tamaño
        System.out.println(nombres.get(0)); //Devuelve el objeto de la posición

        nombres.add("Fitipaldis");
        nombres.add(0, "Fito");
        nombres.add("Fito");
        nombres.add(2, "Curro");
        System.out.println(nombres.size());
        System.out.println(nombres.get(3));

        System.out.println(nombres.contains("Fito"));       //Devuelve boolean si el objeto esta en la lista
        System.out.println(nombres.contains("Lucas"));
        System.out.println(nombres.indexOf("Fito"));        //Devuelve la primera posición del objeto en la lista
        System.out.println(nombres.lastIndexOf("Fito"));    //Devuelve la última posición del objeto en la lista
        nombres.remove(2);      //Borra el objeto según su posición
        nombres.remove("Fito"); //Borra el primero objeto indicado

        //nombres nombresCopia = (ArrayList) nombres.clone();   //Ni puta idea de como clonar

        Object[] array = nombres.toArray();     //Convertir a array normal

        //Iterador
        Iterator<String> miIterator = nombres.iterator();
        while (miIterator.hasNext()) {
            String elemento = miIterator.next();
            System.out.println(elemento);
        }

        nombres.clear();                        //Borar toda la lista
        System.out.println(nombres.isEmpty());  //Devuelve boolean si esta vacía
    }
}
