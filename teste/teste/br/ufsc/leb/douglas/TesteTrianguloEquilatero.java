package teste.br.ufsc.leb.douglas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import teste.br.ufsc.leb.adan.teste.Triangulo;
import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.TrianguloEquilateroInvalidoException;

public class TesteTrianguloEquilatero {

	@Test
	public void oTriganguloEquilateroNoModoOrientadoObjetos() throws Exception {
		Triangulo equilatero = new TrianguloEquilatero(2, 2, 2);
		assertTrue(equilatero.ehEquilatero());
	}
	
	@Test
	public void criaTrianguloEquilateroValido() {
		Triangulo triangulo = new TrianguloEquilatero(3, 3, 3);
		
		assertEquals(new Integer(3), triangulo.getLadoA());
		assertEquals(new Integer(3), triangulo.getLadoB());
		assertEquals(new Integer(3), triangulo.getLadoC());
	}
	
	@Test(expected = TrianguloEquilateroInvalidoException.class)
	public void criaTrianguloEquilateroComLadoBDiferente() {
		Triangulo triangulo = new TrianguloEquilatero(3, 2, 3);
	}
	
	@Test(expected = TrianguloEquilateroInvalidoException.class)
	public void criaTrianguloEquilateroComLadoADiferente() {
		Triangulo triangulo = new TrianguloEquilatero(2, 3, 3);
	}
	
	@Test(expected = TrianguloEquilateroInvalidoException.class)
	public void criaTrianguloEquilateroComLadoCDiferente() {
		Triangulo triangulo = new TrianguloEquilatero(3, 3, 2);
	}

}
