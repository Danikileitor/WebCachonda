package ej17_Daniel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

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
							cifrar();
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
		System.out.println("# [1] Cifrar una frase en cifrado César                                         #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static char pedirLetra() {
		return teclado.next().charAt(0);
	}

    public static String pedirFrase() {
		return teclado.nextLine();
	}

	public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }

    public static void cifrar() {
        String frase;
        System.out.println("Escribe una frase:");
        frase = pedirFrase();
        System.out.println("Indica las posiciones a mover:");
        System.out.println("La frase cifrada es:\n" + Cifrado.cesar(frase, pedirNum()));
    }

}// Fin clase
