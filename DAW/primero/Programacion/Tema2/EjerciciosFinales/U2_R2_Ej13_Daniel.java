//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej13_Daniel{
	public static void main(String []args){
	//Declarar variables
	int comidaDiaria,numAnimales,kilosPorAnimal;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Vamos a comprobar si tenemos alimento suficiente para todos los animales.\nDime la cantidad de comida que compras diariamente:");
	comidaDiaria = teclado.nextInt();
	System.out.println("Dime la cantidad total de animales que alimentar:");
	numAnimales = teclado.nextInt();
	System.out.println("Dime la cantidad media en kilos que come cada animal:");
	kilosPorAnimal = teclado.nextInt();
	if(numAnimales==0){
		System.out.println("Si no tenemos animales no hace falta comprarles alimento.");
	}
	else{
		if(numAnimales*kilosPorAnimal<=comidaDiaria){
			System.out.println("Tenemos alimento suficiente para todos los animales.");
		}
		else{
			System.out.println("No tenemos alimento suficiente para todos los animales, tendremos que racionar los alimentos.");
			System.out.printf("%s %.2f%s","Cada animal tendrá que tomar solamente",((float) comidaDiaria/numAnimales),"kg de alimento.");
		}
	}
	}//Fin main
}//Fin clase