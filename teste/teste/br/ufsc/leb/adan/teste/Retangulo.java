package teste.br.ufsc.leb.adan.teste;

public class Retangulo {

	private Ponto origem;
	private Double largura;
	private Double altura;
	private Double coordenadaX;
	private Double coordenadaY;

	public Retangulo(Ponto origem, Double largura, Double altura) {
		this.origem = origem;
		this.largura = largura;
		this.altura = altura;
	}

	public Retangulo(Double coordenadaX, Double coordenadaY, Double largura, Double altura) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.largura = largura;
		this.altura = altura;
	}

	public Ponto obterOrigem() {
		return origem;
	}

	public Double obterLargura() {
		return largura;
	}

	public Double obterAltura() {
		return altura;
	}

	public Double obterCoordenadaX() {
		return coordenadaX;
	}

	public Double obterCoordenadaY() {
		return coordenadaY;
	}

}
