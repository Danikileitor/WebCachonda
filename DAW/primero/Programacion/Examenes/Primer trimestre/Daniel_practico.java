//Daniel Marcos Guerra Gómez
import java.util.Scanner;

public class Daniel_practico {
	static Scanner teclado = new Scanner(System.in); //Declaro el scanner aquí para que se pueda utilizar el mismo en diferentes métodos.
	static String inverso="";//Explicación en el método numerosRecursivos()
	public static void main (String[] args) { //Inicio main
		//Declaración de variables
		int menu=1,numero,aux;
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
						do{
							System.out.println("Introduzca un número entero positivo: (5 para finalizar)");
							numero = teclado.nextInt();
						}while (numero <= 0);//Bucle para seguir preguntando al usuario hasta que introduzca un número mayor que 0
						aux=numerosRecursivos(numero);//Dado que este método devuelve un int (explicado dentro del método) necesito este auxilar para almacenar los números introducidos por el usuario
						System.out.println("Los números introducidos en orden inverso son:");
						System.out.println(inverso);
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
	
	public static int numerosRecursivos(int n){
		int resultado;
		if (n == 5){//caso base, será 5 dado que es la parada que hemos indicado al usuario
			resultado = 5;
			inverso = "5";//***Como el método devuelve un int, los números estaban todos pegados, por lo que he creado esta String para poder separarlos.***
		}
		else{//caso recursivo
			do{
			System.out.println("Introduzca un número entero positivo: (5 para finalizar)");
			resultado = teclado.nextInt();
			}while (resultado <= 0);//Bucle para seguir preguntando al usuario hasta que introduzca un número mayor que 0
			resultado = n+numerosRecursivos(resultado)*10;
			inverso=inverso+", "+resultado%10;
		}
		return resultado;
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
