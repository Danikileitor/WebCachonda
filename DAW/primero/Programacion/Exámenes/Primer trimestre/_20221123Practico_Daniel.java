import java.util.Scanner;
public class _20221123Practico_Daniel{
	public static void main(String[] args){
		//Declarar variables
		Scanner teclado=new Scanner(System.in);
		int inquilino=1,aux;
		long factorial;
		boolean esPrimo=true,salir=false;
		String aceptado,rechazado;
		aceptado="Bienvenido a la pensión.\n";
		rechazado="Lo siento, usted no cumple con los requisitos.\n";
		//Desarrollo del programa
		System.out.println("Te aproximas a la Pensión de los números, si quieres salir introduce '0'.");
		do{//Primer bucle que engloba a todo el programa dado que seguirá ejecutándose hasta que el usuario quiera salir que en este caso será introduciendo 0 dado que no era un resultado aceptable para entrar a la pensión.
			if(inquilino==0){//Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (true/false)");
				salir=teclado.nextBoolean();
				System.out.println();
				inquilino++;
				if(salir)break;
			}
			else{
				do{//Segundo bucle para preguntar el número del posible inquilino no siendo válidos los números 8 y 12, 0 se usa para salir del programa y no llegaría a entrar aquí.
					switch(inquilino){
						case 8:
							System.out.println("El residente 8 vive aquí desde haces unos meses, indique su número para comprobar su admisión:");
							break;
						case 12:
							System.out.println("El residente 12 vive aquí desde haces unos meses, indique su número para comprobar su admisión:");
							break;
						default:
							System.out.println("Bienvenido a la recepción de la Pensión de los números, indique su número para comprobar su admisión:");
							break;
					}
					inquilino=teclado.nextInt();
				}while(inquilino==8 || inquilino==12);
				if(inquilino<0){//Rechazamos los inquilinos negativos
					System.out.println(rechazado);
				}
				else{//Comprobamos si el inquilino es primo, tenemos que reiniciar las variables esPrimo y aux para cada iteración.
					esPrimo=true;
					aux=2;
					while(esPrimo && aux<inquilino){//Tercer bucle para comprobar si el inquilino es primo.
						esPrimo=inquilino%aux==0?false:true;
						aux++;
					}
					if(esPrimo){
						System.out.println(rechazado);
					}
					else{//Calculamos el factorial del inquilino, tenemos que reiniciar la variable factorial para cada iteración.
						factorial=1;
						for(int i=2;i<=inquilino;i++){//Cuarto y último bucle para calcular el factorial del inquilino.
							factorial*=i;
						}
						if(factorial>1000000000 || factorial<=0){//Comprobamos que el factorial no supera el billón inglés (el que usamos en España da error al compilar porque se sale del rango) y el <=0 es para los resultados que desbordan del rango y dan resultados negativos o 0.
							System.out.println(rechazado);
						}
						else{
							System.out.println(aceptado);//El señor 0 es muy quisquilloso y solamente unos pocos números son capaces de entrar a la Pensión de los números.
						}
					}
				}
			}
		}while(salir==false);
		System.out.println("Gracias por presentar su solicitud de admisión a la Pensión de los números.\nHasta la próxima.");
	}
}
