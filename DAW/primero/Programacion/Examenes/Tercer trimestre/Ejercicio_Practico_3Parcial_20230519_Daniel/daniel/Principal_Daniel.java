package daniel;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal_Daniel {

    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    static Scanner teclado = new Scanner(System.in);

    static ArrayList<Cuadra_Daniel> cuadras = new ArrayList<>();
    static ArrayList<Carrera_Daniel> carreras = new ArrayList<>();

    public static void main(String[] args) {
        menu();
        System.out.println("Gracias por usar este programa. (Ninguno de los caballos fueron maltratados)");
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
                            altaCuadra();
                            break;
                        case 2:
                            altaCaballo();
                            break;
                        case 3:
                            altaCarrera();
                            break;
                        case 4:
                            listarCarreras();
                            break;
                        case 5:
                            consultarCuadraGanadora();
                            break;
                        case 6:
                            elminarCuadra();
                            break;
                        case 7:
                            elminarCaballo();
                            break;
                        case 8:
                            elminarCarrera();
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
        System.out.println("# [1] Alta de cuadra                                                            #");
        System.out.println("# [2] Alta de caballo en una cuadra                                             #");
        System.out.println("# [3] Alta de carrera                                                           #");
        System.out.println("# [4] Listado de carreras y ganadores                                           #");
        System.out.println("# [5] Consulta de cuadra con más carreras ganadas                               #");
        System.out.println("# [6] Eliminar cuadra                                                           #");
        System.out.println("# [7] Eliminar caballo                                                          #");
        System.out.println("# [8] Eliminar carrera                                                          #");
        System.out.println("# [0] Salir                                                                     #");
        System.out.println("#################################################################################");
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

    public static String pedirFrase() {
        return teclado.nextLine().trim();
    }

    //Métodos del menú
    public static void altaCuadra() {
        String cif, nombre, residencia;
        System.out.println("Introduce el CIF de la cuadra:");
        cif = pedirFrase();
        System.out.println("Introduce su nombre:");
        nombre = pedirFrase();
        System.out.println("Introduce su lugar de residencia:");
        residencia = pedirFrase();
        cuadras.add(new Cuadra_Daniel(cif, nombre, residencia));
        System.out.println(VERDE + "Se ha dado de alta la cuadra [" + AMARILLO + (cuadras.size() - 1) + VERDE + "]:\n" + cuadras.get(cuadras.size() - 1).toString() + RESET);
    }

    public static void altaCaballo() {
        String nombre, jinete;
        int cuadra;
        System.out.println("Indica el nombre del caballo:");
        nombre = pedirFrase();
        System.out.println("Indica el nombre de su jinete:");
        jinete = pedirFrase();
        System.out.println("Indica la cuadra donde se dará de alta este caballo (0-" + (cuadras.size() - 1) + "):");
        cuadra = pedirNum();
        try {
            cuadras.get(cuadra).getResidentes().add(new Caballo_Daniel(nombre, jinete));
            System.out.println(VERDE + "Se ha dado de alta el caballo [" + AZUL + (cuadras.get(cuadra).getResidentes().size() - 1) + VERDE + "]:\n" + cuadras.get(cuadra).getResidentes().get(cuadras.get(cuadra).getResidentes().size() - 1).toString());
            System.out.println("En la cuadra: [" + AMARILLO + cuadra + VERDE + "]" + RESET);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡Esa cuadra no existe! Te devuelvo al menú..." + RESET);
        }
    }

    public static void altaCarrera() {
        String lugar, fecha;
        System.out.println("Indica el lugar de la carrera:");
        lugar = pedirFrase();
        System.out.println("Indica su fecha:");
        fecha = pedirFrase();
        carreras.add(new Carrera_Daniel(lugar, fecha));
        System.out.println("Procedemos a indicar sus participantes...");
        elegirParticipantes(carreras.get(carreras.size() - 1));
        System.out.println("Indica el ganador de la carrera (0-" + (carreras.get(carreras.size() - 1).getParticipantes().size() - 1) + "):");
        carreras.get(carreras.size() - 1).setGanador(carreras.get(carreras.size() - 1).getParticipantes().get(pedirNum()));
        System.out.println(VERDE + "Se ha dado de alta la carrera [" + (carreras.size() - 1) + "]\n" + carreras.get(carreras.size() - 1).toString());
    }

    public static void elegirParticipantes(Carrera_Daniel c) {
        String continuar = "";
        do {
            int cuadra, participante;
            System.out.println("Indica la cuadra donde se encuentra el caballo (0-" + (cuadras.size() - 1) + "):");
            cuadra = pedirNum();
            try {
                cuadras.get(cuadra);
                if (cuadras.get(cuadra).getResidentes().isEmpty()) {
                    System.out.println(ROJO + "¡Esta cuadra está vacia!" + RESET);
                } else {
                    System.out.println("Indica el caballo participante (0-" + (cuadras.get(cuadra).getResidentes().size() - 1) + "):");
                    participante = pedirNum();
                    c.insertarParticipante(cuadras.get(cuadra).getResidente(participante));
                    System.out.println(VERDE + "¡Se ha añadido el caballo [" + AZUL + participante + VERDE + "] de la cuadra [" + AMARILLO + cuadra + VERDE + "]" + RESET);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(ROJO + "¡No existe esa posición!" + RESET);
            }
            System.out.println("Si quieres añadir otro partipicante escribe cualquier cosa, de lo contrario pulsa enter sin indicar nada.");
            continuar = pedirFrase();
        } while (!continuar.equals(""));
    }

    public static void listarCarreras() {
        System.out.println("Listado de carreras con sus ganadores:");
        for (Carrera_Daniel carrera : carreras) {
            System.out.println("Carrera: ");
            System.out.println(carrera.toString());
            System.out.println();
        }
    }

    public static void consultarCuadraGanadora() {
        //No me da tiempo, habría que comprobar todas las carreras la cuadra de los caballos ganadores y el mostra la de mayor resultado
    }

    public static void elminarCuadra() {
        System.out.println("Indica la cuadra a eliminar (0-" + (cuadras.size() - 1) + "):");
        try {
            cuadras.remove(pedirNum());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡Esa cuadra no existe! Te devuelvo al menú..." + RESET);
        }
    }

    public static void elminarCaballo() {
        int cuadra;
        System.out.println("Indica la cuadra del caballo a eliminar (0-" + (cuadras.size() - 1) + "):");
        cuadra = pedirNum();
        try {
            System.out.println("Indica el caballo a eliminar (0-" + (cuadras.get(cuadra).getResidentes().size() - 1) + "):");
            cuadras.get(cuadra).getResidentes().remove(pedirNum());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡Esa posición no existe! Te devuelvo al menú..." + RESET);
        }
    }

    public static void elminarCarrera() {
        System.out.println("Indica la carrera a eliminar (0-" + (carreras.size() - 1) + "):");
        try {
            carreras.remove(pedirNum());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡Esa carrera no existe! Te devuelvo al menú..." + RESET);
        }
    }
}
