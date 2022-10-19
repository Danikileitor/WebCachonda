//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej15_Daniel{
	public static void main(String []args){
	//Declarar variables
	double base,altura,area;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Vamos a calcular el área de un triángulo.\nDime cuanto mide su base:");
	base = teclado.nextDouble();
	System.out.println("Dime cuanto mide su altura:");
	altura = teclado.nextDouble();
	if(base<0 || altura<0){
		System.out.println("No tiene sentido que indiques números negativos!");
	}
	else{
		area=base*altura/2;
		System.out.println("El área del triángulo con base "+base+" y altura "+altura+" es: "+area);
	}
	}//Fin main
}//Fin clase