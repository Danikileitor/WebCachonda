package ejercicio7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio7_Daniel {

    public static void main(String[] args) {
        //Creamos el array de calendarios (hemos tenido que modificar la clase Calendario añadiendo implements Serializable)
        Calendario fechas[] = new Calendario[5];
        fechas[0] = new Calendario();
        fechas[1] = new Calendario(1, 1, 1991);
        fechas[2] = new Calendario(25, 4, 1995);
        fechas[3] = new Calendario(19, 9, 2000);
        fechas[4] = new Calendario(30, 5, 1998);

        //Serializamos el array en el fichero FicheroSerializado.dat
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("C:/Users/FOCUS/Desktop/TemaFicherosJava/FicheroSerializado.dat"));
            flujoSalida.writeObject(fechas);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        //Desserializamos el array desde el fichero FicheroSerializado.dat y lo almacenamos en fechas2[]
        Calendario fechas2[] = null;
        ObjectInputStream flujoEntrada = null;
        try {
            flujoEntrada = new ObjectInputStream(new FileInputStream("C:/Users/FOCUS/Desktop/TemaFicherosJava/FicheroSerializado.dat"));
            fechas2 = (Calendario[]) flujoEntrada.readObject();
        } catch (IOException e) {
            System.out.println("Error entrada/salida");
        } catch (ClassNotFoundException e) {
            System.out.println("El fichero no almacena un array de Calendario");
        } finally {
            if (flujoEntrada != null) {
                try {
                    flujoEntrada.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        //Mostramos el contenido del nuevo array para verificar
        for (Calendario fecha : fechas2) {
            System.out.println(fecha);
        }
    }
}