package teste.br.ufsc.leb.douglas.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.douglas.codigos.Calculadora;

public class TesteJunitExemplo {

	private Calculadora caluladora;
	private Integer operando1;

	@Before
	public void setUp() {
		caluladora = new Calculadora();
		operando1 = 1;
	}

	@Test
	public void obterResultado2() throws Exception {
		caluladora.soma(operando1, 1);
		Integer resultado = caluladora.obterResultado();
		assertEquals(new Integer(2), resultado);
	}

	@Test
	public void obterResultado3() throws Exception {
		Integer operando2 = 2;
		caluladora.soma(operando1, operando2);
		Integer resultado = caluladora.obterResultado();
		assertEquals(new Integer(3), resultado);
	}

	@Test(expected = EstouroDeSomaException.class)
	public void somarDoisInteirosMaiores() throws Exception {
		caluladora.soma(Integer.MAX_VALUE, Integer.MAX_VALUE);

	}

}
