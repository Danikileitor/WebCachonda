//Daniel Marcos Guerra Gómez
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class TryCatchFinally {
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
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Hola mundo                                                                #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static char pedirLetra() {
		return teclado.next().charAt(0);
	}

	public static int pedirNum() {
		boolean error;
		int num = 0;
		do {
			error = false;
			try {
				num = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("¡Escribe un número entero!");
				error = true;
			}
			teclado.nextLine();
		} while (error);
		return num;
	}

}// Fin clase