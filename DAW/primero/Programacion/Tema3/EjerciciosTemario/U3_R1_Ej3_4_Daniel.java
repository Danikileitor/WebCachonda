//Daniel Marcos Guerra Gómez
/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice −1 como altura). Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_4_Daniel{
	public static void main(String []args){
	//Declarar variables
	short altura,alturaMaxima=0;
	int contador=0,masAlto=0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca la altura de los árboles en centímetros y te diré el número de etiqueta del árbol más alto, para finalizar introduzca '-1'.");
	do{
		System.out.println("Indroduzca la altura del árbol:");
		altura=teclado.nextShort();
		if(altura>alturaMaxima){
			alturaMaxima=altura;
			masAlto=contador;	
		}
		contador++;
	}while(altura!=-1);
	System.out.printf("El árbol más alto tiene la etiqueta %d y mide %dcm.%n",masAlto,alturaMaxima);
	}//Fin main
}//Fin clase