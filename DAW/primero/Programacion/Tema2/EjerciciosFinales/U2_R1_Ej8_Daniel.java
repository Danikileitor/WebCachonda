//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej8_Daniel{
	public static void main(String []args){
	//Declarar variables
	double numero1, numero2, resultado;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Dime 2 números y calcularé su suma, producto, diferencia y cociente.");
	System.out.println("Dime el primer número:");
	numero1 = teclado.nextDouble();
	System.out.println("Dime el segundo número:");
	numero2 = teclado.nextDouble();
	resultado = numero1+numero2;//Se calcula la suma de ambos números y posteriormente se muestra
	System.out.println("Su suma es: "+resultado);
	resultado = numero1*numero2;//Se calcula el producto de ambos números y posteriormente se muestra
	System.out.println("Su producto es: "+resultado);
	resultado = numero1-numero2;//Se calcula la diferencia de ambos números y posteriormente se muestra
	System.out.println("Su diferencia es: "+resultado);
	resultado = numero1/numero2;//Se calcula el cociente de ambos números y posteriormente se muestra
	System.out.println("Su cociente es: "+resultado);
	}//Fin main
}//Fin clase