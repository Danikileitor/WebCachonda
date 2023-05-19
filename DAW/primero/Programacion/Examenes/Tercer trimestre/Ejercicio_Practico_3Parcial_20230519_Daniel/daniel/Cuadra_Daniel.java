package daniel;

import java.util.ArrayList;

public class Cuadra_Daniel {

    private final String CIF;
    private String nombre;
    private String residencia;
    private ArrayList<Caballo_Daniel> residentes;

    //Constructores de clase
    public Cuadra_Daniel(String cif, String nombre, String residencia) {
        this.CIF = cif;
        this.nombre = nombre;
        this.residencia = residencia;
        this.residentes = new ArrayList<>();
    }

    public Cuadra_Daniel(String cif, String nombre, String residencia, ArrayList<Caballo_Daniel> residentes) {
        this(cif, nombre, residencia);
        this.residentes = residentes;
    }

    //Constructor por defecto
    public Cuadra_Daniel() {
        this("12345678Z", "La Cuadra", "Almería");
    }

    //Constructor copia
    public Cuadra_Daniel(Cuadra_Daniel c) {
        this(c.CIF, c.nombre, c.residencia, c.residentes);
    }

    //Métodos de clase
    public String getCIF() {
        return this.CIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getResidencia() {
        return this.residencia;
    }

    public void setResidentes(ArrayList<Caballo_Daniel> residentes) {
        this.residentes = residentes;
    }

    public ArrayList<Caballo_Daniel> getResidentes() {
        return this.residentes;
    }
    
    public Caballo_Daniel getResidente(int posicion){
        return this.residentes.get(posicion);
    }

    @Override
    public String toString() {
        return "CIF:\t" + this.CIF + "\nNombre:\t" + this.nombre + "\nResidencia:\t" + this.residencia + "\n" + listarResidentes();
    }

    public String listarResidentes() {
        String salida = "Residentes:";
        for (Caballo_Daniel caballo : residentes) {
            salida += "\n" + caballo.toString();
        }
        return salida;
    }
}
