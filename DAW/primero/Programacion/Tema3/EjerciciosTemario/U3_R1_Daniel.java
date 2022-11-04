//Daniel Marcos Guerra Gómez
/*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero y te diré si es par, si es positivo y su cuadrado, hasta que introduzcas 0:");
	numero=teclado.nextInt();
	while(numero!=0){
		if(numero%2==0){
			System.out.println(numero+" es par.");
		}else{
			System.out.println(numero+" es impar.");
		}
		if(numero>=0){
			System.out.println(numero+" es positivo.");
		}else{
			System.out.println(numero+" es negativo.");
		}
		System.out.println("El cuadrado de "+numero+" es "+numero*numero+".");
		System.out.println("Introduzca otro número entero:");
		numero=teclado.nextInt();
	}
	}//Fin main
}//Fin clase
