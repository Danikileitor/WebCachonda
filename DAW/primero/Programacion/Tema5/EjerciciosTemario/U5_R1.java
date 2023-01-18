
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
							int edades[] = crearVector1DEnteros();
							System.out.print("Las edades de los alumnos son:" );
							mostrarVector1D(edades);
							System.out.println();
							break;
						case 2:
							char letras[] = crearVector1DLetras();
							System.out.print("Las letras introducidas son:" );
							mostrarVector1D(letras);
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

	public static int[] crearVector1DEnteros() {
		int rango, valor;
		do {
			System.out.println("Indica un rango válido:");
			rango = teclado.nextInt();
		} while (rango <= 0);
		int vector[] = new int[rango];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Indica el valor del índice [%d]:%n", i);
			valor = teclado.nextInt();
			vector[i] = valor;
		}
		return vector;
	}

	public static char[] crearVector1DLetras() {
		int rango;
		char letra;
		do {
			System.out.println("Indica un rango válido:");
			rango = teclado.nextInt();
		} while (rango <= 0);
		char vector[] = new char[rango];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Indica la letra para el índice [%d]:%n", i);
			letra = teclado.next().charAt(0);
			vector[i] = letra;
		}
		return vector;
	}

	public static void mostrarVector1D(int[] vector) {
		System.out.print("{");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i < vector.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

	public static void mostrarVector1D(char[] vector) {
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