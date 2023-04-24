package ej14_Daniel;

public class Cambio {

    private static final int[] DINERO = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static int[] calcular(int precio, int pagado) {
        int importeCambio = pagado - precio;
        int[] cambio = new int[DINERO.length];

        for (int i = 0; i < DINERO.length; i++) {
            while (importeCambio >= DINERO[i]) {
                importeCambio -= DINERO[i];
                cambio[i]++;
            }
        }

        return cambio;
    }
}
