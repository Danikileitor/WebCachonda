import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Diario");

        // Obtener la fecha para la entrada del diario
        System.out.println("Inserte la fecha en formato [dd/MM/yyyy]:");
        String fecha = scanner.nextLine();

        // Obtener la entrada del diario del usuario
        System.out.println("Escriba su entrada de diario (presione INTRO para guardar):");
        String entrada = scanner.nextLine();

        // Guardar la entrada en el diario
        guardarEntradaDiario(fecha, entrada.toString());

        System.out.println("Entrada de diario guardada con éxito.");
    }

    public static void guardarEntradaDiario(String fecha, String entrada) {
        String nombreArchivo = "diario.txt";

        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            escritor.write("Fecha: " + fecha + "\n");
            escritor.write(entrada + "\n");
            escritor.write("---------------------------------------------------\n");
        } catch (IOException e) {
            System.out.println("Error al guardar la entrada en el diario: " + e.getMessage());
        }
    }
}