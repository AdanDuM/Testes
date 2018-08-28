package teste.br.ufsc.leb.adan.teste.formas.geometricas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;

public class TestePonto {

	@Test
	public void criaPonto() {
		Float coordenadaX = new Float(10.0f);
		Float coordenadaY = new Float(15.0f);
		Ponto ponto = new Ponto(coordenadaX, coordenadaY);
		assertEquals(coordenadaX, ponto.obterX());
		assertEquals(coordenadaY, ponto.obterY());
	}

}
