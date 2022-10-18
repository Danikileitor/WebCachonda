//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej20_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero de 5 dígitos:");
	numero = teclado.nextInt();
	System.out.printf("%d   %d   %d   %d   %d",numero/10000,(numero%10000)/1000,((numero%10000)%1000)/100,(((numero%10000)%1000)%100)/10,((((numero%10000)%1000)%100)%10));
	}//Fin main
}//Fin clase