package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestaCirculo {

	@Test
	public void criaCirculo() {
		Double coordenadaX = new Double(15.0f);
		Double coordenadaY = new Double(15.0f);
		Ponto centro = new Ponto(coordenadaX, coordenadaY);
		Double raio = new Double(3.0f);
		Circulo circulo = new Circulo(centro, raio );
		assertEquals(centro, circulo.obterCentro());
		assertEquals(raio, circulo.obterRaio());
	}

}
