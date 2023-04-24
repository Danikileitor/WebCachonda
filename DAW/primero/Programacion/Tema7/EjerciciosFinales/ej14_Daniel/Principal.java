package ej14_Daniel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int menu = 1;
        char salir = 'n';
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
                            calcularCambio();
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
        System.out.println("# [1] Calcular el cambio de una compra                                          #");
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

    public static void calcularCambio() {
        int precio, pagado;
        int[] cambio;
        System.out.println("Introduzca el precio total en céntimos:");
        precio = pedirNum();
        System.out.println("Introduzca la cantidad pagada en céntimos:");
        pagado = pedirNum();
        System.out.println("Su cambio es:");
        cambio = Cambio.calcular(precio, pagado);
        for (int i = 0; i < cambio.length; i++) {
            if (cambio[i] == 0) {
                continue;
            }
            switch (i) {
                case 0:
                    System.out.println("Billetes de 500€: " + cambio[i]);
                    break;
                case 1:
                    System.out.println("Billetes de 200€: " + cambio[i]);
                    break;
                case 2:
                    System.out.println("Billetes de 100€: " + cambio[i]);
                    break;
                case 3:
                    System.out.println("Billetes de 50€: " + cambio[i]);
                    break;
                case 4:
                    System.out.println("Billetes de 20€: " + cambio[i]);
                    break;
                case 5:
                    System.out.println("Billetes de 10€: " + cambio[i]);
                    break;
                case 6:
                    System.out.println("Billetes de 5€: " + cambio[i]);
                    break;
                case 7:
                    System.out.println("Monedas de 2€: " + cambio[i]);
                    break;
                case 8:
                    System.out.println("Monedas de 1€: " + cambio[i]);
                    break;
                case 9:
                    System.out.println("Monedas de 50 céntimos: " + cambio[i]);
                    break;
                case 10:
                    System.out.println("Monedas de 20 céntimos: " + cambio[i]);
                    break;
                case 11:
                    System.out.println("Monedas de 10 céntimos: " + cambio[i]);
                    break;
                case 12:
                    System.out.println("Monedas de 5 céntimos: " + cambio[i]);
                    break;
                case 13:
                    System.out.println("Monedas de 2 céntimos: " + cambio[i]);
                    break;
                case 14:
                    System.out.println("Monedas de 1 céntimo: " + cambio[i]);
                    break;
            }
        }
    }
}
