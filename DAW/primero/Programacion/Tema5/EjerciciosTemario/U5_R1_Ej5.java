
//Daniel Marcos Guerra Gómez
import java.util.Arrays;
import java.util.Scanner; //Importación de paquetes

public class U5_R1_Ej5 {
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
							ejercicio1();
							break;
						case 2:
							ejercicio2();
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
		System.out.println("# [1] Crear un array con 100 enteros aleatorios y ordenarlos                    #");
		System.out.println("# [2] Echar un boleto de la primitiva                                           #");
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
		int numeros[] = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio(5, 105);
		}
		System.out.print("Los números generados son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " / ");
		}
		System.out.println();
		Arrays.sort(numeros);
		System.out.print("Los números ordenados de menor a menor son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " / ");
		}
		System.out.println();
		System.out.print("Los números ordenados de mayor a menor son: ");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " / ");
		}
		System.out.println();
	}

	public static void ejercicio2() {
		//metodo que recibe 2 enteros, uno se pide al usuario y otro son 6 números generados de forma aleatoria de rango [0, 50] que se corresponden con el número ganador de la primitiva.
		//devolver el número de aciertos del usuario, ningún array puede tener números repetidos
		int boleto[] = new int[6];
		int ganador[] = new int[6];
		for (int i = 0; i < ganador.length; i++) {
			do {
				ganador[i] = generarAleatorio(0, 50);
			} while (estaRepetido(ganador[i], ganador, i));
		}
		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = 51+i;
		}
		System.out.println("Para participar en la primitiva, indique los 6 números con los que participarás:");
		for (int i = 0; i < boleto.length; i++) {
			do {
				System.out.println("Introduzca su número [" + (i+1) + "] del 0 al 50:");
				boleto[i] = pedirNum();
			} while (boleto[i] < 0 || boleto[i] > 50 || estaRepetido(boleto[i], boleto, i));
		}
		System.out.println();
	}

	public static boolean estaRepetido(int numero, int[] numeros, int pos) {
		boolean repetido = false;
		for (int i = 0; i < numeros.length; i++) {
			if (i == pos) {
				continue;
			}
			if (numero == numeros[i]) {
				repetido = true;
			}
		}
		return repetido;
	}

}// Fin clase