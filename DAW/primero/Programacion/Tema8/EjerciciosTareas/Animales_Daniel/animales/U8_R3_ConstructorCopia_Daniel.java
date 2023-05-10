package animales;

public class U8_R3_ConstructorCopia_Daniel {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Prueba con clone
        Mamifero coneja = new Mamifero(Sexo.Hembra, Tipo.Terrestre);
        Mamifero conejaClonada = (Mamifero) coneja.clone();

        System.out.println("# Prueba con .clone() #");
        System.out.println("Original:");
        System.out.println(coneja);
        System.out.println("Clonado:");
        System.out.println(conejaClonada);

        conejaClonada.sexo = Sexo.Macho;
        conejaClonada.tipo = Tipo.Acuatico;

        System.out.println("# Prueba después de modificar el clonado: #");
        System.out.println("Original:");
        System.out.println(coneja);
        System.out.println("Clonado:");
        System.out.println(conejaClonada);

        // Prueba con el método constructor copia
        Mamifero delfin = new Mamifero(Sexo.Macho, Tipo.Acuatico);
        Mamifero delfinCopia = new Mamifero(delfin);

        System.out.println("# Prueba con el método constructor copia #");
        System.out.println("Original:");
        System.out.println(delfin);
        System.out.println("Copia:");
        System.out.println(delfinCopia);

        delfinCopia.sexo = Sexo.Hembra;
        delfinCopia.tipo = Tipo.Terrestre;

        System.out.println("# Prueba después de modificar la copia: #");
        System.out.println("Original:");
        System.out.println(delfin);
        System.out.println("Copia:");
        System.out.println(delfinCopia);
    }
}
