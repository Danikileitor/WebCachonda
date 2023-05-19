package daniel;

public class Caballo_Daniel {

    private String nombre;
    private String jinete;

    //Constructores de clase
    public Caballo_Daniel(String nombre) {
        this.nombre = nombre;
    }

    public Caballo_Daniel(String nombre, String jinete) {
        this(nombre);
        this.jinete = jinete;
    }

    //Constructor por defecto
    public Caballo_Daniel() {
        this("Rocinante");
    }

    //Constructor copia
    public Caballo_Daniel(Caballo_Daniel c) {
        this(c.nombre, c.jinete);
    }

    //Métodos de clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setJinete(String jinete) {
        this.jinete = jinete;
    }

    public String getJinete() {
        return this.jinete;
    }

    @Override
    public String toString() {
        return "Nombre:\t" + this.nombre + "\nJinete:\t" + this.jinete;
    }
}
