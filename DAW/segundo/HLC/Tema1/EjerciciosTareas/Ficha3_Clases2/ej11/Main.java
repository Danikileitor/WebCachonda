package ej11;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(20, 11, 2000);
        Fecha fecha2 = new Fecha(25, "Abril", 1995);
        Fecha fecha3 = new Fecha(167, 1992);

        System.out.println("Primera fecha:");
        fecha1.imprimirFecha1();
        fecha1.imprimirFecha2();
        fecha1.imprimirFecha3();
        System.out.println();

        System.out.println("Segunda fecha:");
        fecha2.imprimirFecha1();
        fecha2.imprimirFecha2();
        fecha2.imprimirFecha3();
        System.out.println();

        System.out.println("Tercera fecha:");
        fecha3.imprimirFecha1();
        fecha3.imprimirFecha2();
        fecha3.imprimirFecha3();
        System.out.println();
    }
}