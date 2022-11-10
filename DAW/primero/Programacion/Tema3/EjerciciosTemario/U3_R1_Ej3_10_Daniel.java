//Daniel Marcos Guerra Gómez
/*Mostrar la suma de los 10 primeros números impares.*/
public class U3_R1_Ej3_10_Daniel{
	public static void main(String []args){
	//Declarar variables
	short suma=0;
	//Desarrollo del programa
	for(int i=1;i<=10;i++){
		suma+=(2*i-1);
	}
	System.out.printf("La suma de los 10 primeros números impares es %d.%n",suma);//La suma tenrdrá que ser 1+3+5+7+9+11+13+15+17+19=100
	}//Fin main
}//Fin clase