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

    public void setSexo(int n) {
        switch (n) {
            case 1:
                this.sexo = Sexo.Macho;
                break;
            case 2:
                this.sexo = Sexo.Hembra;
                break;
            case 3:
                this.sexo = Sexo.Hermafrodita;
                break;
        }
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public void dormir() {
        System.out.println("Zzz...");
    }

    @Override
    public String toString(){
        return "Sexo: " + this.sexo;
    }
}
