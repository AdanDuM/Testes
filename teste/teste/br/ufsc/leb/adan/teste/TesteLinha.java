package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteLinha {

	@Test
	public void criaLinhaComPontos() {
		Double coordenadaX1 = new Double(2.0f);
		Double coordenadaY1 = new Double(2.0f);
		Double coordenadaX2 = new Double(6.0f);
		Double coordenadaY2 = new Double(6.0f);
		Ponto ponto1 = new Ponto(coordenadaX1, coordenadaY1);
		Ponto ponto2 = new Ponto(coordenadaX2, coordenadaY2);
		Linha linha = new Linha(ponto1, ponto2);
		assertEquals(ponto1, linha.obterPonto1());
		assertEquals(ponto2, linha.obterPonto2());
	}
}
