//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
import java.lang.Math;
public class U1_R4_Ej20_Daniel{
	public static void main(String []args){
	//Declarar variables
	double numero,resultado;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indica un número real");
	numero=teclado.nextDouble();
	resultado=Math.sqrt(numero);
	//Mostrar resultado
	System.out.println("La raíz cuadrada de "+numero+" es "+resultado);
	}//Fin main
}//Fin clase
