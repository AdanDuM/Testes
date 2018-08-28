package br.ufsc.leb.adan.codigos.formas.geometricas;

public class Circulo {

	private Ponto centro;
	private Double raio;

	public Circulo(Ponto centro, Double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto obterCentro() {
		return centro;
	}

	public Double obterRaio() {
		return raio;
	}

}
