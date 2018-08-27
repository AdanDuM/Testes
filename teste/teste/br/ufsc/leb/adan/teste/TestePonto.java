package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;

public class TestePonto {

	@Test
	public void criaPonto() {
		Double coordenadaX = new Double(10.0f);
		Double coordenadaY = new Double(15.0f);
		Ponto ponto = new Ponto(coordenadaX, coordenadaY);
		assertEquals(coordenadaX, ponto.obterCoordenadaX());
		assertEquals(coordenadaY, ponto.obterCoordenadaY());
	}

}
