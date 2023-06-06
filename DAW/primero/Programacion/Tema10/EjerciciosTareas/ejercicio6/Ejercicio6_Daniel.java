import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio6_Daniel {

    public static void main(String[] args) {
        String texto = "";
        FileInputStream lectura = null;
        FileOutputStream escritura = null;
        //Primero leemos la imagen
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
        //Ahora escribimos la copia de la imagen
        try {
            escritura = new FileOutputStream("C:/Users/FOCUS/Desktop/Murgi/IesMurgi_copia.jpeg");
            for (int i = 0; i < texto.length(); i++) {
                escritura.write(texto.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}