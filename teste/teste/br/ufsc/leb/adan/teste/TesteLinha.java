package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Linha;
import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;

public class TesteLinha {

	@Test
	public void criaLinhaComPontos() {
		Float coordenadaX1 = new Float(0.0f);
		Float coordenadaY1 = new Float(0.0f);
		Float coordenadaX2 = new Float(0.0f);
		Float coordenadaY2 = new Float(1.0f);
		Ponto a = new Ponto(coordenadaX1, coordenadaY1);
		Ponto b = new Ponto(coordenadaX2, coordenadaY2);
		Linha linha = new Linha(a, b);
		assertEquals(a, linha.obterA());
		assertEquals(b, linha.obterB());
		assertEquals(new Float(1.0f), linha.obterDistancia());
		assertEquals(new Float(coordenadaY2-coordenadaY1), linha.obterDistancia());
	}
	
	@Test
	public void distancia() throws Exception {
		Float latitudeUfsc = new Float(-27.6007f);
		Float longitudeUfsc = new Float(-48.5192f);
		Float latitudeCentroDeFloripa = new Float(-27.5949f);
		Float longitudeCentroDeFloripa = new Float(-48.5482f);
		Ponto ufsc = new Ponto(latitudeUfsc, longitudeUfsc);
		Ponto centro = new Ponto(latitudeCentroDeFloripa, longitudeCentroDeFloripa);
		Linha daUfscAoCentro = new Linha(ufsc, centro);
		assertEquals(new Float(-0.028999329f), daUfscAoCentro.obterDistancia());
		
	}
}
