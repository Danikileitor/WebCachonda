package ej5_Piano;

import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class Principal {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		Piano p = new Piano();
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
							Piano.Nota cancion[] = {Piano.Nota.DO, Piano.Nota.SI, Piano.Nota.SOL, Piano.Nota.RE, Piano.Nota.FA};
							for (Piano.Nota nota:cancion) {
								p.add(nota);
							}
							p.interpretar();
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
		System.out.println("# [1] Reproducir melodía                                                        #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static char pedirLetra() {
		return teclado.next().charAt(0);
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

}// Fin clase