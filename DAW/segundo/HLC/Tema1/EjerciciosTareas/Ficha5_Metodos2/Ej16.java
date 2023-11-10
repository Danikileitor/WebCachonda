import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej16 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Parte a)
        System.out.println("Introduce un número entero:");
        int a = pedirNum();
        System.out.println("Introduce otro número entero:");
        int b = pedirNum();
        System.out.printf("La parte entera de %d / %d es: %d.\n", a, b, parteEntera(a, b));

        // Parte b)
        System.out.println("Introduce un número entero:");
        a = pedirNum();
        System.out.println("Introduce otro número entero:");
        b = pedirNum();
        System.out.printf("El resto de %d / %d es: %d.\n", a, b, resto(a, b));

        // Parte c)
        System.out.println("Introduce un número entero entre 1 y 99999:");
        a = pedirNum();
    }

    public static int parteEntera(int a, int b) {
        return a / b;
    }

    public static int resto(int a, int b) {
        return a % b;
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