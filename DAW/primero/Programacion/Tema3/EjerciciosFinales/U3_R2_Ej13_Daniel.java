//Daniel Marcos Guerra Gómez
/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora, minutos y segundos, así como cuántos segundos se desea incrementar la hora introducida. La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej13_Daniel{
	public static void main(String []args){
	//Declarar variables
	int horas,minutos,segundos;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Vamos a poner en hora nuestro reloj.");
	System.out.println("Introduce la hora:");
	horas=teclado.nextInt();
	System.out.println("Introduce los minutos:");
	minutos=teclado.nextInt();
	System.out.println("Introduce los segundos:");
	segundos=teclado.nextInt();
	System.out.printf("Son las %02d:%02d:%02d.%n",horas,minutos,segundos);
	System.out.println("Indica cuántos segundos deseas incrementar la hora:");
	segundos=teclado.nextInt()+segundos;
	while(segundos>=60){
		minutos++;
		segundos-=60;
	}
	while(minutos>=60){
		horas++;
		minutos-=60;
	}
	while(horas>=24){
		horas-=24;
	}
	System.out.printf("Ahora son las %02d:%02d:%02d.%n",horas,minutos,segundos);
	}//Fin main
}//Fin clase