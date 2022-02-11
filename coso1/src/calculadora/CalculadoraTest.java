package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma001() {
		int resultadoEsperado = 7;
		int resultadoObtenido = Calculadora.suma(3, 4);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSuma002() {
		int resultadoEsperado = 8;
		int resultadoObtenido = Calculadora.suma(3, 4);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSuma003() {
		int resultadoEsperado = 7;
		int resultadoObtenido = Calculadora.suma(3, 23);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSuma004() {
		char resultadoEsperado = 'w';
		int resultadoObtenido = Calculadora.suma(5, 4);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSuma005() {
		int resultadoEsperado = 7;
		int resultadoObtenido = Calculadora.suma(3, 'g');
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSuma006() {
		int resultadoEsperado = 40;
		int resultadoObtenido = Calculadora.suma(20, 20);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}
}
