package animales;

import java.util.ArrayList;

public class U8_R2_ArrayList_Daniel {
    public static void main(String[] args) {

        Perro nana = new Perro();
        Perro laika = new Perro(PerroRaza.HuskySiberiano);
        Perro andy = new Perro(Sexo.Macho);
        Perro lucas = new Perro(Sexo.Macho, Tipo.Acuatico, PerroRaza.Shiba);

        ArrayList<Perro> perros = new ArrayList<Perro>();
        
    }
}
