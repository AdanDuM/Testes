package teste.br.ufsc.leb.douglas.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.douglas.codigos.Calculadora;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.DivisaoPorZeroException;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.EstouroDeSomaException;

public class TesteCalculadora {

	private Calculadora calculadora;
	private Integer parcelaX;
	private Integer parcelaY;
	private Integer dividendo;
	private Integer divisor;
	private Integer fatorX;
	private Integer fatorY;
	private Integer minuendo;
	private Integer subtraendo;
	private Integer zero;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
		zero = 0;
	}

	@Test
	public void obterResultadoSoma() throws Exception {
		// Fixture Setup
		parcelaX = 1;
		parcelaY = 1;
		// Exercise SUT
		calculadora.soma(parcelaX, parcelaY);
		Integer resultado = calculadora.obterResultado();
		// Result Verification
		assertEquals(new Integer(2), resultado);
		// Fixture Teardown
	}

	@Test
	public void obterResultadoDivisao() throws Exception {
		// Fixture Setup
		dividendo = 2;
		divisor = 1;
		// Exercise SUT
		calculadora.divide(dividendo, divisor);
		Integer resultado = calculadora.obterResultado();
		// Result Verification
		assertEquals(new Integer(2), resultado);	
		// Fixture Teardown
	}
	
	@Test
	public void obterResultadoMultiplicacao() {
		// Fixture Setup
		fatorX = 2;
		fatorY = 2;
		// Exercise SUT
		calculadora.multiplica(fatorX, fatorY);
		Integer resultado = calculadora.obterResultado();
		// Result Verification
		assertEquals(new Integer(4), resultado);
		// Fixture Teardown
	}
	
	@Test
	public void obterResultadoSubtracao() {
		// Fixture Setup
		minuendo = 2;
		subtraendo = 1;
		// Exercise SUT
		calculadora.subtrai(minuendo, subtraendo);
		Integer resultado = calculadora.obterResultado();
		// Result Verification
		assertEquals(new Integer(1), resultado);
		// Fixture Teardown
	}
	
	@Test(expected = DivisaoPorZeroException.class)
	public void dividePorZero() throws Exception {
		calculadora.divide(dividendo, zero);
	}
	
	@Test(expected = EstouroDeSomaException.class)
	public void somarDoisInteirosMaiores() throws Exception {
		calculadora.soma(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

}
