package ej11;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(6, 15, 1992);
        Fecha fecha2 = new Fecha("junio", 15, 1992);
        Fecha fecha3 = new Fecha(167, 1992);

        fecha1.imprimirFecha1();
        fecha1.imprimirFecha2();
        fecha1.imprimirFecha3();

        fecha2.imprimirFecha1();
        fecha2.imprimirFecha2();
        fecha2.imprimirFecha3();

        fecha3.imprimirFecha1();
        fecha3.imprimirFecha2();
        fecha3.imprimirFecha3();
    }
}