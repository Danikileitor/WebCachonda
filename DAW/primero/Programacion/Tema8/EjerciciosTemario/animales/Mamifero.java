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

    public boolean nadar() {
        return this.tipo == Tipo.Acuatico;
    }

    public boolean correr() {
        return this.tipo == Tipo.Terrestre;
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
