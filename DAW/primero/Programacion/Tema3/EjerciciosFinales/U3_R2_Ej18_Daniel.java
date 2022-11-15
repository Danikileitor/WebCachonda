//Daniel Marcos Guerra Gómez
/*De forma similar a la Actividad de aplicación 3.17, implementa un algoritmo que calcule el mínimo común múltiplo de dos números dados.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej18_Daniel{
	public static void main(String []args){
	//Declarar variables
	int a,b,aux,aux2,mcd,mcm;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indícame 2 números y te calcularé su mínimo común múltiplo.");
	System.out.println("Indica el primer número");
	a=teclado.nextInt();
	System.out.println("Indica el segundo número");
	b=teclado.nextInt();
	if(a<b){
		aux=b;
		b=a;
		a=aux;
	}
	mcd=a;aux2=b;
	while(aux2!=0){
		aux=aux2;
		aux2=mcd%aux2;
		mcd=aux;
	}
	mcm=a/mcd*b;
	System.out.printf("El mínimo común múltiplo de %d y %d es %d.%n",a,b,mcm);
	}//Fin main
}//Fin clase