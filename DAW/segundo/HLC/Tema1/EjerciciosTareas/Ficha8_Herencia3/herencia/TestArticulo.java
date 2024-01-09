package herencia;

public class TestArticulo {
    public static void main(String[] args) {
        Tipo4 articulo1 = new Tipo4("Articulo con Tipo 4", 100.0);
        Tipo7 articulo2 = new Tipo7("Articulo con Tipo 7", 150.0);
        Tipo16 articulo3 = new Tipo16("Articulo con Tipo 16", 200.0);

        System.out.println("Precio con IVA para " + articulo1.getNombre() + ": $" + articulo1.getPrecio());
        System.out.println("Precio con IVA para " + articulo2.getNombre() + ": $" + articulo2.getPrecio());
        System.out.println("Precio con IVA para " + articulo3.getNombre() + ": $" + articulo3.getPrecio());
    }
}