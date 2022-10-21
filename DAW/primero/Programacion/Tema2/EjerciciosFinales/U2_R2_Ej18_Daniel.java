//Daniel Marcos Guerra Gómez
/*Modifica la Actividad de aplicación 2.17 para que, además de los dos números aleatorios,
también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.*/
import java.util.Scanner; //Importación de paquetes

public class U2_R2_Ej18_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int numero1, numero2, resultado, operacion;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Dime un número entero:");
		numero1 = teclado.nextInt();
		System.out.println("Dime otro número entero:");
		numero2 = teclado.nextInt();
		System.out.println("Escoge la operación a realizar:\nIntroduce 1 para sumar\nIntroduce 2 para restar\nIntroduce 3 para multiplicar");
		switch (operacion = teclado.nextInt()) {
			case 1:
				System.out.println("Calcula la suma de " + numero1 + " + " + numero2 + ":");
				resultado = teclado.nextInt();
				if (resultado == numero1 + numero2) {
					System.out.println("El resultado de la suma es correcto.");
				} else {
					System.out.println("El resultado de la suma es incorrecto.");
				}
				break;
			case 2:
				System.out.println("Calcula la resta de " + numero1 + " - " + numero2 + ":");
				resultado = teclado.nextInt();
				if (resultado == numero1 - numero2) {
					System.out.println("El resultado de la resta es correcto.");
				} else {
					System.out.println("El resultado de la resta es incorrecto.");
				}
				break;
			case 3:
				System.out.println("Calcula la multiplicación de " + numero1 + " x " + numero2 + ":");
				resultado = teclado.nextInt();
				if (resultado == numero1 * numero2) {
					System.out.println("El resultado de la multiplicación es correcto.");
				} else {
					System.out.println("El resultado de la multiplicación es incorrecto.");
				}
				break;
			default:
				System.out.println("No has seleccionado una operación válida, inicie de nuevo el programa para reintentarlo.");
		}
	}// Fin main
}// Fin clase