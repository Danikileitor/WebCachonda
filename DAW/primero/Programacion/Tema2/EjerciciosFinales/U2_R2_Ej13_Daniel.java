//Daniel Marcos Guerra Gómez
/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal.
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero.*/
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