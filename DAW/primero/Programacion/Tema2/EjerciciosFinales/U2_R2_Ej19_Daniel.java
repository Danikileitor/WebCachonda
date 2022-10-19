//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
import java.lang.Math;
public class U2_R2_Ej19_Daniel{
	public static void main(String []args){
	//Declarar variables
	double grados;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Dime los grados que tenga un ángulo y te los paso a radianes:");
	grados=teclado.nextDouble();
	grados=grados>=0 && grados<=360 ? grados : grados%360;//Comprobamos que "grados" se encunetra entre 0 y 360, en caso contrario lo transforma dentro de dicho rango.
	grados=grados*Math.PI/180;//pasamos a radianes
	System.out.println("Su equivalente en radianes es: "+grados);
	}//Fin main
}//Fin clase