//Daniel Marcos Guerra Gómez
/*Pide un número e indica si es primo utilizando un método.*/
import java.util.Scanner; //Importación de paquetes
public class U4_R1_Ej1_Daniel{
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