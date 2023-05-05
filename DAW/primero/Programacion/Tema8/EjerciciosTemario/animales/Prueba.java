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

        for (Gato gato : gatos) {
            gato.duerme();
            gato.ronronear();
            gato.correr();
            gato.nadar();
            gato.comer(Comida.Pescado);
            gato.comer(Comida.Fruta);
        }

        fito.peleaCon(fitipaldis);
        fito.peleaCon(elsa);

        
    }
}
