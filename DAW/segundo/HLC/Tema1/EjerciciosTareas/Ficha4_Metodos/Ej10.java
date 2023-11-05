import java.util.Scanner;

public class Ej10 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] triangulos = { { 0, 0 }, { 0, 12 }, { 8, 15 } };

        System.out.println("Las hipotenusas de los triángulos son:");
        for (double[] triangulo : triangulos) {
            System.out.println(hipotenusa(triangulo[0], triangulo[1]));
        }
    }

    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(lado1 * lado1 + lado2 * lado2);
    }
}