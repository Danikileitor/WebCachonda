//Daniel Marcos Guerra Gómez
import java.util.Arrays;
import java.util.Scanner; //Importación de paquetes

public class U6_R3 {
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
							System.out.printf("Este sería el resultado si eliminamos las vocales: %s.%n", quitarVocales(pedirFrase()));
							break;
						case 2:
							System.out.printf("El número de ocasiones en que aparece la palabra es: %d.%n", contarPalabra(pedirFrase(), pedirFrase()));
							break;
						case 3:
							System.out.printf("¿La frase introducida es un palíndromo? %s.%n", comprobarPalindromo(pedirFrase()));
							break;
						case 4:
							System.out.printf("El resultado de la codificación es: %s.%n", codificar(pedirFrase()));
							break;
						case 5:
							System.out.printf("¿Las palabras introducidas son anagramas? %s.%n", comprobarAnagrama(pedirFrase(), pedirFrase()));
							break;
						case 6:
							dividirPalabra(pedirFrase());
							break;
						case 7:
							System.out.printf("La frase en nomenclatura Camel es: %s.%n", camel(pedirFrase()));
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
		System.out.println("# [1] Pedir un nombre y mostrarlo sin vocales                                   #");
		System.out.println("# [2] Pedir un frase y palabra para buscar cuantas veces aparece en la frase    #");
		System.out.println("# [3] Pedir un frase y comprobar si es un palíndromo                            #");
		System.out.println("# [4] Ej 6.11                                                                   #");
		System.out.println("# [5] Ej 6.12                                                                   #");
		System.out.println("# [6] Ej 6.17                                                                   #");
		System.out.println("# [7] Ej 6.18                                                                   #");
		System.out.println("# [8] Ej 6.19                                                                   #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static String pedirFrase() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase o palabra:");
		return teclado.nextLine().trim();
	}

	public static String quitarVocales(String palabra) {
		String cad = palabra.replace("A", "");
		cad = cad.replace("a", "");
		cad = cad.replace("E", "");
		cad = cad.replace("e", "");
		cad = cad.replace("i", "");
		cad = cad.replace("i", "");
		cad = cad.replace("O", "");
		cad = cad.replace("o", "");
		cad = cad.replace("U", "");
		cad = cad.replace("u", "");
		return cad;
	}

	public static int contarPalabra(String frase, String palabra) {
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.startsWith(palabra, i)) {
				contador++;
			}
		}
		return contador;
	}

	public static boolean comprobarPalindromo(String cadena) {
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		return cadena.equals(invertida);
	}

	public static String codificar(String cadena) {
		String codificado = "";
		char codificando[] = cadena.toLowerCase().toCharArray();
		char clave1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char clave2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		for (int i = 0; i < codificando.length; i++) {
			for (int j = 0; j < clave1.length; j++) {
				if (codificando[i] == clave1[j]) {
					codificando[i] = clave2[j];
					break;
				}
			}
			codificado += codificando[i];
		}
		return codificado;
	}

	public static boolean comprobarAnagrama(String cad1, String cad2) {
		char c1[] = cad1.toLowerCase().toCharArray();
		char c2[] = cad2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

	public static void dividirPalabra(String cadena) {
		int longitud;
		String aux = cadena;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el tamaño de cada división:");
		longitud = teclado.nextInt();
		while (aux.length() > longitud) {
			System.out.println("\t" + aux.substring(0, longitud));
			aux = aux.substring(longitud);
		}
		System.out.println("\t" + aux + "\n");
	}

	public static String camel(String cadena) {
		String camel = cadena.toLowerCase();
		for (int i = 0; i < camel.length(); i++) {
			if (camel.charAt(i) == ' ') {
				camel = camel.substring(0, i) + camel.substring(i+1, i+2).toUpperCase() + camel.substring(i+2);
			}
		}
		return camel;
	}

}// Fin clase