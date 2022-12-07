//Daniel Marcos Guerra Gómez
//Crea la función: 'muestraPares(int n)' que muestre por consola los primeros n números pares.
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej13_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int cantidad;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Introduce un número entero y te mostrare esos primeros números pares:");
		cantidad = teclado.nextInt();
		System.out.printf("Los primeros %d números pares son:%n",cantidad);
		muestraPares(cantidad);
	}// Fin main

	public static void muestraPares(int n) {
		for(int i=1;i<=n;i++){
			if (i%2 == 0) {
                System.out.println(i);
            }
			else{n++;}
		}
	}
}// Fin clase