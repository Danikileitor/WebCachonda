//Daniel Marcos Guerra Gómez
/* Desarrollar la cámara secreta que consiste en abrir una cámara mediante su combinación secreta que está formada por una combinación de dígitos de [1-5].
El jugador especificará cual es la longitud de la combinación (dificultad).
La aplicación genera de forma aleatoria una combinación secreta que el usuario tendrá que acertar.
En cada intento se muestra como pista para cada dígito de la combinación introducida por el jugador si es mayor, menor o igual que el correspondiente en la combinación secreta */
import java.util.Scanner; //Importación de paquetes

public class U5_R6_NoEsUnExamen_Daniel {
	static Scanner teclado = new Scanner(System.in);
	static boolean abierta = false;

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
							abrirCajaFuerte();
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
		System.out.println("########################################################################");
		System.out.println("# Bienvenido al banco de España, elige una de las siguientes opciones: #");
		System.out.println("# [1] Intentar abrir la caja fuerte                                    #");
		System.out.println("# [0] Salir                                                            #");
		System.out.println("########################################################################");
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static int pedirNum() {
		teclado.nextLine();
		return teclado.nextInt();
	}

	public static void abrirCajaFuerte() {
		int cajaFuerte[];
		abierta = false;
		System.out.println("Indica la longitud de la combinación:");
		cajaFuerte = generarCajaFuerte(pedirNum());
		do {
			intentarAbrirCajaFuerte(cajaFuerte);
		} while (abierta == false);
		System.out.printf("¡Enhorabuena, has conseguido robar un total de %d€!%n",generarAleatorio(1000, 1000000));
	}

	public static int[] generarCajaFuerte(int longitud) {
		int cajaFuerte[] = new int[longitud];
		for (int i = 0; i < cajaFuerte.length; i++) {
			cajaFuerte[i] = generarAleatorio(1, 5);
		}
		return cajaFuerte;
	}

	public static void intentarAbrirCajaFuerte(int[] cajaFuerte) {
		int intento[] = new int[cajaFuerte.length];
		System.out.println("Introduzca su combinación:");
		for (int i = 0; i < intento.length; i++) {
			do {
				System.out.printf("Introduzca el dígito número [%d]:%n", i + 1);
				intento[i] = pedirNum();
			} while (intento[i] < 1 || intento[i] > 5);
		}
		if (comprobarAbierta(cajaFuerte, intento)) {
			abierta = true;
		} else {
			darPista(cajaFuerte, intento);
		}
	}

	public static boolean comprobarAbierta(int[] cajaFuerte, int[] intento) {
		boolean estaAbierta = false;
		for (int i = 0; i < cajaFuerte.length; i++) {
			if (cajaFuerte[i] == intento[i]) {
				estaAbierta = true;
			} else {
				estaAbierta = false;
				break;
			}
		}
		return estaAbierta;
	}

	public static void darPista(int[] cajaFuerte, int[] intento) {
		System.out.println("Fallaste! Te doy una pista:");
		for (int i = 0; i < intento.length; i++) {
			if (cajaFuerte[i] > intento[i]) {
				System.out.printf("El dígito número [%d] es mayor.%n", i+1);
			} else if (cajaFuerte[i] < intento[i]) {
				System.out.printf("El dígito número [%d] es menor.%n", i+1);
			} else {
				System.out.printf("El dígito número [%d] es correcto.%n", i+1);
			}
		}
	}

}// Fin clase