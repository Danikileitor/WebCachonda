//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R1_Ej18_Daniel{
	public static void main(String []args){
	//Declarar variables
	int radio;
	double pi = 3.14159;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce un número entero que será el radio de un círculo y te calcularé su diamétro, circunferencia y área:");
	radio = teclado.nextInt();
	System.out.printf("Su diámetro es: %d, su circunferencia es: %f y su área es: %f.",2*radio,2*pi*radio,pi*radio*radio);
	}//Fin main
}//Fin clase
