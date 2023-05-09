package ej22_Daniel;

public class Basura {

    int n;
    static int cantidad;

    Basura() {
        this.n = cantidad;
        cantidad++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El basusrero ha limpiado la basura número [" + this.n + "]");
    }
}
