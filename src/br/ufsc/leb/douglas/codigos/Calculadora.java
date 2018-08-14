package br.ufsc.leb.douglas.codigos;

import teste.br.ufsc.leb.douglas.calculadora.excecoes.DivisaoPorZeroException;
import teste.br.ufsc.leb.douglas.calculadora.excecoes.EstouroDeSomaException;

public class Calculadora {

	private Integer resultado;

	public Integer obterResultado() {
		return resultado;
	}

	public void soma(Integer operando1, Integer operando2) throws EstouroDeSomaException {
		if (operando1 == Integer.MAX_VALUE || operando2 == Integer.MAX_VALUE) {
			throw new EstouroDeSomaException();
		}
		resultado = operando1 + operando2;
	}

	public void multiplica(Integer operando1, Integer operando2) {
		resultado = operando1 * operando2;
	}

	public void divide(Integer operando1, Integer operando2) throws DivisaoPorZeroException {
		if (operando2 == 0) {
			throw new DivisaoPorZeroException();
		}
		resultado = operando1 / operando2;
	}
	
	

}
