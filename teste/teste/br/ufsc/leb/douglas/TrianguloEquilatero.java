package teste.br.ufsc.leb.douglas;

import teste.br.ufsc.leb.adan.teste.Triangulo;

public class TrianguloEquilatero extends Triangulo {

	public TrianguloEquilatero(Integer ladoA, Integer ladoB, Integer ladoC) {
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
