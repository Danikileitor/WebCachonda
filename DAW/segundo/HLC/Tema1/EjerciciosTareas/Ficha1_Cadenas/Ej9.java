import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        int n = pedirNum();

        // Mostramos el carácter correspondiente en ASCII al entero:
        System.out.println("El caracter correspondiente es: " + (char) n);
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