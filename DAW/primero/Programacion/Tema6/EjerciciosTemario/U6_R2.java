//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U6_R2 {
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
							mostrarMensaje(mensaje);
							mostrarMensaje(cadena);
							mostrarMensaje(frase);
							break;
						case 2:
							usarValueOf();
							break;
						case 3:
							String cad1 = new String("Esta es mi primera cadena");
							String cad2 = new String("Esta es mi PRIMERA cadena");
							comparar(cad1,cad2);
							break;
						case 4:
							boolean resultado;
							frase1 = pedirFrase();
							frase2 = pedirFrase();
							resultado = frase1.regionMatches(3, frase2, 10, 5);
							System.out.println(String.valueOf(resultado));
							break;
						case 5:
							frase1 = pedirFrase();
							frase2 = pedirFrase();
							System.out.println(frase1 + frase2);
							System.out.println(frase1.concat(frase2));
							break;
						case 6:
							frase = pedirFrase();
							buscar(frase);
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
		System.out.printf("%n#################################################################################%n# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #%n# [1] Mostrar las String con un método                                          #%n# [2] Usar el método valueOf()                                                  #%n# [3] Usar el método equals()                                                   #%n# [4] Usar el método regionMatches()                                            #%n# [5] Concatenar cadenas usando concat()                                        #%n# [6] Buscar en una frase                                                       #%n# [0] Salir                                                                     #%n#################################################################################%n");
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

}// Fin clase