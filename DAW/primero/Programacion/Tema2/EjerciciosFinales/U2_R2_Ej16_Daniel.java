//Daniel Marcos Guerra Gómez
//Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej16_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número y calcularé su valor absoluto:");
	numero=teclado.nextInt();
	numero=numero<0 ? numero*-1 : numero;
	System.out.println("El valor absoluto es: "+numero);
	}//Fin main
}//Fin clase