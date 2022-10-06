//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej14_Daniel{
	public static void main(String []args){
	//Declarar variables
	double base;
	double altura;
	double area;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("¿Cuánto mide la base?");
	base=teclado.nextDouble();
	System.out.println("¿Cuánto mide la altura?");
	altura=teclado.nextDouble();
	area=base*altura/2;
	//Mostrar resultado
	System.out.println("El área del triángulo es "+area);
	}//Fin main
}//Fin clase
