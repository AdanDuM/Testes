package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteRetangulo {
	
	private Double coordenadaX;
	private Double coordenadaY;
	private Double largura;
	private Double altura;

	@Before
	public void setUp() {
		coordenadaX = new Double(50.0f);
		coordenadaY = new Double(50.0f);
		largura = new Double(300.0f);
		altura = new Double(100.0f);
	}

	@Test
	public void criaRetanguloComPonto() {
		Ponto origem = new Ponto(coordenadaX, coordenadaY);
		Retangulo retangulo = new Retangulo(origem, largura, altura);
		assertEquals(origem, retangulo.obterOrigem());
		assertEquals(largura, retangulo.obterLargura());
		assertEquals(altura, retangulo.obterAltura());
	}
	
	@Test
	public void criaRetanguloComCoordenadas() {
		Retangulo retangulo = new Retangulo(coordenadaX, coordenadaY, largura, altura);
		assertEquals(coordenadaX, retangulo.obterCoordenadaX());
		assertEquals(coordenadaY, retangulo.obterCoordenadaY());
		assertEquals(largura, retangulo.obterLargura());
		assertEquals(altura, retangulo.obterAltura());
	}

}
