package br.ufsc.leb.adan.codigos.formas.geometricas;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TrianguloEquilatero extends Triangulo {

	public TrianguloEquilatero(Integer lado) throws ExcecaoEntradaInvalida {
		super(lado, lado, lado);
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