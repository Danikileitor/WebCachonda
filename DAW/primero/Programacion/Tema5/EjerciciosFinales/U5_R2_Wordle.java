//Daniel Marcos Guerra Gómez
//Aparte añadir un segundo ejercicio con un array bidimensional que sea un cuadrado cuya diagonal sea 1 y el resto de casillas random (2-20)
import java.util.InputMismatchException;
import java.util.Scanner; //Importación de paquetes

public class U5_R2_Wordle {
	static Scanner teclado = new Scanner(System.in);
	static final String FONDO_GRIS = "\u001B[100;1m";
	static final String FONDO_VERDE = "\u001B[42;1m";
	static final String FONDO_AMARILLO = "\u001B[43;1m";
	static final String FONDO_AZUL = "\u001B[44;1m";
	static final String FONDO_AMARILLO2 = "\u001B[103;1m";
	static final String RESET = "\u001B[0m";
	static String[] palabras = {"COCHE","NIEVE","HUESO","TITAN","FLUJO","DISCO","RAZON","HONGO","JAULA","ATRIL","GANSO","NEGRO","BOTAR","BRUJA","ERRAR","GIRAR","GRASA","SECAR","TONTO","MONJA","BONUS","COTAR","OVEJA","CAIDO","BURRO","FALSA","TRAMA","CIEGO","PONGO","AYUDA","CALLA","HECHO","PRIMA","COGER","PATAS","LUCHA","IGUAL","TABLA","VEJEZ","ARIES","CANTE","OCASO","IDEAL","SIMIO","BUENO","CREMA","CHINA","ACABO","TINTA","ESPIA","DULCE","ZORRO","TARDE","SABER","SUIZA","BURRA","JALEO","JURCO","TARTA","ABEJA","SAMBA","LISTA","ENVIO","GUSTO","VALLA","LATIR","FINCA","PULPA","ALPES","CALVA","GOTEO","SOLAR","FRUTA","CIRCO","METAL","FALTA","SIGNO","LIBRE","PEAJE","OTOÑO","SUSHI","CORTA","GEMIR","ACASO","TRAGO","FORRO","MIRAR","CORAL","ZURDO","PIEZA","DOBLA","CERCA","LLENA","LITUO","LINDO","ALBUR","DANZA","KOALA","LICRA","ORDEN","RUBIO","MINAL","CREAR","MANTA","GATAS","LABIO","COBRA","SAUCO","BOLSO","SANAR","DROGA","VELOZ","GENTE","MIMAR","KARMA","CURSI","VIRUS","CABRA","JUNIO","LATEX","LUNAR","SIGMA","AMIGA","LAPIZ","CLIMA","SUAVE","CERCO","LLORO","TRECE","LASER","POLAR","LUGAR","SILLA","MISIL","ACTOR","ARENA","JUDAS","SEXTO","AEREO","CASCO","EXTRA","VAGON","VIEJA","FALSO","LEJOS","DOGMA","RUEGO","CLAVE","JAMAS","PLAZA","ANTRO","BOXER","BUCEO","FUEGO","KOINE","MENOR","DIETA","LIGAR","SEÑOR","LAICO","MEDIA","CESTA","LIANA","TORRE","DIGNO","METER","FLOTA","SALIR","AGUJA","PUGNA","CARGO","FORMA","MIEDO","PALMA","CAGON","PAUSA","ESTAR","GALLO","SOCIO","MUNDO","REZAR","SABIO","DOBLE","COITO","VILLA","NUEVO","MARCA","FOTON","MARCO","DUELO","GORDA","ABRIL","TRAJE","LITRO","MUELA","SISMO","BAILE","BOLLO","PICAR","PLAYA","SUELO","TARRO","CHICA","LECHE","FEROZ","SUCIO","KEFIR","FIRMA","LIBRO","ELLOS","MANCO","FUMAR","BAILA","GORDO","CALDO","GRIPE","LLAVE","ROSAL","MOTEL","PLUMA","GRAVE","VITAL","LLENO","SEXTA","DUEÑO","ALDEA","FAENA","CREER","SANTA","FAUNO","OBVIO","DEUDA","FECHA","LECHO","ATAUD","CRACK","PODAR","ENERO","RIMAR","AUDAZ","TALLO","CONGO","CLAVO","CUTRE","NADIE","JUEZA","LIDER","DIOSA","FLORA","BINGO","CARNE","SARZA","BARCA","MALLA","BEBER","GUAPO","GAMBA","APOYO","ATROZ","SALDO","MATAR","FUERO","LUCIR","MANIA","SALSA","ZOMBI","LEGUA","MARZO","DONDE","OASIS","RUMBA","RUBIA","JUSTO","JUGAR","ANIME","DOLER","JUNTO","COBRO","MELON","CABLE","ATAJO","PODER","SALMO","OREJA","ABRIR","SUDAR","RELOJ","PULPO","LIBRA","BRAVO","BRAZO","TITAR","RURAL","HELIO","RODEO","BANCO","HUECO","TIESO","ZEBRA","TUMOR","REINO","SUDOR","VIEJO","DICHA","MUECA","COPIA","MUDAR","REGLA","LLAGA","PASEO","PINZA","BRAVA","JARRO","PULGA","CHILE","CUEVA","LIMBO","FOBIA","LADRA","FRITA","CORTO","ERIZO","SALON","BAHIA","SERIO","FINTA","COBRE","TESLA","PAUTA","ANUAL","MECHA","MANSO","LEÑAR","FLAMA","ROBAR","METRO","SEÑAL","HOGAR","ABUSO","PONER","RASPA","POETA","KILIM","VACIO","TELAR","MISIO","TORTA","CALVO","BUCLE","DURAR","COSTE","ROLLO","LABOR","SANTO","CERDA","BOMBA","CAMPO","ACERO","LLAMA","FARSA","BURLA","KOPEK","VAPOR","FAUNA","ENTRE","CERDO","AVENA","SARRO","VIVIR","VAINA","PADRE","LABIA","CELDA","PARED","PARAR","MAGNO","HIELO","BOTIN","MAYOR","JAMON","SILVA","VODKA","CORRO","LEMUR","PECAR","MOJAR","BUFON","TIGRE","LINEA","ERROR","RUEDO","CALLO","VIDEO","RUEDA","JAQUE","DUETO","SUBIR","PLENO","MIOPE","DEJAR","COCER","FEMUR","PRIMO","MULTA","FUSIL","HIMNO","TINTO","SOPLO","JUEGO","CONDE","GRANO","MAGIA","AGUDO","MATIZ","BRUJO","PESCA","ORUGA","CAGUE","TECLA","DESEO","CARGA","BAÑAR","CUERO","GOLPE","CONGA","ENANO","BARCO","CISNE","MENOS","ARETE","RENTA","PISAR","OZONO","MEDIO","ARPON","TIBIO","QUEMA","CASAR","FRESA","LISTO","RASGO","MADRE","CIELO","TRAMO","TANGO","NIETO","CACAO","MORIR","LEGAL","PLANO","CUIDA","BESAR","TAROT","LENTO","RUIDO","LITIO","CATAR","CALOR","MUERA","COMER","MAREO","ANDAR","PINTA","MAREA","DONAR","PIOJO","BOLSA","ARROZ","SECTA","LIMON","MOSCA","MENTE","KURDO","GANAR","LICOR","CALLE","DOLOR","RASCA","TESIS","RUGBY","MOVIL","ROTAR","ADIOS","VOLAR","CANTA","ABONO","HUMOR","PLOMO","TRIBU","OBESO","PATIO","FELIZ","NARIZ","FIRME","CAJON","SABOR","CERRO","GORRO","RASTA","ABAJO","PRESO","NEGAR","ACIDA","CHINO","AGRIO","ROCIO","FUERA","VIAJE","HUEVO","TAREA","RUBLO","ANDEN","BROMA","ARMAR","AYUNO","NORTE","BOTON","ALTAR","PAPEL","FRUTO","JURAR","ICONO","RAPTO","FISCO","RAYAR","HACER","SELVA","DOBLO","FLUIR","CACHO","CALMA","SERIE","TINTE","BAJAR","ABANO","POLVO","REINA","TAPAR","FALTO","JAPON","FENIX","OSTIA","DOMAR","POLEN","LAMER","MURAL","COSTO","COLAR","FAVOR","AREPA","MENTA","PALCO","DICHO","DUEÑA","ILESO","ARAÑA","FAROL","LIMAR","RUMBO","ASADO","BUSCO","CORTE","FLACO","POEMA","MEDIR","BAJON","TIRAR","CANTO","OLIVO","FRITO","NOCHE","DUCHA","BUSCA","FLOTE","TAURO","TUTOR","ORINA","ACERA","HIDRA","CULTO","GUISO","CAÑON","CENAR","AMIGO","FALLO","DRAMA","MACHO","POSAR","NUEVE","POLLO","SIETE","USADO","RUMOR","JUNTA","LUCRO","CAGAR","TOCAR","PIZZA","ATRAS","RADIO","TOMAR","ACABE","SORDA","RUINA","SIGLO","SUEÑO","BRAZA","NICHO","PECHO","BANDA","NUEVA","NOVIO","BOXEO","TRONO","AROMA","PASTA","ARPIA","PRISA","MEJOR","CHICO"};
	static boolean daltonismo = false;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int menu = 1;
		char salir = 'n';
		do {
			if (menu == 0) {// Confirmación para salir del programa
				do {
					System.out.println("Has elegido salir, ¿estas seguro? (s/n)");
					salir = Character.toLowerCase(pedirLetra());
				} while (salir != 'n' && salir != 's');
				menu++;
			} else {
				do {
					opcionesMenu();
					menu = pedirNum();
					switch (menu) {
						case 0:
							continue;
						case 1:
							insertarPalabras();
							break;
						case 2:
							jugar();
							break;
						case 3:
							config();
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
		System.out.println("#################################################################################");
		System.out.println("# Bienvenido a este maravilloso juegardo, elige una de las siguientes opciones: #");
		System.out.println("# [1] Insertar palabras                                                         #");
		System.out.println("# [2] Jugar                                                                     #");
		System.out.println("# [3] Configuración                                                             #");
		System.out.println("# [0] Salir                                                                     #");
		System.out.println("#################################################################################");
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

	public static int generarAleatorio(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static void limpiar() {
		for (int i = 0; i < 24; i++) {
			System.out.println();
		}
	}

	public static String pedirPalabra() {
		return teclado.nextLine().trim().toUpperCase();
	}

	public static String palabraAleatoria() {
		return palabras[generarAleatorio(0, palabras.length-1)];
	}
	
	public static void insertarPalabras() {
		String palabra = "";
		boolean repetida = false;
		while (!palabra.equals("F")) {
			System.out.println("Inserta una palabra de 5 letras para añadirla al almacén de palabras (F para salir)");
			palabra = pedirPalabra();
			if (palabra.equals("F")) {
				break;
			}
			if (palabra.length() != 5) {
				System.out.println("La palabra debe tener 5 letras");
				continue;
			}
			for (int i = 0; i < palabras.length; i++) {
				if (palabras[i].equals(palabra)) {
					repetida = true;
					break;
				}
			}
			if (repetida) {
				System.out.printf("La palabra [%s] ya está en el almacén de palabras!%n", palabra);
				repetida = false;
			} else {
				addPalabra(palabra);
			}
		}
	}
	
	public static void addPalabra(String palabra) {
		String aux[] = new String[palabras.length+1];
		for (int i = 0; i < palabras.length; i++) {
			aux[i] = palabras[i];
		}
		aux[aux.length-1] = palabra;
		palabras = aux;
		System.out.printf("Se ha añadido la palabra [%s] al almacén de palabras.%n", palabra);
	}
	
	public static void jugar() {
		String secreta = palabraAleatoria();
		String palabra = "";
		String intentos[] = new String[6];
		int intento = 0;
		limpiar();
		System.out.println("Adivina la palabra de 5 letras, tienes 6 intentos.");
		if (daltonismo) {
			System.out.printf("Las letras que se encuentren en su lugar correcto se mostraran con fondo %sAZUL%s", FONDO_AZUL, RESET);
			System.out.printf("Las letras que se encuentren en la palabra, pero en otro lugar se mostraran con fondo %sAMARILLO%s", FONDO_AMARILLO, RESET);
		} else {
			System.out.printf("Las letras que se encuentren en su lugar correcto se mostraran con fondo %sVERDE%s", FONDO_VERDE, RESET);
			System.out.printf("Las letras que se encuentren en la palabra, pero en otro lugar se mostraran con fondo %sAMARILLO%s", FONDO_AMARILLO2, RESET);
		}
		System.out.printf("Las letras que no se encuentren en la palabra se mostraran con fondo %sGRIS%s", FONDO_GRIS, RESET);
		while (!secreta.equals(palabra) && intento < 6) {
			intento++;
			do {
				palabra = pedirPalabra();
				if (palabra.length() != 5) {
					System.out.println("¡La palabra ha de ser de 5 letras!");
				}
			} while (palabra.length() != 5);
			intentos[intento-1] = palabra;
			if (!secreta.equals(palabra)) {
				darPista(secreta, intentos, intento);
			}
		}
		if (secreta.equals(palabra)) {
			darPista(secreta, intentos, intento);
			victoria(secreta, intento);
		} else {
			derrota(secreta);
		}
	}
	
	public static void darPista(String secreta, String[] intentos, int intento) {
		limpiar();
		for (int i = 0; i < intento; i++) {
			colorear(secreta, intentos[i]);
		}
	}

	public static void colorear(String secreta, String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if (secreta.indexOf(palabra.charAt(i)) != -1) {
				if (palabra.charAt(i) == secreta.charAt(i)) {
					if (daltonismo) {
						System.out.print(FONDO_AZUL);
					} else {
						System.out.print(FONDO_VERDE);
					}
					System.out.print(" " + palabra.charAt(i));
				} else {
					if (daltonismo) {
						System.out.print(FONDO_AMARILLO2);
					} else {
						System.out.print(FONDO_AMARILLO);
					}
					System.out.print(" " + palabra.charAt(i));
				}
			} else {
				System.out.print(FONDO_GRIS + " " + palabra.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println(RESET);
	}
	
	public static void victoria(String palabra, int intentos) {
		System.out.printf("¡Enhorabuena! Has adivinado la palabra [%s] en [%d] intentos.%n", palabra, intentos);
	}

	public static void derrota(String palabra) {
		System.out.printf("¡Has superado el límite de intentos! La palabra era [%s]%n", palabra);
	}

	public static void config() {
		int menuConfig;
		do {
				opcionesConfig();
				menuConfig = pedirNum();
				switch (menuConfig) {
					case 0:
						break;
					case 1:
						cambiarDaltonismo();
						break;
					default:
						System.out.println("¡Introduce un número que corresponda a una de las opciones del menú!");
						break;
				}
		} while (menuConfig != 0);
	}

	public static void opcionesConfig() {
		System.out.println("#################################################################################");
		System.out.println("# Menú de configuración, elige una de las siguientes opciones:                  #");
		System.out.println("# [1] Cambiar daltonismo                                                        #");
		System.out.println("# [0] Volver                                                                    #");
		System.out.println("#################################################################################");
	}
	
	public static void cambiarDaltonismo() {
		if (daltonismo) {
			daltonismo = false;
			System.out.println("Daltonismo desactivado.");
		} else {
			daltonismo = true;
			System.out.println("Daltonismo activado.");
		}
	}
	
}// Fin clase