import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ej13 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una fecha en formato dd/MM/yyyy:");
        String c = pedirCadena();

        // Formato de entrada
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        // Formato de salida
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));

        try {
            Date fecha = formatoEntrada.parse(c);
            // Formatear y mostrar la fecha en el nuevo formato
            String fechaFormateada = formatoSalida.format(fecha);
            System.out.println(fechaFormateada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static String pedirCadena() {
		return teclado.nextLine();
	}
}