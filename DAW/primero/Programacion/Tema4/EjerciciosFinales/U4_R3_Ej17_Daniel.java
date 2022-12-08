//Daniel Marcos Guerra Gómez
/*Escribe una función que decida si dos números enteros positivos son amigos.
Dos números a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a es igual a b. Y viceversa.
Para probar se pueden usar los números 220 y 284, que son amigos.*/
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej17_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int a,b;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Introduce dos números enteros positivos y te diré si son amigos:");
		System.out.println("Introduce el primer número:");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo número:");
		b = teclado.nextInt();
		if (comprobarAmigos(a, b)) {
			System.out.printf("Los números %d y %d son amigos.%n",a,b);	
		} else {
			System.out.printf("Los números %d y %d no son amigos.%n",a,b);
		}
	}// Fin main

	public static boolean comprobarAmigos(int a, int b) {
		boolean amigos;
		amigos = sumaDivisores(a)==sumaDivisores(b);
		return amigos;
	}

	public static int sumaDivisores(int n) {
		int suma=0;
		for (int i=1;i<=n;i++){
			if (n%i==0) {
				suma+=i;
			}
		}
		return suma;
	}

}// Fin clase