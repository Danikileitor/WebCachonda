//Daniel Marcos Guerra Gómez
/*Modifica la Actividad de aplicación 3.11 para que el usuario pueda introducir un número en binario y el programa muestre su conversión a decimal.*/
import java.util.Scanner; //Importación de paquetes
import java.lang.Math;
public class U3_R2_Ej12_Daniel{
	public static void main(String []args){
	//Declarar variables
	int binario, decimal=0, aux, contador=0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número binario y te lo paso a decimal:");
	binario=teclado.nextInt();
	aux=binario;
	while(aux>0){
		decimal+=(aux%2*(Math.pow(2, contador)));
		System.out.println(decimal);
		aux/=10;
		contador++;
	}
	System.out.printf("El número binario %d convertido a decimal es %d.%n",binario,decimal);
	}//Fin main
}//Fin clase