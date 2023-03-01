//Daniel Marcos Guerra Gómez
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class Logueo_Daniel {
    static Scanner teclado = new Scanner(System.in);

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
        do {
            try {
                num = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("¡Introduce un número!");
                teclado.nextLine();
                continue;
            }
        } while (true);
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
                    System.out.println("¡Incorrecto! Inténtelo de nuevo o introduzca [F] para salir.");
                }
                contador++;
            }
        } while (!validar(nif) && contador < 3 && !nif.equals("F"));
        if (validar(nif)) {
            System.out.println("Inicio de sesión correcto, lamentablemente no hay nada más en este programa por lo que te devuelvo al menú principal.");
        } else if (contador == 3) {
            System.out.println("Has superado el límite de intentos, has sido expulsado del inicio de sesión.");
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
        int numero = 0;
        switch (nif.charAt(0)) {
            case 'X': break;
            case 'Y': numero += 10000000; break;
            case 'Z': numero += 20000000; break;
            default: numero += ((int) nif.charAt(0)-48)*10000000; break;
        }
        numero += ((int) nif.charAt(1)-48)*1000000;
        numero += ((int) nif.charAt(2)-48)*100000;
        numero += ((int) nif.charAt(3)-48)*10000;
        numero += ((int) nif.charAt(4)-48)*1000;
        numero += ((int) nif.charAt(5)-48)*100;
        numero += ((int) nif.charAt(6)-48)*10;
        numero += (int) nif.charAt(7)-48;
        return numero;
    }

}// Fin clase