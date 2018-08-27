package br.ufsc.leb.adan.codigos.formas.geometricas;

public class Linha {

	private Ponto a;
	private Ponto b;

	public Linha(Ponto a, Ponto b) {
		this.a = a;
		this.b = b;
	}

	public Ponto obterA() {
		return a;
	}

	public Ponto obterB() {
		return b;
	}

	public Float obterDistancia() {
		return new Float(b.obterCoordenadaY() - a.obterCoordenadaY());
	}

}
