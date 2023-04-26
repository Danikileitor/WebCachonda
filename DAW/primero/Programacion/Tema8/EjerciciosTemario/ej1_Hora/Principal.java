package ej1_Hora;

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
        Hora reloj = new Hora(0, 0);
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
                            System.out.println("Indica los minutos:");
                            if (reloj.setMinutos(pedirNum())) {
                                System.out.println("Minutos cambiados");
                            } else {
                                System.out.println("Error, no es un valor correcto");
                            }
                            break;
                        case 2:
                            System.out.println("Indica la hora:");
                            if (reloj.setHora(pedirNum())) {
                                System.out.println("Hora cambiada");
                            } else {
                                System.out.println("Error, no es un valor correcto");
                            }
                            break;
                        case 3:
                            reloj.inc();
                            System.out.println("Se ha incrementado un minuto");
                            break;
                        case 4:
                            System.out.println(reloj.toString());
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
        System.out.println("##############################################################################");
        System.out.println("# Bienvenido a este maravilloso reloj, elige una de las siguientes opciones: #");
        System.out.println("# [1] Indicar los minutos                                                    #");
        System.out.println("# [2] Indicar las hora                                                       #");
        System.out.println("# [3] Incrementar en 1 minuto                                                #");
        System.out.println("# [4] Mostrar hora                                                           #");
        System.out.println("# [0] Salir                                                                  #");
        System.out.println("##############################################################################");
    }

    public static int generarAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
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
