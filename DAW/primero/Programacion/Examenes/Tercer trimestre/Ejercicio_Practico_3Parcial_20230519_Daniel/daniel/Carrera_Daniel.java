package daniel;

import java.util.ArrayList;

public class Carrera_Daniel {

    private ArrayList<Caballo_Daniel> participantes;
    private Caballo_Daniel ganador;
    private String lugar;
    private String fecha;

    //Constructores de clase
    public Carrera_Daniel(String lugar, String fecha) { //Constructor para preparar sin conocer sus participantes
        this.lugar = lugar;
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public Carrera_Daniel(ArrayList<Caballo_Daniel> participantes, String lugar, String fecha) { //Constructor para preparar la carrera sin conocer aún su ganador
        this(lugar, fecha);
        this.participantes = participantes;
    }

    public Carrera_Daniel(ArrayList<Caballo_Daniel> participantes, Caballo_Daniel ganador, String lugar, String fecha) { //Constructor sabiendo todos los datos
        this(participantes, lugar, fecha);
        this.ganador = ganador;
    }

    //Constructor por defecto
    public Carrera_Daniel() {
        this("Madrid", "2023-19-05");
    }

    //Constructor copia
    public Carrera_Daniel(Carrera_Daniel c) {
        this(c.participantes, c.ganador, c.lugar, c.fecha);
    }

    //Métodos de clase
    public void setParticipantes(ArrayList<Caballo_Daniel> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<Caballo_Daniel> getParticipantes() {
        return this.participantes;
    }

    public void setGanador(Caballo_Daniel ganador) {
        this.ganador = ganador;
    }

    public Caballo_Daniel getGanador() {
        return this.ganador;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

    @Override
    public String toString() {
        return "Lugar:\t" + this.lugar + "\nFecha:\t" + this.fecha + "\n" + listarParticipantes() + "\nGanador:\n" + this.ganador.toString();
    }

    public String listarParticipantes() {
        String salida = "Residentes:";
        for (Caballo_Daniel caballo : participantes) {
            salida += "\n" + caballo.toString();
        }
        return salida;
    }

    public void insertarParticipante(Caballo_Daniel c) {
        this.participantes.add(c);
    }
}
