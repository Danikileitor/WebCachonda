//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R6_Ej3_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero, decenaDeMillar, millar, centena, decena;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero entre 0 y 99999");
	numero=teclado.nextInt();
	decenaDeMillar=numero/10000;
	millar=numero/1000;
	centena=numero/100;
	decena=numero/10;
	if (numero>=0 && numero<= 99999){	//Comprobamos que numero esta entre 0 y 9999
		if(decenaDeMillar>0){
			System.out.println("El número introducido tiene 5 cifras");
		}
		else if(millar>0){
			System.out.println("El número introducido tiene 4 cifras");
		}
		else if(centena>0){
			System.out.println("El número introducido tiene 3 cifras");
		}
		else if(decena>0){
			System.out.println("El número introducido tiene 2 cifras");
		}
		else{
			System.out.println("El número introducido tiene 1 cifras");
		}
	}
	else{
		System.out.println("El número introducido no se encuentra entre 0 y 99999");//Mostrar error
	}
	}//Fin main
}//Fin clase
