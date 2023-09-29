import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej16 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] ventas = new double[5][5]; // Un array bidimensional para las ventas (vendedor x producto)

        // Leer la información de ventas del mes pasado
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese las ventas del vendedor " + i + " para el producto " + j + ": ");
                ventas[j - 1][i - 1] = pedirNum();
            }
        }

        // Imprimir encabezados de columnas (vendedores)
        System.out.print("\t\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal\n");

        // Imprimir filas (productos) y calcular totales
        double[] totalPorProducto = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Producto " + (i + 1) + "\t\t");
            double totalPorFila = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t\t");
                totalPorFila += ventas[i][j];
                totalPorProducto[j] += ventas[i][j];
            }
            System.out.print(totalPorFila + "\n");
        }

        // Imprimir totales por vendedor
        System.out.print("Total\t\t");
        double totalPorVendedor = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print(totalPorProducto[i] + "\t\t");
            totalPorVendedor += totalPorProducto[i];
        }
        System.out.print(totalPorVendedor + "\n");
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
