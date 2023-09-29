import java.util.Scanner;

public class Ej5 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c1 = pedirCadena();
        System.out.println("Introduce un carácter:");
        char c2 = pedirChar();
        int cantidad = 0;
        int posicion = 0;
        while (posicion != -1) {
            posicion = c1.indexOf(c2, posicion);
            if (posicion != -1) {
                cantidad++;
                posicion++;
            }
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