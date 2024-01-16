import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {
    public static void main(String[] args) {
        // Ruta de los archivos de texto (modificar antes de iniciar el programa)
        String entrada = "fichero-a.txt";
        String salida = "fichero-b.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(entrada));
                BufferedWriter bw = new BufferedWriter(new FileWriter(salida))) {
            String linea;
            String sinVocales;

            // Leer línea por línea
            while ((linea = br.readLine()) != null) {
                //Quitamos las vocales
                sinVocales = linea.replaceAll("[aáeéiíoíuúüAÁEÉIÍOÓUÚÜ]", "");

                //Escribimos la línea y realizamos un salto de línea
                bw.write(sinVocales);
                bw.newLine();
            }
            
            //Informamos de que el proceso ha terminado
            System.out.println("Se ha generado el archivo 'fichero-b.txt' con el resultado.");

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}