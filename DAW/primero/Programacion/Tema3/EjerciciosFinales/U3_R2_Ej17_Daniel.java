//Daniel Marcos Guerra Gómez
/*Para dos números dados, a y b, es posible buscar el máximo común divisor (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer número que divide a ambos simultáneamente. Realiza un programa que calcule el máximo común divisor de dos números.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej17_Daniel{
	public static void main(String []args){
	//Declarar variables
	int a,b,aux,aux2,mcd;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indícame 2 números y te calcularé su máximo común divisor.");
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
	System.out.printf("El máximo común divisor entre %d y %d es %d.%n",a,b,mcd);
	}//Fin main
}//Fin clase