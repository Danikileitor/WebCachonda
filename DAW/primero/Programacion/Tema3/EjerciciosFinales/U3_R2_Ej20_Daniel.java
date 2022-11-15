//Daniel Marcos Guerra Gómez
/*Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone el usuario . La manera de especificar que no se desea introducir más cantidades es mediante el cero.*/
import java.util.Scanner; //Importación de paquetes
public class U3_R2_Ej20_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero,raiz=0,resto;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduce el dinero del que dispones de diferentes fuentes (banco, cartera, hucha, etc), para finalizar la introducción de datos introduzca un 0.");
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