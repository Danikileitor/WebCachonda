import java.util.Scanner;

public class Ej11 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena();

        // Usando indexOf para encontrar la primera aparición de una subcadena
        System.out.println("Indica la cadena que quieres encontrar por el principio:");
        int primeraAparicion = c.indexOf(pedirCadena());
        System.out.println("Aparece por primera vez en la posición: " + primeraAparicion);

        // Usando lastIndexOf para encontrar la última aparición de una subcadena
        System.out.println("Indica la cadena que quieres encontrar por el final:");
        int ultimaAparicion = c.lastIndexOf(pedirCadena());
        System.out.println("Aparece por última vez en la posición: " + ultimaAparicion);
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}