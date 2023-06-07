import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio10_Daniel {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        BufferedWriter escritura = null;
        //Este será nuestro directorio de partida
        String inicio = "C:/Users/FOCUS/Desktop/Imagenes/";
        //Pedimos los datos al usuario
        System.out.println("Introduzca el nombre de la carpeta a crear:");
        String carpeta = pedirFrase().trim();
        System.out.println("Introduzca el nombre del fichero a crear:");
        String fichero = pedirFrase().trim();
        System.out.println("Introduzca una frase para insertar en el fichero:");
        String frase = pedirFrase().trim();

        //Creamos el directorio, el fichero e insertamos su contenido
        try {
            Files.createDirectory(Paths.get(inicio + "/" + carpeta));
            File salida = new File(inicio + "/" + carpeta + "/" + fichero + ".txt");
            salida.createNewFile();
            escritura = new BufferedWriter(new FileWriter(salida));
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

    public static String pedirFrase() {
        return teclado.nextLine();
    }
}