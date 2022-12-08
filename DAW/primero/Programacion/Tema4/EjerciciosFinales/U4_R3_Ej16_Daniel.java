//Daniel Marcos Guerra Gómez
//Implementa la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro.
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej16_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int numero;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Introduce un número entero y te indicaré todos sus divisores primos:");
		numero = teclado.nextInt();
		System.out.printf("Los divisores primos de %d son:%n",numero);
		divisoresPrimos(numero);
	}// Fin main

	public static void divisoresPrimos(int n) {
		for (int i=2;i<=n;i++){
			if (n%i==0 && esPrimo(i)) {
				System.out.println(i);	
			}
		}
	}

	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		int aux = 2;
		while (aux < n && esPrimo) {
			esPrimo = n % aux == 0 ? false : true;
			aux++;
		}
		return (esPrimo);
	}
}// Fin clase