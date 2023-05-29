public class Divisores {

	public static int mcd(int a, int b) {
		int resultado;
		a = Math.abs(a);
		b = Math.abs(b);

		if (a == 0 || b == 0) {
			throw new IllegalArgumentException();
		} else {
			if (a - b * (a / b) == 0) {
				resultado = b;
			} else {
				resultado = mcd(b, a - b * (a / b));
			}
		}
		return resultado;
	}
}
