import java.util.Scanner; //Importación de paquetes
public class U1_R1_E3{
	public static void main(String []args){
	//Declarar variables
	byte edad;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique su edad");
	edad=teclado.nextByte();
	edad++;
	//Mostrar importe iva y total
	System.out.println("Su edad para el año que viene será de: "+edad+" años.");
	}//Fin main
}//Fin clase
