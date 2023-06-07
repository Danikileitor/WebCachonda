import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio9_Daniel {

    public static void main(String[] args) {
        try {
            //Creamos la carpeta
            Path carpeta = Paths.get("C:/Users/FOCUS/Desktop/Imagenes/Carpeta");
            Files.createDirectory(carpeta);
            //Creamos la hoja de cálculo
            File fichero = new File(carpeta.toAbsolutePath().toString() + "/hoja.ods");
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}