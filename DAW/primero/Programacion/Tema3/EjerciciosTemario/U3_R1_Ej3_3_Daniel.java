//Daniel Marcos Guerra Gómez
/*Codificar el juego «el número secreto», que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los que se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un −1).*/
import java.util.Scanner; //Importación de paquetes
public class U3_R1_Ej3_3_Daniel{
	public static void main(String []args){
	//Declarar variables
	byte numero,secreto;
	int contador=1;
	String mensaje;
	secreto=(byte)(Math.random()*100+1);
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Adivina el número secreto entre 1 y 100, puedes rendirte introduciendo '-1'.");
	numero=teclado.nextByte();
	while(numero!=secreto && numero!=-1){
		contador++;
		mensaje=numero>secreto?"¡No has acertado! El número secreto es menor.":"¡No has acertado!, el número secreto es mayor.";
		System.out.println(mensaje);
		numero=teclado.nextByte();
	}
	if(numero==secreto){
		System.out.printf("¡Has acertado!, el número secreto es: %d.%nNúmero de intentos: %d.%n",secreto,contador);
	}else{
		contador--;
		System.out.printf("¡Te has rendido!, el número secreto era: %d.%nNúmero de intentos: %d.%n",secreto,contador);
	}
	}//Fin main
}//Fin clase