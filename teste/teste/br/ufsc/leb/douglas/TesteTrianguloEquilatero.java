package teste.br.ufsc.leb.douglas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteTrianguloEquilatero {

	@Test
	public void oTriganguloEquilateroNoModoOrientadoObjetos() throws Exception {
		// Reusando o teu Triangulo -- pode remover o comentario e [teste.br.ufsc.leb.adan.teste.]
		teste.br.ufsc.leb.adan.teste.Triangulo equilatero = new TrianguloEquilatero();
		assertTrue(equilatero.ehEquilatero());
	}

}
