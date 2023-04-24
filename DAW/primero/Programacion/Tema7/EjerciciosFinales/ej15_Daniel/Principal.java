package ej15_Daniel;

import java.util.InputMismatchException;
import java.util.Scanner;//Importación de paquetes

public class Principal {

    //Declaración de variables globales a la clase Principal_Daniel
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m"; //Espero que los colores sean correctos (soy daltónico)
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaración de variables locales al método main
        Calendario c1, c2;
        //Creamos el primer calendario usando un constructor con argumentos y mostramos su información
        System.out.println("Vamos a crear un calendario");
        c1 = new Calendario(pedirDia(), pedirMes(), pedirAnio());
        System.out.println("Primer calendario: " + AZUL + c1.mostrar() + RESET);
        //Se incrementa el día del primer calendario y mostramos su información
        c1.incrementarDia();
        System.out.println("Se incrementa un día: " + AZUL + c1.mostrar() + RESET);
        //Se incrementa el mes del primer calendario y mostramos su información
        c1.incrementarMes();
        System.out.println("Se incrementa un mes: " + AZUL + c1.mostrar() + RESET);
        //Creamos el segundo calendario usando el constructor por defecto y mostramos su información
        c2 = new Calendario();
        System.out.println("Segundo calendario (hoy): " + AMARILLO + c2.mostrar() + RESET);
        //Comprobamos si ambos calendarios son iguales y mostramos su información
        if (c1.iguales(c2)) {
            System.out.println(VERDE + "Ambos calendarios son iguales con fecha: " + c1.mostrar() + RESET);
        } else {
            System.out.println(ROJO + "Ambos calendarios son diferentes" + RESET);
            System.out.println("\tLa fecha del primer calendario es: " + AZUL + c1.mostrar() + RESET);
            System.out.println("\tLa fecha del segundo calendario es: " + AMARILLO + c2.mostrar() + RESET);
        }
    }

    //Método para solicitar enteros
    public static int pedirNum() {
        int n;
        try {
            n = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        return n;
    }

    //Metodos personalizados para solicitar un día, mes y año
    public static int pedirDia() {
        System.out.println("Introduce el día:");
        return pedirNum();
    }

    public static int pedirMes() {
        System.out.println("Introduce el mes:");
        return pedirNum();
    }

    public static int pedirAnio() {
        System.out.println("Introduce el año:");
        return pedirNum();
    }
}
