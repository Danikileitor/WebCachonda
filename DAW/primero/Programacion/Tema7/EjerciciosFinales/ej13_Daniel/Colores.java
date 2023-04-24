package ej13_Daniel;

public class Colores {

    private String[] paleta;

    Colores() {
        this.paleta = new String[]{"ROJO", "VERDE", "AZUL", "AMARILLO", "NARANJA", "ROSA", "NEGRO", "BLANCO", "MORADO", "MARRÓN", "GRIS"};
    }

    public String[] getPaleta() {
        return paleta;
    }

    private int generarAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    private boolean repetido(String[] paleta, String color) {
        boolean rep = false;
        for (int i = 0; i < paleta.length; i++) {
            if (paleta[i] != null && paleta[i].equals(color)) {
                rep = true;
                break;
            }
        }
        return rep;
    }

    public void addColor(String color) {
        if (!this.repetido(this.paleta, color)) {
            String aux[] = new String[this.paleta.length + 1];
            for (int i = 0; i < this.paleta.length; i++) {
                aux[i] = this.paleta[i];
            }
            aux[aux.length - 1] = color;
            this.paleta = aux;
        }
    }

    public String[] generar(int cantidad) {
        String[] paleta = new String[cantidad];
        String aux;
        for (int i = 0; i < cantidad; i++) {
            aux = this.paleta[generarAleatorio(0, this.paleta.length - 1)];
            if (repetido(paleta, aux)) {
                i--;
            } else {
                paleta[i] = aux;
            }
        }
        return paleta;
    }
}
