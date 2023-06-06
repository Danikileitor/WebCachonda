import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3_Daniel {
    
    public static void main(String[] args) {
        BufferedWriter escritura = null;
        try {
            FileWriter salida = new FileWriter("C:/Users/FOCUS/Documents/Ficheros/salida.txt", true); //Se añade este "true" para habilitar la sobreescritura
            escritura = new BufferedWriter(salida);
            String frase = "IES Murgi ( El Ejido) Almeria";
            escritura.newLine();
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            frase = "Curso 2021 2022.";
            escritura.newLine();
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            frase = "CFGS DAW.";
            escritura.newLine();
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