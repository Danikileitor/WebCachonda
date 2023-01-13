//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U6_R2_Ej12 {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
		String mensaje = "Hola caracola";
		String cadena, frase1, frase2;
		cadena = new String("Esto es un ejemplo");
		String frase = new String("Clase de 1º DAW");
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
							ahorcado(pedirFrase());
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

	public static void usarValueOf() {
		String miCadena = new String("");
		miCadena = String.valueOf(-5);
		System.out.println("Mostramos la conversión de un entero:\t" + miCadena);
		miCadena = String.valueOf('W');
		System.out.println("Mostramos la conversión de un caracter:\t" + miCadena);
		miCadena = String.valueOf(true);
		System.out.println("Mostramos la conversión de un booleano:\t" + miCadena);
	}

	public static void comparar(String primera, String segunda) {
		boolean valor;
		String mensaje = "";
		valor = primera.equals(segunda);
		mensaje = String.valueOf(valor);
		System.out.println("Primera cadena: " + primera + "\nSegunda cadena: " + segunda + "\n¿Son iguales? " + mensaje);
		valor = primera.equalsIgnoreCase(segunda);
		mensaje = String.valueOf(valor);
		System.out.println("Primera cadena: " + primera + "\nSegunda cadena: " + segunda + "\n¿Son iguales? " + mensaje);
	}

	public static String pedirFrase() {
		Scanner teclado = new Scanner(System.in);
		String cad = "";
		System.out.println("Dame una frase");
		cad = teclado.nextLine();
		return cad;
	}

	public static void buscar(String cadena) {
		Scanner teclado = new Scanner(System.in);
		String c;
		int pos;
		System.out.println("Introduce la letra o frase que deseas buscar:");
		c = teclado.nextLine();
		pos = cadena.indexOf(c);
		System.out.printf("En la frase '%s', [%s] aparece por primera vez en la posición %d.%n",cadena,c,pos);
	}

	public static void buscarTodo(String cadena) {
		Scanner teclado = new Scanner(System.in);
		String c;
		int pos, cantidad=0;
		System.out.println("Introduce la letra o frase que deseas buscar:");
		c = teclado.nextLine();
		for(int i=0; i<cadena.lastIndexOf(c); i = pos+1){
			pos = cadena.indexOf(c,i);
			cantidad++;
		}
		System.out.printf("En la frase '%s', [%s] aparece en %d ocasiones.%n",cadena,c,cantidad);
	}

	public static void limpiar() {
		System.out.println("\n\n\n\n\n\n\n\n\n");
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
			intento = teclado.nextLine().charAt(0);
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