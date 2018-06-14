package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DadoTeste {
	Dado d = new Dado(6);
	@Test
	void testRoll() {
		Assertions.assertFalse(d.roll(0) > 6);
	}

	@Test
	void testDado() {
		Assertions.assertEquals(6, d.getMax());
	}

}