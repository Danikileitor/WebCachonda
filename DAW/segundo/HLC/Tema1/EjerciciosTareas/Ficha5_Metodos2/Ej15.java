import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej15 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el radio del círculo:");
        double radio = pedirNum();
        System.out.printf("El área del círculo con radio %f es: %f.", radio, circuloArea(radio));
    }

    public static double circuloArea(double radio) {
        return radio * radio * Math.PI;
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