import java.util.Scanner;

public class Ej6 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String alfabeto = "abcçdefghijklmnñopqrstuvwxyz";
        int[] contadorLetras = new int[28];
        System.out.println("Introduzca una cadena de texto:");
        String c = pedirCadena().toLowerCase();
        //Quitamos las tildes
        String original = "áàäéèëíìïóòöúùü";
        String ascii = "aaaeeeiiiooouuu";
        for (int i = 0; i < c.length(); i++) {
            c = c.replace(original.charAt(i), ascii.charAt(i));
        }
        //Vamos a contar todas las letras del abecedario:
        for (int i = 0; i < alfabeto.length(); i++) {
            char letra = alfabeto.charAt(i);
            int contador = 0;
            // Buscamos la letra en el texto y contamos las ocurrencias
            int indice = c.indexOf(letra);
            while (indice >= 0) {
                contador++;
                indice = c.indexOf(letra, indice + 1);
            }
            // Almacenamos en el array
            contadorLetras[i] = contador;
        }
        // Mostramos los resultados
        for (int i = 0; i < alfabeto.length(); i++) {
            char letra = alfabeto.charAt(i);
            int contador = contadorLetras[i];
            if (contador > 0) {
                System.out.print(letra + ": " + contador + "\t");
            }
        }
        System.out.println();
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}