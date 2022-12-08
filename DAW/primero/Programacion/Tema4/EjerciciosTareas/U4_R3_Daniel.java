
//Daniel Marcos Guerra Gómez
//Completa tu menu iterativo con confirmación de salida (si o no) con métodos que resuelvan los ejercicios Ejercicios 4_15 al 4_19 de la pag 120 de tu libro.
import java.util.Scanner; //Importación de paquetes

public class U4_R3_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1,n,m,hora1,hora2,minuto1,minuto2,numero,a,b,cantidad,minimo,maximo;
		char letra,salir = 'n';
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = teclado.next().charAt(0);
				menu++;
			} else {
				do {
					System.out.printf("%n###############################################################################%n#Bienvenido a este maravilloso programa, elige una de las siguientes opciones:#%n#1.Hacer eco.                                                                 #%n#2.Calcular los números comprendidos entre 2 números.                         #%n#3.Calcular los números comprendidos entre 2 números.                         #%n#4.Comprobar el número mayor de entre 2 números.                              #%n#5.Comprobar si una letra es vocal.                                           #%n#6.Comprobar si un número es primo.                                           #%n#7.Ejercicio 4_15                                                             #%n#8.Ejercicio 4_16                                                             #%n#9.Ejercicio 4_17                                                             #%n#10.Ejercicio 4_18                                                            #%n#11.Ejercicio 4_19                                                            #%n#0.Salir                                                                      #%n###############################################################################%n");
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							System.out.println("Introduce un número entero:");
							n = teclado.nextInt();
							System.out.printf("Hacemos eco %d veces:%n", n);
							eco(n);
							break;
						case 2:
							System.out.println("Introduce un número entero:");
							n = teclado.nextInt();
							System.out.println("Introduce otro número entero:");
							m = teclado.nextInt();
							comprendidos(n, m);
							break;
						case 3:
							System.out.println("Introduce un número entero:");
							n = teclado.nextInt();
							System.out.println("Introduce otro número entero:");
							m = teclado.nextInt();
							comprendidos(n, m);
							break;
						case 4:
							System.out.println("Introduce un número entero:");
							n = teclado.nextInt();
							System.out.println("Introduce otro número entero:");
							m = teclado.nextInt();
							System.out.printf("El número mayor entre %d y %d es %d.%n", n, m, mayor(n, m));
							break;
						case 5:
							System.out.println("Introduce una letra:");
							letra = teclado.next().charAt(0);
							System.out.println("¿La letra " + letra + " es una vocal? " + esVocal(letra));
							break;
						case 6:
							System.out.println("Introduce un número entero:");
							n = teclado.nextInt();
							System.err.println("¿El número " + n + " es primo? " + esPrimo(n));
							break;
						case 7:
							System.out.println("Introduce dos instantes de tiempo y te mostrarte su diferencia en minutos:");
							System.out.println("Introduce la cantidad de horas seguida de los minutos del primer instante:");
							hora1 = teclado.nextInt();
							minuto1 = teclado.nextInt();
							System.out.println("Introduce la cantidad de horas seguida de los minutos del segundo instante:");
							hora2 = teclado.nextInt();
							minuto2 = teclado.nextInt();
							System.out.printf("La diferencia entre ambos instantes de tiempo es de %d minutos.%n", diferenciaMin(hora1, minuto1, hora2, minuto2));
							break;
						case 8:
							System.out.println("Introduce un número entero y te indicaré todos sus divisores primos:");
							numero = teclado.nextInt();
							System.out.printf("Los divisores primos de %d son:%n",numero);
							divisoresPrimos(numero);
							break;
						case 9:
							System.out.println("Introduce dos números enteros positivos y te diré si son amigos:");
							System.out.println("Introduce el primer número:");
							a = teclado.nextInt();
							System.out.println("Introduce el segundo número:");
							b = teclado.nextInt();
							if (comprobarAmigos(a, b)) {
								System.out.printf("Los números %d y %d son amigos.%n",a,b);	
							} else {
								System.out.printf("Los números %d y %d no son amigos.%n",a,b);
							}
							break;
						case 10:
							System.out.println("¡Bienvenido al generador de números aleatorios RNG!");
							System.out.println("Introduce la cantidad de números aleatorios que quieres generar:");
							cantidad = teclado.nextInt();
							System.out.println("Introduce el valor mínimo:");
							minimo = teclado.nextInt();
							System.out.println("Introduce el valor máximo:");
							maximo = teclado.nextInt();
							System.out.printf("Voy a mostrar %d números aleatorios entre %d y %d:%n",cantidad,minimo,maximo);
							generarAleatorios(cantidad, minimo, maximo);
							break;
						case 11:
							System.out.println("Introduce la cantidad de números aleatorios que quieres generar:");
							cantidad = teclado.nextInt();
							generarAleatorios(cantidad);
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static void eco(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" Eco.....");
		}
		System.out.println();
	}

	public static void comprendidos(int n, int m) {
		if (m > n) {
			int aux = m;
			m = n;
			n = aux;
		}
		System.out.printf("Los números comprendidos entre %d y %d son:", n, m);
		for (int i = m; i <= n; i++) {
			System.out.printf(" %d", i);
		}
		System.out.println();
	}

	public static int mayor(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}

	public static boolean esVocal(char letra) {
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		int aux = 2;
		while (aux < n && esPrimo) {
			esPrimo = n % aux == 0 ? false : true;
			aux++;
		}
		return (esPrimo);
	}

	public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		int total1 = hora1 * 60 + minuto1;
		int total2 = hora2 * 60 + minuto2;
		int diferencia = total1 > total2 ? total1 - total2 : total2 - total1;
		return diferencia;
	}

	public static void divisoresPrimos(int n) {
		for (int i=2;i<=n;i++){
			if (n%i==0 && esPrimo(i)) {
				System.out.println(i);	
			}
		}
	}

	public static boolean comprobarAmigos(int a, int b) {
		return sumaDivisores(a)==sumaDivisores(b);
	}

	public static int sumaDivisores(int n) {
		int suma=0;
		for (int i=1;i<=n;i++){
			if (n%i==0) {
				suma+=i;
			}
		}
		return suma;
	}

	public static void generarAleatorios(int cant, int min, int max) {
		for(int i=1;i<=cant;i++){
			System.out.printf("%.0f%n",Math.floor(Math.random()*(max-min+1)+min));
		}
	}

	public static void generarAleatorios(int cant) {
		for(int i=1;i<=cant;i++){
			System.out.println(Math.random());
		}
	}

}// Fin clase