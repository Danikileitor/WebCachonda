import java.util.InputMismatchException;
import java.util.Scanner;

public class U7_R1_Ej9 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int menu = 1;
        char salir = 'n';
        Bombilla b1,b2,b3,b4,b5;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b3 = new Bombilla();
        b4 = new Bombilla();
        b5 = new Bombilla();
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
                            Bombilla.causarApagon();
                            break;
                        case 2:
                            Bombilla.resolverApagon();
                            break;
                        case 3:
                            encenderBombilla(b1, b2, b3, b4, b5);
                            break;
                        case 4:
                            apagarBombilla(b1, b2, b3, b4, b5);
                            break;
                        case 5:
                            mostrarInfo(b1, b2, b3, b4, b5);
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
        System.out.println("#############################################################################");
        System.out.println("# Bienvenido a esta maravillosa casa, elige una de las siguientes opciones: #");
        System.out.println("# [1] Bajar los plomos                                                      #");
        System.out.println("# [2] Subir los plomos                                                      #");
        System.out.println("# [3] Encender una bombilla                                                 #");
        System.out.println("# [4] Apagar una bombilla                                                   #");
        System.out.println("# [5] Mostrar información de una bombilla                                   #");
        System.out.println("# [0] Salir                                                                 #");
        System.out.println("#############################################################################");
    }

    public static void bombillasMenu() {
        System.out.println("##############################");
        System.out.println("# Elige la bombilla deseada: #");
        System.out.println("# [1] Comedor                #");
        System.out.println("# [2] Cocina                 #");
        System.out.println("# [3] Portal                 #");
        System.out.println("# [4] Dormitorio             #");
        System.out.println("# [5] Baño                   #");
        System.out.println("# [0] Salir                  #");
        System.out.println("##############################");
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

    public static void mostrarInfo(Bombilla b1, Bombilla b2, Bombilla b3, Bombilla b4, Bombilla b5) {
        int menu = 1;
        char salir = 'n';
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
                salir = Character.toLowerCase(pedirLetra());
                menu++;
            } else {
                do {
                    bombillasMenu();
                    menu = pedirNum();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            b1.estado();
                            break;
                        case 2:
                            b2.estado();
                            break;
                        case 3:
                            b3.estado();
                            break;
                        case 4:
                            b4.estado();
                            break;
                        case 5:
                            b5.estado();
                            break;
                        default:
                            System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
                            break;
                    }// Fin switch
                } while (menu != 0);
            }
        } while (salir != 's');
    }

    public static void encenderBombilla(Bombilla b1, Bombilla b2, Bombilla b3, Bombilla b4, Bombilla b5) {
        int menu = 1;
        char salir = 'n';
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
                salir = Character.toLowerCase(pedirLetra());
                menu++;
            } else {
                do {
                    bombillasMenu();
                    menu = pedirNum();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            b1.encender();
                            break;
                        case 2:
                            b2.encender();
                            break;
                        case 3:
                            b3.encender();
                            break;
                        case 4:
                            b4.encender();
                            break;
                        case 5:
                            b5.encender();
                            break;
                        default:
                            System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
                            break;
                    }// Fin switch
                } while (menu != 0);
            }
        } while (salir != 's');
    }

    public static void apagarBombilla(Bombilla b1, Bombilla b2, Bombilla b3, Bombilla b4, Bombilla b5) {
        int menu = 1;
        char salir = 'n';
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
                salir = Character.toLowerCase(pedirLetra());
                menu++;
            } else {
                do {
                    bombillasMenu();
                    menu = pedirNum();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            b1.apagar();
                            break;
                        case 2:
                            b2.apagar();
                            break;
                        case 3:
                            b3.apagar();
                            break;
                        case 4:
                            b4.apagar();
                            break;
                        case 5:
                            b5.apagar();
                            break;
                        default:
                            System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
                            break;
                    }// Fin switch
                } while (menu != 0);
            }
        } while (salir != 's');
    }
}

class Bombilla {
    private boolean encendida;
    private static boolean apagon;

    Bombilla() {
        encendida = false;
        apagon = false;
    }

    void encender() {
        this.encendida = true;
    }

    void apagar() {
        this.encendida = false;
    }

    static void causarApagon() {
        apagon = true;
    }

    static void resolverApagon() {
        apagon = false;
    }

    void estado() {
        if (!apagon && encendida) {
            System.out.println("La bombilla se encuentra encendida");
        }
    }
}