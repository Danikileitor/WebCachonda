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
                            visualizar();
                            break;
                        case 2:
                            consultar();
                            break;
                        case 3:
                            jugar2();
                            break;
                        case 4:
                            jugarTodos();
                            break;
                        case 5:
                            eliminar();
                            break;
                        case 6:
                            modificar();
                            break;
                        case 7:
                            insertar();
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

    public static void visualizar() {
        System.out.println("Lista de gatos:");
        for (int i = 0; i < gatos.size(); i++) {
            System.out.println("Gato [" + i + "] - " + gatos.get(i));
        }
        System.out.println();
    }

    public static void consultar() {
        System.out.println("Indica el gato que deseas consultar: (0-" + (gatos.size() - 1) + ")");
        int pos = pedirNum();
        System.out.println("Gato [" + pos + "] - " + gatos.get(pos));
        System.out.println();
    }

    public static void jugar2() {
        System.out.println("Indica el gato que va a jugar: (0-" + (gatos.size() - 1) + ")");
        int pos1 = pedirNum();
        System.out.println("Indica el gato con quien va a jugar: (0-" + (gatos.size() - 1) + ")");
        int pos2 = pedirNum();
        System.out.print("El gato [" + pos1 + "] intenta jugar con el gato [" + pos2 + "] ... ");
        gatos.get(pos1).juegaCon(gatos.get(pos2));
        System.out.println();
    }

    public static void jugarTodos() {
        for (int i = 0; i < gatos.size(); i++) {
            for (int j = 0; j < gatos.size(); j++) {
                if (i == j) {
                    continue;
                } else {
                    System.out.print("El gato [" + i + "] intenta jugar con el gato [" + j + "] ... ");
                    gatos.get(i).juegaCon(gatos.get(j));
                }
            }
            System.out.println();
        }
    }

    public static void eliminar() {
        System.out.println("Indica el gato que deseas eliminar: (0-" + (gatos.size() - 1) + ")");
        int pos = pedirNum();
        System.out.println("Se ha eliminado el gato [" + pos + "] - " + gatos.get(pos));
        gatos.remove(pos);
        System.out.println();
    }

    public static void modificar() {
        System.out.println("Indica el gato que deseas eliminar: (0-" + (gatos.size() - 1) + ")");
        int pos = pedirNum();
        System.out.println("Gato [" + pos + "] - " + gatos.get(pos));
        System.out.println("Indica el sexo del gato: (0-Macho | 1-Hembra | 2-Hermafrodita)");
        Sexo sexo = Sexo.values()[pedirNum()];
        System.out.println("Indica la raza del gato: (0-Siames | 1-Persa | 2-Angora | 3-Bengali | 4-Siberiano | 5-Esfinge)");
        GatoRaza raza = GatoRaza.values()[pedirNum()];
        gatos.get(pos).sexo = sexo;
        gatos.get(pos).raza = raza;
        System.out.println("Se ha modificado el gato [" + pos + "] - " + gatos.get(pos));
        System.out.println();
    }

    public static void insertar() {
        System.out.println("Indica el sexo del gato: (0-Macho | 1-Hembra | 2-Hermafrodita)");
        Sexo sexo = Sexo.values()[pedirNum()];
        System.out.println("Indica la raza del gato: (0-Siames | 1-Persa | 2-Angora | 3-Bengali | 4-Siberiano | 5-Esfinge)");
        GatoRaza raza = GatoRaza.values()[pedirNum()];
        gatos.add(new Gato(sexo, Tipo.Terrestre, raza));
        System.out.println("Se ha insertado el gato [" + (gatos.size() - 1) + "] - " + gatos.get((gatos.size() - 1)));
        System.out.println();
    }
}
