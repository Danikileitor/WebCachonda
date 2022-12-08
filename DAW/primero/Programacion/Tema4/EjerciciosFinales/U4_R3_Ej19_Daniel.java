//Daniel Marcos Guerra Gómez
/*Sobrecarga la función realizada en la Actividad de aplicación 4.18 para que el único parámetro sea la cantidad de números aleatorios que se muestra por consola.
Los números aleatorios serán reales y estarán comprendidos entre 0 y 1.*/
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej19_Daniel {
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
		System.out.printf("Voy a mostrar %d números aleatorios usando la función sobrecargada:%n",cantidad);
		generarAleatorios(cantidad);
	}// Fin main

	public static void generarAleatorios(int cant, int min, int max) {
		for(int i=1;i<=cant;i++){
			System.out.printf("%.0f%n",Math.floor(Math.random()*(max-min+1)+min));
		}
	}

	public static void generarAleatorios(int cant) {
		for(int i=1;i<=cant;i++){
			System.out.println(Math.random());
		}
	}

}// Fin clase