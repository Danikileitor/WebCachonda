
//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U5_R6_Colores {
	static Scanner teclado = new Scanner(System.in);
	public static final String NEGRO = "\u001B[30m";
	public static final String BLANCO = "\u001B[37m";
	public static final String ROJO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String AZUL = "\u001B[34m";
	public static final String RESET = "\u001B[0m";

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
							ejercicio1();
							break;
						case 2:
							//ejercicio2();
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
		System.out.println();
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Array bidimensional                                                       #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}
	
	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static int pedirNum() {
		teclado.nextLine();
		return teclado.nextInt();
	}

	public static void ejercicio1() {
		int edades[][] = new int[4][5];
		inicializar(edades);
		mostrar(edades);
		filasAlternas(edades);
		columnasAlternas(edades);
		rellenarAleatorio(edades, 25, 100);
		columnasAlternas(edades);
		consultarPosicion(edades, 2, 3);
		consultarPares(edades);
	}

	public static void inicializar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i;
			}
		}
	}

	public static void rellenarAleatorio(int[][] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = generarAleatorio(min,max);
			}
		}
	}

	public static void mostrar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Fila "+i+":");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("\t" + array[i][j]);
			}
			System.out.println();
		}
	}

	public static void filasAlternas(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (i%2==0) {
				System.out.println(AZUL+"Fila "+i+":");
			} else {
				System.out.println(ROJO+"Fila "+i+":");
			}
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("\t" + array[i][j]);
			}
			System.out.println();
		}
		System.out.println(RESET);
	}

	public static void columnasAlternas(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(RESET+"Fila "+i+":");
			for (int j = 0; j < array[i].length; j++) {
				if (j%2==0) {
					System.out.print(AZUL);
				} else {
					System.out.print(ROJO);
				}
				System.out.print("\t" + array[i][j]);
			}
			System.out.println();
		}
		System.out.println(RESET);
	}

	public static void consultarPosicion(int[][] array, int fila, int columna) {
		System.out.println("El número en la posición ["+fila+"]"+"["+columna+"] es: "+AZUL+array[fila][columna]+RESET);		
	}

	public static void consultarPares(int[][] array) {
		System.out.print("Los números pares son: "+AZUL);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]%2==0) {
					System.out.print(array[i][j] + " / ");
				}
			}
		}
		System.out.print(RESET);
	}

}// Fin clase