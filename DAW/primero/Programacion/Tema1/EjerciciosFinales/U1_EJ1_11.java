import java.util.Scanner; //Importación de paquetes
public class U1_EJ1_11{
	public static void main(String []args){
	//Declarar variables
	double iva=0.0;
	double base=0.0;
	double importeIva=0.0;
	double total=0.0;
	Scanner teclado=new Scanner(System.in);
	//Desarrollo del programa
	System.out.println("Indique la base imponible");
	base=teclado.nextDouble();
	System.out.println("Indique el IVA");
	iva=teclado.nextDouble()/100;
	importeIva=base*iva;
	total=base+importeIva;
	//Mostrar importe iva y total
	System.out.println("El importe correspondiente al IVA es de: "+importeIva+" €");
	System.out.println("El importe total es de: "+total+" €");
	}//Fin main
}//Fin clase
