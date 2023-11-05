import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<>();
        double valor;

        do {
            System.out.println("Introduce el valor número [" + valores.size() + "] (introduce 0 para finalizar)");
            valor = pedirNum();
            if (valor != 0) {
                valores.add(valor);
            }
        } while (valor != 0);

        System.out.println("Original|\tRedondeado");
        for (double original : valores) {
            System.out.println(original + "\t|\t" + redondear(original));
        }
    }

    public static double redondear(double valor) {
        return Math.floor(valor + 0.5);
    }

    public static double pedirNum() {
        double num;
        try {
            num = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }
}