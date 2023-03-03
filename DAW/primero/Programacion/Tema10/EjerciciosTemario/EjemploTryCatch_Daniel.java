//Daniel Marcos Guerra Gómez
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class EjemploTryCatch_Daniel {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(pedirLetra());
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = pedirNum();
					switch (menu) {
						case 0:
							continue;
						case 1:
							ejercicio1();
							break;
						case 2:
							ejercicio2();
							break;
						case 3:
							ejercicio3();
							break;
						case 4:
							ejercicio4();
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir != 's');
	}

	public static void opcionesMenu() {
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Pedir entero del 1 al 5                                                   #");
		System.out.println("# [2] Pedir float                                                               #");
		System.out.println("# [3] Dividir dos enteros                                                       #");
		System.out.println("# [4] Buscar en array                                                           #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static char pedirLetra() {
		return teclado.next().charAt(0);
	}

	public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un entero!");
            teclado.nextLine();
            return pedirNum();
        }
		finally{
			System.out.print(">");
		}
        teclado.nextLine();
        return num;
    }

	public static float pedirFloat() {
        float num;
        try {
            num = teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un float!");
            teclado.nextLine();
            return pedirFloat();
        }
		finally{
			System.out.print(">");
		}
        teclado.nextLine();
        return num;
    }

	public static void ejercicio1() {
		int numero;
		do {
			System.out.println("Introduce un entero del 1 al 5:");
			numero = pedirNum();
		} while (numero < 1 || numero > 5);
		System.out.println("Tu número es: " + numero);
	}

	public static void ejercicio2() {
		System.out.println("Introduce un float:");
		System.out.println("Tu número es: " + pedirFloat());
	}

	public static void ejercicio3() {
		System.out.println("Introduce 2 números enteros para dividirlos:");
		try {
			System.out.println("El resultado es: " + (pedirNum()/pedirNum()));
		} catch (ArithmeticException e) {
			System.out.println("¡No se puede dividir por 0!");
		}
	}

	public static void ejercicio4() {
		String palabras[] = {"Hola", "buenos", "días", "señor", "gracias"};
		System.out.println("La palabra en la posición elegida es: " + buscarPalabra(palabras));
	}

	public static String buscarPalabra(String[] palabras) {
		int pos;
		String palabra;
		System.out.println("Introduce una posición dentro del rango [0-" + (palabras.length-1) + "]");
		pos = pedirNum();
		try {
			palabra = palabras[pos];
		} catch (ArrayIndexOutOfBoundsException e) {
			return buscarPalabra(palabras);
		}
		return palabra;
	}

}// Fin clase