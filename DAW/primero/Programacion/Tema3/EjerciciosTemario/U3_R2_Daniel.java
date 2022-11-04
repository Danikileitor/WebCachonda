//Daniel Marcos Guerra Gómez
/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Daniel{
	public static void main(String []args){
	//Declarar variables
	int edad,mayores;
	float media,suma,alumnos;
	suma=0;media=0;alumnos=0;mayores=0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca las edades de los alumnos de una en una y te calcularé la suma de todas las edades, su media, la cantidad de alumnos introducidos y cuántos son mayores de edad, introduce un número negativo para terminar:");
	edad=teclado.nextInt();
	while(edad>=0){
		alumnos++;
		if(edad>=18){mayores++;}
		suma+=edad;
		System.out.println("Introduzca otra edad:");
		edad=teclado.nextInt();
	}
	if(alumnos!=0){
		media=suma/alumnos;
		System.out.printf("La suma total de las edades es: %.0f.%nSu media es: %.2f.%nLa cantidad de alumnos introducidos es: %.0f.%nLa cantidad de alumnos mayores de edad es: %d.%n",suma,media,alumnos,mayores);
	}else{
	System.out.println("No has introducido ninguna edad.");
	}
	System.out.println("Fin del programa.");
	}//Fin main
}//Fin clase
