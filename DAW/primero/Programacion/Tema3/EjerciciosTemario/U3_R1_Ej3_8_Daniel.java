//Daniel Marcos Guerra Gómez
/*Pedir diez números por teclado y mostrar la media.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_8_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero,total=0;
	float media;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Voy a pedirte 10 números enteros y te calcularé su media.");
	for(int i=1;i<=10;i++){
		System.out.println("Introduce el primer número.");
		numero=teclado.nextInt();
		total+=numero;
	}
	media=total/10.0f;
	System.out.printf("La suma total de los números introducidos es %d y su media es %.1f.%n",total,media);
	}//Fin main
}//Fin clase