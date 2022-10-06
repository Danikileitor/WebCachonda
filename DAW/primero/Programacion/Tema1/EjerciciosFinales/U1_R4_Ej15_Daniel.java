//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U1_R4_Ej15_Daniel{
	public static void main(String []args){
	//Declarar variables
	int a,b,c,x,y;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indica los valores para el polinomio y = ax² + bx + c\nValor de a:");
	a=teclado.nextInt();
	System.out.println("Valor de b:");
	b=teclado.nextInt();
	System.out.println("Valor de c:");
	c=teclado.nextInt();
	System.out.println("Valor de x:");
	x=teclado.nextInt();
	y=a*x*x+b*x+c;
	//Mostrar resultado
	System.out.println("El valor de 'y' es "+y);
	}//Fin main
}//Fin clase
