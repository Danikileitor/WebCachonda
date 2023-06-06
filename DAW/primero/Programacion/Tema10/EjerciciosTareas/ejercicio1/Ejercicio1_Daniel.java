import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_Daniel {

    public static void main(String[] args) {
        String texto = "";
        FileReader entrada = null;
        try {
            entrada = new FileReader("C:/Users/FOCUS/Documents/Ficheros/mensajecortesia.txt");
            int c = entrada.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = entrada.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(texto);
    }
}