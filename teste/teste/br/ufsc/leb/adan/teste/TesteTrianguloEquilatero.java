package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Triangulo;
import br.ufsc.leb.adan.codigos.formas.geometricas.TrianguloEquilatero;
import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TesteTrianguloEquilatero {

	@Test
	public void criaTrianguloEquilateroValido() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3);
		
		assertEquals(new Integer(3), triangulo.getLadoA());
		assertEquals(new Integer(3), triangulo.getLadoB());
		assertEquals(new Integer(3), triangulo.getLadoC());
	}
	
	@Test
	public void verificaSeEhEquilatero() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3);
		Boolean equilatero = triangulo.ehEquilatero();
		
		assertTrue(equilatero);
	}

}