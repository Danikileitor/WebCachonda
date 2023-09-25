import java.util.Scanner;

public class Ej4 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena();
        System.out.println(c.toUpperCase());
        System.out.println(c.toLowerCase());
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}