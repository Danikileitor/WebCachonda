//Daniel Marcos Guerra Gómez
import java.util.Scanner;

public class Ej22 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		String menu = "";
		int cara = 0, cruz = 0;
		do {
			opcionesMenu();
			menu = pedirCadena();
			if (menu.equals("salir")) {
				break;
			} else {
				switch (menu) {
					case "1":
						if (tirar()) {
							cruz++;
							System.out.println("¡Cruz!");
						} else {
							cara++;
							System.out.println("¡Cara!");
						}
						System.out.printf("Veces que ha salido cara: %d\nVeces que ha salido cruz: %d\n", cara, cruz);
						break;
					default:
						System.out.println("¡Introduce una opción válida!");
						break;
				}
			}
		} while (menu != "salir");
	}

	public static void opcionesMenu() {
		System.out.println("########################################");
		System.out.println("# Elige una opción o escribe [salir]:  #");
		System.out.println("# [1] Lanzar moneda                    #");
		System.out.println("########################################");
	}

	public static String pedirCadena() {
		return teclado.nextLine();
	}

	public static boolean tirar() {
		return (int) (Math.random() * (2 - 1 + 1) + 1) == 1;
	}
}