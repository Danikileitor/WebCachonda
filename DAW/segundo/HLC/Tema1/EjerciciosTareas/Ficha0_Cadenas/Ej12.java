import java.util.Scanner;

public class Ej12 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena();
        int[] contadorLetras = new int[26];

        for (int i = 0; i < c.length(); i++) {
            char letra = c.toLowerCase().charAt(i);
            if (letra >= 'a' && letra <= 'z') { // Verificar si es una letra del alfabeto
                int indice = letra - 'a'; // Calcular el índice en el arreglo (a=0, b=1, ..., z=25)
                contadorLetras[indice]++;
            }
        }

        // Imprimir la tabla de ocurrencias
        System.out.println("Tabla de ocurrencias de letras:");
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int indice = letra - 'a';
            int ocurrencias = contadorLetras[indice];
            System.out.print(letra + ": " + ocurrencias + "\t");
        }
        System.out.println();
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}