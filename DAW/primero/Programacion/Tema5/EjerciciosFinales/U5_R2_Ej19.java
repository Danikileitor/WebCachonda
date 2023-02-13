//Daniel Marcos Guerra Gómez
//Aparte añadir un segundo ejercicio con un array bidimensional que sea un cuadrado cuya diagonal sea 1 y el resto de casillas random (2-20)
import java.util.Scanner; //Importación de paquetes

public class U5_R2_Ej19 {
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
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							carrera();
							break;
						case 2:
							cuadrado();
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static void opcionesMenu() {
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Carrera San Silvestre                                                     #");
		System.out.println("# [2] Generar un array bidimensional con forma cuadrada                         #");
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

	public static void carrera() {
		System.out.println("Vaya introduciendo los dorsales de los participantes según su llegada a meta, introduce [-1] para finalizar");
		int dorsal;
		String dorsales = "", clasificacion[];
		do {
			System.out.println("Introduce el siguiente dorsal:");
			dorsal = pedirNum();
			if (dorsal == -1) {
				break;
			}
			dorsales += dorsal + " ";
		} while (dorsal != -1);
		// Generamos la tabla de clasificación:
		clasificacion = dorsales.split(" ");
		// Comprobamos edad:
		System.out.println("Introduca los dorsales de los participantes menores de edad, introduce [-1] para finalizar");
		for (int i = 0; i < clasificacion.length; i++) {
			System.out.println("Introduce el siguiente dorsal:");
			dorsal = pedirNum();
			if (dorsal == -1) {
				break;
			}
			actualizarMenor(clasificacion, dorsal);
		}
		// Comprobar doping:
		System.out.println("Introduca los dorsales de los participantes que hayan dado positivo en el test antidopaje, introduce [-1] para finalizar");
		for (int i = 0; i < clasificacion.length; i++) {
			System.out.println("Introduce el siguiente dorsal:");
			dorsal = pedirNum();
			if (dorsal == -1) {
				break;
			}
			clasificacion = expulsar(clasificacion, dorsal);
		}
		// Comprobar moroso:
		System.out.println("Introduca los dorsales de los participantes que no pagaron su inscripción, introduce [-1] para finalizar");
		for (int i = 0; i < clasificacion.length; i++) {
			System.out.println("Introduce el siguiente dorsal:");
			dorsal = pedirNum();
			if (dorsal == -1) {
				break;
			}
			clasificacion = moverImpagos(clasificacion, dorsal);
		}
		// Resultado
		System.out.println("El resultado final de la clasificación es:");
		for (int i = 0; i < clasificacion.length; i++) {
			System.out.println(clasificacion[i]);
		}
	}

	public static void actualizarMenor(String[] clasificacion, int dorsal) {
		String aux = "", aux2;
		aux += dorsal;
		for (int i = 0; i < clasificacion.length; i++) {
			if (clasificacion[i].equals(aux) && i != 0) {
				aux2 = clasificacion[i - 1];
				clasificacion[i - 1] = aux;
				clasificacion[i] = aux2;
				break;
			}
		}
	}

	public static String[] expulsar(String[] clasificacion, int dorsal) {
		int pos = 0;
		String aux = "", clasificacionNueva[] = new String[clasificacion.length - 1];
		aux += dorsal;
		for (int i = 0; i < clasificacionNueva.length; i++) {
			if (clasificacion[i].equals(aux)) {
				pos++;
			}
			clasificacionNueva[i] = clasificacion[i + pos];
		}
		return clasificacionNueva;
	}

	public static String[] moverImpagos(String[] clasificacion, int dorsal) {
		int pos = 0;
		String aux = "", clasificacionNueva[] = new String[clasificacion.length];
		aux += dorsal;
		for (int i = 0; i < clasificacionNueva.length - 1; i++) {
			if (clasificacion[i].equals(aux)) {
				pos++;
			}
			clasificacionNueva[i] = clasificacion[i + pos];
		}
		clasificacionNueva[clasificacionNueva.length - 1] = aux;
		return clasificacionNueva;
	}

	public static void cuadrado() {
		int cuadrado[][], longitud;
		System.out.println("Introduzca la longitud de uno de los lados del cuadrado:");
		longitud = pedirNum();
		cuadrado = new int[longitud][longitud];
		generarCuadrado(cuadrado);
		mostrarCuadrado(cuadrado);
	}

	public static void generarCuadrado(int[][] cuadrado) {
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado.length; j++) {
				if (i == j) {
					cuadrado[i][j] = 1;
				} else {
					cuadrado[i][j] = generarAleatorio(2, 20);
				}
			}
		}
	}
	
	public static void mostrarCuadrado(int[][] cuadrado) {
		System.out.println("El cuadrado:");
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado.length; j++) {
				System.out.print("\t" + cuadrado[i][j] + " ");
			}
			System.out.println();
		}
	}

}// Fin clase