import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej26 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String jugar = "si";
        do {
            int aleatorio = new Random().nextInt(1000) + 1;
            int usuario = 0;
            System.out.println("Adivine un número entre 1 y 1000");
            usuario = pedirNum();
            while (aleatorio != usuario) {
                if (aleatorio < usuario) {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                } else {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                }
                usuario = pedirNum();
            }
            System.out.println("¡Felicidades. Adivinó el número!");
            System.out.println("¿Desea jugar otra vez? (Cualquier respuesta ajena a 'no' se tomará como un sí)");
            jugar = pedirCadena().trim().toLowerCase();
        } while (!jugar.equals("no"));
    }

    public static String pedirCadena() {
        return teclado.nextLine();
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