import java.util.InputMismatchException;
import java.util.Scanner;

public class U7_R1_Ej8 {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();        
    }
    
    public static void menu() {
		int menu = 1;
		char salir = 'n';
                Radio r = new Radio();
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
							r.display();
							break;
                        case 2:
                            r.up();
                            break;
                        case 3:
                            r.down();
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
		System.out.println("##############################################################################");
		System.out.println("# Bienvenido a esta maravilloso radio, elige una de las siguientes opciones: #");
		System.out.println("# [1] Mostrar frecuencia sintonizada                                         #");
        System.out.println("# [2] Subir frecuencia                                                       #");
        System.out.println("# [3] Bajar frecuencia                                                       #");
		System.out.println("# [0] Salir                                                                  #");
		System.out.println("##############################################################################");
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
}

class Radio {

    double frecuencia;
    
    Radio(){
        this.frecuencia = 80;
    }
    
    Radio(double frecuencia){
        this.frecuencia = frecuencia;
    }
    
    void up(){
        if(this.frecuencia < 108){
            this.frecuencia+= 0.5;
        }else{
            this.frecuencia = 80;
        }
        System.out.println("Frecuencia subida.");
        this.display();
    }
    
    void down(){
        if(this.frecuencia > 80){
            this.frecuencia-= 0.5;
        }else{
            this.frecuencia = 108;
        }
        System.out.println("Frecuencia bajada.");
        this.display();
    }
    
    void display(){
        System.out.println("Frecuencia sintonizada: " + this.frecuencia + " MHz.");
    }
}