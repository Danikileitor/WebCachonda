//Daniel Marcos Guerra Gómez
//Importamos los paquetes necesarios para el programa:
import java.util.Scanner;
//Se define la clase y el método principal:
public class _20221026Practico_Daniel{
	public static void main(String[] args){
		//Declaramos las variables que utilizaremos en el programa:
		String nombre;
		int menu,numero,hombres,mujeres;
		boolean esPar;
		float total,porcentajeHombres,porcentajeMujeres;
		Scanner teclado = new Scanner(System.in);
		//Desarrollo del programa:
		//Primero saludamos y preguntamos el nombre al usuario:
		System.out.print("Bienvenido al programa para el examen de hoy, 26 de Octubre de 2022, elaborado por Daniel Marcos Guerra Gómez.\n¿Podría indicarme su nombre si es tan amable?\n");
		nombre=teclado.nextLine();
		System.out.printf("%s %s, %s%n%s%n%s%n%s%n%s%n","Buenos días",nombre,"introduzca el número entero asociado a la acción que desea realizar:","[1] Calcular el cubo de un número.","[2] Comprobar si un número es par o impar.","[3] Calcular el porcentaje de hombres y mujeres que hay en un aula.","[Cualquier otro número] Salir del menú.");
		menu=teclado.nextInt();
		//Comprobamos qué número ha introducido el usuario y realizamos su acción correspondiente:
		switch(menu){
			case 1://Si se indroduce un 1, se pide un número, se calcula su cubo y se muestra en pantalla el resultado.
				System.out.println("Indroduzca un número entero y le indicaré su cubo:");
				numero=teclado.nextInt();
				System.out.printf("%d %s %d.%n",numero,"elevado al cubo es:",numero*numero*numero);//printf permite realizar el calculo del cubo en uno de sus argumentos e imprimir su resultado.
				break;
			case 2://Si se indroduce un 2, se pide un número, se comprueba si es par o impar y dependiendo del resultado se muestra en pantalla un resultado u otro.
				System.out.println("Indroduzca un número entero y le indicaré si es par o impar:");
				numero=teclado.nextInt();
				esPar=numero%2==0?true:false;//Se comprueba si el número es par o impar, es un poco redundante porque no haría falta utilizar ?true:false, dado que la expresión numero%2==0 ya devuelve true o false.
				if(esPar){//Se evalua si el boolean esPar es verdadero o falso, en caso de verdadero se realiza la siguiente instrucción:
					System.out.printf("%d %s%n",numero,"es par.");//Se muestra el resultado en pantalla
					break;
				}else{//En caso de que el boolean esPar sea falso se realizará la sigiente instrucción:
					System.out.printf("%d %s%n",numero,"es impar.");//Se muestra el resultado en pantalla
					break;
				}
			case 3://Si se indroduce un 3, se pide la cantidad de hombres y de mujeres, se calculan sus porcentajes respecto a su total y se muestra en pantalla el resultado.
				System.out.println("Voy a pedirle la cantidad de hombres y mujeres que hay en un aula y le indicaré sus porcentajes.\nIntroduzca la cantidad de hombres que hay en el aula:");
				hombres=teclado.nextInt();
				System.out.println("Introduzca la cantidad de mujeres que hay en el aula:");
				mujeres=teclado.nextInt();
				total=hombres+mujeres;//Se calcula el total de alumnos
				if(total==0){//Comprobamos que el total de alumnos sea 0 para evitar que ocurra una división por 0, e indicamos un error:
					System.out.println("Si no hay alumnos en el aula no te puedo calcular los porcentajes de hombres y mujeres.");
					break;
				}else{//En caso de que el total sea distinto de 0 podemos calcular los porcentajes:
					porcentajeHombres=hombres/total*100;//Se calcula el % de hombres
					porcentajeMujeres=mujeres/total*100;//Se calcula el % de mujeres
					System.out.printf("En el aula hay %d hombres y %d mujeres, siendo un total de %.0f alumnos.%nSus porcentajes equivalenes son: %.2f%% hombres y %.2f%% mujeres.%n",hombres,mujeres,total,porcentajeHombres,porcentajeMujeres);//Se muestra el resultado en pantalla
					break;
				}
			default:break;//Si se indroduce un número distinto de 1/2/3, se saldrá del menú sin realizar ninguna acción.
		}
		System.out.println("Gracias por utilizar mi humilde programa, procedo a finalizar, que pase buen día "+nombre+".");
	}
}
