
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
							int edades[] = crearVector2DEnteros();
							System.out.print("Las edades de los alumnos son:" );
							mostrarVector2D(edades);
							System.out.println();
							break;
						case 2:
							char letras[] = crearVector2DLetras();
							System.out.print("Las letras introducidas son:" );
							mostrarVector2D(letras);
							System.out.println();
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
		System.out.println("# [2] Crear vector para almacenar letras                                        #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static int[] crearVector2DEnteros() {
		int rango, valor;
		System.out.println("Indica su rango:");
		rango = teclado.nextInt();
		int vector[] = new int[rango];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Indica el valor del índice [%d]:%n", i);
			valor = teclado.nextInt();
			vector[i] = valor;
		}
		return vector;
	}

	public static char[] crearVector2DLetras() {
		int rango;
		char letra;
		System.out.println("Indica su rango:");
		rango = teclado.nextInt();
		char vector[] = new char[rango];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Indica la letra para el índice [%d]:%n", i);
			letra = teclado.next().charAt(0);
			vector[i] = letra;
		}
		return vector;
	}

	public static void mostrarVector2D(int[] vector) {
		System.out.print("{");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i < vector.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

	public static void mostrarVector2D(char[] vector) {
		System.out.print("{");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i < vector.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

}// Fin clase