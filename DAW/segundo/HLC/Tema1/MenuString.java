//Daniel Marcos Guerra Gómez
import java.util.Scanner;

public class MenuString {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		String cadena = "";
		String menu = "";
		do {
			System.out.println("Introduce una cadena:");
			cadena = pedirCadena();
			opcionesMenu();
			menu = pedirCadena();
			if (menu.equals("salir")) {
				break;
			} else {
				switch (Integer.parseInt(menu)) {
					case 1:
						mostrarAlReves(cadena);
						break;
					case 2:
						contarVocales(cadena);
						break;
					case 3:
						contarConsonantes(cadena);
						break;
					case 4:
						pasarMinuscula(cadena);
						break;
					case 5:
						pasarMayuscula(cadena);
						break;
					case 6:
						comprobarPalindromo(cadena);
						break;
					default:
						System.out.println("¡Introduce una opción válida!");
						break;
				}
			}
		} while (menu != "salir");
	}

	public static void opcionesMenu() {
		System.out.println("################################################");
		System.out.println("# Elige una opción o escribe [salir]:          #");
		System.out.println("# [1] Mostrarla al revés                       #");
		System.out.println("# [2] Contar el nº de vocales                  #");
		System.out.println("# [3] Contar el nº de consonantes              #");
		System.out.println("# [4] Pasar todo a minúscula                   #");
		System.out.println("# [5] Pasar todo a mayúscula                   #");
		System.out.println("# [6] Decir si es palíndroma                   #");
		System.out.println("################################################");
	}

	public static String pedirCadena() {
		return teclado.nextLine();
	}

	public static void mostrarAlReves(String cadena){
		System.out.println(new StringBuilder(cadena).reverse().toString());
	}

	public static void contarVocales(String cadena){
		int vocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				vocales++;
			}
		}
		System.out.println("La cantidad de vocales que tiene la cadena es de: " + vocales);
	}

	public static void contarConsonantes(String cadena){
		int consonantes = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				continue;
			}
			consonantes++;
		}
		System.out.println("La cantidad de consonantes que tiene la cadena es de: " + consonantes);
	}

	public static void pasarMinuscula(String cadena){
		System.out.println(cadena.toLowerCase());
	}

	public static void pasarMayuscula(String cadena){
		System.out.println(cadena.toUpperCase());
	}

	public static void comprobarPalindromo(String cadena){
		boolean palindromo = true;
		for (int i = 0, j = cadena.length() - 1; i < j; i++, j--)
        {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                palindromo = false;
            }
        }
		if (palindromo) {
			System.out.println("La cadena es palíndroma");
		} else {
			System.out.println("La cadena no es palíndroma");
		}
	}

}