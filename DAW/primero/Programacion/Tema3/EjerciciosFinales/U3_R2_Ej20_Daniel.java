//Daniel Marcos Guerra Gómez
/*Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone el usuario . La manera de especificar que no se desea introducir más cantidades es mediante el cero.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej20_Daniel{
	public static void main(String []args){
	//Declarar variables
	double dinero,total=0.00;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce el dinero del que dispones en diferentes fuentes (banco, cartera, hucha, etc), para finalizar la introducción de datos introduzca un 0.");
	do{
		System.out.println("Introduzca una cantidad de dinero:");
		dinero=teclado.nextDouble();
		total+=dinero;
	}while(dinero!=0);
	System.out.printf("La cantidad total de dinero que dispones es de %.2f€.%n",total);
	}//Fin main
}//Fin clase