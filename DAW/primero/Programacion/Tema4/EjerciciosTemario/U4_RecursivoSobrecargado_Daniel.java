//Daniel Marcos Guerra Gómez
/*Un menú con un método recursivo y otro sobrecargado.*/
import java.util.Scanner; //Importación de paquetes
public class U4_RecursivoSobrecargado_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu, n, m;
		double o, p;
		char decimales;
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			System.out.println("Elige una opción:\n1.Factorial recursivo\n2.Suma sobrecargada\n0.Salir");
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
				default:
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
}// Fin clase