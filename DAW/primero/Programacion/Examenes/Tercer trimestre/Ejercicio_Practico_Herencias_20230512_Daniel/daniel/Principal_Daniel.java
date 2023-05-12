package daniel;//Declaración del paquete al que pertenece esta clase

import java.util.ArrayList;
import java.util.Scanner;//Importación de paquetes

public class Principal_Daniel {

    //Declaración de variables globales a la clase Principal_Daniel
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    static Scanner teclado = new Scanner(System.in);

    //Creamos una lista para almacenar calendarios
    static ArrayList<CalendarioExacto> calendarios = new ArrayList<CalendarioExacto>();

    public static void main(String[] args) {
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
                            calendarios.add(new CalendarioExacto(pedirDato(Dato.Dia), pedirDato(Dato.Mes), pedirDato(Dato.Anio), pedirDato(Dato.Hora), pedirDato(Dato.Minuto)));
                            break;
                        case 2:
                            if (calendarios.isEmpty()) {
                                System.out.println("¡Almacena una fecha primero!");
                            } else {
                                modificar();
                            }
                            break;
                        case 3:
                            if (calendarios.isEmpty()) {
                                System.out.println("¡Almacena una fecha primero!");
                            } else {
                                comprobarBisiesto();
                            }
                            break;
                        case 4:
                            if (calendarios.size() < 2) {
                                System.out.println("¡Almacena dos fechas primero!");
                            } else {
                                comprobarIguales();
                            }
                            break;
                        case 5:
                            if (calendarios.isEmpty()) {
                                System.out.println("¡Almacena una fecha primero!");
                            } else {
                                mostrarCalendario();
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

    //Opciones del menú principal
    public static void opcionesMenu() {
        System.out.println("##############################################################################");
        System.out.println("# Bienvenido al gestor de calendarios, elige una de las siguientes opciones: #");
        System.out.println("# [1] Almacenar una fecha                                                    #");
        System.out.println("# [2] Modificar una fecha                                                    #");
        System.out.println("# [3] Comprobar si el año de una fecha es bisiesto                           #");
        System.out.println("# [4] Comprobar si dos fechas son iguales                                    #");
        System.out.println("# [5] Mostrar una fecha                                                      #");
        System.out.println("# [0] Salir                                                                  #");
        System.out.println("##############################################################################");
    }

    //Opciones del menú de modificaciones
    public static void opcionesModificar() {
        System.out.println("##############################################################################");
        System.out.println("# Bienvenido al modificador de fechas, elige una de las siguientes opciones: #");
        System.out.println("# [1] Incrementar un minuto                                                  #");
        System.out.println("# [2] Incrementar una hora                                                   #");
        System.out.println("# [3] Incrementar un día                                                     #");
        System.out.println("# [4] Incrementar un mes                                                     #");
        System.out.println("# [5] Incrementar el año                                                     #");
        System.out.println("# [0] Volver                                                                 #");
        System.out.println("##############################################################################");
    }

    //Método para solicitar una letra
    public static char pedirLetra() {
        return teclado.next().charAt(0);
    }

    //Método para solicitar enteros
    public static int pedirNum() {
        int n;
        try {
            n = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        return n;
    }

    //Método personalizado para solicitar minutos, hora, día, mes y año
    public static int pedirDato(Dato dato) {
        switch (dato) {
            case Minuto:
                System.out.println("Introduce los minutos:");
                break;
            case Hora:
                System.out.println("Introduce la hora:");
                break;
            case Dia:
                System.out.println("Introduce el día:");
                break;
            case Mes:
                System.out.println("Introduce el mes:");
                break;
            case Anio:
                System.out.println("Introduce el año:");
                break;
            case Calendario:
                System.out.println("Introduce la posición de la fecha [0-" + (calendarios.size() - 1) + "]");
                break;
            case Calendario2:
                System.out.println("Introduce la posición de la segunda fecha [0-" + (calendarios.size() - 1) + "]");
                break;
        }
        return pedirNum();
    }

    //Métodos del menú principal
    public static void comprobarBisiesto() {
        try {
            CalendarioExacto fecha = calendarios.get(pedirDato(Dato.Calendario));
            System.out.print("Para la fecha: " + AZUL + fecha.toString() + RESET + ", su año " + AMARILLO + fecha.getAnio());
            if (fecha.esBisiesto()) {
                System.out.print(VERDE + " es bisiesto.");
            } else {
                System.out.print(ROJO + " no es bisiesto.");
            }
            System.out.println(RESET);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
        }
    }

    public static void comprobarIguales() {
        try {
            CalendarioExacto fecha1 = calendarios.get(pedirDato(Dato.Calendario));
            CalendarioExacto fecha2 = calendarios.get(pedirDato(Dato.Calendario2));
            System.out.print("Las fechas " + AZUL + fecha1.toString() + RESET + " y " + AMARILLO + fecha2.toString());
            if (fecha1.iguales(fecha2)) {
                System.out.print(VERDE + " son iguales.");
            } else {
                System.out.print(ROJO + " no son iguales.");
            }
            System.out.println(RESET);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
        }
    }

    public static void mostrarCalendario() {
        try {
            System.out.println(AZUL + calendarios.get(pedirDato(Dato.Calendario)).toString() + RESET);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
        }
    }

    //Método para el menú de modificaciones
    public static void modificar() {
        int menu = 1;
        char salir = 'n';
        CalendarioExacto fecha;
        do {
            if (menu == 0) {// Confirmación para salir del programa
                System.out.println("Has elegido volver, ¿estas seguro? (s/n)");
                salir = Character.toLowerCase(pedirLetra());
                menu++;
            } else {
                do {
                    opcionesModificar();
                    menu = pedirNum();
                    switch (menu) {
                        case 0:
                            continue;
                        case 1:
                            try {
                            fecha = calendarios.get(pedirDato(Dato.Calendario));
                            fecha.incrementarMinuto();
                            System.out.println("Se ha incrementado un minuto, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
                        }
                        break;
                        case 2:
                            try {
                            fecha = calendarios.get(pedirDato(Dato.Calendario));
                            fecha.incrementarHora();
                            System.out.println("Se ha incrementado una hora, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
                        }
                        break;
                        case 3:
                            try {
                            fecha = calendarios.get(pedirDato(Dato.Calendario));
                            fecha.incrementarDia();
                            System.out.println("Se ha incrementado un día, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
                        }
                        break;
                        case 4:
                            try {
                            fecha = calendarios.get(pedirDato(Dato.Calendario));
                            fecha.incrementarMes();
                            System.out.println("Se ha incrementado un mes, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
                        }
                        break;
                        case 5:
                            try {
                            fecha = calendarios.get(pedirDato(Dato.Calendario));
                            System.out.println("Indica la cantidad de años a incrementar:");
                            int incremento = pedirNum();
                            fecha.incrementarAnio(incremento);
                            if (incremento > 1) {
                                System.out.println("Se han incrementado " + AMARILLO + incremento + RESET + " años, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                            } else if (incremento == 1) {
                                System.out.println("Se ha incrementado " + AMARILLO + "1" + RESET + " año, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                            } else if (incremento == -1) {
                                System.out.println("Se ha decrementado " + AMARILLO + "1" + RESET + " año, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                            } else if (incremento < -1) {
                                System.out.println("Se han decrementado " + AMARILLO + incremento + RESET + " años, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                            } else {
                                System.out.println("No se ha incrementado ningún año, el resultado es:\n" + AZUL + fecha.toString() + RESET);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO + "¡La posición indicada no es válida! Te devuelvo al menú..." + RESET);
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
}
