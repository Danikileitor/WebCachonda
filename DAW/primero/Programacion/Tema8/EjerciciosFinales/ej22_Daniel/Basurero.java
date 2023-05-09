package ej22_Daniel;

import java.util.Scanner;

public class Basurero {

    static String a = new String();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Presiona enter para generar basura o escribe 0 para finalizar:");
            a = teclado.nextLine();
        } while (!a.equals("0"));
        
    }

    public static void generarBasura() {
        for (int i = 0; i < 1000; i++) {
            a = new String();
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ha pasado el basurero...");
    }
}
