import java.util.Scanner; //Importación de paquetes
public class U1_R1_E4{
	public static void main(String []args){
	//Declarar variables
	short actual;
	short nacimiento;
	int edad;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("¿En qué año estamos?");
	actual=teclado.nextShort();
	System.out.println("¿En qué año naciste?");
	nacimiento=teclado.nextShort();
	edad=actual-nacimiento;
	//Mostrar resultado
	System.out.println("Tienes: "+edad+" años.");
	}//Fin main
}//Fin clase
