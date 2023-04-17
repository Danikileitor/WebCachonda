import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnterosTest {

	@Test
	void testFactorial() {
		assertEquals(1, Enteros.factorial(0));
		assertEquals(6, Enteros.factorial(3));
		assertThrows(ArithmeticException.class, ()->Enteros.factorial(-3));
		assertThrows(ArithmeticException.class, ()->Enteros.factorial(-1));
		assertEquals(1, Enteros.factorial(1));
		assertEquals(2432902008176640000L, Enteros.factorial(20));
	}

	@Test
	void testDivisible() {
		assertTrue(Enteros.divisible(18, 3));
		assertFalse(Enteros.divisible(18, 4));
		assertFalse(Enteros.divisible(18, 0));
		assertTrue(Enteros.divisible(18, 1));
		assertTrue(Enteros.divisible(18, -1));
		assertTrue(Enteros.divisible(-18, 3));
		assertTrue(Enteros.divisible(18, -3));
		assertTrue(Enteros.divisible(-18, -3));
		assertFalse(Enteros.divisible(-18, 4));
		assertFalse(Enteros.divisible(18, -4));
		assertFalse(Enteros.divisible(-18, -4));
	}

	@Test
	void testEsPrimo() {
		assertFalse(Enteros.esPrimo(0));
		assertTrue(Enteros.esPrimo(3));
		assertFalse(Enteros.esPrimo(4));
		assertTrue(Enteros.esPrimo(5));
		assertFalse(Enteros.esPrimo(-3));
		assertTrue(Enteros.esPrimo(7));
		assertFalse(Enteros.esPrimo(9));
		assertFalse(Enteros.esPrimo(1));
		assertTrue(Enteros.esPrimo(2));
	}

}
