package teste.br.ufsc.leb.adan.teste;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TrianguloEquilatero extends Triangulo {

	public TrianguloEquilatero(Integer ladoA, Integer ladoB, Integer ladoC) throws ExcecaoEntradaInvalida {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public Boolean ehEquilatero() {
		return Boolean.TRUE;
	}

	@Override
	public Boolean ehIsoceles() {
		return Boolean.FALSE;
	}

	@Override
	public Boolean ehEscaleno() {
		return Boolean.FALSE;
	}

}