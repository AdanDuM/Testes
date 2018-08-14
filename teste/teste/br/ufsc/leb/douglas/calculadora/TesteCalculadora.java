package teste.br.ufsc.leb.douglas.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.douglas.codigos.Calculadora;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.DivisaoPorZeroException;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.EstouroDeSomaException;

public class TesteCalculadora {

	private Calculadora calculadora;
	private Integer operandoDaDivisao1;
	private Integer operandoDaDivisao2;
	private Integer operandoDaMultiplicacao1;
	private Integer operandoDaMultiplicacao2;
	private Integer operandoDaSoma1;
	private Integer operandoDaSubtracao1;
	private Integer operandoDaSoma2;
	private Integer operandoDaSubtracao2;
	private Integer operandoZero;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
		operandoDaDivisao1 = 4;
		operandoDaDivisao2 = 2;
		operandoDaMultiplicacao1 = 4;
		operandoDaMultiplicacao2 = 5;
		operandoDaSoma1 = 6;
		operandoDaSoma2 = 7;
		operandoDaSubtracao1 = 8;
		operandoDaSubtracao2 = 9;
		operandoZero = 0;
	}

	@Test
	public void obterResultadoSoma() throws Exception {
		calculadora.soma(operandoDaSoma1, operandoDaSoma2);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(13), resultado);
	}

	@Test
	public void obterResultadoDivisao() throws Exception {
		calculadora.divide(operandoDaDivisao1, operandoDaDivisao2);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(2), resultado);
	}
	
	@Test(expected = DivisaoPorZeroException.class)
	public void dividePorZero() throws Exception {
		calculadora.divide(operandoDaDivisao1, operandoZero);
	}

	@Test(expected = EstouroDeSomaException.class)
	public void somarDoisInteirosMaiores() throws Exception {
		calculadora.soma(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	
	@Test
	public void obterResultadoMultiplicacao() {
		calculadora.multiplica(operandoDaMultiplicacao1, operandoDaMultiplicacao2);
		Integer resultado = calculadora.obterResultado();
		assertEquals(new Integer(20), resultado);
	}

}
