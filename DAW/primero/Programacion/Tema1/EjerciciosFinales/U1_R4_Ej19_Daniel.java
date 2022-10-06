//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej19_Daniel{
	public static void main(String []args){
	//Declarar variables
	int entradaInfantil,entradaAdulto;
	double importe;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Cantidad de entradas infantiles:");
	entradaInfantil=teclado.nextInt();
	System.out.println("Cantidad de entradas de adultos:");
	entradaAdulto=teclado.nextInt();
	importe=entradaInfantil*15.50+entradaAdulto*20;
	importe=importe>100?importe-importe*0.05:importe;
	//Mostrar resultado
	System.out.println("El precio total de las entradas es de: "+importe+"€");
	}//Fin main
}//Fin clase
