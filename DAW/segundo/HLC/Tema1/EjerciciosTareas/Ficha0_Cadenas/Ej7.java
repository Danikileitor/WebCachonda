import java.util.Scanner;

public class Ej7 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena();

        // Dividimos la cadena en palabras:
        String[] palabras = c.split(" ");

        // Mostramos las palabras que empiecen por B:
        for (String palabra : palabras) {
            if (palabra.toLowerCase().startsWith("b")) {
                System.out.println(palabra);
            }
        }
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}