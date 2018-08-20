package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TesteTrianguloEquilatero {

	@Test
	public void criaTrianguloEquilateroValido() throws ExcecaoEntradaInvalida {
		Integer comprimentoDoLado = 3;
		Triangulo triangulo = new TrianguloEquilatero(comprimentoDoLado);

		assertEquals(new Integer(3), triangulo.getLadoA());
		assertEquals(new Integer(3), triangulo.getLadoB());
		assertEquals(new Integer(3), triangulo.getLadoC());
	}

	@Test
	public void oTrianguloDiferentao() throws ExcecaoEntradaInvalida {
		Ponto umUm = new Ponto(1, 1);
		Ponto doisDois = new Ponto(2, 2);
		Ponto umTres = new Ponto(1, 3);
		Lado a = new Lado(umUm, doisDois);
		Lado b = new Lado(doisDois, umTres);
		Lado c = new Lado(umTres, umUm);
		TrianguloEquilatero umTriangulo = new TrianguloEquilateroComLado(a, b, c);
		assertTrue(umTriangulo.ehEquilatero());
	}

	@Test(expected = ExcecaoEntradaInvalida.class)
	public void verificaSeEhEquilatero() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3);
		Boolean equilatero = triangulo.ehEquilatero();

		assertTrue(equilatero);
	}

}