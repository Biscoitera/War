package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaisTeste {
	País p = new País(0, "arebaba");
	p.setLevel(3);
	@Test
	void testGetNome() {
		Assertions.assertFalse(p.getNome == " ");
	}

	

	@Test
	void testGetLevel() {
		Assertions.assertEquals(3, p.getLevel());
	}

	@Test
	void testSetLevel() {
		Assertions.assertFalse(p.getLevel() < 0 || p.getLevel() > 5);
	}


	@Test
	void testGetExercito() {
		Assertions.assertFalse(p.getExercito <= 0);
	}

	@Test
	void testSetExercito() {
		Assertions.assertFalse(p.getExercito <= 0);
	}


}
