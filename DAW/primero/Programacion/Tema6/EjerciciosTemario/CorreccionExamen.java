
//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class CorreccionExamen {
	static Scanner teclado = new Scanner(System.in);
	static String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
	static String mayusNum[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	public static final String ROJO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String AZUL = "\u001B[34m";
	public static final String RESET = "\u001B[0m";
	static String colores[] = {ROJO, VERDE, AMARILLO, AZUL};

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
					teclado.nextLine();
					switch (menu) {
						case 0:
							continue;
						case 1:
							codificarMorse();
							break;
						case 2:
							descodificarMorse();
							break;
						case 3:
							tablaPalabras();
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
		System.out.println("###########################################################################");
		System.out.println("# Bienvenido a al examen de Daniel, elige una de las siguientes opciones: #");
		System.out.println("# [1] Codificar frase en español en código morse                          #");
		System.out.println("# [2] Descodificar frase en código morse al español                       #");
		System.out.println("# [3] Introducir una frase y contar sus palabras por tamaño               #");
		System.out.println("# [0] Salir                                                               #");
		System.out.println("###########################################################################");
	}

	public static String pedirFrase() {
		return teclado.nextLine().trim();
	}

	public static void codificarMorse() {
		String frase = new String("");
		String codificada = new String("");
		System.out.println("Introduce una frase en español para codificarla en código morse:");
		frase = pedirFrase().toUpperCase();
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			codificada += colores[i%4];
			String[] letras = palabras[i].split("");
			for (int j = 0; j < letras.length; j++) {
				for (int k = 0; k < mayusNum.length; k++) {
					if (letras[j].equals(mayusNum[k])) {
						codificada += morse[k] + " ";
					}
				}
			}
			codificada += "  " + RESET;
		}
		System.out.println(codificada);
	}

	public static void descodificarMorse() {
		String codificada = new String("");
		String frase = new String("");
		System.out.println("Introduce una frase en código morse (cada letra separada por solo 1 espacio y cada palabra por 3 espacios) para descodificarla al español:");
		codificada = pedirFrase();
		String[] palabras = codificada.split("   ");
		for (int i = 0; i < palabras.length; i++) {
			String[] letras = palabras[i].split(" ");
			for (int j = 0; j < letras.length; j++) {
				for (int k = 0; k < morse.length; k++) {
					if (letras[j].equals(morse[k])) {
						frase += mayusNum[k];
					}
				}
			}
			frase += " ";
		}
		System.out.println(frase);
	}

	public static void tablaPalabras() {
		String frase;
		String palabras[];
		int longitudes[] = new int[24];
		for (int i = 0; i < longitudes.length; i++) {
			longitudes[i] = 0;
		}
		System.out.println("Introduce una frase:");
		frase = pedirFrase();
		palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			longitudes[palabras[i].length()]++;
		}
		for (int i = 1; i < longitudes.length; i++) {
			if (longitudes[i] == 0) {
				continue;
			} else {
				System.out.println("Palabras con " + (i) + " letras: " + longitudes[i]);
			}
		}
	}

}// Fin clase