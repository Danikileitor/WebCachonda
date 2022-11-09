//Daniel Marcos Guerra Gómez
/*Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.*/
public class U3_R1_Ej3_14_Daniel{
	public static void main(String []args){
	//Desarrollo del programa
	System.out.println("¡Bienvenido al programa de las tablas de multiplicar!");
	for(int i=10;i>0;i--){
		System.out.printf("La tabla del %d:%n",i);
		for(int j=0;j<=10;j++){
			System.out.printf("\t\t%dx%d=%d%n",i,j,i*j);
		}
	}
	System.out.println("¡Fin del programa!");
	}//Fin main
}//Fin clase
