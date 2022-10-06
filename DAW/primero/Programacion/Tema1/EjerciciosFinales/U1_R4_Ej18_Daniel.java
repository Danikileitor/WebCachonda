//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej18_Daniel{
	public static void main(String []args){
	//Declarar variables
	int hormigas,aranas,cochinillas,patas;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique las hormigas capturadas");
	hormigas=teclado.nextInt();
	System.out.println("Indique las arañas capturadas");
	aranas=teclado.nextInt();
	System.out.println("Indique las cochinillas capturadas");
	cochinillas=teclado.nextInt();
	patas=hormigas*6+aranas*8+cochinillas*14;
	//Mostrar resultado
	System.out.println("La cantidad total de patas es de: "+patas);
	}//Fin main
}//Fin clase
