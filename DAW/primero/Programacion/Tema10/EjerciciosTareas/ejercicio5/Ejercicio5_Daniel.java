import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio5_Daniel {

    public static void main(String[] args) {
        String texto = "";
        FileInputStream lectura = null;
        try {
            lectura = new FileInputStream("C:/Users/FOCUS/Desktop/Murgi/IesMurgi.jpeg");
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