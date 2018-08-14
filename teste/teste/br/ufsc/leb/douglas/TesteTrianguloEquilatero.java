package teste.br.ufsc.leb.douglas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import teste.br.ufsc.leb.adan.teste.Triangulo;

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
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComPrimeiroArgumentoZero() {
		new TrianguloEquilatero(0, 3, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComSegundoArgumentoZero() {
		new TrianguloEquilatero(3, 0, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComTerceiroArgumentoZero() {
		new TrianguloEquilatero(3, 3, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComPrimeiroArgumentoGrande() {
		new TrianguloEquilatero(Integer.MAX_VALUE, 3, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComSegundoArgumentoGrande() {
		new TrianguloEquilatero(3, Integer.MAX_VALUE, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloEquilateroComTerceiroArgumentoGrande() {
		new TrianguloEquilatero(3, 3, Integer.MAX_VALUE);
	}

}
