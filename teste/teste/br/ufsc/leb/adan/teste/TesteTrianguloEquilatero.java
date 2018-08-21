package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

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
		umUm = new Ponto(1, 1);
		doisDois = new Ponto(2, 2);
		umTres = new Ponto(1, 3);
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
	public void criaTrianguloComLinhas_verificaLinhasDoTriangulo() throws ExcecaoEntradaInvalida {

		TrianguloEquilateroComLinha umTriangulo = new TrianguloEquilateroComLinha(linhaA, linhaB, linhaC);

		assertEquals(linhaA, umTriangulo.obterLinhaA());
		assertEquals(linhaB, umTriangulo.obterLinhaB());
		assertEquals(linhaC, umTriangulo.obterLinhaC());
	}

	@Test
	public void verificaSeEhEquilatero() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3);
		Boolean equilatero = triangulo.ehEquilatero();

		assertTrue(equilatero);
	}

}