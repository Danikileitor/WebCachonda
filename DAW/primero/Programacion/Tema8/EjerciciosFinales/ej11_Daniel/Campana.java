package ej11_Daniel;

public class Campana extends Instrumento {
    
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (Nota nota:melodia) {
            switch (nota) {
                case DO:
                    System.out.print("do ");
                    break;
                case RE:
                    System.out.print("re ");
                    break;
                case MI:
                    System.out.print("mi ");
                    break;
                case FA:
                    System.out.print("fa ");
                    break;
                case SOL:
                    System.out.print("sol ");
                    break;
                case LA:
                    System.out.print("la ");
                    break;
                case SI:
                    System.out.print("si ");
                    break;
            }
        }
        System.out.println();
    }
}
