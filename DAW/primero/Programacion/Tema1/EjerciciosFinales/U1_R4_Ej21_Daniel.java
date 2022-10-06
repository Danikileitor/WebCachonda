//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej21_Daniel{
	public static void main(String []args){
	//Declarar variables
	int a,b;
	boolean igual;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número");
	a=teclado.nextInt();
	System.out.println("Introduzca otro número");
	b=teclado.nextInt();
	igual= a==b ? true:false;
	//Mostrar resultado
	System.out.println(igual);
	}//Fin main
}//Fin clase
