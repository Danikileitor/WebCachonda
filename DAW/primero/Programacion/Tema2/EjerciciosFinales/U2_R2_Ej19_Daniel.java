//Daniel Marcos Guerra Gómez
/*Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes.
Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango.
Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0° a 360°.*/
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