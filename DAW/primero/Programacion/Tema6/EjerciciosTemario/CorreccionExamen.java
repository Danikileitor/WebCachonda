
//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class CorreccionExamen {
	static String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
	static String mayusNum[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
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

	public static void codificarMorse() {
		String frase = new String("");
		String codificada = new String("");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase en español para codificarla en código morse:");
		frase = teclado.nextLine().trim().toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
				i++;
			}
			codificada += morse[mayusNum.toString().indexOf(frase.charAt(i))];
			codificada += "   ";
		}
		System.out.println(codificada.trim());
	}

	public static void descodificarMorse() {
		String codificada = new String("");
		String frase = new String("");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase en código morse (cada código separado por solo 1 espacio) para descodificarla al español:");
		codificada = teclado.nextLine().trim();
		String[] palabras = codificada.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (palabras[i].equals(morse[j])) {
					frase += mayusNum[j];
				}
			}
			if (palabras[i].equals(" ")) {
				frase += " ";
			}
		}
		System.out.println(frase);
	}

	public static void tablaPalabras() {
		String frase = new String("");
		Scanner teclado = new Scanner(System.in);
		int longitud = 0;
		int longitudes[] = new int[8];
		for (int i = 0; i < longitudes.length; i++) {
			longitudes[i] = 0;
		}
		System.out.println("Introduce una frase:");
		frase = teclado.nextLine().trim();
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
				longitudes[longitud]++;
				longitud = -1;
			}
			longitud++;
		}
		frase = frase.substring(frase.lastIndexOf(' '));
		longitudes[frase.length() + 1]++;
		for (int i = 1; i < longitudes.length; i++) {
			System.out.println("Palabras con " + (i) + " letras: " + longitudes[i]);
		}
	}

}// Fin clase