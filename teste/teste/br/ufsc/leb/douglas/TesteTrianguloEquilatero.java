package teste.br.ufsc.leb.douglas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import teste.br.ufsc.leb.adan.teste.Triangulo;

public class TesteTrianguloEquilatero {

	@Test
	public void oTriganguloEquilateroNoModoOrientadoObjetos() throws Exception {
		// Reusando o teu Triangulo -- pode remover o comentario e [teste.br.ufsc.leb.adan.teste.]
		teste.br.ufsc.leb.adan.teste.Triangulo equilatero = new TrianguloEquilatero(2, 2, 2);
		assertTrue(equilatero.ehEquilatero());
	}
	
	@Test
	public void criaTrianguloEquilateroValido() {
		Triangulo triangulo = new TrianguloEquilatero(3, 3, 3);
		
		assertEquals(3, triangulo.getLadoA().intValue());
		assertEquals(3, triangulo.getLadoB().intValue());
		assertEquals(3, triangulo.getLadoC().intValue());
	}
	
	@Test
	public void criaTrianguloEquilateroComPrimeiroArgumentoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			Triangulo triangulo = new TrianguloEquilatero(5, 3, 3);
		});
	}
	
	@Test
	public void criaTrianguloEquilateroComSegundoArgumentoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			Triangulo triangulo = new TrianguloEquilatero(3, 5, 3);
		});
	}
	
	@Test
	public void criaTrianguloEquilateroComTerceiroArgumentoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			Triangulo triangulo = new TrianguloEquilatero(3, 3, 5);
		});
	}

}
