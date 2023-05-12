package daniel;

public class CalendarioExacto extends Calendario {

    //Atributos de la clase, privados para que se tengan que moficar con los set()
    protected int hora, minuto;

    //Constructor por defecto, público para que lo pueda usar cualquiera
    public CalendarioExacto() {
        super();
        this.hora = 12;
        this.minuto = 30;
    }

    //Constructor con argumentos, público para que lo pueda usar cualquiera
    public CalendarioExacto(int dia, int mes, int anio, int hora, int minuto) {
        super(dia, mes, anio);
        this.hora = hora;
        this.minuto = minuto;
        this.comprobar();//Corregimos el calendario en caso de haber introducido alguno de los atributos incorrectametne
    }

    //Constructor copia
    public CalendarioExacto(CalendarioExacto copia) {
        this(copia.dia, copia.mes, copia.anio, copia.hora, copia.minuto);
    }

    //Los setters y getters, públicos para que lo pueda usar cualquiera
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    //Métodos para incrementar horas y minutos, públicos para que lo pueda usar cualquiera
    public void incrementarMinuto() {
        this.minuto++;
        this.comprobar();
    }

    public void incrementarHora() {
        this.hora++;
        this.comprobar();
    }

    //Métodos para comprobar hora y minutos
    private void comprobarMinuto() {
        if (this.minuto > 59) {
            this.hora++;
            this.minuto = 0;
        }
    }

    private void comprobarHora() {
        if (this.hora > 23) {
            this.dia++;
            this.hora = 0;
        }
    }

    //Se sobrescriben los métodos comprobar y toString para ajustarlos a las horas y minutos
    @Override
    protected void comprobar() {
        comprobarMinuto();
        comprobarHora();
        super.comprobar();
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.hora + ":" + this.minuto;
    }

    //Se crea un segundo método iguales para CalendarioExacto, como el parámetro es diferente no hay que sobrescribir
    public boolean iguales(CalendarioExacto c) {
        return super.iguales(c) && this.hora == c.hora && this.minuto == c.minuto;
    }
}
