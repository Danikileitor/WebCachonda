import java.util.Scanner;

public class Ej13 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena();

        String[] palabras = c.split(" "); // Dividir el texto en palabras por espacios en blanco

        int[] contadorPalabrasPorLongitud = new int[31]; // Contar palabras por longitud

        // Contar palabras por longitud
        for (String palabra : palabras) {
            int longitud = palabra.length();
            if (longitud <= 30) { // Limitar la longitud máxima
                contadorPalabrasPorLongitud[longitud]++;
            }
        }

        // Imprimir la tabla de conteo
        System.out.println("Longitud de palabra\tOcurrencias");
        for (int i = 1; i <= 30; i++) {
            int cantidad = contadorPalabrasPorLongitud[i];
            if (cantidad > 0) {
                System.out.println(i + "\t" + cantidad);
            }
        }
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}