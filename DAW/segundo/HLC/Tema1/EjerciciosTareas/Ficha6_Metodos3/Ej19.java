public class Ej19 {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (perfecto(i)) {
                System.out.printf("%d = %s\n", i, factores(i));
            }
        }
        System.out.println("Números perfectos superiores a 1000:");
        for (int i = 1001; i <= 10000; i++) {
            if (perfecto(i)) {
                System.out.printf("%d = %s\n", i, factores(i));
            }
        }
    }

    public static boolean perfecto(int n) {
        int suma = 1; // Inicializamos la suma con 1 porque todo número es divisible por 1

        // Iteramos desde 2 hasta la mitad del número, buscando sus factores
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                suma += i; // Si encontramos un factor, lo sumamos
            }
        }

        // Comprobamos si la suma de los factores es igual al número original
        return suma == n;
    }

    public static String factores(int n) {
        String factores = "";

        if (n == 1) {
            return "1";
        }

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factores += i + " + ";
            }
        }

        return factores.substring(0, factores.length() - 3);
    }
}