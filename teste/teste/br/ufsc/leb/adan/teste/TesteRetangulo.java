package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;
import br.ufsc.leb.adan.codigos.formas.geometricas.Retangulo;

public class TesteRetangulo {
	
	private Float coordenadaX;
	private Float coordenadaY;
	private Float largura;
	private Float altura;

	@Before
	public void setUp() {
		coordenadaX = new Float(50.0f);
		coordenadaY = new Float(50.0f);
		largura = new Float(300.0f);
		altura = new Float(100.0f);
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
		assertEquals(coordenadaX, retangulo.obterX());
		assertEquals(coordenadaY, retangulo.obterY());
		assertEquals(largura, retangulo.obterLargura());
		assertEquals(altura, retangulo.obterAltura());
	}

}
