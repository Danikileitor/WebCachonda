package animales;

public abstract class Animal {

    protected Sexo sexo;
    protected static int cantidadAnimales;

    public Animal() {
        this.sexo = Sexo.Macho;
        cantidadAnimales++;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo;
        cantidadAnimales++;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public void dormir() {
        System.out.println("Zzz...");
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    @Override
    public String toString(){
        return "Sexo: " + this.sexo;
    }
}
