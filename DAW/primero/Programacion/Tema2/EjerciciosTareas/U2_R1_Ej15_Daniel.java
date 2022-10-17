//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej15_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero:");
	numero = teclado.nextInt();
	if(numero%2==0){
		System.out.println("El número "+numero+" es par.");
	}
	else{
		System.out.println("El número "+numero+" es impar.");
	}
	}//Fin main
}//Fin clase
