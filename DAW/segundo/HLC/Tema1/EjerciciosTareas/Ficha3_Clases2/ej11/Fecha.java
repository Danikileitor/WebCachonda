package ej11;

import java.util.Arrays;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    private static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(int dia, String mes, int anio) {
        this(dia, Arrays.binarySearch(meses, mes) + 1, anio);
    }

    public Fecha(int dia, int anio) {
        this(calcularDiaMes(dia, anio)[0], calcularDiaMes(dia, anio)[1], anio);
    }

    private static int[] calcularDiaMes(int dia, int anio) {
        int[] resultado = {dia, 1};
        boolean esBisiesto = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
        int[] diasPorMes = esBisiesto
            ? new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
            : new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (resultado[0] > diasPorMes[resultado[1]]) {
            resultado[0] -= diasPorMes[resultado[1]];
            resultado[1]++;
        }

        return resultado;
    }

    private int calcularDia(int dia, int mes, int anio) {
        boolean esBisiesto = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
        int[] diasPorMes = esBisiesto
            ? new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
            : new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int resultado = dia;
        for (int i = 1; i < mes-1; i++) {
            resultado += diasPorMes[i];
        }
        return resultado;
    }

    public void imprimirFecha1() {
        System.out.printf("%02d/%02d/%d\n",mes,dia,anio);
    }

    public void imprimirFecha2() {
        System.out.printf("%s %d, %d\n",meses[mes],dia,anio);
    }

    public void imprimirFecha3() {
        System.out.printf("%d %d\n",calcularDia(dia, mes, anio),anio);
    }
}