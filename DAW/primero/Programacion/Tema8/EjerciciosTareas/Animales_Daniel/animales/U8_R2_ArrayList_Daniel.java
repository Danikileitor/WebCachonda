package animales;

import java.util.ArrayList;
import java.util.Iterator;

public class U8_R2_ArrayList_Daniel {
    public static void main(String[] args) {

        Perro nana = new Perro();
        Perro laika = new Perro(PerroRaza.HuskySiberiano);
        Perro andy = new Perro(Sexo.Macho);
        Perro lucas = new Perro(Sexo.Macho, Tipo.Acuatico, PerroRaza.Shiba);

        ArrayList<Perro> perros = new ArrayList<Perro>();
        perros.add(nana);
        perros.add(0, laika);
        perros.add(andy);
        perros.add(lucas);
        perros.add(2, lucas);

        System.out.println(perros.size());
        System.out.println(perros.get(1));
        System.out.println(perros.contains(andy));
        System.out.println(perros.indexOf(lucas));
        System.out.println(perros.lastIndexOf(lucas));

        perros.remove(0);
        perros.remove(lucas);

        ArrayList perrosCopia = (ArrayList) perros.clone();

        Object[] array = perros.toArray();

        Iterator<Perro> miIterator = perros.iterator();
        while (miIterator.hasNext()) {
            Perro perro = miIterator.next();
            System.out.println(perro);
        }

        perros.clear();
        System.out.println(perros.isEmpty());
    }
}
