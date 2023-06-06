import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4_Daniel {

    public static void main(String[] args) {
        String texto = "";
        BufferedReader lectura = null;
        try {
            FileReader entrada = new FileReader("C:/Users/FOCUS/Desktop/modulos.txt");
            lectura = new BufferedReader(entrada);
            String linea = lectura.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = lectura.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(texto);
    }
}