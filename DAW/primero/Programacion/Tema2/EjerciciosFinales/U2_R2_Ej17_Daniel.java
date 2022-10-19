//Daniel Marcos Guerra Gómez
/*Realiza el «juego de la suma», que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar.
La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.*/
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej17_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero1, numero2, resultado;
	numero1 = 2;//Tendría que ser aleatorio pero como no lo hemos dado pongo un 2
	numero2 = 7;//Tendría que ser aleatorio pero como no lo hemos dado pongo un 7
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Calcula la suma de "+numero1+" + "+numero2+":");
	resultado=teclado.nextInt();
	if(resultado==numero1+numero2){
	System.out.println("El resultado de la suma es correcto.");
	}
	else{
	System.out.println("El resultado de la suma es incorrecto.");
	}
	}//Fin main
}//Fin clase