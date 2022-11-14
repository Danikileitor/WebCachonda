//Daniel Marcos Guerra Gómez
/*Diseña una aplicación que dibuje el triángulo de Pascal, para n filas. Numerando las filas y elementos desde 0, la fórmula para obtener el m-ésimo elemento de la n-ésima fila es : E(n,m)=(n!)/(m!(n-m)!) Donde n! es el factorial de n.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej15_Daniel{
	public static void main(String []args){
	//Declarar variables
	int n;
	long aux1,aux2,aux3;
	String fila;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Voy a dibujarte el tríangulo de Pascal con el número de filas que me indiques:");
	n=teclado.nextInt();
	for(int m=0;m<=n;m++){
		fila="";
		aux1=0;
		aux2=0;
		aux3=0;
		for(int i=n;i>0;i--){
			aux1*=i;
		}
		for(int j=m;j>0;j--){
			aux2*=j;
		}
		for(int k=(n-m);k>0;k--){
			aux3*=k;
		}
		System.out.printf("%d%n",aux1/(aux2*aux3));
	}
	}//Fin main
}//Fin clase