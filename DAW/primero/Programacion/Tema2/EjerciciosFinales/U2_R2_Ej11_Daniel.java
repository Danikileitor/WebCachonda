//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes
public class U2_R2_Ej11_Daniel{
	public static void main(String []args){
	//Declarar variables
	int numero, millar, centena, decena, unidad;
	boolean capicua;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Introduzca un número entero entre 0 y 9999");
	numero=teclado.nextInt();
	millar=numero/1000;
	centena=(numero-millar*1000)/100;
	decena=(numero-centena*100-millar*1000)/10;
	unidad=numero%10;
	if (numero>=0 && numero<= 9999){	//Comprobamos que numero esta entre 0 y 9999
		if(numero>999){	//Comprobamos que numero tiene 4 cifras
			capicua=(millar==unidad && centena==decena) ? true : false;
		}
		else if(numero>99){	//Comprobamos que numero tiene 3 cifras
			capicua=centena==unidad ? true : false;
		}
		else if(numero>9){	//Comprobamos que numero tiene 2 cifras
			capicua=decena==unidad ? true : false;
		}
		else{	//Comprobamos que numero tiene 1 cifra
			capicua=true;
		}
		if(capicua){	//Mostrar resultado si numero es capicúa
			System.out.println("El número "+numero+" es capicúa.");
		}
		else{	//Mostrar resultado si numero no es capicúa
			System.out.println("El número "+numero+" no es capicúa.");
		}
	}
	else{
		System.out.println("El número introducido no se encuentra entre 0 y 9999");//Mostrar error
	}
	}//Fin main
}//Fin clase