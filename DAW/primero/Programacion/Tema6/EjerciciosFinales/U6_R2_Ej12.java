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
							System.out.println("El jugador A introduce una palabra:");
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

	public static void ahorcado(String frase) {
		System.out.println();
	}

}// Fin clase