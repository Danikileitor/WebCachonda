package ej3_HoraExactaComparable;

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
        super.comprobar();
    }

    @Override
    public void inc() {
        this.segundos++;
        this.comprobar();
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
    
    @Override
    public boolean equals(Object o) {
        HoraExacta aux = (HoraExacta) o;
        return this.segundos == aux.segundos && this.minutos == aux.minutos && this.hora == aux.hora;
    }
}
