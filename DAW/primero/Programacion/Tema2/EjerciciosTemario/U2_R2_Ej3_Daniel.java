//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej3_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero1, numero2;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero");
	numero1=teclado.nextInt();
	System.out.println("Introduzca otro número entero");
	numero2=teclado.nextInt();
	if(numero1==numero2){
		System.out.println("Los números "+numero1+" y "+numero2+" son iguales.");//Mostrar resultado si es verdadero
	}
	else{
		if(numero1>numero2){
			System.out.println("El número "+numero1+" es el mayor.");
		}
		else{
			System.out.println("El número "+numero2+" es el mayor.");
		}
	}
	}//Fin main
}//Fin clase
