package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Linha;
import br.ufsc.leb.adan.codigos.formas.geometricas.Ponto;
import br.ufsc.leb.adan.codigos.formas.geometricas.Triangulo;
import br.ufsc.leb.adan.codigos.formas.geometricas.TrianguloEquilatero;
import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TesteTrianguloEquilatero {
	
	private Ponto umUm;
	private Ponto doisDois;
	private Ponto umTres;
	private Linha linhaA;
	private Linha linhaB;
	private Linha linhaC;

	@Before
	public void setUp() {
		umUm = new Ponto(new Float(1.0f), new Float(1.0f));
		doisDois = new Ponto(new Float(2.0f), new Float(2.0f));
		umTres = new Ponto(new Float(1.0f), new Float(3.0f));
		linhaA = new Linha(umUm, doisDois);
		linhaB = new Linha(doisDois, umTres);
		linhaC = new Linha(umTres, umUm);
	}

	@Test
	public void criaTrianguloEquilateroValido() throws ExcecaoEntradaInvalida {
		Integer comprimentoDoLado = 3;
		Triangulo triangulo = new TrianguloEquilatero(comprimentoDoLado);

		assertEquals(new Integer(3), triangulo.getLadoA());
		assertEquals(new Integer(3), triangulo.getLadoB());
		assertEquals(new Integer(3), triangulo.getLadoC());
	}

	@Test
	public void criaTrianguloComLinhas_deveCriarComSucesso() throws ExcecaoEntradaInvalida {

		TrianguloEquilatero umTriangulo = new TrianguloEquilateroComLinha(linhaA, linhaB, linhaC);
		
		assertTrue(umTriangulo.ehEquilatero());
	}


	@Test
	public void verificaSeEhEquilatero() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3);
		Boolean equilatero = triangulo.ehEquilatero();

		assertTrue(equilatero);
	}

}