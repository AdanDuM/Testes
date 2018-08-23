package teste.br.ufsc.leb.adan.teste;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TrianguloEquilateroComLinha extends TrianguloEquilatero {
	
	private Linha a;
	private Linha b;
	private Linha c;

	public TrianguloEquilateroComLinha(Linha a, Linha b, Linha c) throws ExcecaoEntradaInvalida {
		super(a.obterTamanho());
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Linha obterLinhaA() {
		return a;
	}

	public Linha obterLinhaB() {
		return b;
	}

	public Linha obterLinhaC() {
		return c;
	}

}
