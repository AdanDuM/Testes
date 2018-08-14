package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TesteTriangulo {
	
	private static final Integer TAMANHO_MAXIMO = Integer.MAX_VALUE;
	
	@Test(expected = IllegalArgumentException.class)
	public void criaTrianguloValido() {
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testaComNull() {
		assertFalse(Poligonos.isTriangulo(null, 4, 5));
		assertFalse(Poligonos.isTriangulo(3, null, 5));
		assertFalse(Poligonos.isTriangulo(3, 4, null));
	}
	
	@Test
	public void testaTudoZeros() throws Exception {
		assertFalse(Poligonos.isTriangulo(0, 0, 0));		
	}

	@Test
	public void testaComZero() {
		assertFalse(Poligonos.isTriangulo(0, 4, 5));
		assertFalse(Poligonos.isTriangulo(3, 0, 5));
		assertFalse(Poligonos.isTriangulo(3, 4, 0));
	}

	@Test
	public void testaComNumeroGrande() {
		assertFalse(Poligonos.isTriangulo(TAMANHO_MAXIMO, 4, 5));
		assertFalse(Poligonos.isTriangulo(3, TAMANHO_MAXIMO, 5));
		assertFalse(Poligonos.isTriangulo(3, 4, TAMANHO_MAXIMO));
	}

	@Test
	public void testaComNegativos() {
		assertFalse(Poligonos.isTriangulo(-3, 4, 5));
		assertFalse(Poligonos.isTriangulo(3, -4, 5));
		assertFalse(Poligonos.isTriangulo(3, 4, -5));
	}

	@Test
	public void testaLadoMenorSomaDeDois() {
		assertFalse(Poligonos.isTriangulo(1, 4, 2));
		assertFalse(Poligonos.isTriangulo(2, 1, 4));
		assertFalse(Poligonos.isTriangulo(4, 2, 1));
	}

	@Test
	public void testaLadoIgualSomaDeDois() {
		assertFalse(Poligonos.isTriangulo(2, 2, 4));
		assertFalse(Poligonos.isTriangulo(2, 4, 2));
		assertFalse(Poligonos.isTriangulo(4, 2, 2));
	}

	@Test
	public void testaTriangulosValidos() {
		assertFalse(Poligonos.isTriangulo(3, 3, 3));
		assertFalse(Poligonos.isTriangulo(3, 4, 5));
		assertFalse(Poligonos.isTriangulo(4, 2, 4));
	}

}
