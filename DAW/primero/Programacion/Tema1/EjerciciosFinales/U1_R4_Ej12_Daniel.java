//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej12_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	int restante;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Dime un número entero");
	numero=teclado.nextInt();
	restante=7-numero%7;
	restante= restante==7 ? 0 : restante; 
	//Mostrar resultado
	System.out.println("Para el número "+numero+", hay que sumarle "+restante+" para que sea múltiplo de 7");
	}//Fin main
}//Fin clase
