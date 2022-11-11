//Daniel Marcos Guerra Gómez
/*Realiza un programa que convierta un número decimal en su representación binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario. Por simplicidad, iremos mostrando el número binario con un dígito por línea.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej1_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero, aux;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero en base decimal y te lo paso a binario:");
	numero=teclado.nextInt();
	aux=numero;
	while(aux>0){
		System.out.println(aux%2);
		aux=aux/2;
	}
	System.out.println("Fin del programa.");
	}//Fin main
}//Fin clase