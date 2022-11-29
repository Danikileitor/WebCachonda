//Daniel Marcos Guerra Gómez
/*1. Diseñar la función eco() a la que se le pasa como parámetro un numero n, y muestra por pantalla n-veces el mensaje " Eco....."
* 2. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
* 3. Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
* 4. Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
* 5. Crea una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
* 6. Diseñar una función con el siguiente prototipo: boolean esPrimo(int n)  que devovlverá true si n es primo y false en caso contrario.*/
import java.util.Scanner; //Importación de paquetes
public class U4_R1_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número y te indicaré si es primo:");
	n=teclado.nextInt();
	if(comprobarPrimo(n)){
		System.out.printf("El número %d es primo.%n",n);
	}else{
		System.out.printf("El número %d no es primo.%n",n);
	}
	}//Fin main
	//Creamos el método para comprobar si es primo
	public static boolean comprobarPrimo(int numero){
		boolean esPrimo=true;
		int aux=2;
		while(aux<numero && esPrimo){
			esPrimo=numero%aux==0?false:true;
			aux++;
		}
		return(esPrimo);
	}//Fin método
}//Fin clase