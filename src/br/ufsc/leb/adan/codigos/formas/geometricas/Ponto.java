package br.ufsc.leb.adan.codigos.formas.geometricas;

public class Ponto {

	private Double coordenadaX;
	private Double coordenadaY;

	public Ponto(Double coordenadaX, Double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public Double obterCoordenadaX() {
		return coordenadaX;
	}

	public Double obterCoordenadaY() {
		return coordenadaY;
	}

}
