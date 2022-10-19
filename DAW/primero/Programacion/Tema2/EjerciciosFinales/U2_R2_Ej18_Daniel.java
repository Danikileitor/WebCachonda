//Daniel Marcos Guerra Gómez
/*Modifica la Actividad de aplicación 2.17 para que, además de los dos números aleatorios,
también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.*/
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej18_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero1, numero2, resultado;
	numero1 = 2;//Tendría que ser aleatorio pero como no lo hemos dado pongo un 2
	numero2 = 7;//Tendría que ser aleatorio pero como no lo hemos dado pongo un 7
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa ***La operación a realizar tendría que ser aleatoria entre suma, resta y multiplicación, pero como no lo hemos dado, el programa te pedirá hacer las 3 operaciones***
	System.out.println("Calcula la suma de "+numero1+" + "+numero2+":");
	resultado=teclado.nextInt();
	if(resultado==numero1+numero2){
	System.out.println("El resultado de la suma es correcto.");
	}
	else{
	System.out.println("El resultado de la suma es incorrecto.");
	}
	System.out.println("Calcula la resta de "+numero1+" - "+numero2+":");
	resultado=teclado.nextInt();
	if(resultado==numero1-numero2){
	System.out.println("El resultado de la resta es correcto.");
	}
	else{
	System.out.println("El resultado de la resta es incorrecto.");
	}
	System.out.println("Calcula la multiplicación de "+numero1+" x "+numero2+":");
	resultado=teclado.nextInt();
	if(resultado==numero1*numero2){
	System.out.println("El resultado de la multiplicación es correcto.");
	}
	else{
	System.out.println("El resultado de la multiplicación es incorrecto.");
	}
	}//Fin main
}//Fin clase