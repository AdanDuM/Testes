package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteJunit {
	
	private Double constante = Math.pow(2, 65);
	private final Integer numeroGrande = constante.intValue();

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
		assertFalse(Poligonos.isTriangulo(numeroGrande, 4, 5));
		assertFalse(Poligonos.isTriangulo(3, numeroGrande, 5));
		assertFalse(Poligonos.isTriangulo(3, 4, numeroGrande));
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

	@Test
	public void testaIsoceles() {
		assertTrue(Poligonos.isIsoceles(4, 2, 4));
	}

	@Test
	public void testaEscaleno() {
		assertTrue(Poligonos.isEscaleno(3, 4, 5));
	}

	@Test
	public void testeEquilatero() {
		assertTrue(Poligonos.isEquilatero(3, 3, 3));
	}

}
