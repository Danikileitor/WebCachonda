package ej16_Daniel;

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
        Punto p1 = new Punto();
        boolean generado = false;
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
                            p1 = generarPunto(p1);
                            generado = true;
                            break;
                        case 2:
                            if (generado) {
                                System.out.println("Indica la cantidad a desplazar:");
                                p1.desplazaX(pedirDecimal());
                            } else {
                                System.out.println("¡Genera un punto primero!");
                            }
                            break;
                        case 3:
                            if (generado) {
                                System.out.println("Indica la cantidad a desplazar:");
                                p1.desplazaY(pedirDecimal());
                            } else {
                                System.out.println("¡Genera un punto primero!");
                            }
                            break;
                        case 4:
                            if (generado) {
                                desplazarPunto(p1);
                            } else {
                                System.out.println("¡Genera un punto primero!");
                            }
                            break;
                        case 5:
                            if (generado) {
                                calcularDistancia(p1);
                            } else {
                                System.out.println("¡Genera un punto primero!");
                            }
                            break;
                        case 6:
                            if (generado) {
                                System.out.println(p1.muestra());
                            } else {
                                System.out.println("¡Genera un punto primero!");
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
        System.out.println("# [1] Generar un punto                                                          #");
        System.out.println("# [2] Desplazarlo en el eje X                                                   #");
        System.out.println("# [3] Desplazarlo en el eje Y                                                   #");
        System.out.println("# [4] Desplazarlo en ambos ejes                                                 #");
        System.out.println("# [5] Calcular la distancia euclídea con otro punto                             #");
        System.out.println("# [6] Mostrar sus coordenadas                                                   #");
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

    public static double pedirDecimal() {
        double num;
        try {
            num = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número real!");
            teclado.nextLine();
            return pedirDecimal();
        }
        teclado.nextLine();
        return num;
    }

    public static Punto generarPunto(Punto p) {
        double x, y;
        System.out.println("Introduce el valor de X:");
        x = pedirDecimal();
        System.out.println("Introduce el valor de Y:");
        y = pedirDecimal();
        p = new Punto(x, y);
        System.out.println("Se ha generado un nuevo punto con las coordenadas: " + p.muestra());
        return p;
    }

    public static void desplazarPunto(Punto p) {
        double x, y;
        System.out.println("Introduce el valor de X:");
        x = pedirDecimal();
        System.out.println("Introduce el valor de Y:");
        y = pedirDecimal();
        p.desplaza(x, y);
    }

    public static void calcularDistancia(Punto p) {
        Punto p2;
        double x, y;
        System.out.println("Introducza el valor de X para el segundo punto:");
        x = pedirDecimal();
        System.out.println("Introduce el valor de Y para el segundo punto:");
        y = pedirDecimal();
        p2 = new Punto(x, y);
        System.out.println("La distancia euclídea entre ambos puntos es: " + p.distanciaEuclidea(p2));
    }
}
