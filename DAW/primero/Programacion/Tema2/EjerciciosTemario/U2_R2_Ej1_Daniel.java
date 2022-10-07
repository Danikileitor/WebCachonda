//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej1_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero y te diré si es par o impar");
	numero=teclado.nextInt();
	if(numero%2==0){
		System.out.println("El número "+numero+" es par");//Mostrar resultado si es verdadero (par)
	}
	else{
		System.out.println("El número "+numero+" es impar");//Mostrar resultado si es falso (impar)
	}
	}//Fin main
}//Fin clase
