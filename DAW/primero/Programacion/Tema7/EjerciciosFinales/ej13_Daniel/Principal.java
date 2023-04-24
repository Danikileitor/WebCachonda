package ej13_Daniel;

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
        Colores paleta = new Colores();
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
                            generarPaleta(paleta);
                            break;
                        case 2:
                            addColor(paleta);
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
        System.out.println("# [1] Generar paleta de colores aleatorios                                      #");
        System.out.println("# [2] Añadir colores a la paleta de colores                                     #");
        System.out.println("# [0] Salir                                                                     #");
        System.out.println("#################################################################################");
    }

    public static char pedirLetra() {
        return teclado.next().charAt(0);
    }
    
    public static String pedirPalabra() {
        return teclado.nextLine();
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

    public static void generarPaleta(Colores paleta) {
        String[] paletaAleatoria;
        int cantidad;
        System.out.println("Indica la cantidad de colores deseados:");
        do {
            cantidad = pedirNum();
            if (paleta.getPaleta().length < cantidad) {
                System.out.println("¡La paleta no tiene suficientes colores! Introduzca otra cantidad:");
            }
        } while (paleta.getPaleta().length < cantidad);
        paletaAleatoria = paleta.generar(cantidad);
        System.out.print("Los colores de la paleta son: ");
        for (int i = 0; i < paletaAleatoria.length; i++) {
            System.out.print(paletaAleatoria[i] + " | ");
        }
        System.out.println();
    }
    
    public static void addColor(Colores paleta) {
        System.out.println("Indica el color a añadir:");
        paleta.addColor(pedirPalabra().trim().toUpperCase());
    }
}
