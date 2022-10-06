//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej17_Daniel{
	public static void main(String []args){
	//Declarar variables
	double m,cm,mm,longitud;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique los milímetros");
	mm=teclado.nextDouble()/10;
	System.out.println("Indique los centímetros");
	cm=teclado.nextDouble();
	System.out.println("Indique los metros");
	m=teclado.nextDouble()*100;
	longitud=m+cm+mm;
	//Mostrar resultado
	System.out.println("La longitud total es de: "+longitud+" cm");
	}//Fin main
}//Fin clase
