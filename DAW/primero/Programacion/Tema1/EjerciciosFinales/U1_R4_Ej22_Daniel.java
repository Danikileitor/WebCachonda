//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej22_Daniel{
	public static void main(String []args){
	//Declarar variables
	double m;
	int cm;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca la longitud en metros");
	m=teclado.nextDouble();
	cm=(int)(m*100);
	//Mostrar resultado
	System.out.println("La longitud válida del lanzamiento ha sido: "+cm+"cm");
	}//Fin main
}//Fin clase
