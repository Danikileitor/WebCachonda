import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2_Daniel {
    
    public static void main(String[] args) {
        BufferedWriter salida = null;
        try {
            FileWriter fichero = new FileWriter("C:/Users/FOCUS/Documents/Ficheros/salida.txt");
            salida = new BufferedWriter(fichero);
            String frase = "Estamos escribiendo a través de streams de datos.";
            for (int i = 0; i < frase.length(); i++) {
                salida.write(frase.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}