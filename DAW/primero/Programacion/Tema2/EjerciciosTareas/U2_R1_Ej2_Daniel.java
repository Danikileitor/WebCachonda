//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej2_Daniel{
	public static void main(String []args){
	System.out.println("Voy a calcular el producto de tres números enteros");
	Scanner entrada=new Scanner(System.in);
	int x,y,z,resultado;
	System.out.println("Introduzca el primer número:");
	x = entrada.nextInt();
	System.out.println("Introduzca el segundo número:");
	y = entrada.nextInt();
	System.out.println("Introduzca el tercer número:");
	z = entrada.nextInt();
	resultado = x*y*z;
	System.out.printf("El producto es %s",resultado);
	}//Fin main
}//Fin clase
