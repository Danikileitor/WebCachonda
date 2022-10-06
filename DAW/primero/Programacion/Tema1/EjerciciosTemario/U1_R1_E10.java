import java.util.Scanner; //Importación de paquetes
public class U1_R1_E10{
	public static void main(String []args){
	//Declarar variables
	boolean llueve, tareafinalizada, biblioteca, salir;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("¿Está lloviendo?");
	llueve=teclado.nextBoolean();
	System.out.println("¿Has terminado la tarea?");
	tareafinalizada=teclado.nextBoolean();
	System.out.println("¿Necesitas ir a la biblioteca?");
	biblioteca=teclado.nextBoolean();
	salir=(llueve==false && tareafinalizada==true || biblioteca==true);
	//Mostrar resultado
	System.out.println("Posibilidad de salir a la calle: "+salir);
	}//Fin main
}//Fin clase
