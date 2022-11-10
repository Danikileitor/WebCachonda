//Daniel Marcos Guerra Gómez
/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a cuatro y suspensos.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_13_Daniel{
	public static void main(String []args){
	//Declarar variables
	byte nota,aprobados=0,condicionados=0,suspensos=0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce las notas de 6 exámenes y te diré si hay algún suspenso.");
	for(int i=1;i<=6;i++){
		System.out.println("Introduce una nota del 0 al 10:");
		nota=teclado.nextByte();
		if(nota>=5){aprobados++;}
		else if(nota==4){condicionados++;}
		else{suspensos++;}
	}
	System.out.printf("%d alumnos han aprobado, %d alumnos están condicionados y %d alumnos han suspendido.%n",aprobados,condicionados,suspensos);
	}//Fin main
}//Fin clase