package ejercicio7;//Declaración del paquete al que pertenece esta clase

import java.io.Serializable;

public class Calendario implements Serializable{

    //Atributos de la clase, privados para que se tengan que moficar con los set()
    protected int dia, mes, anio;

    //Constructor por defecto, público para que lo pueda usar cualquiera
    public Calendario() {
        this.dia = 12;
        this.mes = 5;
        this.anio = 2023;
    }

    //Constructor con argumentos, público para que lo pueda usar cualquiera
    public Calendario(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.comprobar();//Corregimos el calendario en caso de haber introducido alguno de los atributos incorrectametne
    }

    //Constructor copia
    public Calendario(Calendario copia) {
        this(copia.dia, copia.mes, copia.anio);
    }

    //Los setters y getters, públicos para que lo pueda usar cualquiera
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return this.anio;
    }

    //Métodos para incrementar el día, mes y año, públicos para que lo pueda usar cualquiera
    public void incrementarDia() {
        this.dia++;
        this.comprobar();
    }

    public void incrementarMes() {
        this.mes++;
        this.comprobar();
    }

    public void incrementarAnio(int n) {
        this.anio += n;
        this.comprobar();
    }

    //Métodos para comprobar que la fecha está correcta y corregirla en caso contrario, privados para que solo se pueda acceder desde la propia clase
    protected void comprobar() {
        comprobarDia();
        comprobarMes();
        comprobarAnio();
    }

    private void comprobarDia() {
        switch (this.mes) {
            case 2:
                if (this.esBisiesto()) {
                    if (this.dia > 29) {
                        this.mes++;
                        this.dia = 1;
                    }
                } else if (this.dia > 28) {
                    this.mes++;
                    this.dia = 1;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.dia > 31) {
                    this.mes++;
                    this.dia = 1;
                }
                break;
            default:
                if (this.dia > 30) {
                    this.mes++;
                    this.dia = 1;
                }
                break;
        }
    }

    private void comprobarMes() {
        if (this.mes > 12) {
            this.anio++;
            this.mes = 1;
        }
    }

    private void comprobarAnio() {
        if (this.anio == 0) {
            this.anio = 1;
        }
    }

    public boolean esBisiesto() {
        return this.anio % 4 == 0;
    }

    //Metódos para mostrar información y comprobar si 2 calendarios son iguales, públicos para que lo pueda usar cualquiera
    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public boolean iguales(Calendario c) {
        return this.dia == c.dia && this.mes == c.mes && this.anio == c.anio;
    }
}
