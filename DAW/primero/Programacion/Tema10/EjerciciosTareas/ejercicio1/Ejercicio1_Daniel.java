import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_Daniel {

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("mensajecortesia.txt");
            int c = in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(texto);
    }
}