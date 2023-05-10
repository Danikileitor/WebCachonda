package animales;

public class U8_R3_ConstructorCopia_Daniel {
    public static void main(String[] args) {

        // Prueba con clone
        Mamifero coneja = new Mamifero(Sexo.Hembra, Tipo.Terrestre);
        Mamifero conejaClonada = (Mamifero) coneja.clone();

        System.out.println("# Prueba con .clone() #");
        System.out.println("Original:");
        System.out.println(coneja);
        System.out.println("Clonado:");
        System.out.println(conejaClonada);

        System.out.println("# Prueba después de modificar el clonado: #");
        System.out.println("Original:");
        System.out.println(coneja);
        System.out.println("Clonado:");
        System.out.println(conejaClonada);

        Mamifero delfin = new Mamifero(Sexo.Macho, Tipo.Acuatico);
        Mamifero delfinCopia = new Mamifero(delfin);

    }
}
