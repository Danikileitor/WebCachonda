package ej11_Daniel;

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
        MarcaPagina mp = new MarcaPagina();
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
                            mp.pasarPagina();
                            break;
                        case 2:
                            mp.info();
                            break;
                        case 3:
                            mp.empezar();
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
        System.out.println("# Gracias por usar este maravilloso marca páginas, elige una de estas opciones: #");
        System.out.println("# [1] Pasar de página                                                           #");
        System.out.println("# [2] Información sobre la página actual                                        #");
        System.out.println("# [3] Comenzar nueva lectura                                                    #");
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
}
