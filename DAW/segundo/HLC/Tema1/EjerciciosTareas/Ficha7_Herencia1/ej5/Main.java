package ej5;

public class Main {
    public static void main(String[] args) {
        Comercial comercialConPlus = new Comercial("Fernando", 33, 2000, 500);
        Comercial comercialSinPlus = new Comercial("Chema", 20, 2000, 150);
        Repartidor repartidorConPlus = new Repartidor("Jairo", 20, 1200, "zona 3");
        Repartidor repartidorSinPlus = new Repartidor("Pablo", 20, 1200, "zona 1");

        System.out.println(comercialConPlus);
        System.out.println(comercialSinPlus);
        System.out.println(repartidorConPlus);
        System.out.println(repartidorSinPlus);
    }
}
