import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Ejercicio8_Daniel {

    public static void main(String[] args) {
        try {
            Path inicio = Paths.get("C:/Users/FOCUS/Desktop/Imagenes");
            Files.walkFileTree(inicio, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path directorio, BasicFileAttributes atributos) {
                    System.out.println("Directorio: " + directorio.toString());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path archivo, BasicFileAttributes atributos) {
                    System.out.println("Archivo: " + archivo.toString());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path archivo, IOException e) {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}