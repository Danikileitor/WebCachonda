package herencia;

public class TestArticulo {
    public static void main(String[] args) {
        Tipo4 articuloTipo4 = new Tipo4("Articulo Tipo 4", 100.0);
        Tipo7 articuloTipo7 = new Tipo7("Articulo Tipo 7", 150.0);
        Tipo16 articuloTipo16 = new Tipo16("Articulo Tipo 16", 200.0);

        System.out.println("Precio con IVA para " + articuloTipo4.getNombre() + ": $" + articuloTipo4.getPrecio());
        System.out.println("Precio con IVA para " + articuloTipo7.getNombre() + ": $" + articuloTipo7.getPrecio());
        System.out.println("Precio con IVA para " + articuloTipo16.getNombre() + ": $" + articuloTipo16.getPrecio());
    }
}