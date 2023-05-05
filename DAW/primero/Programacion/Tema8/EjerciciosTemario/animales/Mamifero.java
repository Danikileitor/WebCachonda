package animales;

public class Mamifero extends Animal {

    Tipo tipo;

    Mamifero() {
        super(Sexo.Macho);
        this.tipo = Tipo.Terrestre;
    }

    Mamifero(Sexo sexo, Tipo tipo) {
        super(sexo);
        this.tipo = tipo;
    }

    Mamifero(Sexo sexo) {
        this(sexo, Tipo.Terrestre);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void nadar() {
        if (this.tipo == Tipo.Acuatico) {
            System.out.println("¡Estoy preparado para nadar!");
        } else {
            System.out.println("¡No puedo nadar mucho!");
        }
    }

    public void correr() {
        if (this.tipo == Tipo.Terrestre) {
            System.out.println("¡Estoy preparado para correr!");
        } else {
            System.out.println("¡No puedo correr! yo solo sé nadar");
        }
    }

    public void duerme() {
        super.dormir();
    }

    public void comer(Comida comida) {
        if (comida == Comida.Algas && this.tipo == Tipo.Acuatico) {
            System.out.println("¡Le ha encantado la comida!");
        } else if (comida != Comida.Algas && this.tipo == Tipo.Terrestre) {
            System.out.println("¡Le ha encantado la comida!");
        } else {
            System.out.println("¡No le gusta para nada esta comida!");
        }
    }
}
