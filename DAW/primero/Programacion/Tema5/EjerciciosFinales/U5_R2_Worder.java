//Daniel Marcos Guerra Gómez
//Aparte añadir un segundo ejercicio con un array bidimensional que sea un cuadrado cuya diagonal sea 1 y el resto de casillas random (2-20)
import java.util.Scanner; //Importación de paquetes

public class U5_R2_Worder {
	static Scanner teclado = new Scanner(System.in);
	static final String GRIS = "\u001B[90m";
	static final String VERDE = "\u001B[32m";
	static final String AMARILLO = "\u001B[33m";
	static final String AZUL = "\u001B[34m";
	static final String RESET = "\u001B[0m";
	static String[] palabras = new String[366];
	static int totalPalabras;

	public static void main(String[] args) {
		generarAlmacen();
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(teclado.next().charAt(0));
				teclado.nextLine();
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = teclado.nextInt();
					teclado.nextLine();
					switch (menu) {
						case 0:
							continue;
						case 1:
							insertarPalabras();
							break;
						case 2:
							jugar();
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
		System.out.println("# Bienvenido a este maravilloso juegardo, elige una de las siguientes opciones: #");
		System.out.println("# [1] Insertar palabras                                                         #");
		System.out.println("# [2] Jugar                                                                     #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static void generarAlmacen() {
		palabras[0] = "BAJAR";
		palabras[1] = "AHORA";
		palabras[2] = "PABLO";
		palabras[3] = "COGER";
		palabras[4] = "VERSO";
		totalPalabras = 5;
	}

	public static void limpiar() {
		for (int i = 0; i < 24; i++) {
			System.out.println();
		}
	}

	public static String pedirPalabra() {
		return teclado.nextLine().trim().toUpperCase();
	}

	public static String palabraAleatoria() {
		return palabras[generarAleatorio(0, totalPalabras-1)];
	}

	public static void insertarPalabras() {
		String palabra = "";
		do {
			System.out.println("Inserta una palabra de 5 letras para añadirla al almacén de palabras (F para salir)");
			palabra = pedirPalabra();
			if (!palabra.equals("F") && palabra.length() != 5) {
				do {
					System.out.println("¡La palabra ha de ser de 5 letras!");
					palabra = pedirPalabra();
				} while (!palabra.equals("F") && palabra.length() != 5);
			}
			if (!palabra.equals("F")) {
				addPalabra(palabra);
			}
		} while (!palabra.equals("F"));
	}

	public static void addPalabra(String palabra) {
		if (totalPalabras != 366) {
			palabras[totalPalabras] = palabra;
			totalPalabras++;
			System.out.printf("Se ha añadido la palabra [%s] al almacén de palabras.%n", palabra);
		} else {
			System.out.println("¡El almacén ha alcanzado el límite de palabras!");
		}
	}

	public static void jugar() {
		String secreta = palabraAleatoria();
		String palabra = "";
		String intentos[] = new String[6];
		int intento = 0;
		limpiar();
		while (!secreta.equals(palabra) && intento < 6) {
			intento++;
			do {
				palabra = pedirPalabra();
			} while (palabra.length() != 5);
			intentos[intento-1] = palabra;
			if (!secreta.equals(palabra)) {
				darPista(secreta, intentos, intento);
			}
		}
		if (secreta.equals(palabra)) {
			darPista(secreta, intentos, intento);
			victoria(secreta, intento);
		} else {
			derrota(secreta);
		}
	}

	public static void darPista(String secreta, String[] intentos, int intento) {
		limpiar();
		for (int i = 0; i < intento; i++) {
			colorear(secreta, intentos[i]);
		}
	}

	public static void colorear(String secreta, String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if (secreta.indexOf(palabra.charAt(i)) != -1) {
				if (palabra.charAt(i) == secreta.charAt(i)) {
					System.out.print(VERDE + palabra.charAt(i));
				} else {
					System.out.print(AMARILLO + palabra.charAt(i));
				}
			} else {
				System.out.print(GRIS + palabra.charAt(i));
			}
		}
		System.out.println(RESET);
	}

	public static void victoria(String palabra, int intentos) {
		System.out.printf("¡Enhorabuena! Has adivinado la palabra [%s] en [%d] intentos.%n", palabra, intentos);
	}

	public static void derrota(String palabra) {
		System.out.printf("¡Has superado el límite de intentos! La palabra era [%s]%n", palabra);
	}

}// Fin clase