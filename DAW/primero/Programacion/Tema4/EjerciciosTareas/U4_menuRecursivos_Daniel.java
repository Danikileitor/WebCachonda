//Daniel Marcos Guerra Gómez
/*Pŕactica U4_menuRecursivos*/
import java.util.Scanner; //Importación de paquetes
public class U4_menuRecursivos_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu, n, m;
		double o, p;
		char decimales;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		System.out.println("Bienvenido a mi humilde programa.");
		do {
			System.out.println("\nElige una opción:\n1.Factorial recursivo\n2.Suma sobrecargada\n3.Potencia iterativa\n4.Potencia recursiva\n5.MCD recursivo\n6.Fibonacci recursivo\n0.Salir");
			menu = teclado.nextInt();
			switch (menu) {
				case 0:
					break;
				case 1:
					System.out.println("Introduce un número entero:");
					n=teclado.nextInt();
					System.out.printf("El factorial %d! es %d.%n",n,factorialRecursivo(n));
					break;
				case 2:
					System.out.println("¿Vas a sumar con decimales? (s/n)");
					decimales = teclado.next().charAt(0);
					switch (decimales) {
						case 'n':
							System.out.println("Introduce un número entero:");
							n=teclado.nextInt();
							System.out.println("Introduce otro número entero:");
							m=teclado.nextInt();
							System.out.printf("La suma de %d y %d es %d.%n",n,m,sumaSobrecargada(n,m));
							break;
						case 's':
							System.out.println("Introduce un número real:");
							o=teclado.nextDouble();
							System.out.println("Introduce otro número real:");
							p=teclado.nextDouble();
							System.out.printf("La suma de %f y %f es %f.%n",o,p,sumaSobrecargada(o,p));
							break;
						default:
							break;
					}
					break;
				case 3:
					System.out.println("Introduce la base real:");
					o=teclado.nextDouble();
					do {
						System.out.println("Introduce el exponente entero positivo:");
						n=teclado.nextInt();
					} while (n<0);
					System.out.printf("La potencia %f elevado a %d es %f.%n",o,n,potenciaIterativa(o,n));
					break;
				case 4:
					System.out.println("Introduce la base real:");
					o=teclado.nextDouble();
					do {
						System.out.println("Introduce el exponente entero positivo:");
						n=teclado.nextInt();
					} while (n<0);
					System.out.printf("La potencia %f elevado a %d es %f.%n",o,n,potenciaRecursiva(o,n));
					break;
				case 5:
					System.out.println("Introduce un número entero:");
					n=teclado.nextInt();
					System.out.println("Introduce otro número entero:");
					m=teclado.nextInt();
					System.out.printf("El máximo común divisor entre %d y %d es %d.%n",n,m,mcdRecursivo(n,m));
					break;
				case 6:
					System.out.println("Introduce un número entero:");
					n=teclado.nextInt();
					System.out.printf("El termino número %d de la serie de Fibonacci es %d.%n",n,fibonacciRecursivo(n));
					break;
				default:
					menu=0;
					break;
			}
		} while (menu != 0);
	}// Fin main
	public static long factorialRecursivo(int x){
		long factorial=1;
		if(x==0){
			factorial=1;
		}
		else{
			factorial=x*factorialRecursivo(x-1);
		}
		return factorial;
	}
	public static int sumaSobrecargada(int x, int y){
		return (x+y);
	}
	public static double sumaSobrecargada(double x, double y){
		return (x+y);
	}
	public static double potenciaIterativa(double x, int y){
		double potencia=1;
		if (y==0) {
			return potencia;
		} else {
			for(int i=1;i<=y;i++){
				potencia*=x;
			}
			return potencia;
		}
	}
	public static double potenciaRecursiva(double x, int y){
		double potencia;
		if (y==0) {
			potencia=1;
		} else {
			potencia=x*potenciaRecursiva(x,y-1);
		}
		return potencia;
	}
	public static int mcdRecursivo(int x, int y){
		int mcd;
		if(y==0){
			mcd=x;
		}
		else{
			mcd=mcdRecursivo(y,x%y);
		}
		return mcd;
	}
	/*Esta sería mi método para fibonacci porque 0=0, 1y2=1, pero el ejercicio dice que los 2 primeros números serán 0 y 1 asique lo hago de nuevo
	public static int fibonacciRecursivo(int x){
		int fibonacci;
		if(x<=0){
			fibonacci=0;
		}
		if(x==1 || x==2){
			fibonacci=1;
		}
		else{
			fibonacci=fibonacciRecursivo(x-1)+fibonacciRecursivo(x-2);
		}
		return fibonacci;
	} */
	public static int fibonacciRecursivo(int x){
		int fibonacci;
		if(x==0 || x==1){
			fibonacci=1;
		}
		else{
			fibonacci=fibonacciRecursivo(x-1)+fibonacciRecursivo(x-2);
		}
		return fibonacci;
	}
}// Fin clase