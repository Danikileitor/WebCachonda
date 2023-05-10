package animales;

public class U8_R3_ConstructorCopia_Daniel {
    public static void main(String[] args) {

        //Prueba con clone
        Mamifero coneja = new Mamifero(Sexo.Hembra, Tipo.Terrestre);
        Mamifero conejaClonada = (Mamifero) coneja.clone();

        System.out.println("Original:");
        System.out.println(coneja);
        System.out.println();
        System.out.println(conejaClonada);

        Mamifero delfin = new Mamifero(Sexo.Macho, Tipo.Acuatico);
        Mamifero delfinCopia = new Mamifero(delfin);



    }
}
