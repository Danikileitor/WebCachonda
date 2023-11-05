import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> clientes = new ArrayList<>();
        double horas, pago, total = 0;

        do {
            System.out.println("Indica las horas de estacionamiento del cliente [" + clientes.size() + "] (introduce 0 para finalizar)");
            horas = pedirNum();
            if (horas > 0) {
                clientes.add(horas);
            }
        } while (horas > 0);

        for (int i = 0; i < clientes.size(); i++) {
            pago = calcularPagos(clientes.get(i));
            System.out.printf("El pago para el cliente %d es de %.2f€\n", i, pago);
            total += pago;
        }

        System.out.printf("El pago total de la jornada es de %.2f€\n", total);
    }

    public static double calcularPagos(double horas) {
        double pago = 2;
        if (horas > 3) {
            pago += 0.5 * (horas - 3);
        }
        return pago = pago > 10 ? 10 : pago;
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