//Daniel Marcos Guerra Gómez
/*Diseña una aplicación que dibuje el triángulo de Pascal, para n filas. Numerando las filas y elementos desde 0, la fórmula para obtener el m-ésimo elemento de la n-ésima fila es : E(n,m)=(n!)/(m!(n-m)!) Donde n! es el factorial de n.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej15_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n;
	long aux;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Voy a dibujarte el tríangulo de Pascal con el número de filas que me indiques:");
	n=teclado.nextInt();
	System.out.printf("El tríangulo de Pascal con %d filas:%n",n);
	for(int m=0;m<n;m++){
		aux=1;
		for(int i=0;i<=m;i++){
			System.out.printf("%d ",aux);
			aux=aux*(m-i)/(i+1);
		}
		System.out.println();
	}
	}//Fin main
}//Fin clase