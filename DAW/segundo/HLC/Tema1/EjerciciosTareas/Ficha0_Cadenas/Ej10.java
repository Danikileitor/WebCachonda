import java.util.Scanner;

public class Ej10 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Mostramos el carácter correspondiente en ASCII entre 0 y 255:
        for (int i = 0; i < 256; i++) {
            System.out.print(i + ": " + (char) i + "\t");
        }
        System.out.println();
    }
}