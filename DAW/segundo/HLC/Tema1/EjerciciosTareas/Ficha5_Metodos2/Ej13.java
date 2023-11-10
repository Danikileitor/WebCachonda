import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej13 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un número entero:");
        cuadradoDeAsteriscos(pedirNum());
    }

    public static void cuadradoDeAsteriscos(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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