import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = Integer.parseInt(scanner.nextLine());

        crearArchivos(numero);

        while (true) {
            System.out.println("\n¿Qué quiere hacer con estos números?");
            System.out.println("1) Buscar el mayor (de entre todos los archivos)");
            System.out.println("2) Buscar el menor (de entre todos los archivos)");
            System.out.println("3) Buscar la media (de entre todos los archivos)");
            System.out.println("4) Buscar la suma (de entre todos los archivos)");
            System.out.println("5) Buscar un número concreto y decir en qué ficheros aparece");
            System.out.println("6) Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    buscarMayor(numero);
                    break;
                case 2:
                    buscarMenor(numero);
                    break;
                case 3:
                    buscarMedia(numero);
                    break;
                case 4:
                    buscarSuma(numero);
                    break;
                case 5:
                    System.out.print("Ingrese el número a buscar: ");
                    int numeroBuscar = Integer.parseInt(scanner.nextLine());
                    buscarNumero(numero, numeroBuscar);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void crearArchivos(int numero) {
        for (int i = 1; i <= numero; i++) {
            String nombreArchivo = i + ".txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
                for (int j = 0; j < i; j++) {
                    writer.println((int) (Math.random() * 100));
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo " + nombreArchivo + ": " + e.getMessage());
            }
        }
    }

    public static void buscarMayor(int numero) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(i + ".txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    listaNumeros.add(Integer.parseInt(linea));
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + i + ".txt: " + e.getMessage());
            }
        }
        int mayor = listaNumeros.stream().max(Integer::compare).orElse(0);
        System.out.println("El mayor número es: " + mayor);
    }

    public static void buscarMenor(int numero) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(i + ".txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    listaNumeros.add(Integer.parseInt(linea));
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + i + ".txt: " + e.getMessage());
            }
        }
        int menor = listaNumeros.stream().min(Integer::compare).orElse(0);
        System.out.println("El menor número es: " + menor);
    }

    public static void buscarMedia(int numero) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(i + ".txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    listaNumeros.add(Integer.parseInt(linea));
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + i + ".txt: " + e.getMessage());
            }
        }
        double suma = listaNumeros.stream().mapToDouble(Integer::doubleValue).sum();
        double media = suma / listaNumeros.size();
        System.out.println("La media de los números es: " + media);
    }

    public static void buscarSuma(int numero) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(i + ".txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    listaNumeros.add(Integer.parseInt(linea));
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + i + ".txt: " + e.getMessage());
            }
        }
        int suma = listaNumeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La suma de los números es: " + suma);
    }

    public static void buscarNumero(int numero, int numeroBuscar) {
        for (int i = 1; i <= numero; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(i + ".txt"))) {
                String linea;
                int numeroLinea = 0;
                while ((linea = reader.readLine()) != null) {
                    numeroLinea++;
                    if (Integer.parseInt(linea) == numeroBuscar) {
                        System.out.println("El número " + numeroBuscar + " se encuentra en el archivo " + i
                                + ".txt, línea " + numeroLinea);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + i + ".txt: " + e.getMessage());
            }
        }
    }
}