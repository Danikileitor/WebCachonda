import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    public static void main(String[] args) {
        // Ruta del archivo de texto
        String archivo = "/home/daniel/GitHub/WebCachonda/DAW/segundo/HLC/Tema1/EjerciciosTareas/Ficha10_Ficheros1/archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            // Leer y mostrar línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}