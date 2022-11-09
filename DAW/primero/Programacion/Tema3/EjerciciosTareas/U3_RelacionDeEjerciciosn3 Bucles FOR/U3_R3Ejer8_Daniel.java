//Daniel Marcos Guerra Gómez
/*Escribir un programa en Java que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.*/
public class U3_R3Ejer8_Daniel{
	public static void main(String []args){
	//Declarar variables
	int resultado=0;
	//Desarrollo del programa
	for(int i=1;i<=100;i++){
		resultado+=i*i;
	}
	System.out.println(resultado);
	}//Fin main
}//Fin clase
