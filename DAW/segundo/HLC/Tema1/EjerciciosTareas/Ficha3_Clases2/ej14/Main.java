package ej14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        DNI dni = new DNI(12345678);

        System.out.println("Introduce un nuevo DNI:");
        try {
            dni.setDni(pedirNum());
            System.out.println("Su DNI es: " + dni.getNumeroDni());
            System.out.println("Su NIF es: " + dni.getNIF());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Introduce un nuevo NIF:");
        try {
            dni.setDni(pedirCadena());
            System.out.println("Su DNI es: " + dni.getNumeroDni());
            System.out.println("Su NIF es: " + dni.getNIF());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String pedirCadena() {
		return teclado.nextLine();
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