//Daniel Marcos Guerra Gómez
/*Solicita al usuario un número n y dibuja un triángulo de base y altura n.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej16_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n,aux;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Voy a plantarte un pino con el número de filas que me indiques:");
	n=teclado.nextInt();
	System.out.printf("El pino con %d filas:%n",n);
	for(int i=1;i<=n;i++){
		aux=1;
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print("* ");
		}
		System.out.println();
	}
	}//Fin main
}//Fin clase