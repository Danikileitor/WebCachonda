import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestEnterosParametrizados {

	@ParameterizedTest
	@CsvSource({"1, 0",
		"6, 3",
		"1, 1",
		"2432902008176640000, 20"})
	final void testFactorial1(long resultado, int n) {
		assertEquals(resultado, Enteros.factorial(n));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-3, -1})
	final void testFactorial2(int n) {
		assertThrows(ArithmeticException.class, ()->Enteros.factorial(n));
	}

	@ParameterizedTest
	@CsvSource({"18, 3",
		"18, 1",
		"18, -1",
		"-18, 3",
		"18, -3",
		"-18, -3"})
	final void testDivisible1(int multiplo, int divisor) {
		assertTrue(Enteros.divisible(multiplo, divisor));
	}
	
	@ParameterizedTest
	@CsvSource({"18, 4",
		"18, 0",
		"-18, 4",
		"18, -4",
		"-18, -4"})
	final void testDivisible2(int multiplo, int divisor) {
		assertFalse(Enteros.divisible(multiplo, divisor));
	}

	@ParameterizedTest
	@ValueSource(ints = {3, 5, 7, 2})
	final void testEsPrimo1(int n) {
		assertTrue(Enteros.esPrimo(n));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0, 4, -3, 9, 1})
	final void testEsPrimo2(int n) {
		assertFalse(Enteros.esPrimo(n));
	}

}
