//Daniel Marcos Guerra Gómez
//Implementa la función: 'static double distancia(double x1, double y1, double x2, double y2)' que calcula y devuelve la distancia euclidea que separa los puntos (x1, y1) y (x2, y2).
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej12_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		double x1,x2,y1,y2;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Dime las coordenadas de 2 puntos y te calcularé la distancia entre ellos:");
		System.out.println("Introduce la coordenada x seguida de la coordenada y del primer punto:");
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		System.out.println("Introduce la coordenada x seguida de la coordenada y del segundo punto:");
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		System.out.printf("La distancia entre ambos puntos es %f.%n",distancia(x1, y1, x2, y2));
	}// Fin main

	public static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
	}
}// Fin clase