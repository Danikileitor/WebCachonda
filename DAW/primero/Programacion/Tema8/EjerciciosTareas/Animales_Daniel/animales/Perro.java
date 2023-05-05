package animales;

public class Perro extends Mamifero {

    PerroRaza raza;

    public Perro(Sexo sexo, Tipo tipo, PerroRaza raza) {
        super(sexo, tipo);
        this.raza = raza;
    }

    public Perro(Sexo sexo) {
        this(sexo, Tipo.Terrestre, PerroRaza.Labrador);
    }

    public Perro(PerroRaza raza) {
        this(Sexo.Hembra, Tipo.Terrestre, raza);
    }

    public Perro() {
        this(Sexo.Hembra, Tipo.Terrestre, PerroRaza.Labrador);
    }

    public PerroRaza getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString() + " Raza: " + this.raza;
    }

    public void ladrar() {
        System.out.println("¡Guau Guau!");
    }

    public void grunir() {
        System.out.println("Grrrrrrrr...");
    }

    public void juegaCon(Perro amigo) {
        if (this.sexo == Sexo.Macho && amigo.sexo == Sexo.Macho || this.sexo == Sexo.Hembra && amigo.sexo == Sexo.Hembra) {
            System.out.println("¡Ambos perros se ponen a jugar!");
        } else {
            System.out.println("¡No quiero jugar con ese perro!");
        }
    }
}
