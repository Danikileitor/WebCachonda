//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class U6_R2_StringBuilder_Daniel {
	public static void main(String[] args) {
		// Declarar variables
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
		// Desarrollo del programa
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(teclado.next().charAt(0));
				menu++;
			} else {
				do {
					menu();
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							EjercicioString();
							break;
						case 2:
							EjercicioStringBuilder();
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static void menu() {
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso programa, elige una de las siguientes opciones: #");
		System.out.println("# [1] Ejercicios con String                                                     #");
		System.out.println("# [2] Ejercicios con StringBuilder                                              #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
	}

	public static void EjercicioString() {
		String cadena = new String("Hoy es lunes y tengo clase de programacion a ultima hora");
		cadena.concat(" con mi tutor");
		cadena.substring(0, 3);
		cadena.substring(7, cadena.length());
		cadena.toLowerCase();
		cadena.toUpperCase();
		cadena.indexOf("hora", 15);
		cadena.indexOf('y');
		cadena.contains("jueves");
		cadena.startsWith("J");
		cadena.endsWith("a");
		cadena.replace("tengo", "hubo");
		System.out.println(cadena);
	}

	public static void EjercicioStringBuilder() {
		StringBuilder cadena2 = new StringBuilder("martes");
		cadena2.insert(0, "Hoy es ");
		cadena2.append(" a última hora");
		cadena2.insert(0, '¡');
		cadena2.replace(0, 4, "Ya");
		System.out.println(cadena2);
	}

}// Fin clase