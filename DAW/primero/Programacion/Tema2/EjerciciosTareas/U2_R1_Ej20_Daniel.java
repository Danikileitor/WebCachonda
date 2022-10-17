//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej20_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero,decenaDeMillar,millar,centena,decena,unidad;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero de 5 dígitos:");
	numero = teclado.nextInt();
	System.out.printf("%1d   %1d   %1d   %1d   %1d",numero/10000,numero/1000,numero/100,numero/10,numero%10);
	}//Fin main
}//Fin clase
