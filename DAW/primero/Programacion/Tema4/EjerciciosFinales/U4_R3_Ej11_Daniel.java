//Daniel Marcos Guerra Gómez
//Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej11_Daniel {
	public static final double PI = Math.PI; //dado que lo vamos a usar varias veces, definimos al número pi como constante.
	public static void main(String[] args) {
		// Declarar variables
		double radio;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Dime el radio de un círculo y te calcularé su superficie y el volumen de su esfera:");
		radio = teclado.nextDouble();
		System.out.printf("Para el radio %f, su superficie es %f y el volumen de su esfera es %f.%n",radio,superficie(radio),volumenEsfera(radio));
	}// Fin main

	public static double superficie(double r) {
		return 4*PI*r*r;
	}

	public static double volumenEsfera(double r) {
		return 4*PI*r*r*r/3;
	}
}// Fin clase