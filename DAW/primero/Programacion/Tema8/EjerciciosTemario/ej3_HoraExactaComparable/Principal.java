package ej3_HoraExactaComparable;

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
        HoraExacta reloj = new HoraExacta(0, 0, 0);
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
                            System.out.println("Indica los segundos:");
                            if (reloj.setSegundos(pedirNum())) {
                                System.out.println("Segundos cambiados");
                            } else {
                                System.out.println("Error, no es un valor correcto");
                            }
                            break;
                        case 2:
                            System.out.println("Indica los minutos:");
                            if (reloj.setMinutos(pedirNum())) {
                                System.out.println("Minutos cambiados");
                            } else {
                                System.out.println("Error, no es un valor correcto");
                            }
                            break;
                        case 3:
                            System.out.println("Indica la hora:");
                            if (reloj.setHora(pedirNum())) {
                                System.out.println("Hora cambiada");
                            } else {
                                System.out.println("Error, no es un valor correcto");
                            }
                            break;
                        case 4:
                            reloj.inc();
                            System.out.println("Se ha incrementado un minuto");
                            break;
                        case 5:
                            System.out.println(reloj.toString());
                            break;
                        case 6:
                            comprobar(reloj);
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
        System.out.println("# [1] Indicar los segundos                                                   #");
        System.out.println("# [2] Indicar los minutos                                                    #");
        System.out.println("# [3] Indicar las hora                                                       #");
        System.out.println("# [4] Incrementar en 1 segundo                                               #");
        System.out.println("# [5] Mostrar hora                                                           #");
        System.out.println("# [6] Comprobar si el reloj tiene la hora correcta                           #");
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

    public void comprobar(HoraExacta h1) {
        HoraExacta h2 = new HoraExacta(0, 0, 0);
        System.out.println("Vamos a indicar la hora correcta.");
        System.out.println("Indica los segundos:");
        h2.setSegundos(pedirNum());
        System.out.println("Indica los minutos:");
        h2.setMinutos(pedirNum());
        System.out.println("Indica la hora:");
        h2.setHora(pedirNum());
        if (h1.equals(h2)) {
            System.out.println("¡El reloj tiene la hora correcta!");
        } else {
            System.out.println("¡El reloj tiene mal la hora!");
        }
    }

}// Fin clase
