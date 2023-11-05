import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int base, exponente;

        System.out.println("Vamos a calcular una potencia, intruce la base:");
        base = pedirNum();
        System.out.println("Introduce el exponente:");
        exponente = pedirNum();
        System.out.println("El resultado es: " + enteroPotencia(base, exponente));
        System.out.println("El resultado de forma recursiva es: " + enteroPotenciaRecursivo(base, exponente));
    }

    public static int enteroPotencia(int base, int exponente) {
        int resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        return resultado = exponente == 0 ? 1 : resultado;
    }

    public static int enteroPotenciaRecursivo(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return enteroPotenciaRecursivo(base, exponente + 1) / base;
        } else {
            return base * enteroPotenciaRecursivo(base, exponente - 1);
        }
    }

    public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }
}