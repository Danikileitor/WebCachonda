//Daniel Marcos Guerra Gómez
/*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_12_Daniel{
	public static void main(String []args){
	//Declarar variables
	boolean suspenso=false;
	byte nota;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce las notas de 5 exámenes y te diré si hay algún suspenso.");
	for(int i=1;i<=5;i++){
		System.out.println("Introduce una nota del 0 al 10:");
		nota=teclado.nextByte();
		suspenso=nota>=5?suspenso:true;
	}
	if(suspenso){
		System.out.println("Hay algún suspenso.");
	}
	else{
		System.out.println("No hay ningún suspenso.");
	}
	}//Fin main
}//Fin clase