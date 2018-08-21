package br.ufsc.leb.douglas.codigos;

import teste.br.ufsc.leb.douglas.calculadora.excecoes.DivisaoPorZeroException;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.EstouroDeSomaException;

public class Calculadora {

	private Integer resultado;

	public Integer obterResultado() {
		return resultado;
	}

	public void soma(Integer parcela1, Integer parcela2) throws EstouroDeSomaException {
		if (parcela1 == Integer.MAX_VALUE || parcela2 == Integer.MAX_VALUE) {
			throw new EstouroDeSomaException();
		}
		resultado = parcela1 + parcela2;
	}

	public void divide(Integer dividendo, Integer divisor) throws DivisaoPorZeroException {
		if (divisor == 0) {
			throw new DivisaoPorZeroException();
		}
		resultado = dividendo / divisor;
	}

	public void multiplica(Integer fator1, Integer fator2) {
		resultado = fator1 * fator2;
	}

	public void subtrai(Integer minuendo, Integer subtraendo) {
		resultado = minuendo - subtraendo;
	}

}
