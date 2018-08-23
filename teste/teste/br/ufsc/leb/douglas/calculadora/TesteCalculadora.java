package teste.br.ufsc.leb.douglas.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.douglas.codigos.Calculadora;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.DivisaoPorZeroException;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.EstouroDeSomaException;

public class TesteCalculadora {

	private Calculadora calculadora;
	private Integer zero;
	private Integer um;
	private Integer dois;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
		zero = 0;
		um = 1;
		dois = 2;
	}

	@Test
	public void obterResultadoSoma() throws Exception {
		calculadora.soma(um, um);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(2), resultado);
	}

	@Test
	public void obterResultadoSomaUmComDois() throws Exception {
		calculadora.soma(um, dois);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(3), resultado);
	}

	@Test
	public void obterResultadoDivisao() throws Exception {
		calculadora.divide(dois, um);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(2), resultado);
	}

	@Test
	public void obterResultadoMultiplicacao() {
		calculadora.multiplica(dois, dois);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(4), resultado);
	}

	@Test
	public void obterResultadoSubtracao() {
		calculadora.subtrai(dois, um);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(1), resultado);
	}

	@Test(expected = DivisaoPorZeroException.class)
	public void dividePorZero() throws Exception {
		calculadora.divide(dois, zero);
	}

	@Test(expected = EstouroDeSomaException.class)
	public void somarDoisInteirosMaiores() throws Exception {
		calculadora.soma(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

}
