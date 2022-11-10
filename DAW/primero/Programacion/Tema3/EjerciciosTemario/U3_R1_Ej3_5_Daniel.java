//Daniel Marcos Guerra Gómez
/*Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.Mientras la solución introducida sea correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente. Usa un do_while() en tu resolución.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_5_Daniel{
	public static void main(String []args){
	//Declarar variables
	byte numero1,numero2;
	short suma;
	int cantidad=0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("¡Bienvenido al juego de la suma! ¿Cuántas sumas seguidas podrás realizar sin equivocarte?");
	do{
		numero1=(byte)(Math.random()*100+1);
		numero2=(byte)(Math.random()*100+1);
		System.out.printf("%d + %d =%n",numero1,numero2);
		suma=teclado.nextShort();
		cantidad++;
	}while(suma==numero1+numero2);
	cantidad--;
	System.out.printf("¡Fallaste! Has acertado un total de %d sumas seguidas.",cantidad);
	}//Fin main
}//Fin clase