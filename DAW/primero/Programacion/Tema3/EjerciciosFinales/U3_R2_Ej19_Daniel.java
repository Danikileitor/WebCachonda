//Daniel Marcos Guerra Gómez
/*Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada de 23, probamos 12 = 1, 22 = 4, 32 = 9, 42 = 16, 52 = 25 (nos pasamos), resultando 4 la raíz cuadrada de 23 con un resto (23 - 16) de 7.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej19_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero,raiz=0,resto;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indícame un número y te calcularé su raíz cuadrada aproximada:");
	numero=teclado.nextInt();
	for(int i=0;i*i<=numero;i++){raiz=i;}
	resto=numero-raiz*raiz;
	if(resto==0){
		System.out.printf("La raíz cuadrada de %d es %d.%n",numero,raiz);
	}
	else{
		System.out.printf("La raíz cuadrada aproximada de %d es %d con resto %d.%n",numero,raiz,resto);
	}
	}//Fin main
}//Fin clase