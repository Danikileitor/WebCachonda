//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej13_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	int multiplo;
	int restante;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Dime un número entero");
	numero=teclado.nextInt();
	System.out.println("Dime otro número entero");
	multiplo=teclado.nextInt();
	restante=multiplo-numero%multiplo;
	restante= restante==multiplo ? 0 : restante;
	//Mostrar resultado
	System.out.println("Para el número "+numero+", hay que sumarle "+restante+" para que sea múltiplo de "+multiplo);
	}//Fin main
}//Fin clase
