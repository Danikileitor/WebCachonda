package ej5;

public class Main {
    public static void main(String[] args) {
        Comercial comercialConPlus = new Comercial("Fernando", 33, 2000, 500);
        Comercial comercialSinPlus = new Comercial("Chema", 20, 2000, 150);
        Repartidor repartidorConPlus = new Repartidor("Jairo", 20, 1200, "zona 3");
        Repartidor repartidorSinPlus = new Repartidor("Pablo", 27, 1200, "zona 1");

        System.out.println(comercialConPlus);
        System.out.println(comercialSinPlus);
        System.out.println(repartidorConPlus);
        System.out.println(repartidorSinPlus);

        System.out.println("Vamos a actualizar los 2 empleados sin plus para que cumplan sus condiciones:");

        comercialSinPlus.setEdad(35);
        comercialSinPlus.setComision(250);
        comercialSinPlus.setSalario(comercialSinPlus.getSalario());
        repartidorSinPlus.setEdad(18);
        repartidorSinPlus.setZona("zona 3");
        repartidorSinPlus.setSalario(repartidorSinPlus.getSalario());

        System.out.println(comercialSinPlus);
        System.out.println(repartidorSinPlus);
    }
}
