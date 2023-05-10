package animales;

public class U8_R3_ConstructorCopia_Daniel {
    public static void main(String[] args) {

        Mamifero coneja = new Mamifero(Sexo.Hembra, Tipo.Terrestre);
        Mamifero conejaClonada = coneja.clone();
        
        Mamifero delfin = new Mamifero(Sexo.Macho, Tipo.Acuatico);
        Mamifero delfinCopia = new Mamifero(delfin);

    }
}
