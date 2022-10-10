//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
import java.lang.Math;
public class U2_R6_Ej2_Daniel{
	public static void main(String []args){
	//Declarar variables
	double a,b,c,x1,x2,aux;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce los valores de a, b y c para calcular el valor de x de una ecuación de segundo grado (ax² + bx + c = 0)");
	System.out.println("Valor de a:");
	a=teclado.nextDouble();
	System.out.println("Valor de b:");
	b=teclado.nextDouble();
	System.out.println("Valor de c:");
	c=teclado.nextDouble();
	aux=b*b-4*a*c;
	if(aux < 0){
		System.out.println("La ecucación: "+a+"x² + "+b+"x + "+c+" = 0 no tiene soluciones reales.");
	}
	else{
		if(a==0){
			System.out.println("La ecucación: "+a+"x² + "+b+"x + "+c+" = 0 no es de segundo grado, no puedo calcularla.");
		}
		else{
			x1 = (-b+Math.sqrt(aux))/2*a;
			x2 = (-b-Math.sqrt(aux))/2*a;
			System.out.println("La ecucación: "+a+"x² + "+b+"x + "+c+" = 0 tiene estas soluciones:");
				if(aux==0){
					System.out.println("Ambas soluciones son: "+x1);
				}
				else{
					System.out.println(x1+" y "+x2);
				}
		}
	}
	}//Fin main
}//Fin clase
