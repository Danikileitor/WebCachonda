//Daniel Marcos Guerra Gómez
/*Realiza un programa que nos pida un número n, y nos diga cuántos números hay entre 1 y n que sean primos. Un número primo es aquel que solo es divisible por 1 y por él mismo.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej14_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n,primos=0,aux;
	boolean esPrimo;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Voy a indicarte cuantos números primos hay desde 1 hasta el número que me indiques:");
	n=teclado.nextInt();
	for(int i=1;i<=n;i++){
		esPrimo=true;
		aux=2;
		while(aux<i && esPrimo){
			esPrimo=i%aux==0?false:true;
			aux++;
		}
		primos+=esPrimo?1:0;
	}
	System.out.printf("Los números primos que hay entre 1 y %d son %d.%n",n,primos);
	}//Fin main
}//Fin clase