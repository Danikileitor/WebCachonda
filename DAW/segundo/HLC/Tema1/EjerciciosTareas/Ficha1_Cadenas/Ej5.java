import java.util.Scanner;

public class Ej5 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c1 = pedirCadena();
        System.out.println("Introduce un carácter:");
        char c2 = pedirChar();
        int cantidad = 0;
        for (int i = 0; i < args.length; i++) {
            //falta hacer esto con indexOf();
        }
        System.out.println("Total de coincidencias: " + cantidad);
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}

    public static char pedirChar() {
		return teclado.next().charAt(0);
	}
}