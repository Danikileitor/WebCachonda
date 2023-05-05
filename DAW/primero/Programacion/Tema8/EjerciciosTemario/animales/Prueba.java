package animales;

public class Prueba {
    public static void main(String[] args) {

        //Gatos
        Gato elsa = new Gato();
        Gato pataky = new Gato(GatoRaza.Esfinge);
        Gato fito = new Gato(Sexo.Macho);
        Gato fitipaldis = new Gato(Sexo.Macho, Tipo.Acuatico, GatoRaza.Persa);
        //Perros
        Perro nana = new Perro();
        Perro laika = new Perro(PerroRaza.HuskySiberiano);
        Perro andy = new Perro(Sexo.Macho);
        Perro lucas = new Perro(Sexo.Macho, Tipo.Acuatico, PerroRaza.Shiba);
        //Agrupaciones
        Gato[] gatos = {elsa, pataky, fito, fitipaldis};
        Perro[] perros = {nana, laika, andy, lucas};

        System.out.println("Pruebas generales con cada gato:");
        for (Gato gato : gatos) {
            System.out.println(gato);
            gato.duerme();
            gato.maullar();
            gato.ronronear();
            gato.correr();
            gato.nadar();
            gato.comer(Comida.Pescado);
            gato.comer(Comida.Fruta);
            System.out.println();
        }

        System.out.println("Pruebas interactivas entre gatos:");
        fito.peleaCon(fitipaldis);
        fito.peleaCon(elsa);
        System.out.println();

        System.out.println("Pruebas generales con cada perro:");
        for (Perro perro : perros) {
            System.out.println(perro);
            perro.duerme();
            perro.ladrar();
            perro.grunir();
            perro.correr();
            perro.nadar();
            perro.comer(Comida.Carne);
            perro.comer(Comida.Algas);
            System.out.println();
        }

        System.out.println("Pruebas interactivas entre perros:");
        laika.juegaCon(nana);
        andy.juegaCon(nana);
        System.out.println();

        System.out.println("Finalizamos la prueba indicando la cantidad de animales:");
        System.out.println(Animal.cantidadAnimales);

    }
}
