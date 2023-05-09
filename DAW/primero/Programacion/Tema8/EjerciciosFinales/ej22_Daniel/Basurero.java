package ej22_Daniel;

import java.util.Scanner;

public class Basurero {

    static String entrada = new String();
    static Basura basura = new Basura();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Presiona enter para generar basura o escribe 0 para finalizar:");
            entrada = teclado.nextLine();
        } while (!entrada.equals("0"));
        
    }

    public static void generarBasura() {
        for (int i = 0; i < 1000; i++) {
            basura = new Basura();
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ha pasado el basurero...");
    }
}
