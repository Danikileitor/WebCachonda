//Daniel Marcos Guerra Gómez
import java.util.Scanner;

public class U4_Examen_Daniel {
	static Scanner teclado = new Scanner(System.in); //Declaro el scanner aquí para que se pueda utilizar el mismo en diferentes métodos.
	public static void main (String[] args) { //Inicio main
		//Declaración de variables
		int menu=1,numero;
		char salir='n';
		String nombre;
		//Desarrollo del programa
		System.out.println("Bienvenido al examen práctico de Daniel, introduzca su nombre:");
		nombre = teclado.nextLine();
		do{
			if(menu==0){ //confirmación de salida
				System.out.println("¿Estas seguro de que deseas salir? (s/n)");
				salir = teclado.next().charAt(0);
				menu++;
				System.out.println();
			}
			else{
				menu = mostrarMenu(nombre);//Mostramos el menú y almacenamos la elección del usuario
				switch(menu){
					case 1:
						numerosRecursivos();
						break;
					case 2:
						do{
							System.out.println("Introduzca un número entero que no sea negativo:");
							numero = teclado.nextInt();
						}while (numero < 0);//Bucle para seguir preguntando al usuario hasta que introduzca un mayor o igual que 0
						System.out.printf("El número decimal %d convertido a binario es %d.%n",numero,decBin(numero));
						break;
					default: break;
				}
				System.out.println();
			}
		}while(salir=='n');
	}//Fin main
	
	public static int mostrarMenu(String nombre){
		System.out.printf("%s, indique una de las siguientes opciones:%n[1] Mostrar los números introducidos en orden inverso.%n[2] Convertir un número decimal a binario.%n[0] Salir%n",nombre);
		return teclado.nextInt();
	}
	
	public static void numerosRecursivos(){
		int n;
		do{
			System.out.println("Introduzca un número entero positivo: (5 para finalizar)");
			n = teclado.nextInt();
			}while (n < 0);//Bucle para seguir preguntando al usuario hasta que introduzca un número mayor que 0
			
		if (n == 5){
			System.out.println("Los números en orden inverso son: "+n+",");
		}
		else{//caso recursivo
			numerosRecursivos();
			System.out.println(n+",");
		}
	}
	
	public static int decBin(int n){
		int binario;
		if (n == 0){//primer caso base, en caso de que el usuario introduzca un 0 simplemente se devolverá 0.
			binario=0;
		}
		else if (n == 1){//segundo caso base, será 1 dado que vamos a ir dividiendo el número entre 2 hasta que el resultado sea 1 (no podamos seguir dividiendo)
			binario=1;
		}
		else{//caso recursivo
			binario=decBin(n/2)*10+n%2;
		}
		return binario;
	}
}