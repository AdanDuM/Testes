package br.ufsc.leb.adan.codigos.formas.geometricas;

public class Retangulo {

	private Ponto origem;
	private Float largura;
	private Float altura;
	private Float x;
	private Float y;

	public Retangulo(Ponto origem, Float largura, Float altura) {
		this.origem = origem;
		this.largura = largura;
		this.altura = altura;
	}

	public Retangulo(Float x, Float y, Float largura, Float altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	public Ponto obterOrigem() {
		return origem;
	}

	public Float obterLargura() {
		return largura;
	}

	public Float obterAltura() {
		return altura;
	}

	public Float obterX() {
		return x;
	}

	public Float obterY() {
		return y;
	}

}
