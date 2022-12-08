//Daniel Marcos Guerra Gómez
/*Crea una función que muestre por consola una serie de números aleatorios enteros.
Los parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden tomar.*/
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej18_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int cantidad,minimo,maximo;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("¡Bienvenido al generador de números aleatorios RNG!");
		System.out.println("Introduce la cantidad de números aleatorios que quieres generar:");
		cantidad = teclado.nextInt();
		System.out.println("Introduce el valor mínimo:");
		minimo = teclado.nextInt();
		System.out.println("Introduce el valor máximo:");
		maximo = teclado.nextInt();
		System.out.printf("Voy a mostrar %d números aleatorios entre %d y %d:%n",cantidad,minimo,maximo);
		generarAleatorios(cantidad, minimo, maximo);
	}// Fin main

	public static void generarAleatorios(int cant, int min, int max) {
		for(int i=1;i<=cant;i++){
			System.out.printf("%.0f%n",Math.floor(Math.random()*(max-min+1)+min));
		}
	}

}// Fin clase