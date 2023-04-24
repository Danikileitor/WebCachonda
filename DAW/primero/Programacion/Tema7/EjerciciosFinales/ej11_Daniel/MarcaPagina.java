package ej11_Daniel;

public class MarcaPagina {

    int pagina;

    MarcaPagina() {
        this.pagina = 1;
    }

    MarcaPagina(int pagina) {
        this.pagina = pagina;
    }

    void pasarPagina() {
        this.pagina++;
        this.info();
    }

    void info() {
        System.out.println("Vas por la página " + this.pagina + ".");
    }

    void empezar() {
        this.pagina = 1;
        System.out.println("Has vuelto a la primera página.");
    }
}
