//Daniel Marcos Guerra Gómez
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class Ordenar {
	static Scanner teclado = new Scanner(System.in);
	static String nombres[] = new String[3];

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
							insertarNombres(nombres);
							break;
						case 2:
							verNombres(nombres);
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
		System.out.println("# [1] Insertar 3 nombres                                                        #");
		System.out.println("# [2] Mostrar nombres                                                           #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static char pedirLetra() {
		return teclado.next().charAt(0);
	}

	public static String pedirNombre() {
		String nombre = teclado.nextLine().trim();
		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
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

	public static void ordenar(String[] nombres) {
		String aux;
		for (int i = 1; i < nombres.length; i++) {
			if (nombres[i].compareTo(nombres[i-1]) < 0) {
				aux = nombres[i];
				nombres[i] = nombres[i-1];
				nombres[i-1] = aux;
			}
		}
	}

	public static void insertarNombres(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Inserta un nombre:");
			nombres[i] = pedirNombre();
		}
		ordenar(nombres);
		System.out.println();
	}

	public static void verNombres(String[] nombres) {
		System.out.println("Lista de nombres:");
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] == null) {
				break;
			}
			System.out.printf("[%d]\t Nombre: %s%n", i + 1, nombres[i]);
		}
		System.out.println();
	}

}// Fin clase