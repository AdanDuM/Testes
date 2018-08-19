package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TesteTrianguloEquilatero {

	@Test
	public void oTriganguloEquilateroNoModoOrientadoObjetos() throws Exception {
		Triangulo equilatero = new TrianguloEquilatero(2, 2, 2);
		assertTrue(equilatero.ehEquilatero());
	}
	
	@Test
	public void criaTrianguloEquilateroValido() throws ExcecaoEntradaInvalida {
		Triangulo triangulo = new TrianguloEquilatero(3, 3, 3);
		
		assertEquals(new Integer(3), triangulo.getLadoA());
		assertEquals(new Integer(3), triangulo.getLadoB());
		assertEquals(new Integer(3), triangulo.getLadoC());
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaTrianguloEquilateroComLadoBDiferente() throws ExcecaoEntradaInvalida {
		new TrianguloEquilatero(3, 2, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaTrianguloEquilateroComLadoADiferente() throws ExcecaoEntradaInvalida {
		new TrianguloEquilatero(2, 3, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaTrianguloEquilateroComLadoCDiferente() throws ExcecaoEntradaInvalida {
		new TrianguloEquilatero(3, 3, 2);
	}

}