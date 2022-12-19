import java.util.Scanner;

public class U6_R1 {
	public static void main(String[] args) {
		// Declarar variables
		char c, d;
		int num;
		Scanner teclado=new Scanner(System.in);
		// Desarrollo del programa
		c = 'w';
		System.out.println("Valor de c: " + c);
		c = 98;
		System.out.println("Segundo valor de c: " + c);
		c = '\u2661';
		System.out.println("Tercer valor de c: " + c);
		d = '\t';
		c = '\'';
		System.out.println(d + "Tabulación de d seguido del cuarto valor de c: " + c);
		num = 'a';
		System.out.println("Valor de num: " + num);
		num = '\u0062';
		System.out.println("Segundo valor de num: " + num);
		d = 'b';
		System.out.println("Valor de d con casting a int: " + (int) d);
		num = 111;
		System.out.println("Valor de num con casting a char: " + (char) num);
		d = (char)num;
		System.out.println("Valor de d con casting a char de num: " + d);
		c = 'A';
		d = 'a';
		num = c-d;
		System.out.println("Valor de la operación en num: " + num);
	}// Fin main
}// Fin clase
