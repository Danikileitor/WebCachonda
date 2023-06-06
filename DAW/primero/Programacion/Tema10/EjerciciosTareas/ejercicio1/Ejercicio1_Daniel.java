import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_Daniel {

    public static void main(String[] args) {
        String texto = "";
        FileReader lectura = null;
        try {
            lectura = new FileReader("mensajecortesia.txt");
            int c = lectura.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = lectura.read();
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