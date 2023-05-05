package animales;

public class Prueba {
    public static void main(String[] args) {

        //Mamíferos
        Mamifero ocelote = new Mamifero();
        Mamifero avestruz = new Mamifero(Sexo.Hembra);
        Mamifero delfin = new Mamifero(Sexo.Macho, Tipo.Acuatico);
        //Gatos
        Gato elsa = new Gato();
        Gato pataky = new Gato(Raza.Esfinge);
        Gato fito = new Gato(Sexo.Macho);
        Gato fitipaldis = new Gato(Sexo.Macho, Tipo.Acuatico, Raza.Persa);

        Gato[] gatos = {elsa, pataky, fito, fitipaldis};

        System.out.println("Pruebas generales con cada gato:");
        for (Gato gato : gatos) {
            System.out.println(gato);
            gato.duerme();
            gato.ronronear();
            gato.correr();
            gato.nadar();
            gato.comer(Comida.Pescado);
            gato.comer(Comida.Fruta);
            System.out.println();
        }

        System.out.println("Pruebas interactivas:");
        fito.peleaCon(fitipaldis);
        fito.peleaCon(elsa);
        elsa.juegaCon(pataky);
        elsa.juegaCon(fito);

    }
}
