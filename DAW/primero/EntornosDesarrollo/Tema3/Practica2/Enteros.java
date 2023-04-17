
public class Enteros {

	/*
	 * MÃ©todo r_factorial: Recibe un entero y devuelve su factorial. El
	 * factorial de un nÃºmero es el resultado de multiplicar todos los nÃºmeros
	 * comprendidos entre 1 y ese nÃºmero. Este mÃ©todo resuelve el problema
	 * mediante llamadas recursivas
	 */
	public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
	}

	/*
	 * MÃ©todo factorial: Recibe un entero y devuelve su factorial. El factorial
	 * de un nÃºmero es el resultado de multiplicar todos los nÃºmeros
	 * comprendidos entre 1 y ese nÃºmero. Este mÃ©todo resuelve el problema sin
	 * llamadas recursivas
	 */
	public static long factorial(int n) {
		long resultado;
		
		if(n < 0) {
			throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
		}

		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}

	/*
	 * MÃ©todo alreves: Recibe una cadena de caracteres y devuelve la misma
	 * cadena, pero invirtiendo el orden de los caracteres.
	 */
	public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
	}

	/*
	 * MÃ©todo capicua: Recibe un nÃºmero entero y devuelve true si es capicua o
	 * false si no es capicua. Se dice que un nÃºmero es capicua cuando se
	 * obtiene el mismo resultado leyÃ©ndolo de izquierda a derecha y de derecha
	 * a izquierda
	 */
	public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/*
	 * MÃ©todo divisible: Recibe dos nÃºmeros enteros (multiplo y divisor) y
	 * devuelve true si el primero es divisible por el segundo. Se dice que un
	 * nÃºmero (multiplo) es divisible por otro (divisor) si la divisiÃ³n es
	 * exacta, es decir, de resto 0
	 */
	public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;
		
		if (divisor == 0) {
			resultado = false;
		} else if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/*
	 * MÃ©todo multiplo: Recibe dos nÃºmeros enteros (mult y divisor) y devuelve
	 * true si el primero es mÃºltiplo del segundo. Se dice que un nÃºmero (mult)
	 * es mÃºltiplo de otro (divisor) si la divisiÃ³n es exacta, es decir, de
	 * resto 0
	 */
	public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
	}

	/*
	 * MÃ©todo esPrimo: Recibe un nÃºmero entero y devuelve true si es primo o
	 * false si no es primo. Se dice que un nÃºmero es primo cuando es mayor que
	 * 1 y no tiene mÃ¡s divisores que el 1 y a sÃ­ mismo.
	 */
	public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
	}

	/*
	 * MÃ©todo n_primos: Recibe un nÃºmero entero y devuelve el nÃºmero de primos
	 * menores o iguales a ese nÃºmero.
	 */
	public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
	}

	/*
	 * MÃ©todo primosHasta: Recibe un nÃºmero entero y devuelve los nÃºmeros primos
	 * menores o iguales a ese nÃºmero.
	 */
	public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
	}

	/*
	 * MÃ©todo primerosPrimos: Recibe un nÃºmero entero (n) y devuelve los n
	 * primeros primos
	 */
	public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}

	/*
	 * MÃ©todo divide: Recibe dos nÃºmeros reales y devuelve su divisiÃ³n
	 * Si el divisor es 0 genera un excepciÃ³n
	 */
	public static double divide (double dividendo, double divisor) {
		double resultado;
		if (divisor==0) {
			throw new ArithmeticException();
		} else {
			resultado = dividendo / divisor;
		}
		return resultado;
	}
}