//Daniel Marcos Guerra Gómez
/*Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_11_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	long factorial=1;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero y te indicaré su factorial:");
	numero=teclado.nextInt();
	for(int i=numero;i>0;i--){
		factorial*=i;
	}
	System.out.printf("El factorial %d! es %d.%n",numero,factorial);//Usando long se puede llegar a calcular hasta el factorial de 25.
	}//Fin main
}//Fin clase