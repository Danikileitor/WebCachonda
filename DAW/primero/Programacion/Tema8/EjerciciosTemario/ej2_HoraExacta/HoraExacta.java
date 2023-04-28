package ej2_HoraExacta;

public class HoraExacta extends Hora {

    int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
        this.comprobar();
    }

    @Override
    public void comprobar() {
        if (this.segundos < 0) {
            this.segundos = 0;
            this.minutos--;
        }
        if (this.segundos > 59) {
            this.segundos = 0;
            this.minutos++;
        }
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

    @Override
    public void inc() {
        this.segundos++;
        comprobar();
    }

    public boolean setSegundos(int segundos) {
        boolean posible = false;
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            posible = true;
        }
        return posible;
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minutos + ":" + this.segundos;
    }
}
