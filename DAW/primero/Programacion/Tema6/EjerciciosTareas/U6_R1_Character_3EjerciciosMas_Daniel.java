
//Daniel Marcos Guerra Gómez
//Implementa un menú recursivo con confirmación de salida. Donde en una de las opciones generes números aleatorios (enteros positivos) y compruebes a que símbolo corresponde. Para ello debes usar la clase Character.
import java.util.Scanner; //Importación de paquetes

public class U6_R1_Character_3EjerciciosMas_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = teclado.next().charAt(0);
				menu++;
			} else {
				do {
					System.out.printf("%n#################################################################################%n# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #%n# [1] Generar 10 símbolos aleatorios                                            #%n# [0] Salir                                                                     #%n#################################################################################%n");
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							System.out.println("Los 10 símbolos aleatorios generados son:");
							for (int i = 0; i < 10; i++) {
								char c = (char) generarAleatorio(21, 126);
								System.out.print(c + " ");
							}
							System.out.println();
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

}// Fin clase