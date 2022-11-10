//Daniel Marcos Guerra Gómez
/*Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 a n.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_6_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Vamos a aprender a contar hasta el número que vas a introducir:");
	n=teclado.nextInt();
	System.out.printf("Contemos hasta %d:%n",n);
	for(int i=1;i<=n;i++){
		System.out.println(i);		
	}
	System.out.println("Fin del programa");
	}//Fin main
}//Fin clase