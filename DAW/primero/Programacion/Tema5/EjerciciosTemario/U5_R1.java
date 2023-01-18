//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U5_R1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1;
		char salir = 'n';
		// Desarrollo del programa
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(teclado.next().charAt(0));
				menu++;
			} else {
				do {
					menu();
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							int edades[] = crearVectorEnteros();
							System.out.println("Las edades de los alumnos son:");
							mostrarVector(edades);
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static void menu() {
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Crear vector para almacenar edades                                        #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static int[] crearVectorEnteros() {
		int rango, edad;
		System.out.println("Indica su rango:");
		rango = teclado.nextInt();
		int edades[] = new int[rango];
		for (int i = 0; i < edades.length; i++) {
			System.out.printf("Indica el valor del índice [%d]:%n",i);
			edad = teclado.nextInt();
			edades[i] = edad;
		}
		return edades;
	}

	public static void mostrarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("[%d] ",vector[i]);
		}
		System.out.println("\n");
	}

}// Fin clase