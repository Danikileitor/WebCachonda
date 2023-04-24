package ej12_Daniel;

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
        boolean hayEcuacion = false;
        EcuacionGrado2 e = new EcuacionGrado2(0, 0, 0);
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
                            generarEcuacion(e);
                            hayEcuacion = true;
                            break;
                        case 2:
                            if (hayEcuacion) {
                                resolverEcuacion(e);
                            } else {
                                System.out.println("¡Indica primero los coeficientes de la ecuación!");
                            }
                            break;
                        case 3:
                            if (hayEcuacion) {
                                discriminanteEcuacion(e);
                            } else {
                                System.out.println("¡Indica primero los coeficientes de la ecuación!");
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
        System.out.println("############################################################################");
        System.out.println("# Gracias por usar este maravilloso programa, elige una de estas opciones: #");
        System.out.println("# [1] Indicar coeficientes de la ecuación                                  #");
        System.out.println("# [2] Resolver                                                             #");
        System.out.println("# [3] Comprobar discriminante                                              #");
        System.out.println("# [0] Salir                                                                #");
        System.out.println("############################################################################");
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

    public static double pedirCoeficiente() {
        double num;
        try {
            num = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirCoeficiente();
        }
        teclado.nextLine();
        return num;
    }

    public static void generarEcuacion(EcuacionGrado2 e) {
        System.out.println("Indica el valor del coeficiente A:");
        e.setCoeficienteA(pedirCoeficiente());
        System.out.println("Indica el valor del coeficiente B:");
        e.setCoeficienteB(pedirCoeficiente());
        System.out.println("Indica el valor del coeficiente C:");
        e.setCoeficienteC(pedirCoeficiente());
    }

    public static void resolverEcuacion(EcuacionGrado2 e) {
        e.resolver();
        System.out.println("Las soluciones para la ecuación " + e.getCoeficienteA() + "x^2 + " + e.getCoeficienteB() + "x + " + e.getCoeficienteC() + " = 0 son:");
        System.out.println("\tSolución 1: " + e.getResultado1());
        System.out.println("\tSolución 2: " + e.getResultado2());
    }

    public static void discriminanteEcuacion(EcuacionGrado2 e) {
        if (e.comprobarDiscriminante()) {
            System.out.println("El discriminante es positivo.");
        } else {
            System.out.println("El discriminante es negativo.");
        }
    }
}
