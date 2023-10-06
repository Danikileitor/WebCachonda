package ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000);
		CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000);
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
							System.out.println("Introduce la nueva tasa de interés anual:");
                            CuentaDeAhorros.modificarTasaInteres(pedirDouble());
							break;
                        case 2:
                            ahorrador1.calcularInteresMensual();
							ahorrador2.calcularInteresMensual();
							System.out.printf("El nuevo saldo de los ahorradores es:\nAhorrador1: %f €\nAhorrador2: %f €\n", ahorrador1.getSaldoAhorros(), ahorrador2.getSaldoAhorros());
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
		System.out.println("#######################################################################");
		System.out.println("# Prueba de cuentas de ahorros, elige una de las siguientes opciones: #");
		System.out.println("# [1] Modificar la tasa de interés anual                              #");
        System.out.println("# [2] Calcular el interés mensual                                     #");
		System.out.println("# [0] Salir                                                           #");
		System.out.println("#######################################################################");
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

    public static double pedirDouble() {
        double num;
        try {
            num = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }
}