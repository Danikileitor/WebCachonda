package animales;

public class Gato extends Mamifero {
    
    protected GatoRaza raza;

    public Gato(Sexo sexo, Tipo tipo, GatoRaza raza) {
        super(sexo, tipo);
        this.raza = raza;
    }

    public Gato(Sexo sexo) {
        this(sexo, Tipo.Terrestre, GatoRaza.Siames);
    }

    public Gato(GatoRaza raza) {
        this(Sexo.Hembra, Tipo.Terrestre, raza);
    }

    public Gato() {
        this(Sexo.Hembra, Tipo.Terrestre, GatoRaza.Siames);
    }

    public GatoRaza getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString() + " Raza: " + this.raza;
    }

    public void maullar() {
        System.out.println("¡Miau miau!");
    }

    public void ronronear() {
        System.out.println("Prrrrrrrr...");
    }

    @Override
    public void comer(Comida comida) {
        if (comida == Comida.Pescado) {
            System.out.println("¡Me encanta el pescado!");
        } else {
            System.out.println("¡No me gusta esta comida!");
        }
    }

    public void peleaCon(Gato contrincante) {
        if (this.sexo == Sexo.Macho && contrincante.sexo == Sexo.Macho) {
            System.out.println("¡Ambos gatos se pelean!");
        } else {
            System.out.println("¡Las hembras no se pelean!");
        }
    }
}