//Daniel Marcos Guerra Gómez
//Escribe una función a la que se pase como parámetros de entrada una cantidad de días, horas y minutos. La función calculará y devolverá el número de segundos que existen en los datos de entrada.
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej14_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int dias,horas,minutos;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Introduce una cantidad de días, horas y minutos para mostrarte la cantidad de segundos totales:");
		System.out.println("Introduce los días:");
		dias = teclado.nextInt();
		System.out.println("Introduce las horas:");
		horas = teclado.nextInt();
		System.out.println("Introduce los minutos:");
		minutos = teclado.nextInt();
		System.out.printf("La cantidad de segundos que hay en %d días, %d horas y %d minutos es: %d.%n",dias,horas,minutos,calcularSegundos(dias, horas, minutos));
	}// Fin main

	public static int calcularSegundos(int d, int h, int m) {
		return 0;
	}
}// Fin clase