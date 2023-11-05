import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej11 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> enteros1 = new ArrayList<>();
        ArrayList<Integer> enteros2 = new ArrayList<>();
        int entero1, entero2 = 0;

        do {
            System.out.println("Introduce el primer entero de la pareja [" + enteros1.size() + "] (introduce 0 para finalizar)");
            entero1 = pedirNum();

            if (entero1 != 0) {
                System.out.println("Introduce el segundo entero de la pareja [" + enteros2.size() + "] (introduce 0 para finalizar)");
                entero2 = pedirNum();
                
                if (entero2 != 0) {
                    enteros1.add(entero1);
                    enteros2.add(entero2);
                }
            }
        } while (entero1 != 0 && entero2 != 0);

        for (int i = 0; i < enteros1.size(); i++) {
            System.out.println("¿" + enteros2.get(i) + " es múltiplo de " + enteros1.get(i) + "? " + multiplo(enteros1.get(i), enteros2.get(i)));
        }
    }

    public static boolean multiplo(int a, int b) {
        return b % a == 0;
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