//Daniel Marcos Guerra Gómez
/*Escribir un programa en Java que multiplique los 20 primeros número naturales (1*2*3*4*5...).*/
public class U3_R3Ejer7_Daniel{
	public static void main(String []args){
	//Declarar variables
	long resultado=1;
	//Desarrollo del programa
	for(int i=2;i<=20;i++){
		resultado*=i;
	}
	System.out.println(resultado);
	}//Fin main
}//Fin clase
