//Daniel Marcos Guerra Gómez
import java.util.Arrays;

public class Prueba_Arrays {
    public static void main(String[] args) {
        //Definimos las variables
        String[] alumnosClase = {"Pablo","Victor","Chema","Alberto","Juapisito","Pedro","Alfonso","Joaquín","Jairo","Isma"};
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] numeros = {'1', '2', '9', '7', '5', '8', '6'};
        int[] numeros2 = numeros;
        int[] arrayClonado = numeros.clone();
        int[] numeros3 = {'4', '3', '5', '8', '1'};
        
        Arrays.sort(alumnosClase);
        Arrays.sort(numeros);

        int posicionAlumnos = java.util.Arrays.binarySearch(alumnosClase,"Victor");

        java.util.Arrays.fill(numeros2,1);

        System.out.println(alumnosClase[posicionAlumnos]);
        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros == arrayClonado);
        System.out.println(numeros == numeros2);
        System.out.println(java.util.Arrays.equals(numeros,numeros3));
        System.out.println(java.util.Arrays.equals(numeros,numeros2));
    }
}