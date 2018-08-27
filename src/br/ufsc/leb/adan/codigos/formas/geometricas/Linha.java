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
		Float diferencaX = b.obterX() - a.obterX();
		Float diferencaY = b.obterY() - a.obterY();
		if (a.obterX().equals(b.obterX())) {
			return Math.abs(diferencaY);
		}
		if (a.obterY().equals(b.obterY())) {
			return Math.abs(diferencaX);
		}
		return new Float(Math.abs(Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2))));
	}

}
