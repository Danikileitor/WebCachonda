package animales;

import java.util.ArrayList;

public class Gato extends Mamifero {
    
    protected GatoRaza raza;
    protected ArrayList<Diente> boca;

    public Gato(Sexo sexo, Tipo tipo, GatoRaza raza) {
        super(sexo, tipo);
        this.raza = raza;
        this.boca = new ArrayList<>();
        bocaInicial();
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
        return super.toString() + " Raza: " + this.raza + " Dientes: " + this.boca.size();
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

    public void juegaCon(Gato amigo) {
        if (this.sexo == Sexo.Macho && amigo.sexo == Sexo.Macho || this.sexo == Sexo.Hembra && amigo.sexo == Sexo.Hembra) {
            System.out.println("¡Ambos gatos se ponen a jugar!");
        } else {
            System.out.println("¡No quiero jugar con ese gato!");
        }
    }

    private void bocaInicial(){
        for (int i = 0; i < 12; i++) {
            this.boca.add(new Diente(TipoDiente.Incisivo));  
        }
        for (int i = 0; i < 4; i++) {
            this.boca.add(new Diente(TipoDiente.Canino));  
        }
        for (int i = 0; i < 10; i++) {
            this.boca.add(new Diente(TipoDiente.Premolar));  
        }
        for (int i = 0; i < 4; i++) {
            this.boca.add(new Diente(TipoDiente.Molar));  
        }
    }
}
