import java.util.InputMismatchException;
import java.util.Scanner;

public class U7_R1_Ej1 {
    static Scanner teclado = new Scanner(System.in);
    static CuentaCorriente c;
    static boolean hayCuenta = false;
    
    public static void main(String[] args) {
        menu();
        CuentaCorriente c1;
        c1 = new CuentaCorriente("12345678Z", "Paco");
        c1.sacarDinero(5);
        c1.ingresarDinero(10);
        c1.sacarDinero(5);
        c1.mostrarInfo();
    }

    public static void menu() {
		int menu = 1;
		char salir = 'n';
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(pedirLetra());
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = pedirNum();
					switch (menu) {
						case 0:
							continue;
						case 1:
							crearCuenta();
							break;
                        case 2:
                            if (hayCuenta) {
                                sacar();
                            } else {
                                System.out.println("¡Es necesario crear una cuenta primero!");
                            }
							break;
                        case 3:
                            if (hayCuenta) {
                                ingresar();
                            } else {
                                System.out.println("¡Es necesario crear una cuenta primero!");
                            }
							break;
                        case 4:
                            if (hayCuenta) {
                                info();
                            } else {
                                System.out.println("¡Es necesario crear una cuenta primero!");
                            }
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir != 's');
	}

	public static void opcionesMenu() {
		System.out.println("######################################################");
		System.out.println("# Bienvenido al banco de España, indique una opción: #");
		System.out.println("# [1] Crear cuenta bancaria                          #");
		System.out.println("# [2] Sacar dinero                                   #");
		System.out.println("# [3] Ingresar dinero                                #");
		System.out.println("# [4] Mostrar información sobre su cuenta bancaria   #");
		System.out.println("# [0] Salir                                          #");
		System.out.println("######################################################");
	}

	public static String pedirTexto() {
		return teclado.nextLine().trim();
	}

    public static String pedirDni() {
        String dni;
        do {
            dni = teclado.nextLine().trim().toUpperCase();
            if (dni.length() != 9) {
                System.out.println("¡Un DNI tiene 9 caracteres!");
            }
        } while (dni.length() != 9);
		return dni;
	}

    public static double pedirDinero() {
		double dinero;
        try {
            dinero = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número real!");
            teclado.nextLine();
            return pedirDinero();
        }
        teclado.nextLine();
        return dinero;
	}

    public static char pedirLetra() {
		return teclado.next().charAt(0);
	}

	public static int pedirNum() {
        int num;
        try {
            num = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            teclado.nextLine();
            return pedirNum();
        }
        teclado.nextLine();
        return num;
    }

    public static void crearCuenta(){
        String dni, titular;
        System.out.println("Introduce el DNI del titular:");
        dni = pedirDni();
        System.out.println("Introduce el nombre del titular:");
        titular = pedirTexto();
        c = new CuentaCorriente(dni, titular);
        hayCuenta = true;
    }

    public static void sacar() {
        double dinero;
        System.out.println("Introduce la cantidad deseada:");
        dinero = pedirDinero();
        c.sacarDinero(dinero);
    }

    public static void ingresar() {
        double dinero;
        System.out.println("Introduce la cantidad deseada:");
        dinero = pedirDinero();
        c.ingresarDinero(dinero);
    }

    public static void info() {
        c.mostrarInfo();
    }
}//Fin clase principal

class CuentaCorriente {
    String dni;
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
}//Fin clase