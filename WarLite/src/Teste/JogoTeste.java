package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JogoTeste {
	Jogo j = new Jogo();
	@Test
	void test() {
		Assertions.assertFalse(j.tab == false);
	}

}
