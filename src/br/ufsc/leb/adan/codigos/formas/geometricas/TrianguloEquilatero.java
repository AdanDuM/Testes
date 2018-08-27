package br.ufsc.leb.adan.codigos.formas.geometricas;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TrianguloEquilatero extends Triangulo {

	public TrianguloEquilatero(Integer comprimento) throws ExcecaoEntradaInvalida {
		super(comprimento, comprimento,  comprimento);
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