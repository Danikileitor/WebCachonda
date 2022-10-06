//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej16_Daniel{
	public static void main(String []args){
	//Declarar variables
	int segundos,minutos,horas;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique los segundos");
	segundos=teclado.nextInt();
	minutos=(segundos/60)%60;
	horas=segundos/3600;
	segundos=(segundos%3600)%60;
	//Mostrar resultado
	System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
	}//Fin main
}//Fin clase
