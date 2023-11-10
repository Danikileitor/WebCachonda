import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej16 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un número entero:");
        int a = pedirNum();
        System.out.println("Introduce otro número entero:");
        int b = pedirNum();
        System.out.printf("La parte entera de %d / %d es: %d.\n", a, b, parteEntera(a / b));
    }

    public static int parteEntera(double n) {
        return (int) n;
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