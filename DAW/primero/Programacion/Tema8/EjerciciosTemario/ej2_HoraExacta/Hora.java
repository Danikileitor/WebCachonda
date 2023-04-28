package ej2_HoraExacta;

public class Hora {

    int hora, minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
        this.comprobar();
    }

    public void comprobar() {
        if (this.minutos < 0) {
            this.minutos = 0;
            this.hora--;
        }
        if (this.minutos > 59) {
            this.minutos = 0;
            this.hora++;
        }
        if (this.hora < 0) {
            this.hora = 23;
        }
        if (this.hora > 23) {
            this.hora = 0;
        }
    }

    public void inc() {
        this.minutos++;
        comprobar();
    }

    public boolean setMinutos(int minutos) {
        boolean posible = false;
        if (minutos > 0 && minutos < 59) {
            this.minutos = minutos;
            posible = true;
        }
        return posible;
    }

    public boolean setHora(int hora) {
        boolean posible = false;
        if (hora > 0 && hora < 23) {
            this.hora = hora;
            posible = true;
        }
        return posible;
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minutos;
    }
}
