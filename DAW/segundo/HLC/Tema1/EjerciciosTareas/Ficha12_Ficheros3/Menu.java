import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Editar aquí la ruta del fichero
        String fichero = "fichero.txt";

        System.out.println("Menú:");
        System.out.println("1) Leer y mostrar el archivo");
        System.out.println("2) Escribir una frase al final del archivo");
        System.out.println("3) Triturar el archivo para conservar solo una frase");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                leerArchivo(fichero);
                break;
            case 2:
                escribirAlFinal(fichero);
                break;
            case 3:
                triturarArchivo(fichero);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void leerArchivo(String fichero) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static void escribirAlFinal(String fichero) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la frase a agregar al final del archivo:");
            String frase = scanner.nextLine();
            writer.write(frase);
            writer.newLine();
            System.out.println("Frase escrita correctamente al final del archivo.");
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }

    public static void triturarArchivo(String fichero) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la frase a conservar:");
            String frase = scanner.nextLine();
            writer.write(frase);
            writer.newLine();
            System.out.println("Frase escrita correctamente al final del archivo.");
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
}