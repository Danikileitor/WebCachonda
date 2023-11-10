import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej12 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int valor;
        do {
            System.out.println("Introduce un número entero: (0 para salir)");
            valor = pedirNum();
            System.out.printf("¿El número %d es par? %s.\n", valor, esPar(valor));
        } while (valor != 0);
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
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