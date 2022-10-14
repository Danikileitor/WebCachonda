//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R8_Daniel{
	public static void main(String []args){
	//Declarar variables
	int edad;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique su edad:");
	edad = teclado.nextInt();
	/*Esto pa java 17
	switch (edad) {
		case 0, 1, 2 ->
			System.out.println("Guarderia");
		case 3, 4, 5 ->
			System.out.println("Prescolar");
		case 6, 7, 8, 9, 10, 11 ->
			System.out.println("Primaria");
		case 12, 13, 14, 15, 16 ->
			System.out.println("Secundaria");
		default ->
			System.out.println("Estudios postobligatorios");
	}*/
	switch (edad) {
		case 0:
			System.out.println("Guarderia");
			break;
		case 1:
			System.out.println("Guarderia");
			break;
		case 2:
			System.out.println("Guarderia");
			break;
		case 3:
			System.out.println("Prescolar");
			break;
		case 4:
			System.out.println("Prescolar");
			break;
		case 5:
			System.out.println("Prescolar");
			break;
		case 6:
			System.out.println("Primaria");
			break;
		case 7:
			System.out.println("Primaria");
			break;
		case 8:
			System.out.println("Primaria");
			break;
		case 9:
			System.out.println("Primaria");
			break;
		case 10:
			System.out.println("Primaria");
			break;
		case 11:
			System.out.println("Primaria");
			break;
		case 12:
			System.out.println("Secundaria");
			break;
		case 13:
			System.out.println("Secundaria");
			break;
		case 14:
			System.out.println("Secundaria");
			break;
		case 15:
			System.out.println("Secundaria");
			break;
		case 16:
			System.out.println("Secundaria");
			break;
		default:
			System.out.println("Estudios postobligatorios");
			break;
	}
	}//Fin main
}//Fin clase