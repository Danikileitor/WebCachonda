import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2_Daniel {
    
    public static void main(String[] args) {
        BufferedWriter escritura = null;
        try {
            FileWriter salida = new FileWriter("C:/Users/FOCUS/Documents/Ficheros/salida.txt");
            escritura = new BufferedWriter(salida);
            String frase = "Estamos escribiendo a traves de streams de datos.";
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
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