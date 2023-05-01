package ej18_Daniel;

import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class Principal {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int menu = 1;
        char salir = 'n';
        Cola cola = new Cola();
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
                salir = Character.toLowerCase(pedirLetra());
                menu++;
            } else {
                do {
                    opcionesMenu();
                    menu = pedirNum();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            System.out.println("Introduce un entero:");
                            cola.encolar(pedirNum());
                            break;
                        case 2:
                            System.out.println("Introduce la posición de la cola que deseas consultar:");
                            try {
                                System.out.println("El entero de dicha posición es: " + cola.getEntero(pedirNum()));
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("¡No hay ningún entero en esa posición de la cola!");
                            }
                            break;
                        default:
                            System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
                            break;
                    }// Fin switch
                } while (menu != 0);
            }
        } while (salir != 's');
    }

    public static void opcionesMenu() {
        System.out.println("#################################################################################");
        System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
        System.out.println("# [1] Encolar un entero                                                         #");
        System.out.println("# [2] Mostrar un entero según su posición en la cola                            #");
        System.out.println("# [0] Salir                                                                     #");
        System.out.println("#################################################################################");
    }

    public static char pedirLetra() {
        return teclado.next().charAt(0);
    }

    public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }

}// Fin clase
