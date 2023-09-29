import java.util.Scanner;

public class Ej3 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c1 = pedirCadena();
        System.out.println("Introduzca otra cadena de texto:");
        String c2 = pedirCadena();
        int comparacion = c1.compareTo(c2);
        if (comparacion > 0) {
            System.out.println("La primera cadena es mayor que la segunda cadena.");
        } else if (comparacion < 0) {
            System.out.println("La primera cadena es menor que la segunda cadena.");
        } else {
            System.out.println("Ambas cadenas tienen el mismo tamaño.");
        }
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}