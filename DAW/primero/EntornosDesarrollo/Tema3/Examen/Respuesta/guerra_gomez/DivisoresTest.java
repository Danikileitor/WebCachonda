import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisoresTest {

	@ParameterizedTest
	@DisplayName("Divisores válidos")
	@CsvSource({"-10, -5, 5",
		"-18, 14, 2",
		"17, -5, 1",
		"28, 14, 14"})
	final void testMcdValidos(int a, int b, int resultado) {
		assertEquals(resultado, Divisores.mcd(a, b));
	}
	
	@ParameterizedTest
	@DisplayName("Divisores no válidos")
	@CsvSource({"-15, 0",
		"0, -15",
		"0, 0",
		"0, 14",
		"18, 0"})
	final void testMcdNoValidos(int a, int b) {
		assertThrows(IllegalArgumentException.class, ()-> Divisores.mcd(a, b));
	}

}
