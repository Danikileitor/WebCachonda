//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej16_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n1,n2;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero:");
	n1 = teclado.nextInt();
	System.out.println("Introduce un segundo número entero:");
	n2 = teclado.nextInt();
	if(n1%n2==0){
		System.out.println("El número "+n1+" es múltiplo de "+n2+".");
	}
	else{
		System.out.println("El número "+n1+" no es múltiplo de "+n2+".");
	}
	}//Fin main
}//Fin clase
