//Daniel Marcos Guerra Gómez
/*Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número introducido se encuentra en el rango establecido.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_9_Daniel{
	public static void main(String []args){
	//Declarar variables
	byte numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	do{
		System.out.println("Introduce un número entre 1 y 10 y te mostraré su tabla de multiplicar.");
		numero=teclado.nextByte();
	}while(numero<1||numero>10);
	System.out.printf("La tabla del %d:%n",numero);
	for(int i=1;i<=10;i++){
		System.out.printf("\t\t%dx%d=%d%n",numero,i,numero*i);
	}
	System.out.println("Fin del programa.");
	}//Fin main
}//Fin clase