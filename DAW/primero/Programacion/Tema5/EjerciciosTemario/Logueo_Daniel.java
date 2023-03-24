//Daniel Marcos Guerra Gómez
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class Logueo_Daniel {
    static Scanner teclado = new Scanner(System.in);
    static final String ROJO = "\u001B[31m";
	static final String VERDE = "\u001B[32m";
	static final String RESET = "\u001B[0m";

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(teclado.next().charAt(0));
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = pedirNum();
					switch (menu) {
						case 0:
							continue;
						case 1:
							login();
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
		System.out.println("# [1] Iniciar sesión                                                            #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

    public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }

    public static String pedirNIF() {
        return teclado.nextLine();
    }

    public static void login() {
        String nif;
        int contador = 0;
        do {
            System.out.println("Introduzca su NIF/NIE:");
            nif=pedirNIF().trim().toUpperCase();
            if (!validar(nif) && !nif.equals("F")) {
                if (contador < 2) {
                    System.out.println(ROJO + "¡Incorrecto! Inténtelo de nuevo o introduzca [F] para salir." + RESET);
                }
                contador++;
            }
        } while (!validar(nif) && contador < 3 && !nif.equals("F"));
        if (validar(nif)) {
            System.out.println(VERDE + "Inicio de sesión correcto, lamentablemente no hay nada más en este programa por lo que te devuelvo al menú principal." + RESET);
        } else if (contador == 3) {
            System.out.println(ROJO + "Has superado el límite de intentos, has sido expulsado del inicio de sesión." + RESET);
        } else {
            System.out.println("Volviendo al menú principal...");
        }
    }

    public static boolean validar(String nif) {
        boolean valido = false;
        char control[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        if (nif.length() == 9 && nif.charAt(8) == control[calcularNum(nif)%23]) {
            valido = true;
        }
        return valido;
    }

    public static int calcularNum(String nif) {
        switch (nif.charAt(0)) {
            case 'X': nif = '0' + nif.substring(1); break;
            case 'Y': nif = '1' + nif.substring(1); break;
            case 'Z': nif = '2' + nif.substring(1); break;
            default: break;
        }
        return Integer.parseInt(nif.substring(0, 8));
    }

}// Fin clase