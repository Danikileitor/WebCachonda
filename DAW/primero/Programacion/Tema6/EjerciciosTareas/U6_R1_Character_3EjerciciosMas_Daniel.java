//Daniel Marcos Guerra Gómez
//Implementa un menú recursivo con confirmación de salida. Donde en una de las opciones generes números aleatorios (enteros positivos) y compruebes a que símbolo corresponde. Para ello debes usar la clase Character.
import java.util.Scanner; //Importación de paquetes

public class U6_R1_Character_3EjerciciosMas_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1, digito;
		char salir = 'n', a, b;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = teclado.next().charAt(0);
				menu++;
			} else {
				do {
					System.out.printf("%n#################################################################################%n# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #%n# [1] Generar 10 símbolos aleatorios                                            #%n# [2] Comprobar si 2 caracteres son iguales                                     #%n# [3] Convertir un dígito a caracter y vicecersa                                #%n# [4] Realizar comprobaciones sobre un caracter                                 #%n# [0] Salir                                                                     #%n#################################################################################%n");
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							System.out.println("Los 10 símbolos aleatorios generados son:");
							for (int i = 0; i < 10; i++) {
								char c = (char) generarAleatorio(21, 126);
								System.out.print(c + " ");
							}
							System.out.println();
							break;
						case 2:
							System.out.println("Introduce el primer caracter:");
							a = teclado.next().charAt(0);
							System.out.println("Introduce el segundo caracter:");
							b = teclado.next().charAt(0);
							if (comprobarIgual(a, b)) {
								System.out.printf("Los caracteres %s y %s son iguales.%n", a, b);
							} else {
								System.out.printf("Los caracteres %s y %s no son iguales.%n", a, b);
							}
							break;
						case 3:
							System.out.println("Introduce un dígito");
							digito = teclado.nextInt();
							System.out.println("Introduce un caracter");
							a = teclado.next().charAt(0);
							System.out.printf("El dígito [%d] convertido a caracter es [%s] y el caracter [%s] convertido en dígito es [%d].%n", digito, convertir(digito), a, convertir(a));
							break;
						case 4:
							System.out.println("Introduce un caracter");
							a = teclado.next().charAt(0);
							System.out.printf("¿[%s] está definido? %b%n", a, Character.isDefined(a));
							System.out.printf("¿[%s] es un dígito? %b%n", a, Character.isDigit(a));
							System.out.printf("¿[%s] es el primer caracter de un identificador de Java? %b%n", a, Character.isJavaIdentifierStart(a));
							System.out.printf("¿[%s] es una letra? %b%n", a, Character.isLetter(a));
							System.out.printf("¿[%s] es una letra o un dígito? %b%n", a, Character.isLetterOrDigit(a));
							System.out.printf("¿[%s] está en minúscula? %b%n", a, Character.isLowerCase(a));
							System.out.printf("¿[%s] está en mayúscula? %b%n", a, Character.isUpperCase(a));
							System.out.printf("[%s] pasado a mayúscula es [%s].%n", a, Character.toUpperCase(a));
							System.out.printf("[%s] pasado a minúscula es [%s].%n", a, Character.toLowerCase(a));
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static boolean comprobarIgual(char a, char b) {
		return a == b;
	}

	public static int convertir(char a) {
		return Character.digit(a, 10);
	}

	public static char convertir(int n) {
		return Character.forDigit(n, 10);
	}

}// Fin clase