
//Daniel Marcos Guerra Gómez
/*1. Diseñar la función eco() a la que se le pasa como parámetro un numero n, y muestra por pantalla n-veces el mensaje " Eco....."
* 2. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
* 3. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
* 4. Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
* 5. Crea una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
* 6. Diseñar una función con el siguiente prototipo: boolean esPrimo(int n)  que devovlverá true si n es primo y false en caso contrario.*/
import java.util.Scanner; //Importación de paquetes

public class U4_R1_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu, n, m;
		char letra;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			System.out.printf("%n###############################################################################%n#Bienvenido a este maravilloso programa, elige una de las siguientes opciones:#%n#1.Hacer eco.                                                                 #%n#2.Calcular los números comprendidos entre 2 números.                         #%n#3.Calcular los números comprendidos entre 2 números.                         #%n#4.Comprobar el número mayor de entre 2 números.                              #%n#5.Comprobar si una letra es vocal.                                           #%n#6.Comprobar si un número es primo.                                           #%n#0.Salir                                                                      #%n###############################################################################%n");
			menu = teclado.nextInt();
			switch (menu) {
				case 0:
					break;
				case 1:
					System.out.println("Introduce un número entero:");
					n = teclado.nextInt();
					System.out.printf("Método 1: Eco..... %d veces:%n", n);
					eco(n);
					break;
				case 2:
					System.out.println("Introduce un número entero:");
					n = teclado.nextInt();
					System.out.println("Introduce otro número entero:");
					m = teclado.nextInt();
					comprendidos(n, m);
					break;
				case 3:
					System.out.println("Introduce un número entero:");
					n = teclado.nextInt();
					System.out.println("Introduce otro número entero:");
					m = teclado.nextInt();
					comprendidos(n, m);
					break;
				case 4:
					System.out.println("Introduce un número entero:");
					n = teclado.nextInt();
					System.out.println("Introduce otro número entero:");
					m = teclado.nextInt();
					System.out.printf("El número mayor entre %d y %d es %d.%n", n, m, mayor(n, m));
				case 5:
					System.out.println("Introduce una letra:");
					letra = teclado.next().charAt(0);
					System.out.println("¿La letra " + letra + " es una vocal? " + esVocal(letra));
				case 6:
					System.out.println("Introduce un número entero:");
					n = teclado.nextInt();
					System.err.println("¿El número " + n + " es primo? " + esPrimo(n));
				default:
					System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
					break;
			}// Fin switch
		} while (menu != 0);
	}// Fin main
	// 1 - Método eco
	public static void eco(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" Eco.....");
		}
		System.out.println();
	}// Fin método 1
	// 2 y 3 - Método para mostrar números comprendidos entre n y m
	public static void comprendidos(int n, int m) {
		if (m > n) {
			int aux = m;
			m = n;
			n = aux;
		}
		System.out.printf("Los números comprendidos entre %d y %d son:", n, m);
		for (int i = m; i <= n; i++) {
			System.out.printf(" %d", i);
		}
		System.out.println();
	}// Fin método 2 y 3
	// 4 - Método para calcular el número mayor
	public static int mayor(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}// Fin método 4
	// 5 - Método para comprobar si un char es vocal
	public static boolean esVocal(char letra) {
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			return true;
		} else {
			return false;
		}
	}// Fin método 5
	// 6 - Método para comprobar si n es primo
	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		int aux = 2;
		while (aux < n && esPrimo) {
			esPrimo = n % aux == 0 ? false : true;
			aux++;
		}
		return (esPrimo);
	}// Fin método 6
}// Fin clase