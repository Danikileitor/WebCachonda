import java.util.Scanner; //Importación de paquetes
public class U1_R1_E8{
	public static void main(String []args){
	//Declarar variables
	byte edad;
	boolean mayoria;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("¿Qué edad tienes?");
	edad=teclado.nextByte();
	mayoria=(edad>=18);
	//Mostrar resultado
	System.out.println("Mayoría de edad: "+mayoria);
	}//Fin main
}//Fin clase
