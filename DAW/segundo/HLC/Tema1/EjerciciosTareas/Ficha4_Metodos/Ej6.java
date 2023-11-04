import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> clientes = new ArrayList<>();
        double horas, total;

        do {
            System.out.println("Indica las horas de estacionamiento del cliente [" + clientes.size() + "] (introduce 0 para finalizar)");
            horas = pedirNum();
            if (horas > 0) {
                clientes.add(horas);
            }
        } while (horas > 0);

        for (Double cliente : clientes) {
            System.out.println("El pago para el cliente ... es:");
            //nos quedamos por aqui
        }
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