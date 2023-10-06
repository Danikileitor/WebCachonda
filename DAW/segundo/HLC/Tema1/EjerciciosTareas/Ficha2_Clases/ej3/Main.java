package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Rectangulo r1 = new Rectangulo();
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
							System.out.println("Introduce la nueva longitud entre 0.0 y 20.0:");
                            r1.setLongitud(pedirDouble());
							break;
                        case 2:
							System.out.println("Introduce la nueva anchura entre 0.0 y 20.0:");
                            r1.setAnchura(pedirDouble());
							break;
                        case 3:
							System.out.println("El perítro del rectángulo es: " + r1.perimetro());
							break;
                        case 4:
							System.out.println("El área del rectángulo es: " + r1.area());
							break;
                        case 5:
							System.out.println(r1.toString());
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
		System.out.println("################################################################");
		System.out.println("# Prueba de rectángulos, elige una de las siguientes opciones: #");
		System.out.println("# [1] Cambiar longitud                                         #");
        System.out.println("# [2] Cambiar anchura                                          #");
        System.out.println("# [3] Calcular perímetro                                       #");
        System.out.println("# [4] Calcular área                                            #");
        System.out.println("# [5] Mostrar información sobre el rectángulo                  #");
		System.out.println("# [0] Salir                                                    #");
		System.out.println("################################################################");
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
