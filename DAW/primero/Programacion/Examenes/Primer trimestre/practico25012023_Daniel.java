//Daniel Marcos Guerra Gómez
import java.util.Scanner; //Importación de paquetes

public class practico25012023_Daniel {
	static String morse[] = new String[36];
	static String mayusNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static void main(String[] args) {
		morse[0] = ".-"; // A
		morse[1] = "-...";
		morse[2] = "-.-.";
		morse[3] = "-..";
		morse[4] = ".";
		morse[5] = "..-.";
		morse[6] = "--.";
		morse[7] = "....";
		morse[8] = ".."; // I
		morse[9] = ".---";
		morse[10] = "-.-";
		morse[11] = ".-..";
		morse[12] = "--";
		morse[13] = "-.";
		morse[14] = "---";
		morse[15] = ".--.";
		morse[16] = "--.-";
		morse[17] = ".-."; // R
		morse[18] = "...";
		morse[19] = "-";
		morse[20] = "..-";
		morse[21] = "...-";
		morse[22] = ".--";
		morse[23] = "-..-";
		morse[24] = "-.--";
		morse[25] = "--..";
		morse[26] = ".----"; // 0
		morse[27] = "..---";
		morse[28] = "...--";
		morse[29] = "....-";
		morse[30] = ".....";
		morse[31] = "-....";
		morse[32] = "--...";
		morse[33] = "---..";
		morse[34] = "----.";
		morse[35] = "-----"; // 9
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		Scanner teclado = new Scanner(System.in);
		do {
			if (menu == 0) {// Confirmación para salir del programa
				System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
				salir = Character.toLowerCase(teclado.next().charAt(0));
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = teclado.nextInt();
					switch (menu) {
						case 0:
							continue;
						case 1:
							codificarMorse();
							break;
						case 2:
							descodificarMorse();
							break;
						case 3:
							tablaPalabras();
							break;
						default:
							System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
							break;
					}// Fin switch
				} while (menu != 0);
			}
		} while (salir == 'n');
	}

	public static void opcionesMenu() {
		System.out.println("###########################################################################");
		System.out.println("# Bienvenido a al examen de Daniel, elige una de las siguientes opciones: #");
		System.out.println("# [1] Codificar frase en español en código morse                          #");
		System.out.println("# [2] Descodificar frase en código morse al español                       #");
		System.out.println("# [3] Introducir una frase y contar sus palabras por tamaño               #");
		System.out.println("# [0] Salir                                                               #");
		System.out.println("###########################################################################");
	}
	
	public static void codificarMorse() {
		String frase = new String("");
		String codificada = new String("");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase en español para codificarla en código morse:");
		frase = teclado.nextLine().trim().toUpperCase();
		for(int i=0; i<frase.length(); i++){
			if(Character.isWhitespace(frase.charAt(i))){
				i++;
			}
			codificada+=morse[mayusNum.indexOf(frase.charAt(i))];
			codificada+="   ";
		}
		System.out.println(codificada.trim());
	}
	
	public static void descodificarMorse() {
		String codificada = new String("");
		String frase = new String("");
		String aux = new String("");
		String aux2 = new String("");
		int pos = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase en código morse (cada código separado por solo 1 espacio) para descodificarla al español:");
		codificada = teclado.nextLine().trim();
		for (int i=0; i<codificada.length(); i++){
			if(Character.isWhitespace(codificada.charAt(i))){
				frase += decode(aux, aux2, codificada, i, pos);
				frase += " ";
			}
		}
		frase += decodeLast(aux, aux2, codificada, pos);
		System.out.println(frase.trim());
	}
	
	public static String decode(String aux, String aux2, String codificada, int i, int pos){
		aux = codificada.substring(0,i);
		codificada = codificada.substring(i+1);
		for(int k=0; k<morse.length; k++){
			if(morse[k] == aux){
				pos = k;
			}
		}
		aux2 = "";
		aux2 += mayusNum.charAt(pos);
		return aux.replaceAll(aux, aux2);
	}
	
	public static String decodeLast(String aux, String aux2, String codificada, int pos){
		aux = codificada;
		for(int k=0; k<morse.length; k++){
			if(morse[k] == aux){
				pos = k;
			}
		}
		aux2 = "";
		aux2 += mayusNum.charAt(pos);
		return aux.replaceAll(aux, aux2);
	}
	
	public static void tablaPalabras() {
		String frase = new String("");
		Scanner teclado = new Scanner(System.in);
		int longitud = 0;
		int longitudes[] = new int[8];
		for(int i=0; i<longitudes.length; i++){
			longitudes[i] = 0;
		}
		System.out.println("Introduce una frase:");
		frase = teclado.nextLine().trim();
		for(int i=0; i<frase.length(); i++){
			if(Character.isWhitespace(frase.charAt(i))){
				longitudes[longitud]++;
				longitud = -1;
			}
			longitud++;
		}
		frase = frase.substring(frase.lastIndexOf(' '));
		longitudes[frase.length()+1]++;
		for(int i=1; i<longitudes.length; i++){
			System.out.println("Palabras con "+(i)+" letras: "+longitudes[i]);
		}
	}

}// Fin clase