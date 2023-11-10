import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej17 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce los grados farenheit como un número entero:");
        int f = pedirNum();
        System.out.printf("%d grados farenheit equivalen a %d grados centígrados.\n", f, centigrados(f));
        System.out.println("Introduce los grados centígrados como un número entero:");
        int c = pedirNum();
        System.out.printf("%d grados centígrados equivalen a %d grados farenheit.\n", c, farenheit(c));
    }

    public static int centigrados(int f) {
        return 5 / 9 * (f - 32);
    }

    public static int farenheit(int c) {
        return 9 / 5 * c + 32;
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