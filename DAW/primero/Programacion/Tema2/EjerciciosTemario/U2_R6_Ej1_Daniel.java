//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R6_Ej1_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero1, numero2, numero3;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Dime tres números enteros y te los muestro ordenados de mayor a menor");
	System.out.println("Introduzca el primer número");
	numero1=teclado.nextInt();
	System.out.println("Introduzca el segundo número");
	numero2=teclado.nextInt();
	System.out.println("Introduzca el tecer número");
	numero3=teclado.nextInt();
	if(numero1==numero2 && numero1==numero3){
		System.out.println("Los números "+numero1+", "+numero2+" y "+numero3+" son iguales.");//Indicar que los números son iguales
	}
	else{
		if(numero1>numero2){
			if(numero1>numero3){
				if(numero2>numero3){
					System.out.println(numero1+" > "+numero2+" > "+numero3);
				}
				else{
					System.out.println(numero1+" > "+numero3+" > "+numero2);
				}
			}
			else{
				System.out.println(numero3+" > "+numero1+" > "+numero2);
			}
		}
		else{
			if(numero2>numero3){
				if(numero1>numero3){
					System.out.println(numero2+" > "+numero1+" > "+numero3);
				}
				else{
					System.out.println(numero2+" > "+numero3+" > "+numero1);
				}
			}
			else{
				System.out.println(numero3+" > "+numero2+" > "+numero1);
			}
		}
	}
	}//Fin main
}//Fin clase
