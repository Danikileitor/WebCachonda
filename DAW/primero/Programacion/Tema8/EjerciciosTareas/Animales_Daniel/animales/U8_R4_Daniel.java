package animales;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class U8_R4_Daniel {

    static ArrayList<Gato> gatos = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Añadimos unos cuantos gatos a la lista
        gatos.add(new Gato());
        gatos.add(new Gato(GatoRaza.Esfinge));
        gatos.add(new Gato(Sexo.Macho));
        gatos.add(new Gato(Sexo.Macho, Tipo.Acuatico, GatoRaza.Persa));
        gatos.add(new Gato(GatoRaza.Bengali));
        gatos.add(new Gato(Sexo.Hembra, Tipo.Terrestre, GatoRaza.Siberiano));

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
                            System.out.println("Hola mundo");
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
        System.out.println("# Bienvenido a esta tienda de gatos, elige una de las siguientes opciones: #");
        System.out.println("# [1] Visualizar todos los gatos                                           #");
        System.out.println("# [2] Consultar posición determinada                                       #");
        System.out.println("# [3] 2 gatos juegan                                                       #");
        System.out.println("# [4] Todos los gatos juegan con todos                                     #");
        System.out.println("# [5] Eliminar un gato                                                     #");
        System.out.println("# [6] Modificar datos de 1 gato                                            #");
        System.out.println("# [7] Insertar gato                                                        #");
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
}
