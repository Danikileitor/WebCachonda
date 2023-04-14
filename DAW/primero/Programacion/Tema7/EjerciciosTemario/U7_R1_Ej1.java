public class U7_R1_Ej1 {
    public static void main(String[] args) {
        CuentaCorriente c1;
        c1 = new CuentaCorriente("12345678Z", "Paco");
        c1.sacarDinero(5);
        c1.ingresarDinero(10);
        c1.sacarDinero(5);
        c1.mostrarInfo();
    }
}

class CuentaCorriente {
    final String dni;
    String titular;
    double saldo;

    CuentaCorriente(String dni, String titular){
        this.dni = dni;
        this.titular = titular;
        this.saldo = 0;
    }

    void sacarDinero(double dinero){
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
            System.out.println("Se ha retirado " + dinero + "€\nSu saldo actual es: " + this.saldo + "€");
        } else {
            System.out.println("No es posible realizar la operación, su saldo actual es: " + this.saldo + "€");
        }
    }

    void ingresarDinero(double dinero){
        this.saldo += dinero;
        System.out.println("Se ha ingresado " + dinero + "€\nSu saldo actual es: " + this.saldo + "€");
    }

    void mostrarInfo(){
        System.out.println("###################################");
        System.out.println("# Datos del titular de la cuenta: #");
        System.out.println("# DNI: " + this.dni + "                  #");
        System.out.println("# Titular: " + this.titular + " #");
        System.out.println("###################################");
        System.out.println("# Saldo: " + this.saldo + "€ #");
        System.out.println("###################################");
    }
}