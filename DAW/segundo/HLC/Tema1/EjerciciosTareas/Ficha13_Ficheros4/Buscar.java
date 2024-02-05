import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Buscar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo de texto:");
        String nombreArchivo = scanner.nextLine();

        System.out.println("Ingrese la palabra a buscar:");
        String palabraBuscar = scanner.nextLine();

        buscarPalabraEnArchivo(nombreArchivo, palabraBuscar);

        scanner.close();
    }

    public static void buscarPalabraEnArchivo(String nombreArchivo, String palabraBuscar) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 0;
            boolean palabraEncontrada = false;

            while ((linea = reader.readLine()) != null) {
                numeroLinea++;
                if (linea.contains(palabraBuscar)) {
                    palabraEncontrada = true;
                    System.out.println("La palabra '" + palabraBuscar + "' se encuentra en la línea " + numeroLinea);
                }
            }

            if (!palabraEncontrada) {
                System.out.println("La palabra '" + palabraBuscar + "' no se encontró en el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo!");
        }
    }
}