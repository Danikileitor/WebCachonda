//Daniel Marcos Guerra Gómez
/*Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el siguiente prototipo:
static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)
La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.*/
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Ej15_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int hora1,hora2,minuto1,minuto2;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Introduce dos instantes de tiempo y te mostrarte su diferencia en minutos:");
		System.out.println("Introduce la cantidad de horas seguida de los minutos del primer instante:");
		hora1 = teclado.nextInt();
		minuto1 = teclado.nextInt();
		System.out.println("Introduce la cantidad de horas seguida de los minutos del segundo instante:");
		hora2 = teclado.nextInt();
		minuto2 = teclado.nextInt();
		System.out.printf("La diferencia entre ambos instantes de tiempo es de %d minutos.%n",diferenciaMin(hora1, minuto1, hora2, minuto2));
	}// Fin main

	public static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){
		int total1 = hora1*60+minuto1;
		int total2 = hora2*60+minuto2;
		int diferencia = total1>total2?total1-total2:total2-total1;
		return diferencia;
	}
}// Fin clase