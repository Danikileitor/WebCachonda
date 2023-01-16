//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U6_R2_Ej12 {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
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
							System.out.println("Turno del jugador A");
							ahorcado(pedirFraseMayus());
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
		System.out.printf("%n#################################################################################%n# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #%n# [1] El juego del ahorcado                                                     #%n# [0] Salir                                                                     #%n#################################################################################%n");
	}

	public static void mostrarMensaje(String miCadena) {
		System.out.println("##### Vemos el contenido #####");
		System.out.println(miCadena);
	}

	public static String pedirFraseMayus() {
		Scanner teclado = new Scanner(System.in);
		String cad = "";
		System.out.println("Dame una frase");
		cad = teclado.nextLine().toUpperCase();
		return cad;
	}

	public static void limpiar() {
		for (int i = 0; i < 24; i++) {
			System.out.println();
		}
	}

	public static String preparar(String frase) {
		String preparado = new String("");
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				preparado += ' ';
			} else {
				preparado += '_';				
			}
		}
		return preparado;
	}

	public static void ahorcado(String fraseA) {
		boolean resuelto = false;
		char intento;
		int vidas = 7;
		String intentos = new String("");
		String progreso = new String(preparar(fraseA));
		Scanner teclado = new Scanner(System.in);
		limpiar();
		System.out.println("El jugador B tratará de adivinar la frase, ¡solo se permiten 7 fallos!.");
		do {
			System.out.println(progreso);
			System.out.println("Introduce una letra:");
			intento = Character.toUpperCase(teclado.nextLine().charAt(0));
			if (fraseA.indexOf(intento) >= 0 && intentos.indexOf(intento) < 0) {
				for (int i = 0; i < fraseA.length(); i++) {
					if (intento == fraseA.charAt(i)) {
						progreso = progreso.substring(0,i) + intento + progreso.substring(i+1);
					}
				}
				intentos += intento;
				resuelto = fraseA.equals(progreso);
			} else {
				vidas--;
				System.out.println("¡Fallo! La letra que has introducido no está en la frase o ya la introduciste anteriormente.");
				System.out.printf("¡Te quedan [%d] intentos!%n",vidas);
			}
			System.out.println();
		} while (!resuelto && vidas > 0);
		if (vidas > 0) {
			System.out.println(fraseA);
			System.out.println("¡Enhorabuena, has adivinado la frase del jugador A! El jugador B gana la partida.");
		} else {
			System.out.println("¡El jugador B se ha agotado todos sus intentos! El jugador A gana la partida.");
			System.out.println("La frase era: "+fraseA);
		}
	}

}// Fin clase