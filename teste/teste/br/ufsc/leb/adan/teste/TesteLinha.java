package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Linha;
import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;

public class TesteLinha {

	@Test
	public void criaLinhaComPontos() {
		Double coordenadaX1 = new Double(0.0f);
		Double coordenadaY1 = new Double(0.0f);
		Double coordenadaX2 = new Double(0.0f);
		Double coordenadaY2 = new Double(1.0f);
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
		Double latitudeUfsc = new Double(-27.6007f);
		Double longitudeUfsc = new Double(-48.5192f);
		Double latitudeCentroDeFloripa = new Double(-27.5949f);
		Double longitudeCentroDeFloripa = new Double(-48.5482f);
		Ponto ufsc = new Ponto(latitudeUfsc, longitudeUfsc);
		Ponto centro = new Ponto(latitudeCentroDeFloripa, longitudeCentroDeFloripa);
		Linha daUfscAoCentro = new Linha(ufsc, centro);
		assertEquals(new Float(12.0f), daUfscAoCentro.obterDistancia());
		
	}
}
