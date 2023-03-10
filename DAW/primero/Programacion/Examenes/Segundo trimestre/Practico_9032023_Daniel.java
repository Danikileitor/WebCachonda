//Daniel Marcos Guerra Gómez
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Practico_9032023_Daniel {
	static Scanner teclado = new Scanner(System.in);
	static String[][] contactos = new String[300][2];
	static final String ROJO = "\u001B[31m";
	static final String VERDE = "\u001B[32m";
	static final String CYAN = "\u001B[36m";
	static final String RESET = "\u001B[39m"; //No se si este es el código bueno del RESET pero se ve bien en pantalla :)
	
	public static void main(String args[]){
		construirAgenda(contactos);
		menu();
	}
	
	public static void construirAgenda(String[][] contactos){
		contactos[0][0] = "Alberto";
		contactos[0][1] = "611111111";
		contactos[1][0] = "Daniel";
		contactos[1][1] = "622222222";
		contactos[2][0] = "Pablo";
		contactos[2][1] = "633333333";
		contactos[3][0] = "Victor";
		contactos[3][1] = "644444444";
	}
	
	public static void menu(){
		int menu = 1;
		char salir = 'n';
		do{
			if(menu == 0){
				System.out.println(ROJO + "¿Seguro que deseas salir? (s/n)" + RESET);
				salir = Character.toLowerCase(pedirLetra());
				menu++;
			}else{
				do{
					//Arrays.sort(contactos); <-- En este punto ordenaría el Array de contactos pero no se como ordenar un array bidimensional :(
					opcionesMenu();
					menu = pedirEntero();
					switch(menu){
						case 0:
							continue;
						case 1:
							verContactos(contactos);
							break;
						case 2:
							buscarContacto(contactos);
							break;
						case 3:
							insertarContacto();
							break;
						case 4:
							editarContacto();
							break;
						case 5:
							eliminarContacto();
							break;
						default:
							System.out.println(ROJO + "¡Introduce una de las opciones del menú!" + RESET);
					}
				}while(menu != 0);
			}
		}while(salir != 's');
	}
	
	public static void opcionesMenu(){
		System.out.println(CYAN + "#########################");
		System.out.println("#  Agenda de contactos  #");
		System.out.println("# [1] Ver contactos     #");
		System.out.println("# [2] Buscar contacto   #");
		System.out.println("# [3] Insertar contacto #");
		System.out.println("# [4] Editar contacto   #");
		System.out.println("# [5] Eliminar contacto #");
		System.out.println("# [0] Salir             #");
		System.out.println("#########################" + RESET);
	}
	
	public static char pedirLetra(){
		return teclado.nextLine().charAt(0);
	}
	
	public static int pedirEntero(){
		int entero;
		try{
			entero = teclado.nextInt();
		}catch(InputMismatchException e){
			System.out.println("¡Introduce un número!");
			teclado.nextLine();
			return pedirEntero();
		}
		teclado.nextLine();
		return entero;
	}
	
	public static String pedirNombre(){
		return teclado.nextLine().trim();
	}
	
	public static void verContactos(String[][] contactos){ //En caso de haber borrado un contacto, al no ordenarse el array es posible que no muestre todos los contactos de la agenda
		System.out.println(CYAN + "Lista de contactos:");
		for(int i = 0; i < contactos.length; i++){
			if(contactos[i][0] == null){
				break;
			}
			System.out.printf("[%s%d%s]\t Nombre: %s%n\tTeléfono: %s%n", VERDE, i+1, CYAN, contactos[i][0], contactos[i][1]);
		}
		System.out.println(RESET);
	}
	
	public static void buscarContacto(String[][] contactos){
		boolean encontrado = false;
		String nombre = new String("");
		System.out.println("Introduzca el nombre del contacto:");
		do{
			nombre = pedirNombre();
			for(int i = 0; i < contactos.length; i++){
				if(contactos[i][0] == null){
					break;
				}
				if(contactos[i][0].equals(nombre)){
					encontrado = true;
					System.out.printf("%s[%s%d%s]\t Nombre: %s%n\tTeléfono: %s%n", CYAN, VERDE, i+1, CYAN, contactos[i][0], contactos[i][1]);
					break;
				}
			}
			if(!encontrado && !nombre.equals("0")){
				System.out.println(ROJO + "El nombre introducido no existe, prueba de nuevo o introduce [0] para salir:" + RESET);
			}
		}while(!encontrado && !nombre.equals("0"));
		System.out.println();
	}
	
	public static void insertarContacto(){
		if(!comprobarLleno(contactos)){
			boolean repetido;
			String nombre = new String("");
			int telefono;
			System.out.println("Introduzca el nombre del contacto:");
			do{
				repetido = false;
				nombre = pedirNombre();
				for(int i = 0; i < contactos.length; i++){
					if(contactos[i][0] == null){
						break;
					}
					if(contactos[i][0].equals(nombre)){
						repetido = true;
						System.out.println(ROJO + "¡Este nombre ya existe!, prueba de nuevo o introduce [0] para salir:" + RESET);
						break;
					}
				}
			}while(repetido && !nombre.equals("0"));
			if(!repetido && !nombre.equals("0")){
				do{
					System.out.println("Introduce su número de teléfono (9 dígitos) o introduce [0] para salir:");
					telefono = pedirEntero();
				}while((telefono < 100000000 || telefono > 999999999) && telefono != 0);
				if(telefono == 0){
					nombre = "0";
				}else{
					int pos = comprobarUltimo(contactos);
					String aux = "";
					aux += telefono;
					contactos[pos][0] = nombre;
					contactos[pos][1] = aux;
					System.out.println(VERDE + "¡Contacto insertado!" + RESET);
				}
			}
		}else{
			System.out.println(ROJO + "¡La agenda está llena! Si quieres insertar un nuevo contacto primero tendrás que eliminar otro." + RESET);
		}
		System.out.println();
	}
	
	public static boolean comprobarLleno(String[][] contactos){
		boolean lleno = false;
		int pos;
		for(pos = 0; pos < contactos.length; pos++){
			if(contactos[pos][0] == null){
				break;
			}
		}
		return pos == contactos.length-1;
	}
	
	public static int comprobarUltimo(String[][] contactos){
		int ultimo = 299;
		for(int i = 0; i < contactos.length; i++){
			if(contactos[i][0] == null){
				ultimo = i;
				break;
			}
		}
		return ultimo;
	}
	
	public static void editarContacto(){
		boolean encontrado = false, repetido;
		String nombre = new String("");
		int telefono, pos = 299;
		System.out.println("Introduzca el nombre del contacto:");
		do{
			nombre = pedirNombre();
			for(int i = 0; i < contactos.length; i++){
				if(contactos[i][0] == null){
					break;
				}
				if(contactos[i][0].equals(nombre)){
					encontrado = true;
					pos = i;
					break;
				}
			}
			if(!encontrado && !nombre.equals("0")){
				System.out.println(ROJO + "El nombre introducido no existe, prueba de nuevo o introduce [0] para salir:" + RESET);
			}
		}while(!encontrado && !nombre.equals("0"));
		if(encontrado && !nombre.equals("0")){
			System.out.println("Introduzca el nuevo nombre del contacto:");
			do{
				repetido = false;
				nombre = pedirNombre();
				for(int i = 0; i < contactos.length; i++){
					if(contactos[i][0] == null){
						break;
					}
					if(contactos[i][0].equals(nombre)){
						repetido = true;
						System.out.println(ROJO + "¡Este nombre ya existe!, prueba de nuevo o introduce [0] para salir:" + RESET);
						break;
					}
				}
			}while(repetido && !nombre.equals("0"));
			if(!repetido && !nombre.equals("0")){
				do{
					System.out.println("Introduce su nuevo número de teléfono (9 dígitos) o introduce [0] para salir:");
					telefono = pedirEntero();
				}while((telefono < 100000000 || telefono > 999999999) && telefono != 0);
				if(telefono == 0){
					nombre = "0";
				}else{
					String aux = "";
					aux += telefono;
					contactos[pos][0] = nombre;
					contactos[pos][1] = aux;
					System.out.println(VERDE + "¡Contacto editado!" + RESET);
				}
			}
		}
		System.out.println();
	}
	
	public static void eliminarContacto(){
		boolean encontrado = false, repetido;
		String nombre = new String("");
		int pos = 299;
		System.out.println("Introduzca el nombre del contacto:");
		do{
			nombre = pedirNombre();
			for(int i = 0; i < contactos.length; i++){
				if(contactos[i][0] == null){
					break;
				}
				if(contactos[i][0].equals(nombre)){
					encontrado = true;
					pos = i;
					break;
				}
			}
			if(!encontrado && !nombre.equals("0")){
				System.out.println(ROJO + "El nombre introducido no existe, prueba de nuevo o introduce [0] para salir:" + RESET);
			}
		}while(!encontrado && !nombre.equals("0"));
		if(encontrado && !nombre.equals("0")){
			contactos[pos][0] = null;
			contactos[pos][1] = null;
			System.out.println(VERDE + "¡Contacto eliminado!" + RESET);
		}
		System.out.println();
	}
}