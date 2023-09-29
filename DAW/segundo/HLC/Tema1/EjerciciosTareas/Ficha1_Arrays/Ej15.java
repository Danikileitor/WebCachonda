import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej15 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] asientos = new boolean[11]; // Un array para representar los asientos (0 no se usa para coincidir el mismo número de posición-asiento)

        while (true) {
            System.out.println("Por favor escriba [1] para Primera Clase o [2] para Económico:");
            int eleccion = pedirNum();

            if (eleccion == 1) {
                int asiento = asignarAsiento(asientos, 1, 5);
                if (asiento != -1) {
                    imprimirTarjeta(asiento, "Primera Clase");
                } else {
                    System.out.println("La sección de Primera Clase está llena. ¿Desea viajar en Económico? (s/n)");
                    String respuesta = pedirCadena();
                    if (respuesta.equalsIgnoreCase("s")) {
                        asiento = asignarAsiento(asientos, 6, 10);
                        if (asiento != -1) {
                            imprimirTarjeta(asiento, "Económico");
                        } else {
                            System.out.println("Lo sentimos, el vuelo está completo. El próximo vuelo sale en 3 horas.");
                            break;
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            } else if (eleccion == 2) {
                int asiento = asignarAsiento(asientos, 6, 10);
                if (asiento != -1) {
                    imprimirTarjeta(asiento, "Económico");
                } else {
                    System.out.println("La sección Económica está llena. ¿Desea viajar en Primera Clase? (s/n)");
                    String respuesta = pedirCadena();
                    if (respuesta.equalsIgnoreCase("s")) {
                        asiento = asignarAsiento(asientos, 1, 5);
                        if (asiento != -1) {
                            imprimirTarjeta(asiento, "Primera Clase");
                        } else {
                            System.out.println("Lo sentimos, el vuelo está completo. El próximo vuelo sale en 3 horas.");
                            break;
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            } else {
                System.out.println("Opción no válida. Por favor, ingrese 1 para Primera Clase o 2 para Económico.");
            }
        }
    }

    public static int asignarAsiento(boolean[] asientos, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i;
            }
        }
        return -1; // Todos los asientos están ocupados
    }

    public static void imprimirTarjeta(int asiento, String seccion) {
        System.out.println("***************************************");
        System.out.println("*         Tarjeta de Embarque         *");
        System.out.printf("* Asiento: %-13d              *\n", asiento);
        System.out.printf("* Sección: %-13s              *\n", seccion);
        System.out.println("***************************************");
    }

    public static String pedirCadena() {
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
}
