import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej15 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad a imprimir en el cheque:");
        double cantidad = pedirNum();

        String cantidadFormateada = formatearCantidadCheque(cantidad);
        System.out.println("Cantidad en formato de cheque: " + cantidadFormateada);
    }

    public static String formatearCantidadCheque(double cantidad) {
        // Convierte la cantidad en una cadena con dos decimales
        String cantidadCadena = String.format("%.2f", cantidad);

        // Reemplaza el punto decimal por una coma (formato español)
        cantidadCadena = cantidadCadena.replace(".", ",");

        // Completa con asteriscos al principio si es necesario
        int longitudActual = cantidadCadena.length();
        StringBuilder cantidadFormateada = new StringBuilder(cantidadCadena);
        
        while (longitudActual < 9) {
            cantidadFormateada.insert(0, '*');
            longitudActual++;
        }

        return cantidadFormateada.toString();
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