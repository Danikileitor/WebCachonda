import java.time.LocalTime; //Importación de paquetes
import java.util.Scanner;
public class U1_R2_E1{
	public static void main(String []args){
	//Declarar variables
	final short SUELDO=200;
	short sueldo=0;
	LocalTime queHoraEsEnElEjido;
	Scanner teclado=new Scanner(System.in);
	int edad=0;
	float altura=0.0f;
	String nombre;

	//Desarrollo del programa
	System.out.println("Dime tu sueldo");
	sueldo=teclado.nextShort();
	System.out.print("Mi sueldo es: "+sueldo+"€\n");
	//sueldo=sueldo+100;
	System.out.print("Mi sueldo incrementado es: "+sueldo+"€\n");
	queHoraEsEnElEjido=LocalTime.now();
	System.out.print("Y tenemos de hora: "+queHoraEsEnElEjido+"\n");
	System.out.println("Dime que edad tienes");
	edad=teclado.nextInt();
	System.out.println("\tRealmente tienes "+edad+"?");
	System.out.println("Dime que altura tienes");
	altura=teclado.nextFloat();
	System.out.println("\tRealmente mides "+altura+"?");
	System.out.println("Dime tu nombre");
	teclado.nextLine();
	nombre=teclado.nextLine();
	System.out.println("\tRealmente te llamas "+nombre+"?");
	}//Fin main
}//Fin clase
