import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) {
        // Ruta del archivo de texto (modificar antes de iniciar el programa)
        String fichero = "fichero.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fichero));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
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